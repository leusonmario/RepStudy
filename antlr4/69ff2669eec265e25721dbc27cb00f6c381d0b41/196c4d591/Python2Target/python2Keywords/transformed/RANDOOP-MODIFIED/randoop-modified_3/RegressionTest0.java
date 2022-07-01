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
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar3, sT4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getRuleFunctionContextStructName(ruleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python2Target1.getElementName("Python2");
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
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getImplicitTokenLabel("_@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getLoopLabel(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python2Target1.getLoopLabel(grammarAST2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar12, sT13, "@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar13 = null;
        int[] intArray20 = new int[] { 100, 100, 64, (byte) 0, (short) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray21 = python2Target1.getTokenTypesAsTargetLabels(grammar13, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100, 64, 0, -1, 35]");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) 10.0d, "", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar7, sT8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) (byte) 10, "_@", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python2Target1.getLoopCounter(grammarAST2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"_tset\"", false);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset" + "'", str6, "_tset");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset");
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar7, sT8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar4, sT5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.tool.Grammar grammar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getTokenTypeAsTargetLabel(grammar5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "_tset");
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python2Target1.genRecognizerHeaderFile(grammar3, sT4, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_@");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_@" + "'", str1, "_@");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementListName("\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_@", true);
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementName("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup3 = python2Target1.loadTemplates();
        org.antlr.v4.tool.Rule rule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getRuleFunctionContextStructName(rule4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(sTGroup3);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getTokenTypeAsTargetLabel(grammar5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("Python2");
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2Context" + "'", str6, "Python2Context");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.tool.Grammar grammar1 = null;
        org.stringtemplate.v4.ST sT2 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar1, sT2, "_tset");
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
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar13 = null;
        int[] intArray19 = new int[] { 64, 1, (short) -1, (byte) 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray20 = python2Target1.getTokenTypesAsTargetLabels(grammar13, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[64, 1, -1, 1, -1]");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar13, sT14, "4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        java.util.Set<java.lang.String> strSet21 = python2Target10.getBadWords();
        python2Target1.badWords = strSet21;
        java.lang.String str24 = python2Target1.getAltLabelContextStructName("hi!");
        org.antlr.v4.tool.Grammar grammar25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python2Target1.getTokenTypeAsTargetLabel(grammar25, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\1" + "'", str8, "\\1");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!Context" + "'", str24, "Hi!Context");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("Python2");
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar7, sT8, "\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2Context" + "'", str6, "Python2Context");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar13 = null;
        int[] intArray19 = new int[] { (short) 1, (short) -1, 2147483647, 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray20 = python2Target1.getTokenTypesAsTargetLabels(grammar13, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, -1, 2147483647, 1, 1]");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python2Target1.genRecognizerHeaderFile(grammar3, sT4, "hi!");
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar7, sT8, "Python2Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str12 = python2Target9.encodeIntAsCharEscape(64);
        java.lang.String str13 = python2Target9.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String[] strArray16 = python2Target15.targetCharValueEscape;
        java.lang.String str17 = python2Target15.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target15.getTemplates();
        python2Target9.templates = sTGroup18;
        python2Target1.templates = sTGroup18;
        org.antlr.v4.tool.ast.GrammarAST grammarAST21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.lang.String[] strArray7 = python2Target6.targetCharValueEscape;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = pythonStringRenderer0.toString((java.lang.Object) strArray7, "_tset", locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.String; cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup3 = python2Target1.loadTemplates();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray6 = new int[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = python2Target1.getTokenTypesAsTargetLabels(grammar4, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(sTGroup3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52]");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "_tset");
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar8, sT9, "\"_tset\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getLoopLabel(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.util.Set<java.lang.String> strSet3 = python2Target2.badWords;
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = pythonStringRenderer0.toString((java.lang.Object) python2Target2, "@", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String[] strArray6 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target1.targetCharValueEscape = strArray6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("_@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass13 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.tool.Rule rule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getRuleFunctionContextStructName(rule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.util.Set<java.lang.String> strSet6 = python2Target5.badWords;
        java.lang.String str8 = python2Target5.encodeIntAsCharEscape(64);
        java.lang.String str9 = python2Target5.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        python2Target5.templates = sTGroup14;
        python2Target1.templates = sTGroup14;
        boolean boolean17 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray22 = new int[] { 64, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray23 = python2Target1.getTokenTypesAsTargetLabels(grammar18, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[64, 1, 10]");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray18 = new int[] { '4', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray19 = python2Target1.getTokenTypesAsTargetLabels(grammar15, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[52, 0]");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("Hi!Context");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!Context" + "'", str1, "Hi!Context");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.util.Set<java.lang.String> strSet6 = python2Target5.badWords;
        java.lang.String str8 = python2Target5.encodeIntAsCharEscape(64);
        java.lang.String str9 = python2Target5.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        python2Target5.templates = sTGroup14;
        python2Target1.templates = sTGroup14;
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str19 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python2Target1.getElementListName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tsetContext" + "'", str18, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        python2Target1.language = "\"\"";
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar6, sT7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.stringtemplate.v4.ST sT16 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar15, sT16, "\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.loadTemplates();
        org.antlr.v4.tool.Rule rule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getRuleFunctionContextStructName(rule14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.lang.String str8 = python2Target6.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        python2Target6.templates = sTGroup19;
        java.lang.String str23 = python2Target6.getAltLabelContextStructName("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        python2Target6.gen = codeGenerator24;
        java.util.Locale locale27 = null;
        java.lang.String str28 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator24, "\"hi!\"", locale27);
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target30 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator29);
        java.util.Set<java.lang.String> strSet31 = python2Target30.badWords;
        java.lang.String str33 = python2Target30.encodeIntAsCharEscape(64);
        java.lang.String str34 = python2Target30.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target36 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator35);
        java.lang.String[] strArray37 = python2Target36.targetCharValueEscape;
        java.lang.String str38 = python2Target36.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup39 = python2Target36.getTemplates();
        python2Target30.templates = sTGroup39;
        org.stringtemplate.v4.STGroup sTGroup41 = python2Target30.templates;
        java.util.Set<java.lang.String> strSet42 = python2Target30.badWords;
        java.util.Locale locale44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = pythonStringRenderer0.toString((java.lang.Object) strSet42, "\"hi!\"", locale44);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.HashSet cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_tsetContext" + "'", str23, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"hi!\"" + "'", str28, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "@" + "'", str33, "@");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Python2" + "'", str34, "Python2");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Python2" + "'", str38, "Python2");
        org.junit.Assert.assertNotNull(sTGroup39);
        org.junit.Assert.assertNotNull(sTGroup41);
        org.junit.Assert.assertNotNull(strSet42);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        java.lang.String[] strArray4 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Rule rule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        org.antlr.v4.tool.Rule rule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getRuleFunctionContextStructName(rule3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.util.Set<java.lang.String> strSet3 = python2Target2.badWords;
        java.lang.String str5 = python2Target2.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target2.getAltLabelContextStructName("Python2");
        java.util.Locale locale9 = null;
        java.lang.String str10 = pythonStringRenderer0.toString((java.lang.Object) "Python2", "hi!", locale9);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        java.lang.String[] strArray13 = python2Target12.targetCharValueEscape;
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = pythonStringRenderer0.toString((java.lang.Object) python2Target12, "", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2Context" + "'", str7, "Python2Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"hi!\"");
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar8, sT9, "_tset\\\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_@", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String[] strArray4 = new java.lang.String[] { "Python2" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray4;
        python2Target1.targetCharValueEscape = strArray4;
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("Hi!Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        java.lang.String[] strArray4 = python2Target1.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getElementName("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_@", true);
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("Python2");
        python2Target1.language = "";
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2Context" + "'", str6, "Python2Context");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) 100.0d, "\"4.5.2.1\"", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        org.antlr.v4.tool.Grammar grammar3 = null;
        int[] intArray7 = new int[] { 'a', (byte) 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = python2Target1.getTokenTypesAsTargetLabels(grammar3, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 0, 52]");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.lang.String str8 = python2Target6.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        python2Target6.templates = sTGroup19;
        java.lang.String str23 = python2Target6.getAltLabelContextStructName("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        python2Target6.gen = codeGenerator24;
        java.util.Locale locale27 = null;
        java.lang.String str28 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator24, "\"hi!\"", locale27);
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target30 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator29);
        java.lang.String[] strArray31 = python2Target30.targetCharValueEscape;
        java.lang.String str32 = python2Target30.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup33 = python2Target30.getTemplates();
        java.util.Locale locale35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = pythonStringRenderer0.toString((java.lang.Object) sTGroup33, "\"4.5.2.1\"", locale35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.stringtemplate.v4.STGroupFile cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_tsetContext" + "'", str23, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"hi!\"" + "'", str28, "\"hi!\"");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Python2" + "'", str32, "Python2");
        org.junit.Assert.assertNotNull(sTGroup33);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar16, sT17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\1" + "'", str8, "\\1");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"hi!\"");
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getTokenTypeAsTargetLabel(grammar9, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.lang.String str12 = python2Target1.language;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python2" + "'", str12, "Python2");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getTokenTypeAsTargetLabel(grammar3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str12 = python2Target9.encodeIntAsCharEscape(64);
        java.lang.String str13 = python2Target9.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String[] strArray16 = python2Target15.targetCharValueEscape;
        java.lang.String str17 = python2Target15.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target15.getTemplates();
        python2Target9.templates = sTGroup18;
        python2Target1.templates = sTGroup18;
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.stringtemplate.v4.ST sT22 = null;
        python2Target1.genRecognizerHeaderFile(grammar21, sT22, "\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        python2Target1.gen = codeGenerator25;
        org.antlr.v4.tool.ast.GrammarAST grammarAST27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        int int6 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar7, sT8, "_tset\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String[] strArray15 = python2Target14.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target14.loadTemplates();
        python2Target1.templates = sTGroup16;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getElementListName("Hi!Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(sTGroup16);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.util.Set<java.lang.String> strSet12 = python2Target11.badWords;
        java.lang.String str14 = python2Target11.encodeIntAsCharEscape(64);
        java.lang.String str15 = python2Target11.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.lang.String[] strArray18 = python2Target17.targetCharValueEscape;
        java.lang.String str19 = python2Target17.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target17.getTemplates();
        python2Target11.templates = sTGroup20;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python2Target11.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target11.loadTemplates();
        python2Target1.templates = sTGroup23;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python2Target1.getRuleFunctionContextStructName(ruleFunction25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertNotNull(sTGroup23);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.util.Set<java.lang.String> strSet6 = python2Target5.badWords;
        java.lang.String str8 = python2Target5.encodeIntAsCharEscape(64);
        java.lang.String str9 = python2Target5.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        python2Target5.templates = sTGroup14;
        python2Target1.templates = sTGroup14;
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str19 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python2Target1.getImplicitTokenLabel(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tsetContext" + "'", str18, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        java.util.Set<java.lang.String> strSet21 = python2Target10.getBadWords();
        python2Target1.badWords = strSet21;
        java.lang.String str24 = python2Target1.getAltLabelContextStructName("hi!");
        java.lang.String str25 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator26);
        java.lang.String[] strArray28 = python2Target27.targetCharValueEscape;
        java.lang.String str29 = python2Target27.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup30 = python2Target27.getTemplates();
        python2Target1.templates = sTGroup30;
        org.antlr.v4.tool.ast.GrammarAST grammarAST32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python2Target1.getLoopCounter(grammarAST32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\1" + "'", str8, "\\1");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!Context" + "'", str24, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Python2" + "'", str29, "Python2");
        org.junit.Assert.assertNotNull(sTGroup30);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.util.Set<java.lang.String> strSet3 = python2Target2.badWords;
        java.lang.String str5 = python2Target2.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target2.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator7);
        java.lang.String[] strArray9 = python2Target8.targetCharValueEscape;
        java.lang.String str10 = python2Target8.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target8.getTemplates();
        python2Target2.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target2.templates;
        java.util.Set<java.lang.String> strSet14 = python2Target2.badWords;
        python2Target0.badWords = strSet14;
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("Python2");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape(1);
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2Context" + "'", str6, "Python2Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\1" + "'", str9, "\\1");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        java.util.Set<java.lang.String> strSet21 = python2Target10.getBadWords();
        python2Target1.badWords = strSet21;
        org.antlr.v4.tool.ast.GrammarAST grammarAST23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target1.getLoopCounter(grammarAST23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\1" + "'", str8, "\\1");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getRuleFunctionContextStructName(ruleFunction16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_@", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        java.lang.String str6 = python2Target1.getListLabel("\\n");
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python2Target1.genRecognizerHeaderFile(grammar7, sT8, "\"4.5.2.1\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementListName("i");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.lang.String str8 = python2Target6.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        python2Target6.templates = sTGroup19;
        java.lang.String str23 = python2Target6.getAltLabelContextStructName("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        python2Target6.gen = codeGenerator24;
        java.util.Locale locale27 = null;
        java.lang.String str28 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator24, "\"hi!\"", locale27);
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target30 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator29);
        org.stringtemplate.v4.STGroup sTGroup31 = python2Target30.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        java.lang.String str35 = python2Target30.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator32, "_@", true);
        org.stringtemplate.v4.STGroup sTGroup36 = python2Target30.getTemplates();
        java.util.Locale locale38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = pythonStringRenderer0.toString((java.lang.Object) python2Target30, "_tset\\1", locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_tsetContext" + "'", str23, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"hi!\"" + "'", str28, "\"hi!\"");
        org.junit.Assert.assertNull(sTGroup31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"" + "'", str35, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup36);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet16 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getLoopLabel(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("Hi!Context");
        java.lang.String[] strArray9 = python2Target1.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementName("_tsethi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"Hi!Context\"" + "'", str8, "\"Hi!Context\"");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_\"_tset\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_\"_tset\"" + "'", str1, "_\"_tset\"");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getLoopCounter(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        java.lang.String[] strArray14 = new java.lang.String[] { "@", "\"_tset\"", "\"hi!\"", "_tset\\1", "_tset\\\\1" };
        python2Target1.targetCharValueEscape = strArray14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getElementListName("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        python2Target1.gen = codeGenerator14;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getRuleFunctionContextStructName(ruleFunction16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.stringtemplate.v4.STGroup sTGroup1 = python2Target0.templates;
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar2, sT3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup1);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.util.Set<java.lang.String> strSet6 = python2Target5.badWords;
        java.lang.String str8 = python2Target5.encodeIntAsCharEscape(64);
        java.lang.String str9 = python2Target5.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        python2Target5.templates = sTGroup14;
        python2Target1.templates = sTGroup14;
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str19 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tsetContext" + "'", str18, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar6, sT7, "_tset\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String[] strArray6 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target1.targetCharValueEscape = strArray6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("_tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\1" + "'", str8, "\\1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        java.util.Set<java.lang.String> strSet21 = python2Target10.getBadWords();
        python2Target1.badWords = strSet21;
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.stringtemplate.v4.ST sT24 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar23, sT24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\1" + "'", str8, "\\1");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("\\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.lang.String str8 = python2Target6.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        python2Target6.templates = sTGroup19;
        java.lang.String str23 = python2Target6.getAltLabelContextStructName("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        python2Target6.gen = codeGenerator24;
        java.util.Locale locale27 = null;
        java.lang.String str28 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator24, "\"hi!\"", locale27);
        java.lang.Object obj29 = null;
        java.util.Locale locale31 = null;
        java.lang.String str32 = pythonStringRenderer0.toString(obj29, "@", locale31);
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator33);
        java.util.Set<java.lang.String> strSet35 = python2Target34.badWords;
        java.lang.String str38 = python2Target34.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str40 = python2Target34.getImplicitRuleLabel("@");
        python2Target34.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target44 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator43);
        java.util.Set<java.lang.String> strSet45 = python2Target44.badWords;
        java.lang.String str47 = python2Target44.encodeIntAsCharEscape(64);
        java.lang.String str48 = python2Target44.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target50 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator49);
        java.lang.String[] strArray51 = python2Target50.targetCharValueEscape;
        java.lang.String str52 = python2Target50.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup53 = python2Target50.getTemplates();
        python2Target44.templates = sTGroup53;
        org.antlr.v4.codegen.CodeGenerator codeGenerator55 = python2Target44.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup56 = python2Target44.loadTemplates();
        python2Target34.templates = sTGroup56;
        org.antlr.v4.tool.Grammar grammar58 = null;
        org.stringtemplate.v4.ST sT59 = null;
        python2Target34.genRecognizerHeaderFile(grammar58, sT59, "\"\\\"hi!\\\"\"");
        java.util.Locale locale63 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str64 = pythonStringRenderer0.toString((java.lang.Object) python2Target34, "_tsetContextContext", locale63);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_tsetContext" + "'", str23, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"hi!\"" + "'", str28, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "@" + "'", str32, "@");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "_@" + "'", str40, "_@");
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "@" + "'", str47, "@");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Python2" + "'", str48, "Python2");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Python2" + "'", str52, "Python2");
        org.junit.Assert.assertNotNull(sTGroup53);
        org.junit.Assert.assertNull(codeGenerator55);
        org.junit.Assert.assertNotNull(sTGroup56);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("Hi!Context");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"Hi!Context\"" + "'", str8, "\"Hi!Context\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        python2Target1.addBadWords();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar7, sT8, "d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target1.loadTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(sTGroup16);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar6, sT7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python2Target1.genRecognizerHeaderFile(grammar3, sT4, "hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tsetContext", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getImplicitTokenLabel("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"tsetContex\"" + "'", str10, "\"tsetContex\"");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet16 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator18);
        java.lang.String[] strArray20 = python2Target19.targetCharValueEscape;
        java.lang.String str23 = python2Target19.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar24 = null;
        int[] intArray25 = new int[] {};
        java.lang.String[] strArray26 = python2Target19.getTokenTypesAsTargetLabels(grammar24, intArray25);
        java.lang.String[] strArray27 = python2Target1.getTokenTypesAsTargetLabels(grammar17, intArray25);
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        python2Target1.gen = codeGenerator28;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_tset\\\\1" + "'", str23, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.util.Set<java.lang.String> strSet12 = python2Target11.badWords;
        java.lang.String str14 = python2Target11.encodeIntAsCharEscape(64);
        java.lang.String str15 = python2Target11.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.lang.String[] strArray18 = python2Target17.targetCharValueEscape;
        java.lang.String str19 = python2Target17.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target17.getTemplates();
        python2Target11.templates = sTGroup20;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python2Target11.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target11.loadTemplates();
        python2Target1.templates = sTGroup23;
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.stringtemplate.v4.ST sT26 = null;
        python2Target1.genRecognizerHeaderFile(grammar25, sT26, "\"\\\"hi!\\\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = python2Target1.getLoopCounter(grammarAST29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertNotNull(sTGroup23);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.lang.String[] strArray18 = python2Target17.targetCharValueEscape;
        java.lang.String str21 = python2Target17.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str22 = python2Target17.getVersion();
        java.lang.String str24 = python2Target17.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator25);
        java.util.Set<java.lang.String> strSet27 = python2Target26.badWords;
        java.lang.String str29 = python2Target26.encodeIntAsCharEscape(64);
        java.lang.String str30 = python2Target26.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target32 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator31);
        java.lang.String[] strArray33 = python2Target32.targetCharValueEscape;
        java.lang.String str34 = python2Target32.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup35 = python2Target32.getTemplates();
        python2Target26.templates = sTGroup35;
        java.util.Set<java.lang.String> strSet37 = python2Target26.getBadWords();
        python2Target17.badWords = strSet37;
        java.lang.String str40 = python2Target17.getAltLabelContextStructName("hi!");
        java.lang.String str41 = python2Target17.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target43 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator42);
        java.lang.String[] strArray44 = python2Target43.targetCharValueEscape;
        java.lang.String str45 = python2Target43.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup46 = python2Target43.getTemplates();
        python2Target17.templates = sTGroup46;
        python2Target1.templates = sTGroup46;
        java.lang.String[] strArray49 = python2Target1.targetCharValueEscape;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Python2" + "'", str21, "Python2");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\1" + "'", str24, "\\1");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "@" + "'", str29, "@");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Python2" + "'", str30, "Python2");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Python2" + "'", str34, "Python2");
        org.junit.Assert.assertNotNull(sTGroup35);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Hi!Context" + "'", str40, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "4.5.2.1" + "'", str41, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Python2" + "'", str45, "Python2");
        org.junit.Assert.assertNotNull(sTGroup46);
        org.junit.Assert.assertNotNull(strArray49);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getImplicitTokenLabel("\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String[] strArray4 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar5, sT6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        python2Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.lang.String str8 = python2Target6.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        python2Target6.templates = sTGroup19;
        java.lang.String str23 = python2Target6.getAltLabelContextStructName("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        python2Target6.gen = codeGenerator24;
        java.util.Locale locale27 = null;
        java.lang.String str28 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator24, "\"hi!\"", locale27);
        java.lang.Object obj29 = null;
        java.util.Locale locale31 = null;
        java.lang.String str32 = pythonStringRenderer0.toString(obj29, "@", locale31);
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator33);
        java.lang.String[] strArray35 = python2Target34.targetCharValueEscape;
        java.lang.String str38 = python2Target34.getTargetStringLiteralFromString("_tset\\1", false);
        java.util.Locale locale40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = pythonStringRenderer0.toString((java.lang.Object) false, "@", locale40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_tsetContext" + "'", str23, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"hi!\"" + "'", str28, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "@" + "'", str32, "@");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "_tset\\\\1" + "'", str38, "_tset\\\\1");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar11, sT12, "_tsethi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str12 = python2Target1.getImplicitSetLabel("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str12, "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("Python2");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("");
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2Context" + "'", str6, "Python2Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset" + "'", str9, "_tset");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1");
        java.lang.String str11 = python2Target1.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("Python2Context");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Python2Context" + "'", str1, "Python2Context");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_@", true);
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("\"\\\"hi!\\\"\"");
        boolean boolean9 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"\\\"hi!\\\"\"" + "'", str8, "_\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("Python2");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getVersion();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2Context" + "'", str6, "Python2Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        java.lang.String[] strArray14 = new java.lang.String[] { "@", "\"_tset\"", "\"hi!\"", "_tset\\1", "_tset\\\\1" };
        python2Target1.targetCharValueEscape = strArray14;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray14;
        java.lang.Class<?> wildcardClass17 = strArray14.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        boolean boolean5 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.loadTemplates();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar7, sT8, "Python2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(sTGroup6);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "\\1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementListName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getTokenTypeAsTargetLabel(grammar4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\\1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\1" + "'", str1, "\\1");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str1, "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator7);
        java.util.Set<java.lang.String> strSet9 = python2Target8.badWords;
        java.lang.String str11 = python2Target8.encodeIntAsCharEscape(64);
        java.lang.String str12 = python2Target8.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String[] strArray15 = python2Target14.targetCharValueEscape;
        java.lang.String str16 = python2Target14.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target14.getTemplates();
        python2Target8.templates = sTGroup17;
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target8.templates;
        java.util.Set<java.lang.String> strSet20 = python2Target8.badWords;
        java.util.Set<java.lang.String> strSet21 = python2Target8.getBadWords();
        boolean boolean22 = python2Target8.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet23 = python2Target8.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup24 = python2Target8.getTemplates();
        python2Target1.templates = sTGroup24;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python2Target1.getImplicitTokenLabel("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "@" + "'", str11, "@");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python2" + "'", str12, "Python2");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Python2" + "'", str16, "Python2");
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(sTGroup24);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        int int6 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("\\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.util.Set<java.lang.String> strSet3 = python2Target2.badWords;
        java.lang.String str5 = python2Target2.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target2.getAltLabelContextStructName("Python2");
        java.util.Locale locale9 = null;
        java.lang.String str10 = pythonStringRenderer0.toString((java.lang.Object) "Python2", "hi!", locale9);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        java.lang.String[] strArray13 = python2Target12.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target12.loadTemplates();
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = pythonStringRenderer0.toString((java.lang.Object) python2Target12, "_tset\"Hi!Context\"", locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2Context" + "'", str7, "Python2Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(sTGroup14);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getLoopCounter(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("Hi!Context");
        java.util.Set<java.lang.String> strSet9 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "hi!", false);
        java.util.Set<java.lang.String> strSet14 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet15 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getElementListName("i");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"Hi!Context\"" + "'", str8, "\"Hi!Context\"");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "i" + "'", str13, "i");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str6 = python2Target1.getLanguage();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("Python2");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.language;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2Context" + "'", str6, "Python2Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar13, sT14, "d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        java.lang.String str11 = python2Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getTokenTypeAsTargetLabel(grammar12, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        java.lang.String[] strArray14 = new java.lang.String[] { "@", "\"_tset\"", "\"hi!\"", "_tset\\1", "_tset\\\\1" };
        python2Target1.targetCharValueEscape = strArray14;
        java.lang.String str17 = python2Target1.getAltLabelContextStructName("hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getLoopCounter(grammarAST18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!Context" + "'", str17, "Hi!Context");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getRuleFunctionContextStructName(ruleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        boolean boolean14 = python2Target1.supportsOverloadedMethods();
        java.lang.String str16 = python2Target1.getImplicitSetLabel("\"Hi!Context\"");
        java.lang.String str17 = python2Target1.language;
        java.lang.String str19 = python2Target1.getImplicitSetLabel("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target1.templates;
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.stringtemplate.v4.ST sT22 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar21, sT22, "_tsetContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset\"Hi!Context\"" + "'", str16, "_tset\"Hi!Context\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str19, "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup20);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getLanguage();
        python2Target1.addBadWords();
        boolean boolean10 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        java.lang.String str14 = python2Target12.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.stringtemplate.v4.ST sT16 = null;
        python2Target12.genRecognizerHeaderFile(grammar15, sT16, "_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        java.util.Set<java.lang.String> strSet21 = python2Target20.badWords;
        java.lang.String str23 = python2Target20.encodeIntAsCharEscape(64);
        java.lang.String str24 = python2Target20.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator25);
        java.lang.String[] strArray27 = python2Target26.targetCharValueEscape;
        java.lang.String str28 = python2Target26.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup29 = python2Target26.getTemplates();
        python2Target20.templates = sTGroup29;
        python2Target12.templates = sTGroup29;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target33 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator32);
        java.lang.String[] strArray34 = python2Target33.targetCharValueEscape;
        java.lang.String str35 = python2Target33.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup36 = python2Target33.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator37);
        java.util.Set<java.lang.String> strSet39 = python2Target38.badWords;
        python2Target33.badWords = strSet39;
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator41);
        java.util.Set<java.lang.String> strSet43 = python2Target42.badWords;
        java.lang.String str46 = python2Target42.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str48 = python2Target42.getImplicitRuleLabel("@");
        python2Target42.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator51 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target52 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator51);
        java.util.Set<java.lang.String> strSet53 = python2Target52.badWords;
        java.lang.String str55 = python2Target52.encodeIntAsCharEscape(64);
        java.lang.String str56 = python2Target52.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator57 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target58 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator57);
        java.lang.String[] strArray59 = python2Target58.targetCharValueEscape;
        java.lang.String str60 = python2Target58.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup61 = python2Target58.getTemplates();
        python2Target52.templates = sTGroup61;
        org.antlr.v4.codegen.CodeGenerator codeGenerator63 = python2Target52.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup64 = python2Target52.loadTemplates();
        python2Target42.templates = sTGroup64;
        python2Target33.templates = sTGroup64;
        python2Target12.templates = sTGroup64;
        python2Target1.templates = sTGroup64;
        org.antlr.v4.tool.Rule rule69 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str70 = python2Target1.getRuleFunctionContextStructName(rule69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset" + "'", str14, "_tset");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "@" + "'", str23, "@");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Python2" + "'", str28, "Python2");
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Python2" + "'", str35, "Python2");
        org.junit.Assert.assertNotNull(sTGroup36);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "_@" + "'", str48, "_@");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "@" + "'", str55, "@");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Python2" + "'", str56, "Python2");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Python2" + "'", str60, "Python2");
        org.junit.Assert.assertNotNull(sTGroup61);
        org.junit.Assert.assertNull(codeGenerator63);
        org.junit.Assert.assertNotNull(sTGroup64);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.lang.String[] strArray3 = python2Target2.targetCharValueEscape;
        java.lang.String str6 = python2Target2.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str7 = python2Target2.getVersion();
        java.lang.String str9 = python2Target2.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.util.Set<java.lang.String> strSet12 = python2Target11.badWords;
        java.lang.String str14 = python2Target11.encodeIntAsCharEscape(64);
        java.lang.String str15 = python2Target11.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.lang.String[] strArray18 = python2Target17.targetCharValueEscape;
        java.lang.String str19 = python2Target17.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target17.getTemplates();
        python2Target11.templates = sTGroup20;
        java.util.Set<java.lang.String> strSet22 = python2Target11.getBadWords();
        python2Target2.badWords = strSet22;
        java.lang.String str25 = python2Target2.getAltLabelContextStructName("hi!");
        java.lang.String str26 = python2Target2.getVersion();
        java.util.Set<java.lang.String> strSet27 = python2Target2.getBadWords();
        java.util.Locale locale29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = pythonStringRenderer0.toString((java.lang.Object) strSet27, "_\"\\\"hi!\\\"\"", locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.HashSet cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\1" + "'", str9, "\\1");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hi!Context" + "'", str25, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4.5.2.1" + "'", str26, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tsetContext", false);
        boolean boolean13 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\1" + "'", str8, "\\1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "tsetContex" + "'", str12, "tsetContex");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.stringtemplate.v4.STGroup sTGroup1 = python2Target0.templates;
        java.lang.String[] strArray2 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target4 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator3);
        java.lang.String[] strArray5 = python2Target4.targetCharValueEscape;
        java.lang.String str8 = python2Target4.getTargetStringLiteralFromString("Python2", false);
        java.lang.String[] strArray9 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target4.targetCharValueEscape = strArray9;
        python2Target0.targetCharValueEscape = strArray9;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray9;
        org.junit.Assert.assertNull(sTGroup1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getElementName("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        java.lang.String str6 = python2Target1.getListLabel("\\n");
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python2Target1.genRecognizerHeaderFile(grammar7, sT8, "\"4.5.2.1\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementListName("_tset\\\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.getLanguage();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"hi!\"");
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = codeGenerator9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python2Target1.genRecognizerHeaderFile(grammar3, sT4, "hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tsetContext", true);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"tsetContex\"" + "'", str10, "\"tsetContex\"");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        java.lang.String[] strArray14 = new java.lang.String[] { "@", "\"_tset\"", "\"hi!\"", "_tset\\1", "_tset\\\\1" };
        python2Target1.targetCharValueEscape = strArray14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getImplicitTokenLabel("__tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\\\"hi!\\\"\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str9, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementListName("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.stringtemplate.v4.STGroup sTGroup1 = python2Target0.templates;
        java.lang.String[] strArray2 = python2Target0.targetCharValueEscape;
        python2Target0.addBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target0.getRuleFunctionContextStructName(ruleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.util.Set<java.lang.String> strSet12 = python2Target11.badWords;
        java.lang.String str14 = python2Target11.encodeIntAsCharEscape(64);
        java.lang.String str15 = python2Target11.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.lang.String[] strArray18 = python2Target17.targetCharValueEscape;
        java.lang.String str19 = python2Target17.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target17.getTemplates();
        python2Target11.templates = sTGroup20;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python2Target11.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target11.loadTemplates();
        python2Target1.templates = sTGroup23;
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.stringtemplate.v4.ST sT26 = null;
        python2Target1.genRecognizerHeaderFile(grammar25, sT26, "\"\\\"hi!\\\"\"");
        org.antlr.v4.tool.Grammar grammar29 = null;
        org.stringtemplate.v4.ST sT30 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar29, sT30, "i");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertNotNull(sTGroup23);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getElementListName("_tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        python2Target1.genRecognizerHeaderFile(grammar12, sT13, "\"_tset\"");
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar16, sT17, "i");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str7, "__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("Python2");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementListName("\\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2Context" + "'", str6, "Python2Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.lang.String[] strArray3 = python2Target2.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray3;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = pythonStringRenderer0.toString((java.lang.Object) strArray3, "", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.String; cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str12 = python2Target9.encodeIntAsCharEscape(64);
        java.lang.String str13 = python2Target9.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String[] strArray16 = python2Target15.targetCharValueEscape;
        java.lang.String str17 = python2Target15.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target15.getTemplates();
        python2Target9.templates = sTGroup18;
        python2Target1.templates = sTGroup18;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator21);
        java.lang.String[] strArray23 = python2Target22.targetCharValueEscape;
        java.lang.String str24 = python2Target22.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup25 = python2Target22.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator26);
        java.util.Set<java.lang.String> strSet28 = python2Target27.badWords;
        python2Target22.badWords = strSet28;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator30);
        java.util.Set<java.lang.String> strSet32 = python2Target31.badWords;
        java.lang.String str35 = python2Target31.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str37 = python2Target31.getImplicitRuleLabel("@");
        python2Target31.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target41 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator40);
        java.util.Set<java.lang.String> strSet42 = python2Target41.badWords;
        java.lang.String str44 = python2Target41.encodeIntAsCharEscape(64);
        java.lang.String str45 = python2Target41.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target47 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator46);
        java.lang.String[] strArray48 = python2Target47.targetCharValueEscape;
        java.lang.String str49 = python2Target47.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup50 = python2Target47.getTemplates();
        python2Target41.templates = sTGroup50;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = python2Target41.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup53 = python2Target41.loadTemplates();
        python2Target31.templates = sTGroup53;
        python2Target22.templates = sTGroup53;
        python2Target1.templates = sTGroup53;
        boolean boolean57 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(sTGroup25);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "_@" + "'", str37, "_@");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "@" + "'", str44, "@");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Python2" + "'", str45, "Python2");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Python2" + "'", str49, "Python2");
        org.junit.Assert.assertNotNull(sTGroup50);
        org.junit.Assert.assertNull(codeGenerator52);
        org.junit.Assert.assertNotNull(sTGroup53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("Python2");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.language;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementName("_tset\\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2Context" + "'", str6, "Python2Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet16 = python2Target1.getBadWords();
        python2Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "\\0", true);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\"" + "'", str21, "\"\"");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python2Target1.genRecognizerHeaderFile(grammar3, sT4, "hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.lang.String str8 = python2Target6.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        python2Target6.templates = sTGroup19;
        java.lang.String str23 = python2Target6.getAltLabelContextStructName("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        python2Target6.gen = codeGenerator24;
        java.util.Locale locale27 = null;
        java.lang.String str28 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator24, "\"hi!\"", locale27);
        java.lang.Object obj29 = null;
        java.util.Locale locale31 = null;
        java.lang.String str32 = pythonStringRenderer0.toString(obj29, "@", locale31);
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator33);
        java.lang.String[] strArray35 = python2Target34.targetCharValueEscape;
        java.lang.String str36 = python2Target34.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup37 = python2Target34.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator38);
        java.util.Set<java.lang.String> strSet40 = python2Target39.badWords;
        python2Target34.badWords = strSet40;
        java.util.Locale locale43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = pythonStringRenderer0.toString((java.lang.Object) strSet40, "_tset\\1", locale43);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.HashSet cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_tsetContext" + "'", str23, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"hi!\"" + "'", str28, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "@" + "'", str32, "@");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Python2" + "'", str36, "Python2");
        org.junit.Assert.assertNotNull(sTGroup37);
        org.junit.Assert.assertNotNull(strSet40);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean7 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.gen;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"" + "'", str6, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        java.lang.String str11 = python2Target1.getListLabel("Python2");
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.gen;
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python2Target1.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("Python2");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape(1);
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) ' ');
        java.lang.String str13 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2Context" + "'", str6, "Python2Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\1" + "'", str9, "\\1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\0" + "'", str13, "\\0");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"_tset\"", false);
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python2Target1.genRecognizerHeaderFile(grammar8, sT9, "");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(ruleFunction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset" + "'", str6, "_tset");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String[] strArray4 = new java.lang.String[] { "Python2" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray4;
        python2Target1.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("4.5.2.1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"4.5.2.1\"" + "'", str6, "\"4.5.2.1\"");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML(" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getTokenTypeAsTargetLabel(grammar11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python2Target1.gen = codeGenerator7;
        java.lang.String str9 = python2Target1.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"4.5.2.1\"" + "'", str6, "\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar13, sT14, "\"_tsethi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str14 = python2Target10.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str16 = python2Target10.getImplicitRuleLabel("@");
        python2Target10.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        java.util.Set<java.lang.String> strSet21 = python2Target20.badWords;
        java.lang.String str23 = python2Target20.encodeIntAsCharEscape(64);
        java.lang.String str24 = python2Target20.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator25);
        java.lang.String[] strArray27 = python2Target26.targetCharValueEscape;
        java.lang.String str28 = python2Target26.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup29 = python2Target26.getTemplates();
        python2Target20.templates = sTGroup29;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python2Target20.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup32 = python2Target20.loadTemplates();
        python2Target10.templates = sTGroup32;
        python2Target1.templates = sTGroup32;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        java.lang.String str38 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator35, "@", false);
        org.stringtemplate.v4.STGroup sTGroup39 = python2Target1.loadTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = python2Target1.getImplicitTokenLabel("\"Hi!Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_@" + "'", str16, "_@");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "@" + "'", str23, "@");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Python2" + "'", str28, "Python2");
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertNull(codeGenerator31);
        org.junit.Assert.assertNotNull(sTGroup32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(sTGroup39);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.lang.String[] strArray7 = python2Target6.targetCharValueEscape;
        java.lang.String str8 = python2Target6.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target6.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.util.Set<java.lang.String> strSet12 = python2Target11.badWords;
        python2Target6.badWords = strSet12;
        java.lang.String[] strArray19 = new java.lang.String[] { "@", "\"_tset\"", "\"hi!\"", "_tset\\1", "_tset\\\\1" };
        python2Target6.targetCharValueEscape = strArray19;
        python2Target1.targetCharValueEscape = strArray19;
        org.antlr.v4.tool.ast.GrammarAST grammarAST22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.stringtemplate.v4.STGroup sTGroup1 = python2Target0.templates;
        java.lang.String[] strArray2 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target4 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator3);
        java.lang.String[] strArray5 = python2Target4.targetCharValueEscape;
        java.lang.String str8 = python2Target4.getTargetStringLiteralFromString("Python2", false);
        java.lang.String[] strArray9 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target4.targetCharValueEscape = strArray9;
        python2Target0.targetCharValueEscape = strArray9;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup12 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("Hi!Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.lang.String[] strArray11 = python2Target10.targetCharValueEscape;
        python2Target1.targetCharValueEscape = strArray11;
        java.lang.Class<?> wildcardClass13 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"Hi!Context\"" + "'", str8, "\"Hi!Context\"");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getRuleFunctionContextStructName(ruleFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        java.util.Set<java.lang.String> strSet21 = python2Target10.getBadWords();
        python2Target1.badWords = strSet21;
        java.lang.String str24 = python2Target1.getAltLabelContextStructName("hi!");
        java.lang.String str25 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\1" + "'", str8, "\\1");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!Context" + "'", str24, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getLanguage();
        python2Target1.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.stringtemplate.v4.STGroup sTGroup1 = python2Target0.templates;
        java.lang.String[] strArray2 = python2Target0.targetCharValueEscape;
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        python2Target0.gen = codeGenerator4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target0.getImplicitRuleLabel("_tset\"Hi!Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"_\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"_\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str1, "\"_\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        java.lang.String str6 = python2Target1.getListLabel("\\n");
        java.lang.String[] strArray7 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.lang.String[] strArray11 = python2Target10.targetCharValueEscape;
        java.lang.String str14 = python2Target10.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python2Target10.getTokenTypesAsTargetLabels(grammar15, intArray16);
        java.lang.String[] strArray18 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray16);
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray18;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset\\\\1" + "'", str14, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.gen;
        java.util.Set<java.lang.String> strSet9 = python2Target1.badWords;
        int int10 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        python2Target1.language = "\"\"";
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"_tsethi!\"" + "'", str1, "\"_tsethi!\"");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        java.lang.String[] strArray4 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getTokenTypeAsTargetLabel(grammar5, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.util.Set<java.lang.String> strSet6 = python2Target5.badWords;
        java.lang.String str8 = python2Target5.encodeIntAsCharEscape(64);
        java.lang.String str9 = python2Target5.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        python2Target5.templates = sTGroup14;
        python2Target1.templates = sTGroup14;
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromString("_tsethi!");
        org.antlr.v4.tool.Rule rule21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python2Target1.getRuleFunctionContextStructName(rule21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tsetContext" + "'", str18, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"_tsethi!\"" + "'", str20, "\"_tsethi!\"");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str12 = python2Target9.encodeIntAsCharEscape(64);
        java.lang.String str13 = python2Target9.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String[] strArray16 = python2Target15.targetCharValueEscape;
        java.lang.String str17 = python2Target15.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target15.getTemplates();
        python2Target9.templates = sTGroup18;
        python2Target1.templates = sTGroup18;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator21);
        java.lang.String[] strArray23 = python2Target22.targetCharValueEscape;
        java.lang.String str24 = python2Target22.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup25 = python2Target22.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator26);
        java.util.Set<java.lang.String> strSet28 = python2Target27.badWords;
        python2Target22.badWords = strSet28;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator30);
        java.util.Set<java.lang.String> strSet32 = python2Target31.badWords;
        java.lang.String str35 = python2Target31.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str37 = python2Target31.getImplicitRuleLabel("@");
        python2Target31.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target41 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator40);
        java.util.Set<java.lang.String> strSet42 = python2Target41.badWords;
        java.lang.String str44 = python2Target41.encodeIntAsCharEscape(64);
        java.lang.String str45 = python2Target41.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target47 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator46);
        java.lang.String[] strArray48 = python2Target47.targetCharValueEscape;
        java.lang.String str49 = python2Target47.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup50 = python2Target47.getTemplates();
        python2Target41.templates = sTGroup50;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = python2Target41.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup53 = python2Target41.loadTemplates();
        python2Target31.templates = sTGroup53;
        python2Target22.templates = sTGroup53;
        python2Target1.templates = sTGroup53;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str58 = python2Target1.getElementName("\"_tset\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(sTGroup25);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "_@" + "'", str37, "_@");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "@" + "'", str44, "@");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Python2" + "'", str45, "Python2");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Python2" + "'", str49, "Python2");
        org.junit.Assert.assertNotNull(sTGroup50);
        org.junit.Assert.assertNull(codeGenerator52);
        org.junit.Assert.assertNotNull(sTGroup53);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        java.lang.String str16 = python2Target1.getImplicitSetLabel("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str19 = python2Target1.getTargetStringLiteralFromString("_tset_tset_tsetContext", true);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str16, "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"_tset_tset_tsetContext\"" + "'", str19, "\"_tset_tset_tsetContext\"");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"Hi!Context\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Hi!Context\"Context" + "'", str10, "\"Hi!Context\"Context");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        java.util.Set<java.lang.String> strSet21 = python2Target10.getBadWords();
        python2Target1.badWords = strSet21;
        java.lang.String str24 = python2Target1.getAltLabelContextStructName("hi!");
        java.lang.String str25 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator26);
        java.lang.String[] strArray28 = python2Target27.targetCharValueEscape;
        java.lang.String str29 = python2Target27.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup30 = python2Target27.getTemplates();
        python2Target1.templates = sTGroup30;
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.stringtemplate.v4.ST sT33 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar32, sT33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\1" + "'", str8, "\\1");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!Context" + "'", str24, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Python2" + "'", str29, "Python2");
        org.junit.Assert.assertNotNull(sTGroup30);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        java.lang.String str6 = python2Target1.getListLabel("\\n");
        java.lang.String[] strArray7 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.lang.String[] strArray11 = python2Target10.targetCharValueEscape;
        java.lang.String str14 = python2Target10.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python2Target10.getTokenTypesAsTargetLabels(grammar15, intArray16);
        java.lang.String[] strArray18 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray16);
        java.lang.String[] strArray19 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python2Target1.getLoopLabel(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset\\\\1" + "'", str14, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"hi!\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python2Target1.gen = codeGenerator8;
        java.lang.String[] strArray10 = null;
        python2Target1.targetCharValueEscape = strArray10;
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar12, sT13, "_tsethi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) 100L, "\"_tsethi!\"", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getTokenTypeAsTargetLabel(grammar9, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("Python2");
        python2Target1.language = "";
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar11, sT12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2Context" + "'", str6, "Python2Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str10, "_\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup3 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", false);
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        python2Target1.addBadWords();
        boolean boolean10 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(sTGroup3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.util.Set<java.lang.String> strSet6 = python2Target5.badWords;
        java.lang.String str8 = python2Target5.encodeIntAsCharEscape(64);
        java.lang.String str9 = python2Target5.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        python2Target5.templates = sTGroup14;
        python2Target1.templates = sTGroup14;
        boolean boolean17 = python2Target1.templatesExist();
        java.lang.String str19 = python2Target1.getAltLabelContextStructName("_tsetContext");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python2Target1.getRuleFunctionContextStructName(ruleFunction20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tsetContextContext" + "'", str19, "_tsetContextContext");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        python2Target1.genRecognizerHeaderFile(grammar12, sT13, "\"_tset\"");
        java.util.Set<java.lang.String> strSet16 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target1.loadTemplates();
        org.antlr.v4.tool.Grammar grammar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getTokenTypeAsTargetLabel(grammar18, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(sTGroup17);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator7);
        java.util.Set<java.lang.String> strSet9 = python2Target8.badWords;
        java.lang.String str11 = python2Target8.encodeIntAsCharEscape(64);
        java.lang.String str12 = python2Target8.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String[] strArray15 = python2Target14.targetCharValueEscape;
        java.lang.String str16 = python2Target14.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target14.getTemplates();
        python2Target8.templates = sTGroup17;
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target8.templates;
        java.util.Set<java.lang.String> strSet20 = python2Target8.badWords;
        java.util.Set<java.lang.String> strSet21 = python2Target8.getBadWords();
        boolean boolean22 = python2Target8.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet23 = python2Target8.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup24 = python2Target8.getTemplates();
        python2Target1.templates = sTGroup24;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python2Target1.getElementListName("@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "@" + "'", str11, "@");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python2" + "'", str12, "Python2");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Python2" + "'", str16, "Python2");
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(sTGroup24);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"hi!\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python2Target1.gen = codeGenerator8;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        python2Target1.language = "\"\"";
        java.lang.String[] strArray6 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar7, sT8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.gen;
        java.lang.String str10 = python2Target1.getLanguage();
        java.lang.String str11 = python2Target1.getVersion();
        boolean boolean12 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("@");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "@" + "'", str1, "@");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str12 = python2Target9.encodeIntAsCharEscape(64);
        java.lang.String str13 = python2Target9.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String[] strArray16 = python2Target15.targetCharValueEscape;
        java.lang.String str17 = python2Target15.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target15.getTemplates();
        python2Target9.templates = sTGroup18;
        python2Target1.templates = sTGroup18;
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.stringtemplate.v4.ST sT22 = null;
        python2Target1.genRecognizerHeaderFile(grammar21, sT22, "\"\"");
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.stringtemplate.v4.ST sT26 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar25, sT26, "__tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.util.Set<java.lang.String> strSet6 = python2Target5.badWords;
        java.lang.String str8 = python2Target5.encodeIntAsCharEscape(64);
        java.lang.String str9 = python2Target5.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        python2Target5.templates = sTGroup14;
        python2Target1.templates = sTGroup14;
        boolean boolean17 = python2Target1.templatesExist();
        java.lang.String str19 = python2Target1.getAltLabelContextStructName("_tsetContext");
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tsetContextContext" + "'", str19, "_tsetContextContext");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("");
        python2Target1.language = "_tsetContext";
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("\"#\"");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset" + "'", str7, "_tset");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"#\"" + "'", str12, "_\"#\"");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.lang.String str8 = python2Target6.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        python2Target6.templates = sTGroup19;
        java.lang.String str23 = python2Target6.getAltLabelContextStructName("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        python2Target6.gen = codeGenerator24;
        java.util.Locale locale27 = null;
        java.lang.String str28 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator24, "\"hi!\"", locale27);
        java.lang.Object obj29 = null;
        java.util.Locale locale31 = null;
        java.lang.String str32 = pythonStringRenderer0.toString(obj29, "@", locale31);
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator33);
        java.util.Set<java.lang.String> strSet35 = python2Target34.badWords;
        java.lang.String str38 = python2Target34.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str40 = python2Target34.getTargetStringLiteralFromString("\"hi!\"");
        java.util.Set<java.lang.String> strSet41 = python2Target34.getBadWords();
        java.util.Locale locale43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = pythonStringRenderer0.toString((java.lang.Object) strSet41, "\\1Context", locale43);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.HashSet cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_tsetContext" + "'", str23, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"hi!\"" + "'", str28, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "@" + "'", str32, "@");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str40, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet41);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet16 = python2Target1.getBadWords();
        python2Target1.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target1.loadTemplates();
        python2Target1.language = "i";
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup21 = python2Target1.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(sTGroup18);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getImplicitTokenLabel("\"\\\"4.5.2.1\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        java.util.Set<java.lang.String> strSet21 = python2Target10.getBadWords();
        python2Target1.badWords = strSet21;
        java.lang.String str24 = python2Target1.getAltLabelContextStructName("hi!");
        java.lang.String str25 = python2Target1.getVersion();
        java.lang.String str26 = python2Target1.language;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python2Target1.getRuleFunctionContextStructName(ruleFunction27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\1" + "'", str8, "\\1");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!Context" + "'", str24, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Python2" + "'", str26, "Python2");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.templates;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNull(sTGroup6);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("\"_tset\"");
        boolean boolean13 = python2Target1.supportsOverloadedMethods();
        boolean boolean14 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset\"Context" + "'", str12, "\"_tset\"Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("Python2");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementName("\"tsetContex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2Context" + "'", str6, "Python2Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset" + "'", str9, "_tset");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getElementName("Hi!Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(sTGroup4);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String[] strArray15 = python2Target14.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target14.loadTemplates();
        python2Target1.templates = sTGroup16;
        java.lang.String str18 = python2Target1.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getLoopCounter(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"_tset\"", false);
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python2Target1.genRecognizerHeaderFile(grammar8, sT9, "");
        boolean boolean12 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset" + "'", str6, "_tset");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"hi!\"");
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        boolean boolean14 = python2Target1.supportsOverloadedMethods();
        java.lang.String str16 = python2Target1.getImplicitSetLabel("\"Hi!Context\"");
        java.lang.String str17 = python2Target1.language;
        java.lang.String str19 = python2Target1.getImplicitSetLabel("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar20, sT21, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset\"Hi!Context\"" + "'", str16, "_tset\"Hi!Context\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str19, "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "_tset");
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\\"hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str1, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.Class<?> wildcardClass1 = python2Target0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"hi!\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python2Target1.gen = codeGenerator8;
        java.lang.String[] strArray10 = null;
        python2Target1.targetCharValueEscape = strArray10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.templates;
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar14, sT15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("Hi!Context");
        java.util.Set<java.lang.String> strSet9 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "hi!", false);
        java.util.Set<java.lang.String> strSet14 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet15 = python2Target1.getBadWords();
        java.lang.String str16 = python2Target1.language;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"Hi!Context\"" + "'", str8, "\"Hi!Context\"");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "i" + "'", str13, "i");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Python2" + "'", str16, "Python2");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("_tset\\1", false);
        java.util.Set<java.lang.String> strSet6 = python2Target1.badWords;
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tset\\\\1" + "'", str5, "_tset\\\\1");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        python2Target1.gen = codeGenerator9;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("\"_tset\"");
        boolean boolean13 = python2Target1.supportsOverloadedMethods();
        boolean boolean14 = python2Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getElementListName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset\"Context" + "'", str12, "\"_tset\"Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.util.Set<java.lang.String> strSet6 = python2Target5.badWords;
        java.lang.String str8 = python2Target5.encodeIntAsCharEscape(64);
        java.lang.String str9 = python2Target5.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        python2Target5.templates = sTGroup14;
        python2Target1.templates = sTGroup14;
        boolean boolean17 = python2Target1.templatesExist();
        java.lang.String str19 = python2Target1.getTargetStringLiteralFromString("");
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target1.getTemplates();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup20);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1");
        java.lang.String str11 = python2Target1.language;
        int int12 = python2Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementListName("Python2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String[] strArray15 = python2Target14.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target14.loadTemplates();
        python2Target1.templates = sTGroup16;
        java.lang.String str18 = python2Target1.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "_@", true);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\"" + "'", str22, "\"\"");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("");
        python2Target1.language = "_tsetContext";
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        java.lang.String str11 = python2Target1.getLanguage();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset" + "'", str7, "_tset");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tsetContext" + "'", str11, "_tsetContext");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        python2Target1.addBadWords();
        java.lang.String str8 = python2Target1.getListLabel("_tset\"Hi!Context\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        boolean boolean12 = python2Target10.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target10.loadTemplates();
        python2Target1.templates = sTGroup13;
        java.lang.String str16 = python2Target1.encodeIntAsCharEscape(0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset\"Hi!Context\"" + "'", str8, "_tset\"Hi!Context\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\0" + "'", str16, "\\0");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("Python2");
        python2Target1.language = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2Context" + "'", str6, "Python2Context");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"_tset\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset" + "'", str6, "_tset");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getImplicitTokenLabel("\"tset_tsetContex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(sTGroup4);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("tsetContex");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tsetContex" + "'", str1, "tsetContex");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset_\"#\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset_\\\"#\\\"\"" + "'", str7, "\"_tset_\\\"#\\\"\"");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.wantsBaseListener();
        java.lang.String str18 = python2Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        java.lang.String[] strArray21 = python2Target20.targetCharValueEscape;
        java.lang.String str22 = python2Target20.getLanguage();
        java.lang.String str25 = python2Target20.getTargetStringLiteralFromString("_tset", true);
        java.util.Set<java.lang.String> strSet26 = python2Target20.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = python2Target20.gen;
        java.util.Set<java.lang.String> strSet28 = python2Target20.badWords;
        python2Target1.badWords = strSet28;
        java.lang.String str31 = python2Target1.getAltLabelContextStructName("_tset_tset\\\\1");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str18, "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Python2" + "'", str22, "Python2");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"_tset\"" + "'", str25, "\"_tset\"");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(codeGenerator27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "_tset_tset\\\\1Context" + "'", str31, "_tset_tset\\\\1Context");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        python2Target1.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("_tset_tsetContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("_tset\\1", false);
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tset\\\\1" + "'", str5, "_tset\\\\1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\\\"hi!\\\"\"", true);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python2Target1.genRecognizerHeaderFile(grammar10, sT11, "\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str9, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.lang.String[] strArray3 = python2Target2.targetCharValueEscape;
        java.lang.String str6 = python2Target2.getTargetStringLiteralFromString("Python2", false);
        java.lang.String[] strArray7 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target2.targetCharValueEscape = strArray7;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = pythonStringRenderer0.toString((java.lang.Object) python2Target2, "_tset_tset\\\\1Context", locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        python2Target1.language = "\"\"";
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("__tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.lang.String str11 = python2Target9.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator12);
        java.util.Set<java.lang.String> strSet14 = python2Target13.badWords;
        java.lang.String str16 = python2Target13.encodeIntAsCharEscape(64);
        java.lang.String str17 = python2Target13.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator18);
        java.lang.String[] strArray20 = python2Target19.targetCharValueEscape;
        java.lang.String str21 = python2Target19.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup22 = python2Target19.getTemplates();
        python2Target13.templates = sTGroup22;
        python2Target9.templates = sTGroup22;
        boolean boolean25 = python2Target9.templatesExist();
        java.lang.String[] strArray26 = python2Target9.targetCharValueEscape;
        python2Target1.targetCharValueEscape = strArray26;
        org.antlr.v4.tool.Grammar grammar28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = python2Target1.getTokenTypeAsTargetLabel(grammar28, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"__tset\"" + "'", str7, "\"__tset\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset" + "'", str11, "_tset");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "@" + "'", str16, "@");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Python2" + "'", str21, "Python2");
        org.junit.Assert.assertNotNull(sTGroup22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet16 = python2Target1.getBadWords();
        python2Target1.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertNull(codeGenerator19);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_@", true);
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python2Target1.genRecognizerHeaderFile(grammar8, sT9, "Hi!Context");
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.util.Set<java.lang.String> strSet6 = python2Target5.badWords;
        java.lang.String str8 = python2Target5.encodeIntAsCharEscape(64);
        java.lang.String str9 = python2Target5.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        python2Target5.templates = sTGroup14;
        python2Target1.templates = sTGroup14;
        boolean boolean17 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target1.gen;
        int int19 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.language;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar8, sT9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset");
        java.lang.String str7 = python2Target1.getVersion();
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("\\1");
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getTokenTypeAsTargetLabel(grammar11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\1Context" + "'", str9, "\\1Context");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset");
        java.lang.String str7 = python2Target1.getVersion();
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("\\1");
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\1Context" + "'", str9, "\\1Context");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getTokenTypeAsTargetLabel(grammar6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.lang.String str11 = python2Target1.language;
        java.lang.String str13 = python2Target1.getListLabel("\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"hi!\"" + "'", str13, "\"hi!\"");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("Python2");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Python2" + "'", str1, "Python2");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "\\1");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString(" ", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_@", true);
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getLanguage();
        python2Target1.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup10 = null;
        python2Target1.templates = sTGroup10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getElementName("_\"#\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        java.lang.String str6 = python2Target1.getListLabel("\\n");
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python2Target1.genRecognizerHeaderFile(grammar7, sT8, "\"4.5.2.1\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.lang.String str8 = python2Target6.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        python2Target6.templates = sTGroup19;
        java.lang.String str23 = python2Target6.getAltLabelContextStructName("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        python2Target6.gen = codeGenerator24;
        java.util.Locale locale27 = null;
        java.lang.String str28 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator24, "\"hi!\"", locale27);
        java.lang.Object obj29 = null;
        java.util.Locale locale31 = null;
        java.lang.String str32 = pythonStringRenderer0.toString(obj29, "@", locale31);
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator33);
        java.lang.String[] strArray35 = python2Target34.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup36 = python2Target34.loadTemplates();
        java.util.Locale locale38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = pythonStringRenderer0.toString((java.lang.Object) python2Target34, "\"hi!\"", locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_tsetContext" + "'", str23, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"hi!\"" + "'", str28, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "@" + "'", str32, "@");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(sTGroup36);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String[] strArray15 = python2Target14.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target14.loadTemplates();
        python2Target1.templates = sTGroup16;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getRuleFunctionContextStructName(ruleFunction18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(sTGroup16);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target1.genRecognizerHeaderFile(grammar11, sT12, "_@");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getElementListName("_tset_tset\\\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.stringtemplate.v4.STGroup sTGroup3 = python2Target0.templates;
        java.lang.String str4 = python2Target0.getLanguage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.wantsBaseListener();
        java.lang.String str18 = python2Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"", true);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python2Target1.gen;
        org.antlr.v4.tool.Rule rule21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python2Target1.getRuleFunctionContextStructName(rule21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str18, "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNull(codeGenerator20);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.wantsBaseListener();
        java.lang.String str18 = python2Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"", true);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python2Target1.gen;
        int int21 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str23 = python2Target1.encodeIntAsCharEscape(100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator24);
        java.lang.String[] strArray26 = python2Target25.targetCharValueEscape;
        java.lang.String str27 = python2Target25.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup28 = python2Target25.templates;
        java.lang.String str30 = python2Target25.getListLabel("\\n");
        java.lang.String[] strArray31 = python2Target25.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator33);
        java.lang.String[] strArray35 = python2Target34.targetCharValueEscape;
        java.lang.String str38 = python2Target34.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar39 = null;
        int[] intArray40 = new int[] {};
        java.lang.String[] strArray41 = python2Target34.getTokenTypesAsTargetLabels(grammar39, intArray40);
        java.lang.String[] strArray42 = python2Target25.getTokenTypesAsTargetLabels(grammar32, intArray40);
        java.lang.String[] strArray43 = python2Target25.targetCharValueEscape;
        python2Target1.targetCharValueEscape = strArray43;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str18, "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Python2" + "'", str27, "Python2");
        org.junit.Assert.assertNull(sTGroup28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\\n" + "'", str30, "\\n");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "_tset\\\\1" + "'", str38, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[]");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String[] strArray4 = python2Target1.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar6, sT7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset");
        java.lang.String str7 = python2Target1.getVersion();
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("\\1");
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar10, sT11, "_tset_\"#\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\1Context" + "'", str9, "\\1Context");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.util.Set<java.lang.String> strSet17 = python2Target16.badWords;
        java.lang.String str19 = python2Target16.encodeIntAsCharEscape(64);
        java.lang.String str20 = python2Target16.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator21);
        java.lang.String[] strArray23 = python2Target22.targetCharValueEscape;
        java.lang.String str24 = python2Target22.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup25 = python2Target22.getTemplates();
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = python2Target16.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup28 = python2Target16.loadTemplates();
        python2Target1.templates = sTGroup28;
        boolean boolean30 = python2Target1.supportsOverloadedMethods();
        java.lang.String str32 = python2Target1.encodeIntAsCharEscape((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = python2Target1.getImplicitTokenLabel("\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "@" + "'", str19, "@");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Python2" + "'", str20, "Python2");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(sTGroup25);
        org.junit.Assert.assertNull(codeGenerator27);
        org.junit.Assert.assertNotNull(sTGroup28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#" + "'", str32, "#");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String[] strArray4 = python2Target1.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementName("___tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        java.lang.String[] strArray13 = python2Target1.targetCharValueEscape;
        java.lang.Class<?> wildcardClass14 = strArray13.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.util.Set<java.lang.String> strSet6 = python2Target5.badWords;
        java.lang.String str8 = python2Target5.encodeIntAsCharEscape(64);
        java.lang.String str9 = python2Target5.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        python2Target5.templates = sTGroup14;
        python2Target1.templates = sTGroup14;
        boolean boolean17 = python2Target1.templatesExist();
        java.lang.String str19 = python2Target1.getAltLabelContextStructName("_tsetContext");
        python2Target1.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python2Target1.getLoopLabel(grammarAST21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tsetContextContext" + "'", str19, "_tsetContextContext");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.util.Set<java.lang.String> strSet6 = python2Target5.badWords;
        java.lang.String str8 = python2Target5.encodeIntAsCharEscape(64);
        java.lang.String str9 = python2Target5.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        python2Target5.templates = sTGroup14;
        python2Target1.templates = sTGroup14;
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        python2Target1.gen = codeGenerator19;
        org.antlr.v4.tool.Rule rule21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python2Target1.getRuleFunctionContextStructName(rule21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tsetContext" + "'", str18, "_tsetContext");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.antlr.v4.tool.Grammar grammar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getTokenTypeAsTargetLabel(grammar12, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"hi!\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python2Target1.gen = codeGenerator8;
        java.lang.String[] strArray10 = null;
        python2Target1.targetCharValueEscape = strArray10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.encodeIntAsCharEscape((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup12);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str10 = python2Target1.getImplicitSetLabel("\"tset_tsetContex\"");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset\"tset_tsetContex\"" + "'", str10, "_tset\"tset_tsetContex\"");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python2Target1.genRecognizerHeaderFile(grammar3, sT4, "hi!");
        python2Target1.language = "_\"_tset\"";
        java.util.Set<java.lang.String> strSet9 = python2Target1.badWords;
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python2Target1.genRecognizerHeaderFile(grammar10, sT11, "\"_tset\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getListLabel("_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset\"\"" + "'", str8, "_tset\"\"");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str12 = python2Target9.encodeIntAsCharEscape(64);
        java.lang.String str13 = python2Target9.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String[] strArray16 = python2Target15.targetCharValueEscape;
        java.lang.String str17 = python2Target15.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target15.getTemplates();
        python2Target9.templates = sTGroup18;
        python2Target1.templates = sTGroup18;
        boolean boolean21 = python2Target1.supportsOverloadedMethods();
        java.lang.String str22 = python2Target1.getVersion();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        python2Target1.language = "\"\"";
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("__tset");
        boolean boolean8 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"__tset\"" + "'", str7, "\"__tset\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"4.5.2.1\"");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("__tset");
        int int11 = python2Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"4.5.2.1\\\"\"" + "'", str8, "\"\\\"4.5.2.1\\\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tsetContext" + "'", str10, "__tsetContext");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        python2Target1.gen = codeGenerator14;
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getLoopLabel(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.lang.String[] strArray0 = null;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray0;
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\1" + "'", str8, "\\1");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("\"_tset\"");
        boolean boolean13 = python2Target1.supportsOverloadedMethods();
        boolean boolean14 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset\"Context" + "'", str12, "\"_tset\"Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str14 = python2Target10.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str16 = python2Target10.getImplicitRuleLabel("@");
        python2Target10.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        java.util.Set<java.lang.String> strSet21 = python2Target20.badWords;
        java.lang.String str23 = python2Target20.encodeIntAsCharEscape(64);
        java.lang.String str24 = python2Target20.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator25);
        java.lang.String[] strArray27 = python2Target26.targetCharValueEscape;
        java.lang.String str28 = python2Target26.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup29 = python2Target26.getTemplates();
        python2Target20.templates = sTGroup29;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python2Target20.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup32 = python2Target20.loadTemplates();
        python2Target10.templates = sTGroup32;
        python2Target1.templates = sTGroup32;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        java.lang.String str38 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator35, "@", false);
        boolean boolean39 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_@" + "'", str16, "_@");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "@" + "'", str23, "@");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Python2" + "'", str28, "Python2");
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertNull(codeGenerator31);
        org.junit.Assert.assertNotNull(sTGroup32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str14 = python2Target10.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str16 = python2Target10.getImplicitRuleLabel("@");
        python2Target10.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        java.util.Set<java.lang.String> strSet21 = python2Target20.badWords;
        java.lang.String str23 = python2Target20.encodeIntAsCharEscape(64);
        java.lang.String str24 = python2Target20.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator25);
        java.lang.String[] strArray27 = python2Target26.targetCharValueEscape;
        java.lang.String str28 = python2Target26.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup29 = python2Target26.getTemplates();
        python2Target20.templates = sTGroup29;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python2Target20.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup32 = python2Target20.loadTemplates();
        python2Target10.templates = sTGroup32;
        python2Target1.templates = sTGroup32;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        java.lang.String str38 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator35, "@", false);
        python2Target1.language = "\"4.5.2.1\"";
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target43 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator42);
        java.lang.String[] strArray44 = python2Target43.targetCharValueEscape;
        java.lang.String str47 = python2Target43.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar48 = null;
        int[] intArray49 = new int[] {};
        java.lang.String[] strArray50 = python2Target43.getTokenTypesAsTargetLabels(grammar48, intArray49);
        java.lang.String[] strArray51 = python2Target1.getTokenTypesAsTargetLabels(grammar41, intArray49);
        int int52 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator53 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target54 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator53);
        java.util.Set<java.lang.String> strSet55 = python2Target54.badWords;
        boolean boolean56 = python2Target54.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup57 = python2Target54.loadTemplates();
        python2Target1.templates = sTGroup57;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_@" + "'", str16, "_@");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "@" + "'", str23, "@");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Python2" + "'", str28, "Python2");
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertNull(codeGenerator31);
        org.junit.Assert.assertNotNull(sTGroup32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "_tset\\\\1" + "'", str47, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[]");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(sTGroup57);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        java.lang.String[] strArray4 = python2Target1.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.util.Set<java.lang.String> strSet6 = python2Target5.badWords;
        java.lang.String str8 = python2Target5.encodeIntAsCharEscape(64);
        java.lang.String str9 = python2Target5.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        python2Target5.templates = sTGroup14;
        python2Target1.templates = sTGroup14;
        boolean boolean17 = python2Target1.templatesExist();
        java.lang.String str19 = python2Target1.getAltLabelContextStructName("_tsetContext");
        boolean boolean20 = python2Target1.wantsBaseListener();
        java.lang.String str21 = python2Target1.getVersion();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tsetContextContext" + "'", str19, "_tsetContextContext");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = null; // flaky: python2Target1.getBadWords();
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet16 = null; // flaky: python2Target1.getBadWords();
// flaky:         python2Target1.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target1.loadTemplates();
        python2Target1.language = "i";
// flaky:         python2Target1.addBadWords();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
// flaky:         org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(sTGroup18);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getLanguage();
// flaky:         python2Target1.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_@", true);
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("\"\\\"hi!\\\"\"");
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"\\\"hi!\\\"\"" + "'", str8, "_\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\0" + "'", str11, "\\0");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        java.lang.String str6 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) '#');
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#" + "'", str9, "#");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"hi!\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str12 = python2Target9.encodeIntAsCharEscape(64);
        java.lang.String str13 = python2Target9.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String[] strArray16 = python2Target15.targetCharValueEscape;
        java.lang.String str17 = python2Target15.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target15.getTemplates();
        python2Target9.templates = sTGroup18;
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        python2Target9.genRecognizerHeaderFile(grammar20, sT21, "\"_tset\"");
        java.util.Set<java.lang.String> strSet24 = null; // flaky: python2Target9.getBadWords();
        python2Target1.badWords = strSet24;
        int int26 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
// flaky:         org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getLanguage();
// flaky:         python2Target1.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup10 = null;
        python2Target1.templates = sTGroup10;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(ruleFunction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementName("tsetContex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = null; // flaky: python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.util.Set<java.lang.String> strSet18 = python2Target17.badWords;
        java.lang.String str20 = python2Target17.encodeIntAsCharEscape(64);
        java.lang.String str21 = python2Target17.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target23 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator22);
        java.lang.String[] strArray24 = python2Target23.targetCharValueEscape;
        java.lang.String str25 = python2Target23.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup26 = python2Target23.getTemplates();
        python2Target17.templates = sTGroup26;
        org.stringtemplate.v4.STGroup sTGroup28 = python2Target17.templates;
        java.util.Set<java.lang.String> strSet29 = python2Target17.badWords;
        java.util.Set<java.lang.String> strSet30 = null; // flaky: python2Target17.getBadWords();
        boolean boolean31 = python2Target17.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet32 = null; // flaky: python2Target17.getBadWords();
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator34);
        java.lang.String[] strArray36 = python2Target35.targetCharValueEscape;
        java.lang.String str39 = python2Target35.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar40 = null;
        int[] intArray41 = new int[] {};
        java.lang.String[] strArray42 = python2Target35.getTokenTypesAsTargetLabels(grammar40, intArray41);
        java.lang.String[] strArray43 = python2Target17.getTokenTypesAsTargetLabels(grammar33, intArray41);
        java.lang.String[] strArray44 = python2Target1.getTokenTypesAsTargetLabels(grammar15, intArray41);
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        java.lang.String str48 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator45, "\"Hi!Context\"Context", true);
        org.antlr.v4.tool.Grammar grammar49 = null;
        org.stringtemplate.v4.ST sT50 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar49, sT50, "\"_tset_tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
// flaky:         org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "@" + "'", str20, "@");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Python2" + "'", str21, "Python2");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Python2" + "'", str25, "Python2");
        org.junit.Assert.assertNotNull(sTGroup26);
        org.junit.Assert.assertNotNull(sTGroup28);
        org.junit.Assert.assertNotNull(strSet29);
// flaky:         org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky:         org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "_tset\\\\1" + "'", str39, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[]");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\"Hi!Context\\\"Contex\"" + "'", str48, "\"Hi!Context\\\"Contex\"");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.util.Set<java.lang.String> strSet6 = python2Target5.badWords;
        java.lang.String str8 = python2Target5.encodeIntAsCharEscape(64);
        java.lang.String str9 = python2Target5.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        python2Target5.templates = sTGroup14;
        python2Target1.templates = sTGroup14;
        boolean boolean17 = python2Target1.templatesExist();
        java.lang.String str19 = python2Target1.getAltLabelContextStructName("_tsetContext");
// flaky:         python2Target1.addBadWords();
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.stringtemplate.v4.ST sT22 = null;
        python2Target1.genRecognizerHeaderFile(grammar21, sT22, "\"_tset_tset_tsetContext\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tsetContextContext" + "'", str19, "_tsetContextContext");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator7);
        java.util.Set<java.lang.String> strSet9 = python2Target8.badWords;
        java.lang.String str11 = python2Target8.encodeIntAsCharEscape(64);
        java.lang.String str12 = python2Target8.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String[] strArray15 = python2Target14.targetCharValueEscape;
        java.lang.String str16 = python2Target14.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target14.getTemplates();
        python2Target8.templates = sTGroup17;
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target8.templates;
        java.util.Set<java.lang.String> strSet20 = python2Target8.badWords;
        java.util.Set<java.lang.String> strSet21 = null; // flaky: python2Target8.getBadWords();
        boolean boolean22 = python2Target8.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet23 = null; // flaky: python2Target8.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup24 = python2Target8.getTemplates();
        python2Target1.templates = sTGroup24;
        org.antlr.v4.tool.Rule rule26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python2Target1.getRuleFunctionContextStructName(rule26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "@" + "'", str11, "@");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python2" + "'", str12, "Python2");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Python2" + "'", str16, "Python2");
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(strSet20);
// flaky:         org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(sTGroup24);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"hi!\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str12 = python2Target9.encodeIntAsCharEscape(64);
        java.lang.String str13 = python2Target9.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String[] strArray16 = python2Target15.targetCharValueEscape;
        java.lang.String str17 = python2Target15.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target15.getTemplates();
        python2Target9.templates = sTGroup18;
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        python2Target9.genRecognizerHeaderFile(grammar20, sT21, "\"_tset\"");
        java.util.Set<java.lang.String> strSet24 = null; // flaky: python2Target9.getBadWords();
        python2Target1.badWords = strSet24;
        java.lang.String str26 = python2Target1.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python2Target1.getLoopCounter(grammarAST27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
// flaky:         org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Python2" + "'", str26, "Python2");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        java.util.Set<java.lang.String> strSet10 = null; // flaky: python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.templates;
// flaky:         python2Target1.addBadWords();
        org.antlr.v4.tool.Rule rule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getRuleFunctionContextStructName(rule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
// flaky:         org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.gen;
        java.lang.String str12 = python2Target1.getImplicitSetLabel("\"\"");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\"\"" + "'", str12, "_tset\"\"");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = null; // flaky: python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet14 = null; // flaky: python2Target1.getBadWords();
        boolean boolean15 = python2Target1.wantsBaseListener();
        java.lang.String str18 = python2Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"", true);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python2Target1.gen;
        int int21 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet22 = python2Target1.badWords;
        org.antlr.v4.tool.ast.GrammarAST grammarAST23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target1.getLoopLabel(grammarAST23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
// flaky:         org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(codeGenerator13);
// flaky:         org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str18, "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"_tset\"", false);
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("", true);
        java.lang.String str12 = python2Target1.getAltLabelContextStructName(" ");
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset" + "'", str6, "_tset");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " Context" + "'", str12, " Context");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        java.util.Set<java.lang.String> strSet21 = null; // flaky: python2Target10.getBadWords();
        python2Target1.badWords = strSet21;
        java.lang.String str24 = python2Target1.getAltLabelContextStructName("hi!");
        java.lang.String str25 = python2Target1.getVersion();
        java.util.Set<java.lang.String> strSet26 = null; // flaky: python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass27 = null; // flaky: strSet26.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\1" + "'", str8, "\\1");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
// flaky:         org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!Context" + "'", str24, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
// flaky:         org.junit.Assert.assertNotNull(strSet26);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = null; // flaky: python2Target1.getBadWords();
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet16 = null; // flaky: python2Target1.getBadWords();
// flaky:         python2Target1.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target1.loadTemplates();
        python2Target1.language = "i";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python2Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
// flaky:         org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(sTGroup18);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        java.lang.String[] strArray14 = new java.lang.String[] { "@", "\"_tset\"", "\"hi!\"", "_tset\\1", "_tset\\\\1" };
        python2Target1.targetCharValueEscape = strArray14;
        java.lang.String str17 = python2Target1.getListLabel("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        java.lang.String str9 = python2Target6.encodeIntAsCharEscape(64);
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target6.loadTemplates();
        java.lang.String str11 = python2Target6.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target6.getCodeGenerator();
        java.util.Locale locale14 = null;
        java.lang.String str15 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator12, "__tsetContext", locale14);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.util.Set<java.lang.String> strSet18 = python2Target17.badWords;
        java.lang.String str20 = python2Target17.encodeIntAsCharEscape(64);
        java.lang.String str21 = python2Target17.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target23 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator22);
        java.lang.String[] strArray24 = python2Target23.targetCharValueEscape;
        java.lang.String str25 = python2Target23.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup26 = python2Target23.getTemplates();
        python2Target17.templates = sTGroup26;
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.stringtemplate.v4.ST sT29 = null;
        python2Target17.genRecognizerHeaderFile(grammar28, sT29, "\"_tset\"");
        java.util.Set<java.lang.String> strSet32 = null; // flaky: python2Target17.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup33 = python2Target17.loadTemplates();
        java.lang.String str35 = python2Target17.getAltLabelContextStructName("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str36 = python2Target17.language;
        java.util.Locale locale38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = pythonStringRenderer0.toString((java.lang.Object) python2Target17, "\\1Context", locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "@" + "'", str9, "@");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "__tsetContext" + "'", str15, "__tsetContext");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "@" + "'", str20, "@");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Python2" + "'", str21, "Python2");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Python2" + "'", str25, "Python2");
        org.junit.Assert.assertNotNull(sTGroup26);
// flaky:         org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(sTGroup33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context" + "'", str35, "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Python2" + "'", str36, "Python2");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.lang.String str7 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getTokenTypeAsTargetLabel(grammar9, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"4.5.2.1\"");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("__tset");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"4.5.2.1\\\"\"" + "'", str8, "\"\\\"4.5.2.1\\\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tsetContext" + "'", str10, "__tsetContext");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        java.lang.String str4 = python2Target1.language;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = null; // flaky: python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        java.lang.String str15 = python2Target1.getImplicitRuleLabel("_tset");
        python2Target1.language = "\"_tsethi!\"Context";
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
// flaky:         org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "__tset" + "'", str15, "__tset");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str14 = python2Target1.getImplicitSetLabel("\\1");
        java.util.Set<java.lang.String> strSet15 = null; // flaky: python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getImplicitTokenLabel("\"_\"\\\"hi!\\\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset\\1" + "'", str14, "_tset\\1");
// flaky:         org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"4.5.2.1\"");
        java.lang.String[] strArray9 = python2Target1.targetCharValueEscape;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"4.5.2.1\\\"\"" + "'", str8, "\"\\\"4.5.2.1\\\"\"");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = null; // flaky: python2Target1.getBadWords();
        java.lang.String str14 = python2Target1.getListLabel("_tset\\1");
        java.lang.String str15 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.util.Set<java.lang.String> strSet18 = python2Target17.badWords;
        java.lang.String str21 = python2Target17.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str23 = python2Target17.getImplicitRuleLabel("@");
        python2Target17.language = "hi!";
        java.util.Set<java.lang.String> strSet26 = null; // flaky: python2Target17.getBadWords();
        python2Target1.badWords = strSet26;
        java.lang.String str29 = python2Target1.encodeIntAsCharEscape((int) '4');
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
// flaky:         org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset\\1" + "'", str14, "_tset\\1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_@" + "'", str23, "_@");
// flaky:         org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\\64" + "'", str29, "\\64");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.util.Set<java.lang.String> strSet12 = python2Target11.badWords;
        java.lang.String str14 = python2Target11.encodeIntAsCharEscape(64);
        java.lang.String str15 = python2Target11.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.lang.String[] strArray18 = python2Target17.targetCharValueEscape;
        java.lang.String str19 = python2Target17.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target17.getTemplates();
        python2Target11.templates = sTGroup20;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python2Target11.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target11.loadTemplates();
        python2Target1.templates = sTGroup23;
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.stringtemplate.v4.ST sT26 = null;
        python2Target1.genRecognizerHeaderFile(grammar25, sT26, "\"\\\"hi!\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup29 = python2Target1.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertNotNull(sTGroup23);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup3 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", false);
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
// flaky:         python2Target1.addBadWords();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar10, sT11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(sTGroup3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str12 = python2Target9.encodeIntAsCharEscape(64);
        java.lang.String str13 = python2Target9.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String[] strArray16 = python2Target15.targetCharValueEscape;
        java.lang.String str17 = python2Target15.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target15.getTemplates();
        python2Target9.templates = sTGroup18;
        python2Target1.templates = sTGroup18;
        boolean boolean21 = python2Target1.supportsOverloadedMethods();
        java.lang.String str22 = python2Target1.language;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Python2" + "'", str22, "Python2");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.util.Set<java.lang.String> strSet3 = python2Target2.badWords;
        java.lang.String str5 = python2Target2.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target2.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator7);
        java.lang.String[] strArray9 = python2Target8.targetCharValueEscape;
        java.lang.String str10 = python2Target8.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target8.getTemplates();
        python2Target2.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target2.templates;
        java.util.Set<java.lang.String> strSet14 = python2Target2.badWords;
        java.util.Set<java.lang.String> strSet15 = null; // flaky: python2Target2.getBadWords();
        boolean boolean16 = python2Target2.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet17 = null; // flaky: python2Target2.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target2.getTemplates();
        python2Target0.templates = sTGroup18;
        org.antlr.v4.tool.Rule rule20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python2Target0.getRuleFunctionContextStructName(rule20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(strSet14);
// flaky:         org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(sTGroup18);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getImplicitTokenLabel("_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        java.lang.String[] strArray14 = new java.lang.String[] { "@", "\"_tset\"", "\"hi!\"", "_tset\\1", "_tset\\\\1" };
        python2Target1.targetCharValueEscape = strArray14;
        java.lang.String str16 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet17 = null; // flaky: python2Target1.getBadWords();
        java.lang.String str19 = python2Target1.getTargetStringLiteralFromString("\"#\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Python2" + "'", str16, "Python2");
// flaky:         org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"#\"\"" + "'", str19, "\"\"#\"\"");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        java.lang.String str4 = python2Target1.language;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet9 = null; // flaky: python2Target1.getBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertNull(codeGenerator8);
// flaky:         org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "_tset");
        python2Target1.language = "_tset\"Hi!Context\"";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getAltLabelContextStructName("\"\\\"4.5.2.1\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.gen;
        java.lang.String str12 = python2Target1.getImplicitSetLabel("_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"" + "'", str12, "_tset_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = null; // flaky: python2Target1.getBadWords();
// flaky:         python2Target1.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target1.getTemplates();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
// flaky:         org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(sTGroup14);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_@", true);
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("\"\\\"hi!\\\"\"");
        boolean boolean9 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("\"Hi!Context\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"\\\"hi!\\\"\"" + "'", str8, "_\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str14 = python2Target10.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str16 = python2Target10.getImplicitRuleLabel("@");
        python2Target10.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        java.util.Set<java.lang.String> strSet21 = python2Target20.badWords;
        java.lang.String str23 = python2Target20.encodeIntAsCharEscape(64);
        java.lang.String str24 = python2Target20.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator25);
        java.lang.String[] strArray27 = python2Target26.targetCharValueEscape;
        java.lang.String str28 = python2Target26.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup29 = python2Target26.getTemplates();
        python2Target20.templates = sTGroup29;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python2Target20.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup32 = python2Target20.loadTemplates();
        python2Target10.templates = sTGroup32;
        python2Target1.templates = sTGroup32;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        java.lang.String str38 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator35, "@", false);
        python2Target1.language = "\"4.5.2.1\"";
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target43 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator42);
        java.lang.String[] strArray44 = python2Target43.targetCharValueEscape;
        java.lang.String str47 = python2Target43.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar48 = null;
        int[] intArray49 = new int[] {};
        java.lang.String[] strArray50 = python2Target43.getTokenTypesAsTargetLabels(grammar48, intArray49);
        java.lang.String[] strArray51 = python2Target1.getTokenTypesAsTargetLabels(grammar41, intArray49);
        boolean boolean52 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_@" + "'", str16, "_@");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "@" + "'", str23, "@");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Python2" + "'", str28, "Python2");
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertNull(codeGenerator31);
        org.junit.Assert.assertNotNull(sTGroup32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "_tset\\\\1" + "'", str47, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[]");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"_@\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"_@\"" + "'", str1, "\"_@\"");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("\"_tset\"");
        boolean boolean13 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getLoopLabel(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset\"Context" + "'", str12, "\"_tset\"Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String[] strArray4 = new java.lang.String[] { "Python2" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray4;
        python2Target1.targetCharValueEscape = strArray4;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("#", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("__tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"#\"" + "'", str9, "\"#\"");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_@", true);
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("Python2Context", false);
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2Context" + "'", str9, "Python2Context");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        java.lang.String str9 = python2Target6.encodeIntAsCharEscape(64);
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target6.loadTemplates();
        java.lang.String str11 = python2Target6.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target6.getCodeGenerator();
        java.util.Locale locale14 = null;
        java.lang.String str15 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator12, "__tsetContext", locale14);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.util.Set<java.lang.String> strSet18 = python2Target17.badWords;
        java.lang.String str21 = python2Target17.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str23 = python2Target17.getImplicitRuleLabel("@");
        python2Target17.language = "hi!";
        boolean boolean26 = python2Target17.supportsOverloadedMethods();
        java.lang.String str28 = python2Target17.getTargetStringLiteralFromString("");
        java.lang.String str30 = python2Target17.getImplicitSetLabel("\\1");
        java.util.Set<java.lang.String> strSet31 = python2Target17.getBadWords();
        java.util.Locale locale33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = pythonStringRenderer0.toString((java.lang.Object) strSet31, "@", locale33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.HashSet cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "@" + "'", str9, "@");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "__tsetContext" + "'", str15, "__tsetContext");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_@" + "'", str23, "_@");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\"" + "'", str28, "\"\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "_tset\\1" + "'", str30, "_tset\\1");
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target1.genRecognizerHeaderFile(grammar6, sT7, "\"#\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tsetContext", false);
        boolean boolean13 = python2Target1.templatesExist();
        int int14 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\1" + "'", str8, "\\1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "tsetContex" + "'", str12, "tsetContex");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.util.Set<java.lang.String> strSet12 = python2Target11.badWords;
        java.lang.String str14 = python2Target11.encodeIntAsCharEscape(64);
        java.lang.String str15 = python2Target11.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.lang.String[] strArray18 = python2Target17.targetCharValueEscape;
        java.lang.String str19 = python2Target17.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target17.getTemplates();
        python2Target11.templates = sTGroup20;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python2Target11.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target11.loadTemplates();
        python2Target1.templates = sTGroup23;
        java.lang.String str26 = python2Target1.getListLabel("hi!");
        org.antlr.v4.tool.Grammar grammar27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = python2Target1.getTokenTypeAsTargetLabel(grammar27, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertNotNull(sTGroup23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.wantsBaseListener();
        java.lang.String str18 = python2Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        java.lang.String[] strArray21 = python2Target20.targetCharValueEscape;
        java.lang.String str22 = python2Target20.getLanguage();
        java.lang.String str25 = python2Target20.getTargetStringLiteralFromString("_tset", true);
        java.util.Set<java.lang.String> strSet26 = python2Target20.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = python2Target20.gen;
        java.util.Set<java.lang.String> strSet28 = python2Target20.badWords;
        python2Target1.badWords = strSet28;
        org.antlr.v4.tool.Rule rule30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = python2Target1.getRuleFunctionContextStructName(rule30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str18, "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Python2" + "'", str22, "Python2");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"_tset\"" + "'", str25, "\"_tset\"");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(codeGenerator27);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        java.lang.String str5 = python2Target1.getImplicitSetLabel("_\"#\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tset_\"#\"" + "'", str5, "_tset_\"#\"");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.util.Set<java.lang.String> strSet6 = python2Target5.badWords;
        java.lang.String str8 = python2Target5.encodeIntAsCharEscape(64);
        java.lang.String str9 = python2Target5.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        python2Target5.templates = sTGroup14;
        python2Target1.templates = sTGroup14;
        boolean boolean17 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet18 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar19, sT20, "_tset\\\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getLanguage();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python2Target1.gen = codeGenerator7;
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.templates;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target10.templates;
        java.lang.String[] strArray12 = python2Target10.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String[] strArray15 = python2Target14.targetCharValueEscape;
        java.lang.String str18 = python2Target14.getTargetStringLiteralFromString("Python2", false);
        java.lang.String[] strArray19 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target14.targetCharValueEscape = strArray19;
        python2Target10.targetCharValueEscape = strArray19;
        python2Target1.targetCharValueEscape = strArray19;
        org.antlr.v4.tool.ast.GrammarAST grammarAST23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target1.getLoopLabel(grammarAST23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"4.5.2.1\"" + "'", str6, "\"4.5.2.1\"");
        org.junit.Assert.assertNull(sTGroup9);
        org.junit.Assert.assertNull(sTGroup11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset");
        java.lang.String str7 = python2Target1.getVersion();
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        python2Target1.addBadWords();
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getTokenTypeAsTargetLabel(grammar11, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        java.lang.String str4 = python2Target1.language;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str13 = python2Target9.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str15 = python2Target9.getTargetStringLiteralFromString("\"hi!\"");
        java.util.Set<java.lang.String> strSet16 = python2Target9.getBadWords();
        python2Target1.badWords = strSet16;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str15, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        java.lang.String[] strArray4 = python2Target1.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet5 = python2Target1.badWords;
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar6, sT7, "_tset ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        python2Target1.language = "\"hi!\"";
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet16 = python2Target1.getBadWords();
        java.lang.String str18 = python2Target1.getImplicitSetLabel(" ");
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python2Target1.gen;
        java.lang.String str21 = python2Target1.getImplicitSetLabel("\"Hi!Context\"Context");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset " + "'", str18, "_tset ");
        org.junit.Assert.assertNull(codeGenerator19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_tset\"Hi!Context\"Context" + "'", str21, "_tset\"Hi!Context\"Context");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_@", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("_tset\"tset_tsetContex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet16 = python2Target1.getBadWords();
        python2Target1.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python2Target1.getCodeGenerator();
        boolean boolean20 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertNull(codeGenerator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean6 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"4.5.2.1\"" + "'", str5, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        java.lang.String str6 = python2Target1.getListLabel("\\n");
        java.lang.String[] strArray7 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.lang.String[] strArray11 = python2Target10.targetCharValueEscape;
        java.lang.String str14 = python2Target10.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python2Target10.getTokenTypesAsTargetLabels(grammar15, intArray16);
        java.lang.String[] strArray18 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray16);
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset\\\\1" + "'", str14, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean7 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getImplicitTokenLabel(" Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.lang.String str11 = python2Target1.language;
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.lang.String str8 = python2Target6.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        python2Target6.templates = sTGroup19;
        java.lang.String str23 = python2Target6.getAltLabelContextStructName("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        python2Target6.gen = codeGenerator24;
        java.util.Locale locale27 = null;
        java.lang.String str28 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator24, "\"hi!\"", locale27);
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target30 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator29);
        java.lang.String str32 = python2Target30.getImplicitSetLabel("");
        java.lang.String str33 = python2Target30.language;
        java.lang.String str36 = python2Target30.getTargetStringLiteralFromString("\"\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = python2Target30.getCodeGenerator();
        java.util.Set<java.lang.String> strSet38 = python2Target30.getBadWords();
        java.util.Locale locale40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = pythonStringRenderer0.toString((java.lang.Object) strSet38, "\"_@\"", locale40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.HashSet cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_tsetContext" + "'", str23, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"hi!\"" + "'", str28, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "_tset" + "'", str32, "_tset");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Python2" + "'", str33, "Python2");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"\\\"\\\"\"" + "'", str36, "\"\\\"\\\"\"");
        org.junit.Assert.assertNull(codeGenerator37);
        org.junit.Assert.assertNotNull(strSet38);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("");
        python2Target1.language = "_tsetContext";
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("Python2Context");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset" + "'", str7, "_tset");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python2ContextContext" + "'", str12, "Python2ContextContext");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar11, sT12, "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.util.Set<java.lang.String> strSet6 = python2Target5.badWords;
        java.lang.String str8 = python2Target5.encodeIntAsCharEscape(64);
        java.lang.String str9 = python2Target5.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        python2Target5.templates = sTGroup14;
        python2Target1.templates = sTGroup14;
        boolean boolean17 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target1.gen;
        boolean boolean19 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        python2Target1.genRecognizerHeaderFile(grammar20, sT21, "\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        java.lang.String str27 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator24, "\"\"", true);
        org.antlr.v4.tool.Rule rule28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = python2Target1.getRuleFunctionContextStructName(rule28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\"" + "'", str27, "\"\"");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset");
        java.lang.String str7 = python2Target1.getVersion();
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("\\1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\1Context" + "'", str9, "\\1Context");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python2Target1.genRecognizerHeaderFile(grammar9, sT10, "\\n");
        org.antlr.v4.tool.Grammar grammar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getTokenTypeAsTargetLabel(grammar13, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\1" + "'", str8, "\\1");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String[] strArray6 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target1.targetCharValueEscape = strArray6;
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_\"\\\"hi!\\\"\"");
        java.lang.String[] strArray11 = python2Target1.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getElementListName("_\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_\"\\\"hi!\\\"\"\"" + "'", str10, "\"_\"\\\"hi!\\\"\"\"");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("\"\"#\"\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"\"#\"\"" + "'", str7, "_\"\"#\"\"");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("\"_tset\"");
        boolean boolean13 = python2Target1.supportsOverloadedMethods();
        boolean boolean14 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet15 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "#", false);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset\"Context" + "'", str12, "\"_tset\"Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("\"_tset\"");
        boolean boolean13 = python2Target1.supportsOverloadedMethods();
        boolean boolean14 = python2Target1.wantsBaseListener();
        java.lang.String[] strArray15 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getLoopLabel(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset\"Context" + "'", str12, "\"_tset\"Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("");
        python2Target1.language = "_tsetContext";
        python2Target1.language = "\"Hi!Context\"Context";
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar12, sT13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset" + "'", str7, "_tset");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tset\\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tset\\n" + "'", str1, "_tset\\n");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target1.gen = codeGenerator11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementListName("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        boolean boolean14 = python2Target1.supportsOverloadedMethods();
        java.lang.String str16 = python2Target1.getImplicitSetLabel("\"Hi!Context\"");
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.stringtemplate.v4.ST sT18 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar17, sT18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset\"Hi!Context\"" + "'", str16, "_tset\"Hi!Context\"");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.wantsBaseListener();
        java.lang.String str18 = python2Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getElementListName("\\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str18, "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.util.Set<java.lang.String> strSet6 = python2Target5.badWords;
        java.lang.String str8 = python2Target5.encodeIntAsCharEscape(64);
        java.lang.String str9 = python2Target5.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        python2Target5.templates = sTGroup14;
        python2Target1.templates = sTGroup14;
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        python2Target1.gen = codeGenerator19;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python2Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tsetContext" + "'", str18, "_tsetContext");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.gen;
        java.lang.String str10 = python2Target1.getLanguage();
        java.lang.String str11 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator12);
        java.util.Set<java.lang.String> strSet14 = python2Target13.badWords;
        java.lang.String str17 = python2Target13.getTargetStringLiteralFromString("hi!", false);
        int int18 = python2Target13.getInlineTestSetWordSize();
        boolean boolean19 = python2Target13.wantsBaseVisitor();
        java.lang.String str20 = python2Target13.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup21 = python2Target13.loadTemplates();
        python2Target1.templates = sTGroup21;
        java.lang.String str24 = python2Target1.getAltLabelContextStructName("\"_tsethi!\"");
        java.lang.Class<?> wildcardClass25 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Python2" + "'", str20, "Python2");
        org.junit.Assert.assertNotNull(sTGroup21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"_tsethi!\"Context" + "'", str24, "\"_tsethi!\"Context");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str14 = python2Target10.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str16 = python2Target10.getImplicitRuleLabel("@");
        python2Target10.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        java.util.Set<java.lang.String> strSet21 = python2Target20.badWords;
        java.lang.String str23 = python2Target20.encodeIntAsCharEscape(64);
        java.lang.String str24 = python2Target20.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator25);
        java.lang.String[] strArray27 = python2Target26.targetCharValueEscape;
        java.lang.String str28 = python2Target26.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup29 = python2Target26.getTemplates();
        python2Target20.templates = sTGroup29;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python2Target20.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup32 = python2Target20.loadTemplates();
        python2Target10.templates = sTGroup32;
        python2Target1.templates = sTGroup32;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        java.lang.String str38 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator35, "@", false);
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target41 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator40);
        java.util.Set<java.lang.String> strSet42 = python2Target41.badWords;
        java.lang.String str44 = python2Target41.encodeIntAsCharEscape(64);
        java.lang.String str45 = python2Target41.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target47 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator46);
        java.lang.String[] strArray48 = python2Target47.targetCharValueEscape;
        java.lang.String str49 = python2Target47.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup50 = python2Target47.getTemplates();
        python2Target41.templates = sTGroup50;
        org.stringtemplate.v4.STGroup sTGroup52 = python2Target41.templates;
        java.util.Set<java.lang.String> strSet53 = python2Target41.badWords;
        java.util.Set<java.lang.String> strSet54 = python2Target41.getBadWords();
        boolean boolean55 = python2Target41.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet56 = python2Target41.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup57 = python2Target41.getTemplates();
        python2Target39.templates = sTGroup57;
        org.antlr.v4.codegen.CodeGenerator codeGenerator59 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target60 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator59);
        java.util.Set<java.lang.String> strSet61 = python2Target60.badWords;
        java.lang.String str63 = python2Target60.encodeIntAsCharEscape(64);
        java.lang.String str64 = python2Target60.getLanguage();
        java.lang.String str65 = python2Target60.getLanguage();
        java.lang.String str67 = python2Target60.getListLabel("\"tsetContex\"");
        java.lang.String[] strArray68 = python2Target60.targetCharValueEscape;
        python2Target39.targetCharValueEscape = strArray68;
        python2Target1.targetCharValueEscape = strArray68;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_@" + "'", str16, "_@");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "@" + "'", str23, "@");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Python2" + "'", str28, "Python2");
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertNull(codeGenerator31);
        org.junit.Assert.assertNotNull(sTGroup32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "@" + "'", str44, "@");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Python2" + "'", str45, "Python2");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Python2" + "'", str49, "Python2");
        org.junit.Assert.assertNotNull(sTGroup50);
        org.junit.Assert.assertNotNull(sTGroup52);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(sTGroup57);
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "@" + "'", str63, "@");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Python2" + "'", str64, "Python2");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Python2" + "'", str65, "Python2");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\"tsetContex\"" + "'", str67, "\"tsetContex\"");
        org.junit.Assert.assertNotNull(strArray68);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        boolean boolean14 = python2Target1.supportsOverloadedMethods();
        java.lang.String str16 = python2Target1.getListLabel("_@");
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "\"\"#\"\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python2Target1.getImplicitTokenLabel("_tset_tsetContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_@" + "'", str16, "_@");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\\\"#\\\"\"" + "'", str20, "\"\\\"#\\\"\"");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        python2Target1.genRecognizerHeaderFile(grammar12, sT13, "\"_tset\"");
        java.util.Set<java.lang.String> strSet16 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.util.Set<java.lang.String> strSet6 = python2Target5.badWords;
        java.lang.String str8 = python2Target5.encodeIntAsCharEscape(64);
        java.lang.String str9 = python2Target5.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        python2Target5.templates = sTGroup14;
        python2Target1.templates = sTGroup14;
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromString("_tsethi!");
        java.lang.String str22 = python2Target1.getImplicitRuleLabel("\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tsetContext" + "'", str18, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"_tsethi!\"" + "'", str20, "\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "_\"4.5.2.1\"" + "'", str22, "_\"4.5.2.1\"");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"" + "'", str1, "_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"_tset\"", false);
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("", true);
        python2Target1.language = "\"_tset_tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"";
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getLoopLabel(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset" + "'", str6, "_tset");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.stringtemplate.v4.STGroup sTGroup1 = python2Target0.templates;
        java.lang.String[] strArray2 = python2Target0.targetCharValueEscape;
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.getCodeGenerator();
        org.junit.Assert.assertNull(sTGroup1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(codeGenerator4);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getListLabel("_\"_tset\"");
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"_tset\"" + "'", str6, "_\"_tset\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context" + "'", str8, "__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("_tset_tset\\\\1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getLanguage();
        python2Target1.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup10 = null;
        python2Target1.templates = sTGroup10;
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"_tset\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.gen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementListName("_tset_tset\\\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset" + "'", str6, "_tset");
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.util.Set<java.lang.String> strSet3 = python2Target2.badWords;
        java.lang.String str5 = python2Target2.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target2.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator7);
        java.lang.String[] strArray9 = python2Target8.targetCharValueEscape;
        java.lang.String str10 = python2Target8.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target8.getTemplates();
        python2Target2.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target2.templates;
        java.util.Set<java.lang.String> strSet14 = python2Target2.badWords;
        java.util.Set<java.lang.String> strSet15 = python2Target2.getBadWords();
        boolean boolean16 = python2Target2.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet17 = python2Target2.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target2.getTemplates();
        python2Target0.templates = sTGroup18;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator20);
        java.util.Set<java.lang.String> strSet22 = python2Target21.badWords;
        java.lang.String str24 = python2Target21.encodeIntAsCharEscape(64);
        java.lang.String str25 = python2Target21.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator26);
        java.lang.String[] strArray28 = python2Target27.targetCharValueEscape;
        java.lang.String str29 = python2Target27.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup30 = python2Target27.getTemplates();
        python2Target21.templates = sTGroup30;
        java.util.Set<java.lang.String> strSet32 = python2Target21.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = python2Target21.getCodeGenerator();
        java.util.Set<java.lang.String> strSet34 = python2Target21.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target36 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator35);
        java.util.Set<java.lang.String> strSet37 = python2Target36.badWords;
        java.lang.String str39 = python2Target36.encodeIntAsCharEscape(64);
        java.lang.String str40 = python2Target36.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator41);
        java.lang.String[] strArray43 = python2Target42.targetCharValueEscape;
        java.lang.String str44 = python2Target42.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup45 = python2Target42.getTemplates();
        python2Target36.templates = sTGroup45;
        org.antlr.v4.codegen.CodeGenerator codeGenerator47 = python2Target36.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup48 = python2Target36.loadTemplates();
        python2Target21.templates = sTGroup48;
        python2Target0.templates = sTGroup48;
        org.antlr.v4.tool.ast.GrammarAST grammarAST51 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "@" + "'", str24, "@");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Python2" + "'", str25, "Python2");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Python2" + "'", str29, "Python2");
        org.junit.Assert.assertNotNull(sTGroup30);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNull(codeGenerator33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "@" + "'", str39, "@");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Python2" + "'", str40, "Python2");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Python2" + "'", str44, "Python2");
        org.junit.Assert.assertNotNull(sTGroup45);
        org.junit.Assert.assertNull(codeGenerator47);
        org.junit.Assert.assertNotNull(sTGroup48);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str12 = python2Target9.encodeIntAsCharEscape(64);
        java.lang.String str13 = python2Target9.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String[] strArray16 = python2Target15.targetCharValueEscape;
        java.lang.String str17 = python2Target15.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target15.getTemplates();
        python2Target9.templates = sTGroup18;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python2Target9.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup21 = python2Target9.loadTemplates();
        python2Target1.templates = sTGroup21;
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target1.getTemplates();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertNotNull(sTGroup21);
        org.junit.Assert.assertNotNull(sTGroup23);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.lang.String str8 = python2Target6.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        python2Target6.templates = sTGroup19;
        java.lang.String str23 = python2Target6.getAltLabelContextStructName("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        python2Target6.gen = codeGenerator24;
        java.util.Locale locale27 = null;
        java.lang.String str28 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator24, "\"hi!\"", locale27);
        java.lang.Object obj29 = null;
        java.util.Locale locale31 = null;
        java.lang.String str32 = pythonStringRenderer0.toString(obj29, "@", locale31);
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator33);
        java.lang.String[] strArray35 = python2Target34.targetCharValueEscape;
        java.lang.String str36 = python2Target34.getLanguage();
        java.lang.String str39 = python2Target34.getTargetStringLiteralFromString("_tset", true);
        java.util.Set<java.lang.String> strSet40 = python2Target34.badWords;
        java.util.Locale locale42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = pythonStringRenderer0.toString((java.lang.Object) python2Target34, "\\0", locale42);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_tsetContext" + "'", str23, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"hi!\"" + "'", str28, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "@" + "'", str32, "@");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Python2" + "'", str36, "Python2");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"_tset\"" + "'", str39, "\"_tset\"");
        org.junit.Assert.assertNotNull(strSet40);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"hi!\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str12 = python2Target9.encodeIntAsCharEscape(64);
        java.lang.String str13 = python2Target9.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String[] strArray16 = python2Target15.targetCharValueEscape;
        java.lang.String str17 = python2Target15.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target15.getTemplates();
        python2Target9.templates = sTGroup18;
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        python2Target9.genRecognizerHeaderFile(grammar20, sT21, "\"_tset\"");
        java.util.Set<java.lang.String> strSet24 = python2Target9.getBadWords();
        python2Target1.badWords = strSet24;
        org.antlr.v4.tool.ast.GrammarAST grammarAST26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("\"_tset\"");
        boolean boolean13 = python2Target1.supportsOverloadedMethods();
        boolean boolean14 = python2Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.encodeIntAsCharEscape((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset\"Context" + "'", str12, "\"_tset\"Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape(64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementListName("\"_tset\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getImplicitTokenLabel("_4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean7 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.lang.String str10 = python2Target1.getListLabel("_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context" + "'", str10, "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.util.Set<java.lang.String> strSet18 = python2Target17.badWords;
        java.lang.String str20 = python2Target17.encodeIntAsCharEscape(64);
        java.lang.String str21 = python2Target17.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target23 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator22);
        java.lang.String[] strArray24 = python2Target23.targetCharValueEscape;
        java.lang.String str25 = python2Target23.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup26 = python2Target23.getTemplates();
        python2Target17.templates = sTGroup26;
        org.stringtemplate.v4.STGroup sTGroup28 = python2Target17.templates;
        java.util.Set<java.lang.String> strSet29 = python2Target17.badWords;
        java.util.Set<java.lang.String> strSet30 = python2Target17.getBadWords();
        boolean boolean31 = python2Target17.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet32 = python2Target17.getBadWords();
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator34);
        java.lang.String[] strArray36 = python2Target35.targetCharValueEscape;
        java.lang.String str39 = python2Target35.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar40 = null;
        int[] intArray41 = new int[] {};
        java.lang.String[] strArray42 = python2Target35.getTokenTypesAsTargetLabels(grammar40, intArray41);
        java.lang.String[] strArray43 = python2Target17.getTokenTypesAsTargetLabels(grammar33, intArray41);
        java.lang.String[] strArray44 = python2Target1.getTokenTypesAsTargetLabels(grammar15, intArray41);
        boolean boolean45 = python2Target1.templatesExist();
        java.lang.String str47 = python2Target1.getTargetStringLiteralFromString("__@");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "@" + "'", str20, "@");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Python2" + "'", str21, "Python2");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Python2" + "'", str25, "Python2");
        org.junit.Assert.assertNotNull(sTGroup26);
        org.junit.Assert.assertNotNull(sTGroup28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "_tset\\\\1" + "'", str39, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[]");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"__@\"" + "'", str47, "\"__@\"");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet16 = python2Target1.getBadWords();
        java.lang.String str18 = python2Target1.getListLabel("\\n");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getElementListName("_\"\"#\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\n" + "'", str18, "\\n");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.util.Set<java.lang.String> strSet3 = python2Target2.badWords;
        java.lang.String str5 = python2Target2.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target2.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator7);
        java.lang.String[] strArray9 = python2Target8.targetCharValueEscape;
        java.lang.String str10 = python2Target8.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target8.getTemplates();
        python2Target2.templates = sTGroup11;
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        python2Target2.genRecognizerHeaderFile(grammar13, sT14, "\"_tset\"");
        boolean boolean17 = python2Target2.wantsBaseVisitor();
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = pythonStringRenderer0.toString((java.lang.Object) boolean17, "tsetContextContex", locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target1.genRecognizerHeaderFile(grammar11, sT12, "_@");
        boolean boolean15 = python2Target1.templatesExist();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.gen;
        python2Target1.language = "\"4.5.2.1\"";
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNotNull(sTGroup12);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.loadTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("_tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"Contex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("Python2");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.loadTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2Context" + "'", str6, "Python2Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\1" + "'", str9, "\\1");
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.lang.String str7 = python2Target1.getVersion();
        boolean boolean8 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getTokenTypeAsTargetLabel(grammar9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        python2Target1.genRecognizerHeaderFile(grammar12, sT13, "\"_tset\"");
        java.util.Set<java.lang.String> strSet16 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target1.loadTemplates();
        java.lang.String str19 = python2Target1.getAltLabelContextStructName("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target1.templates;
        java.lang.String[] strArray21 = python2Target1.targetCharValueEscape;
        java.lang.String str23 = python2Target1.encodeIntAsCharEscape((int) '#');
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context" + "'", str19, "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#" + "'", str23, "#");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        java.lang.String[] strArray14 = new java.lang.String[] { "@", "\"_tset\"", "\"hi!\"", "_tset\\1", "_tset\\\\1" };
        python2Target1.targetCharValueEscape = strArray14;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray14;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray14;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.gen;
        java.lang.String str10 = python2Target1.getLanguage();
        java.lang.String str11 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator12);
        java.util.Set<java.lang.String> strSet14 = python2Target13.badWords;
        java.lang.String str17 = python2Target13.getTargetStringLiteralFromString("hi!", false);
        int int18 = python2Target13.getInlineTestSetWordSize();
        boolean boolean19 = python2Target13.wantsBaseVisitor();
        java.lang.String str20 = python2Target13.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup21 = python2Target13.loadTemplates();
        python2Target1.templates = sTGroup21;
        java.lang.String str25 = python2Target1.getTargetStringLiteralFromString("4.5.2.1", false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Python2" + "'", str20, "Python2");
        org.junit.Assert.assertNotNull(sTGroup21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.gen;
        python2Target1.language = "\"4.5.2.1\"";
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar12, sT13, "\\\"\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.stringtemplate.v4.STGroup sTGroup1 = python2Target0.templates;
        java.lang.String[] strArray2 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target4 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator3);
        java.lang.String[] strArray5 = python2Target4.targetCharValueEscape;
        java.lang.String str8 = python2Target4.getTargetStringLiteralFromString("Python2", false);
        java.lang.String[] strArray9 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target4.targetCharValueEscape = strArray9;
        python2Target0.targetCharValueEscape = strArray9;
        python2Target0.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target0.getAltLabelContextStructName("_tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"Contex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("Hi!Context");
        java.lang.String str9 = python2Target1.getLanguage();
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"Hi!Context\"" + "'", str8, "\"Hi!Context\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getLanguage();
        python2Target1.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup10 = null;
        python2Target1.templates = sTGroup10;
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        java.lang.String str10 = python2Target1.getListLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar11, sT12, "\"d\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"4.5.2.1\"");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("__tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "_tsetContextContext", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.util.Set<java.lang.String> strSet17 = python2Target16.badWords;
        java.lang.String str19 = python2Target16.encodeIntAsCharEscape(64);
        java.lang.String str21 = python2Target16.getAltLabelContextStructName("Python2");
        boolean boolean22 = python2Target16.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String[] strArray25 = python2Target24.targetCharValueEscape;
        java.lang.String str26 = python2Target24.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup27 = python2Target24.loadTemplates();
        int int28 = python2Target24.getInlineTestSetWordSize();
        java.lang.String[] strArray29 = python2Target24.targetCharValueEscape;
        python2Target16.targetCharValueEscape = strArray29;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray29;
        python2Target1.targetCharValueEscape = strArray29;
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = python2Target1.gen;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"4.5.2.1\\\"\"" + "'", str8, "\"\\\"4.5.2.1\\\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tsetContext" + "'", str10, "__tsetContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "tsetContextContex" + "'", str14, "tsetContextContex");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "@" + "'", str19, "@");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Python2Context" + "'", str21, "Python2Context");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Python2" + "'", str26, "Python2");
        org.junit.Assert.assertNotNull(sTGroup27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 64 + "'", int28 == 64);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNull(codeGenerator33);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target1.genRecognizerHeaderFile(grammar11, sT12, "_@");
        java.lang.String str16 = python2Target1.encodeIntAsCharEscape((int) '#');
        int int17 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str19 = python2Target1.getImplicitRuleLabel("_\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#" + "'", str16, "#");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "__\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str19, "__\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.util.Set<java.lang.String> strSet3 = python2Target2.badWords;
        java.lang.String str5 = python2Target2.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target2.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator7);
        java.lang.String[] strArray9 = python2Target8.targetCharValueEscape;
        java.lang.String str10 = python2Target8.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target8.getTemplates();
        python2Target2.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target2.templates;
        java.util.Set<java.lang.String> strSet14 = python2Target2.badWords;
        java.util.Set<java.lang.String> strSet15 = python2Target2.getBadWords();
        boolean boolean16 = python2Target2.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet17 = python2Target2.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target2.getTemplates();
        python2Target0.templates = sTGroup18;
        java.lang.String str21 = python2Target0.getImplicitSetLabel("_tset_tsetContext");
        java.lang.String[] strArray22 = python2Target0.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target0.getLoopLabel(grammarAST23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_tset_tset_tsetContext" + "'", str21, "_tset_tset_tsetContext");
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet16 = python2Target1.getBadWords();
        python2Target1.addBadWords();
        python2Target1.addBadWords();
        java.lang.String[] strArray19 = python2Target1.targetCharValueEscape;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\1" + "'", str8, "\\1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"Contex");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"Contex" + "'", str1, "_tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"Contex");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.stringtemplate.v4.STGroup sTGroup1 = python2Target0.templates;
        java.lang.String[] strArray2 = python2Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target0.getTokenTypeAsTargetLabel(grammar3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.lang.String str7 = python2Target1.getVersion();
        boolean boolean8 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar9, sT10, "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"hi!\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python2Target1.genRecognizerHeaderFile(grammar3, sT4, "hi!");
        python2Target1.language = "_\"_tset\"";
        java.util.Set<java.lang.String> strSet9 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str15 = python2Target11.getTargetStringLiteralFromString("Python2", false);
        java.lang.String[] strArray16 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target11.targetCharValueEscape = strArray16;
        python2Target1.targetCharValueEscape = strArray16;
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar19, sT20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("_tset ");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_tset \"" + "'", str9, "\"_tset \"");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset");
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        python2Target1.language = "\"\"";
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("__tset");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getAltLabelContextStructName("\"_tset \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"__tset\"" + "'", str7, "\"__tset\"");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar13, sT14, "_tset\"Hi!Context\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.util.Set<java.lang.String> strSet6 = python2Target5.badWords;
        java.lang.String str8 = python2Target5.encodeIntAsCharEscape(64);
        java.lang.String str9 = python2Target5.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        python2Target5.templates = sTGroup14;
        python2Target1.templates = sTGroup14;
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("_tset");
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getLoopLabel(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tsetContext" + "'", str18, "_tsetContext");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.util.Set<java.lang.String> strSet6 = python2Target5.badWords;
        java.lang.String str8 = python2Target5.encodeIntAsCharEscape(64);
        java.lang.String str9 = python2Target5.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        python2Target5.templates = sTGroup14;
        python2Target1.templates = sTGroup14;
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        python2Target1.gen = codeGenerator19;
        python2Target1.language = "@";
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.stringtemplate.v4.ST sT25 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar24, sT25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tsetContext" + "'", str18, "_tsetContext");
        org.junit.Assert.assertNull(codeGenerator23);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getListLabel("_\"_tset\"");
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar7, sT8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"_tset\"" + "'", str6, "_\"_tset\"");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean7 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.loadTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"" + "'", str6, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        java.lang.String str6 = python2Target1.getListLabel("\\n");
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python2Target1.genRecognizerHeaderFile(grammar7, sT8, "\"4.5.2.1\"");
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar12, sT13, "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"\"");
        python2Target1.language = "\"_tset \"";
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset\"\"" + "'", str8, "_tset\"\"");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getListLabel("_\"_tset\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.gen;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"_tset\"" + "'", str6, "_\"_tset\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.lang.String[] strArray3 = python2Target2.targetCharValueEscape;
        java.lang.String str6 = python2Target2.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str7 = python2Target2.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target2.gen;
        java.util.Locale locale10 = null;
        java.lang.String str11 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator8, "\"4.5.2.1\"", locale10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator12);
        java.lang.String str15 = python2Target13.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.util.Set<java.lang.String> strSet18 = python2Target17.badWords;
        java.lang.String str20 = python2Target17.encodeIntAsCharEscape(64);
        java.lang.String str21 = python2Target17.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target23 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator22);
        java.lang.String[] strArray24 = python2Target23.targetCharValueEscape;
        java.lang.String str25 = python2Target23.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup26 = python2Target23.getTemplates();
        python2Target17.templates = sTGroup26;
        python2Target13.templates = sTGroup26;
        java.lang.String str30 = python2Target13.getAltLabelContextStructName("_tset");
        java.lang.String str31 = python2Target13.getLanguage();
        boolean boolean32 = python2Target13.supportsOverloadedMethods();
        java.lang.String str33 = python2Target13.getVersion();
        java.util.Locale locale35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = pythonStringRenderer0.toString((java.lang.Object) python2Target13, "\\\"\\\\\\\"hi!\\\\\\\"\\\"", locale35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"4.5.2.1\"" + "'", str11, "\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset" + "'", str15, "_tset");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "@" + "'", str20, "@");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Python2" + "'", str21, "Python2");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Python2" + "'", str25, "Python2");
        org.junit.Assert.assertNotNull(sTGroup26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "_tsetContext" + "'", str30, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Python2" + "'", str31, "Python2");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4.5.2.1" + "'", str33, "4.5.2.1");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        python2Target1.genRecognizerHeaderFile(grammar12, sT13, "\"_tset\"");
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar16, sT17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.gen;
        java.lang.String str10 = python2Target1.getLanguage();
        java.lang.String str11 = python2Target1.getVersion();
        boolean boolean12 = python2Target1.wantsBaseVisitor();
        python2Target1.language = "\\\"_tset_tset_tsetContext\\\"";
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.stringtemplate.v4.ST sT16 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar15, sT16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str14 = python2Target10.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str16 = python2Target10.getImplicitRuleLabel("@");
        python2Target10.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        java.util.Set<java.lang.String> strSet21 = python2Target20.badWords;
        java.lang.String str23 = python2Target20.encodeIntAsCharEscape(64);
        java.lang.String str24 = python2Target20.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator25);
        java.lang.String[] strArray27 = python2Target26.targetCharValueEscape;
        java.lang.String str28 = python2Target26.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup29 = python2Target26.getTemplates();
        python2Target20.templates = sTGroup29;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python2Target20.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup32 = python2Target20.loadTemplates();
        python2Target10.templates = sTGroup32;
        python2Target1.templates = sTGroup32;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        java.lang.String str38 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator35, "@", false);
        python2Target1.language = "\"4.5.2.1\"";
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target43 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator42);
        java.lang.String[] strArray44 = python2Target43.targetCharValueEscape;
        java.lang.String str47 = python2Target43.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar48 = null;
        int[] intArray49 = new int[] {};
        java.lang.String[] strArray50 = python2Target43.getTokenTypesAsTargetLabels(grammar48, intArray49);
        java.lang.String[] strArray51 = python2Target1.getTokenTypesAsTargetLabels(grammar41, intArray49);
        java.lang.Class<?> wildcardClass52 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_@" + "'", str16, "_@");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "@" + "'", str23, "@");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Python2" + "'", str28, "Python2");
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertNull(codeGenerator31);
        org.junit.Assert.assertNotNull(sTGroup32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "_tset\\\\1" + "'", str47, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[]");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.templates;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str12 = python2Target9.encodeIntAsCharEscape(64);
        java.lang.String str13 = python2Target9.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String[] strArray16 = python2Target15.targetCharValueEscape;
        java.lang.String str17 = python2Target15.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target15.getTemplates();
        python2Target9.templates = sTGroup18;
        python2Target1.templates = sTGroup18;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator21);
        java.lang.String[] strArray23 = python2Target22.targetCharValueEscape;
        java.lang.String str24 = python2Target22.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup25 = python2Target22.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator26);
        java.util.Set<java.lang.String> strSet28 = python2Target27.badWords;
        python2Target22.badWords = strSet28;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator30);
        java.util.Set<java.lang.String> strSet32 = python2Target31.badWords;
        java.lang.String str35 = python2Target31.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str37 = python2Target31.getImplicitRuleLabel("@");
        python2Target31.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target41 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator40);
        java.util.Set<java.lang.String> strSet42 = python2Target41.badWords;
        java.lang.String str44 = python2Target41.encodeIntAsCharEscape(64);
        java.lang.String str45 = python2Target41.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target47 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator46);
        java.lang.String[] strArray48 = python2Target47.targetCharValueEscape;
        java.lang.String str49 = python2Target47.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup50 = python2Target47.getTemplates();
        python2Target41.templates = sTGroup50;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = python2Target41.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup53 = python2Target41.loadTemplates();
        python2Target31.templates = sTGroup53;
        python2Target22.templates = sTGroup53;
        python2Target1.templates = sTGroup53;
        java.lang.String[] strArray57 = python2Target1.targetCharValueEscape;
        java.lang.String str59 = python2Target1.getListLabel(" ");
        org.antlr.v4.tool.Rule rule60 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = python2Target1.getRuleFunctionContextStructName(rule60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(sTGroup25);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "_@" + "'", str37, "_@");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "@" + "'", str44, "@");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Python2" + "'", str45, "Python2");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Python2" + "'", str49, "Python2");
        org.junit.Assert.assertNotNull(sTGroup50);
        org.junit.Assert.assertNull(codeGenerator52);
        org.junit.Assert.assertNotNull(sTGroup53);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + " " + "'", str59, " ");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.stringtemplate.v4.STGroup sTGroup1 = python2Target0.templates;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python2Target0.getRuleFunctionContextStructName(ruleFunction2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup1);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("");
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("Hi!Context");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"Hi!Context\"" + "'", str8, "\"Hi!Context\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.util.Set<java.lang.String> strSet12 = python2Target11.badWords;
        java.lang.String str14 = python2Target11.encodeIntAsCharEscape(64);
        java.lang.String str15 = python2Target11.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.lang.String[] strArray18 = python2Target17.targetCharValueEscape;
        java.lang.String str19 = python2Target17.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target17.getTemplates();
        python2Target11.templates = sTGroup20;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python2Target11.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target11.loadTemplates();
        python2Target1.templates = sTGroup23;
        java.lang.String str26 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator27);
        java.util.Set<java.lang.String> strSet29 = python2Target28.badWords;
        java.lang.String str31 = python2Target28.encodeIntAsCharEscape(64);
        java.lang.String str32 = python2Target28.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator33);
        java.lang.String[] strArray35 = python2Target34.targetCharValueEscape;
        java.lang.String str36 = python2Target34.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup37 = python2Target34.getTemplates();
        python2Target28.templates = sTGroup37;
        java.util.Set<java.lang.String> strSet39 = python2Target28.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = python2Target28.getCodeGenerator();
        java.util.Set<java.lang.String> strSet41 = python2Target28.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target43 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator42);
        java.util.Set<java.lang.String> strSet44 = python2Target43.badWords;
        java.lang.String str46 = python2Target43.encodeIntAsCharEscape(64);
        java.lang.String str47 = python2Target43.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target49 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator48);
        java.lang.String[] strArray50 = python2Target49.targetCharValueEscape;
        java.lang.String str51 = python2Target49.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup52 = python2Target49.getTemplates();
        python2Target43.templates = sTGroup52;
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = python2Target43.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup55 = python2Target43.loadTemplates();
        python2Target28.templates = sTGroup55;
        python2Target1.templates = sTGroup55;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = python2Target1.getCodeGenerator();
        java.lang.String str60 = python2Target1.getImplicitSetLabel("_tset_tsetContext");
        java.lang.Class<?> wildcardClass61 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertNotNull(sTGroup23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_tsethi!" + "'", str26, "_tsethi!");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "@" + "'", str31, "@");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Python2" + "'", str32, "Python2");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Python2" + "'", str36, "Python2");
        org.junit.Assert.assertNotNull(sTGroup37);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNull(codeGenerator40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "@" + "'", str46, "@");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Python2" + "'", str47, "Python2");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Python2" + "'", str51, "Python2");
        org.junit.Assert.assertNotNull(sTGroup52);
        org.junit.Assert.assertNull(codeGenerator54);
        org.junit.Assert.assertNotNull(sTGroup55);
        org.junit.Assert.assertNull(codeGenerator58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "_tset_tset_tsetContext" + "'", str60, "_tset_tset_tsetContext");
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        java.lang.String[] strArray14 = new java.lang.String[] { "@", "\"_tset\"", "\"hi!\"", "_tset\\1", "_tset\\\\1" };
        python2Target1.targetCharValueEscape = strArray14;
        java.lang.String str16 = python2Target1.getLanguage();
        boolean boolean17 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Python2" + "'", str16, "Python2");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.util.Set<java.lang.String> strSet6 = python2Target5.badWords;
        java.lang.String str8 = python2Target5.encodeIntAsCharEscape(64);
        java.lang.String str9 = python2Target5.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        python2Target5.templates = sTGroup14;
        python2Target1.templates = sTGroup14;
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        python2Target1.gen = codeGenerator19;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python2Target1.getCodeGenerator();
        java.lang.String str22 = python2Target1.getVersion();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tsetContext" + "'", str18, "_tsetContext");
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar3, sT4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.lang.String str8 = python2Target6.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        python2Target6.templates = sTGroup19;
        java.lang.String str23 = python2Target6.getAltLabelContextStructName("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        python2Target6.gen = codeGenerator24;
        java.util.Locale locale27 = null;
        java.lang.String str28 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator24, "\"hi!\"", locale27);
        java.util.Locale locale31 = null;
        java.lang.String str32 = pythonStringRenderer0.toString((java.lang.Object) "\"_tset_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"", "_4.5.2.1", locale31);
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator33);
        java.util.Set<java.lang.String> strSet35 = python2Target34.badWords;
        java.lang.String str37 = python2Target34.encodeIntAsCharEscape(64);
        org.stringtemplate.v4.STGroup sTGroup38 = python2Target34.loadTemplates();
        java.lang.String str39 = python2Target34.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = python2Target34.getCodeGenerator();
        java.lang.String str42 = python2Target34.getListLabel("__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String[] strArray43 = python2Target34.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet44 = python2Target34.getBadWords();
        java.util.Locale locale46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = pythonStringRenderer0.toString((java.lang.Object) python2Target34, "\\1", locale46);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_tsetContext" + "'", str23, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"hi!\"" + "'", str28, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "_4.5.2.1" + "'", str32, "_4.5.2.1");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "@" + "'", str37, "@");
        org.junit.Assert.assertNotNull(sTGroup38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Python2" + "'", str39, "Python2");
        org.junit.Assert.assertNull(codeGenerator40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str42, "__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strSet44);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.lang.String str8 = python2Target6.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        python2Target6.templates = sTGroup19;
        java.lang.String str23 = python2Target6.getAltLabelContextStructName("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        python2Target6.gen = codeGenerator24;
        java.util.Locale locale27 = null;
        java.lang.String str28 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator24, "\"hi!\"", locale27);
        java.util.Locale locale31 = null;
        java.lang.String str32 = pythonStringRenderer0.toString((java.lang.Object) "\"_tset_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"", "_4.5.2.1", locale31);
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator33);
        java.util.Set<java.lang.String> strSet35 = python2Target34.badWords;
        java.lang.String str37 = python2Target34.encodeIntAsCharEscape(64);
        java.lang.String str38 = python2Target34.getLanguage();
        java.lang.String str39 = python2Target34.getLanguage();
        java.lang.String str41 = python2Target34.getListLabel("\"tsetContex\"");
        java.lang.String[] strArray42 = python2Target34.targetCharValueEscape;
        java.util.Locale locale44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = pythonStringRenderer0.toString((java.lang.Object) strArray42, "", locale44);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.String; cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_tsetContext" + "'", str23, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"hi!\"" + "'", str28, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "_4.5.2.1" + "'", str32, "_4.5.2.1");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "@" + "'", str37, "@");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Python2" + "'", str38, "Python2");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Python2" + "'", str39, "Python2");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"tsetContex\"" + "'", str41, "\"tsetContex\"");
        org.junit.Assert.assertNotNull(strArray42);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getListLabel("_\"_tset\"");
        java.lang.String str8 = python2Target1.getListLabel("_4.5.2.1");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"_tset\"" + "'", str6, "_\"_tset\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_4.5.2.1" + "'", str8, "_4.5.2.1");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("___tsetContext");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "___tsetContext" + "'", str1, "___tsetContext");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.loadTemplates();
        java.lang.String str14 = python2Target1.getLanguage();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.wantsBaseListener();
        java.lang.String str18 = python2Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"", true);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.getTemplates();
        java.lang.Class<?> wildcardClass20 = sTGroup19.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str18, "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        python2Target1.addBadWords();
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        java.lang.String str6 = python2Target1.getListLabel("\\n");
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python2Target1.genRecognizerHeaderFile(grammar7, sT8, "\"4.5.2.1\"");
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str13 = python2Target1.encodeIntAsCharEscape(1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\1" + "'", str13, "\\1");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        java.lang.String[] strArray14 = new java.lang.String[] { "@", "\"_tset\"", "\"hi!\"", "_tset\\1", "_tset\\\\1" };
        python2Target1.targetCharValueEscape = strArray14;
        java.lang.String str17 = python2Target1.getListLabel("");
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target1.templates;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(sTGroup18);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target1.gen = codeGenerator6;
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"Contex");
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("\"_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"Contex" + "'", str9, "_tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"Contex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"_tset\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\"\"" + "'", str11, "\"\\\"_tset\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\"\"");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.lang.String str8 = python2Target6.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python2Target10.badWords;
        java.lang.String str13 = python2Target10.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str18 = python2Target16.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target16.getTemplates();
        python2Target10.templates = sTGroup19;
        python2Target6.templates = sTGroup19;
        java.lang.String str23 = python2Target6.getAltLabelContextStructName("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        python2Target6.gen = codeGenerator24;
        java.util.Locale locale27 = null;
        java.lang.String str28 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator24, "\"hi!\"", locale27);
        java.util.Locale locale31 = null;
        java.lang.String str32 = pythonStringRenderer0.toString((java.lang.Object) "\"_tset_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"", "_4.5.2.1", locale31);
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator33);
        java.util.Set<java.lang.String> strSet35 = python2Target34.badWords;
        java.lang.String str37 = python2Target34.encodeIntAsCharEscape(64);
        java.lang.String str38 = python2Target34.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target40 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator39);
        java.lang.String[] strArray41 = python2Target40.targetCharValueEscape;
        java.lang.String str42 = python2Target40.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup43 = python2Target40.getTemplates();
        python2Target34.templates = sTGroup43;
        java.util.Set<java.lang.String> strSet45 = python2Target34.getBadWords();
        java.lang.String[] strArray46 = python2Target34.targetCharValueEscape;
        java.util.Locale locale48 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = pythonStringRenderer0.toString((java.lang.Object) python2Target34, "_\"_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"", locale48);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_tsetContext" + "'", str23, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"hi!\"" + "'", str28, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "_4.5.2.1" + "'", str32, "_4.5.2.1");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "@" + "'", str37, "@");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Python2" + "'", str38, "Python2");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Python2" + "'", str42, "Python2");
        org.junit.Assert.assertNotNull(sTGroup43);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(strArray46);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
        java.lang.String str10 = python2Target1.getVersion();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        boolean boolean16 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "\"_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"", false);
        java.lang.String[] strArray21 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python2Target1.getLoopLabel(grammarAST22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"" + "'", str20, "_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"");
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("Python2");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.lang.String[] strArray11 = python2Target10.targetCharValueEscape;
        java.lang.String str12 = python2Target10.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target10.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.util.Set<java.lang.String> strSet16 = python2Target15.badWords;
        python2Target10.badWords = strSet16;
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        java.util.Set<java.lang.String> strSet21 = python2Target20.badWords;
        java.lang.String str23 = python2Target20.encodeIntAsCharEscape(64);
        java.lang.String str24 = python2Target20.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator25);
        java.lang.String[] strArray27 = python2Target26.targetCharValueEscape;
        java.lang.String str28 = python2Target26.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup29 = python2Target26.getTemplates();
        python2Target20.templates = sTGroup29;
        org.stringtemplate.v4.STGroup sTGroup31 = python2Target20.templates;
        java.util.Set<java.lang.String> strSet32 = python2Target20.badWords;
        java.util.Set<java.lang.String> strSet33 = python2Target20.getBadWords();
        boolean boolean34 = python2Target20.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet35 = python2Target20.getBadWords();
        org.antlr.v4.tool.Grammar grammar36 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator37);
        java.lang.String[] strArray39 = python2Target38.targetCharValueEscape;
        java.lang.String str42 = python2Target38.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar43 = null;
        int[] intArray44 = new int[] {};
        java.lang.String[] strArray45 = python2Target38.getTokenTypesAsTargetLabels(grammar43, intArray44);
        java.lang.String[] strArray46 = python2Target20.getTokenTypesAsTargetLabels(grammar36, intArray44);
        java.lang.String[] strArray47 = python2Target10.getTokenTypesAsTargetLabels(grammar18, intArray44);
        java.lang.String[] strArray48 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray44);
        org.antlr.v4.tool.Grammar grammar49 = null;
        org.stringtemplate.v4.ST sT50 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar49, sT50, "___tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2Context" + "'", str6, "Python2Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python2" + "'", str12, "Python2");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "@" + "'", str23, "@");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Python2" + "'", str28, "Python2");
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertNotNull(sTGroup31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "_tset\\\\1" + "'", str42, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\1" + "'", str8, "\\1");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet13 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet16 = python2Target1.getBadWords();
        python2Target1.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python2Target1.getCodeGenerator();
        boolean boolean20 = python2Target1.supportsOverloadedMethods();
        boolean boolean21 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python2Target1.getElementListName("Python2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertNull(codeGenerator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        java.lang.String str14 = python2Target1.getImplicitSetLabel("_tsetContext");
        java.util.Set<java.lang.String> strSet15 = python2Target1.getBadWords();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset_tsetContext" + "'", str14, "_tset_tsetContext");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.lang.String str7 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("_\"tsetContex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.lang.String str7 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("\"_tsethi!\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean7 = python2Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.loadTemplates();
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str12 = python2Target9.encodeIntAsCharEscape(64);
        java.lang.String str13 = python2Target9.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String[] strArray16 = python2Target15.targetCharValueEscape;
        java.lang.String str17 = python2Target15.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target15.getTemplates();
        python2Target9.templates = sTGroup18;
        python2Target1.templates = sTGroup18;
        boolean boolean21 = python2Target1.supportsOverloadedMethods();
        java.lang.String str22 = python2Target1.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target1.getLoopLabel(grammarAST23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Python2" + "'", str22, "Python2");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_@", true);
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target1.genRecognizerHeaderFile(grammar11, sT12, "_@");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getRuleFunctionContextStructName(ruleFunction15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str12 = python2Target9.encodeIntAsCharEscape(64);
        java.lang.String str13 = python2Target9.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String[] strArray16 = python2Target15.targetCharValueEscape;
        java.lang.String str17 = python2Target15.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target15.getTemplates();
        python2Target9.templates = sTGroup18;
        python2Target1.templates = sTGroup18;
        boolean boolean21 = python2Target1.supportsOverloadedMethods();
        java.lang.String str22 = python2Target1.getLanguage();
        java.lang.Class<?> wildcardClass23 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Python2" + "'", str22, "Python2");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        python2Target1.genRecognizerHeaderFile(grammar12, sT13, "\"_tset\"");
        java.util.Set<java.lang.String> strSet16 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target1.loadTemplates();
        java.lang.String str19 = python2Target1.getAltLabelContextStructName("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target1.templates;
        java.lang.String[] strArray21 = python2Target1.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray21;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context" + "'", str19, "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("_tset\\1", false);
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.loadTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tset\\\\1" + "'", str5, "_tset\\\\1");
        org.junit.Assert.assertNotNull(sTGroup6);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("Python2");
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\\64");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2Context" + "'", str6, "Python2Context");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\\64\"" + "'", str9, "\"\\\\64\"");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
    }
}
