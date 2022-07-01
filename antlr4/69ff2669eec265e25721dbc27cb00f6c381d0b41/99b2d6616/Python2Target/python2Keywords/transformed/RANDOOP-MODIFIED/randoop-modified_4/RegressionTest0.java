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
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar2, sT3, "@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar4, sT5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar9, sT10, "_@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getImplicitTokenLabel("\"\\\"hi!\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) 0.0d, "\"hi!\"", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getImplicitTokenLabel("_tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getLoopLabel(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
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
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
        java.lang.Class<?> wildcardClass6 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
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
        org.antlr.v4.tool.Rule rule17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getRuleFunctionContextStructName(rule17);
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
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar8, sT9, "_@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.tool.Rule rule1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = python2Target0.getRuleFunctionContextStructName(rule1);
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
        org.antlr.v4.tool.Grammar grammar17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getTokenTypeAsTargetLabel(grammar17, 0);
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
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.tool.ast.GrammarAST grammarAST1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST1);
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
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar2, sT3, "a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getListLabel("");
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray14 = new int[] { 64, 1, (short) -1, (byte) 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray15 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[64, 1, -1, 1, -1]");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar5, sT6, "Python2Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar8, sT9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getVersion();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        java.lang.Class<?> wildcardClass4 = python2Target0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertNotNull(wildcardClass4);
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
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.tool.Grammar grammar1 = null;
        int[] intArray7 = new int[] { (short) 1, (short) -1, 2147483647, 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = python2Target0.getTokenTypesAsTargetLabels(grammar1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, -1, 2147483647, 1, 1]");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String[] strArray11 = new java.lang.String[] { "\"hi!\"", "Python2", "Python2", "@", "_@" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        python2Target1.badWords = strSet12;
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
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
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
            boolean boolean13 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST12);
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
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar10, sT11, "\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("@", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "@" + "'", str3, "@");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray5;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = pythonStringRenderer0.toString((java.lang.Object) strArray5, "4.5.2.1", locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.String; cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertNotNull(strArray5);
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
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target1.templates;
        int int17 = python2Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getElementListName("@");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str15, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        int int4 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getElementName("@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) 100.0d, "\"_tset\"", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("a");
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("4.5.2.1");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AContext" + "'", str9, "AContext");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"4.5.2.1\"" + "'", str11, "\"4.5.2.1\"");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        org.antlr.v4.tool.Grammar grammar6 = null;
        int[] intArray11 = new int[] { (byte) 10, (byte) 100, (short) 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = python2Target1.getTokenTypesAsTargetLabels(grammar6, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 100, 0, 100]");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target1.templates;
        int int17 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST18);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str15, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.getAltLabelContextStructName("\\\"\\\"");
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.lang.Class<?> wildcardClass6 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\"\\\"Context" + "'", str4, "\\\"\\\"Context");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
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
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        python2Target1.language = "\"\\\"hi!\\\"\"";
        org.antlr.v4.tool.Rule rule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getRuleFunctionContextStructName(rule4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getTokenTypeAsTargetLabel(grammar6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        java.lang.String str9 = python2Target6.encodeIntAsCharEscape(64);
        java.lang.String str10 = python2Target6.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        java.lang.String[] strArray13 = python2Target12.targetCharValueEscape;
        java.lang.String str14 = python2Target12.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target12.getTemplates();
        python2Target6.templates = sTGroup15;
        java.util.Set<java.lang.String> strSet17 = python2Target6.getBadWords();
        java.lang.String str20 = python2Target6.getTargetStringLiteralFromString("\"hi!\"", true);
        org.stringtemplate.v4.STGroup sTGroup21 = python2Target6.templates;
        int int22 = python2Target6.getSerializedATNSegmentLimit();
        java.util.Locale locale24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = pythonStringRenderer0.toString((java.lang.Object) int22, "\"hi!\"", locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "@" + "'", str9, "@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str20, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("hi!");
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementName("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.getAltLabelContextStructName("\\\"\\\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\"\\\"Context" + "'", str4, "\\\"\\\"Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.getListLabel("\"_@\"");
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", false);
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar16, sT17, "\"_@\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_@\"" + "'", str12, "\"_@\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"hi!\\\"" + "'", str15, "\\\"hi!\\\"");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"_hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"_hi!\"" + "'", str1, "\"_hi!\"");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.getAltLabelContextStructName("\\\"\\\"");
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementListName("\"Python2Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\"\\\"Context" + "'", str4, "\\\"\\\"Context");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target1.badWords;
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar10, sT11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) "\\n", "\"\\\"\\\"\"", locale7);
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = pythonStringRenderer0.toString((java.lang.Object) 1.0f, "\"4.5.2.1\"", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"\\\"\"" + "'", str8, "\"\\\"\\\"\"");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_hi!", true);
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_hi!\"" + "'", str12, "\"_hi!\"");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("@", false);
        org.antlr.v4.tool.Rule rule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target0.getRuleFunctionContextStructName(rule4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "@" + "'", str3, "@");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getLoopCounter(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
        java.lang.String[] strArray6 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target1.targetCharValueEscape = strArray6;
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.lang.String str4 = python2Target2.getImplicitSetLabel("");
        java.util.Locale locale6 = null;
        java.lang.String str7 = pythonStringRenderer0.toString((java.lang.Object) "", "\"\"", locale6);
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = pythonStringRenderer0.toString((java.lang.Object) 10, "\\64", locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset" + "'", str4, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getElementListName("\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target1.gen = codeGenerator6;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar8, sT9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"\\\"\\\"\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\"" + "'", str11, "\\\"\\\"");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        python2Target0.addBadWords();
        org.antlr.v4.tool.Grammar grammar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target0.getTokenTypeAsTargetLabel(grammar2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getElementListName("\\64");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.getAltLabelContextStructName("\\\"\\\"");
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementName("_tset\\64");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\"\\\"Context" + "'", str4, "\\\"\\\"Context");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        python2Target1.language = "\"\\\"hi!\\\"\"";
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str11 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        int int10 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        boolean boolean3 = python2Target2.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet4 = python2Target2.badWords;
        java.lang.String str6 = python2Target2.getTargetStringLiteralFromString("");
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = pythonStringRenderer0.toString((java.lang.Object) python2Target2, "\\n", locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"4.5.2.1\"" + "'", str1, "\"4.5.2.1\"");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.getListLabel("\"_@\"");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"_@\"", "\"_@\"", "Python2Context", "\"hi!\"", "\"hi!\"" };
        python2Target1.targetCharValueEscape = strArray18;
        java.lang.String str21 = python2Target1.getAltLabelContextStructName("\"\"");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_@\"" + "'", str12, "\"_@\"");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\"Context" + "'", str21, "\"\"Context");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.getAltLabelContextStructName("\\\"\\\"");
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\"\\\"Context" + "'", str4, "\\\"\\\"Context");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        python2Target1.language = "a";
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
        java.lang.String[] strArray6 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target1.targetCharValueEscape = strArray6;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray6;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar2, sT3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        java.util.Set<java.lang.String> strSet19 = python2Target1.badWords;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python2Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getTokenTypeAsTargetLabel(grammar13, (int) (short) 100);
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
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("_@");
        java.lang.Class<?> wildcardClass14 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_@\"" + "'", str13, "\"_@\"");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        org.antlr.v4.tool.Grammar grammar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getTokenTypeAsTargetLabel(grammar3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar11, sT12, "\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python2Target1.getElementListName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getElementListName("_tset\\64");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup6);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("_@");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getImplicitTokenLabel("\"\\\"Python2Context\\\"\"");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_@\"" + "'", str13, "\"_@\"");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        java.lang.String[] strArray15 = python2Target11.targetCharValueEscape;
        python2Target1.targetCharValueEscape = strArray15;
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getLoopCounter(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
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
        boolean boolean13 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getLoopCounter(grammarAST14);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_hi!", true);
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar13, sT14, "\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_hi!\"" + "'", str12, "\"_hi!\"");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST19);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getRuleFunctionContextStructName(ruleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str4 = python2Target1.getImplicitSetLabel("\\64");
        org.antlr.v4.tool.Grammar grammar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getTokenTypeAsTargetLabel(grammar5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\\64" + "'", str4, "_tset\\64");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getElementListName("\\64Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
        org.stringtemplate.v4.STGroup sTGroup22 = python2Target6.loadTemplates();
        java.util.Locale locale24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = pythonStringRenderer0.toString((java.lang.Object) python2Target6, "\"\"", locale24);
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
        org.junit.Assert.assertNotNull(sTGroup22);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_hi!", true);
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.loadTemplates();
        boolean boolean14 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getLoopLabel(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_hi!\"" + "'", str12, "\"_hi!\"");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementName("_tset_tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\\64");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\64" + "'", str1, "\\64");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getLoopCounter(grammarAST13);
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
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementListName("\\\"\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str4 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target0.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        boolean boolean7 = python2Target6.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet8 = python2Target6.badWords;
        python2Target1.badWords = strSet8;
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar10, sT11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String[] strArray11 = new java.lang.String[] { "\"hi!\"", "Python2", "Python2", "@", "_@" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        python2Target1.badWords = strSet12;
        boolean boolean15 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.stringtemplate.v4.ST sT19 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar18, sT19, "\"_tset\\\\64\"");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str15, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertNull(codeGenerator17);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("_tset");
        boolean boolean12 = python2Target1.wantsBaseListener();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tset" + "'", str11, "_tset_tset");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\\\"hi!\\\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\"hi!\\\"" + "'", str1, "\\\"hi!\\\"");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getListLabel("Python2Context");
        java.lang.Class<?> wildcardClass6 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2Context" + "'", str5, "Python2Context");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target1.badWords;
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.language;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray18 = new int[] { (short) 10, 1, (-1), 'a', (short) -1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray19 = python2Target1.getTokenTypesAsTargetLabels(grammar11, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 1, -1, 97, -1, 52]");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        python2Target1.language = "\"\\\"hi!\\\"\"";
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) '4');
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\64" + "'", str5, "\\64");
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
        java.lang.String[] strArray6 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target1.targetCharValueEscape = strArray6;
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python2Target1.genRecognizerHeaderFile(grammar9, sT10, "\\1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "\"\\\"_tset\\\"\"", true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"_tset\\\"\"" + "'", str16, "\"\\\"_tset\\\"\"");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        int int4 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.language;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementListName("\\64Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str11 = python2Target1.getVersion();
        java.lang.String str12 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String str11 = python2Target1.getListLabel("_tset\\64");
        boolean boolean12 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\\64" + "'", str11, "_tset\\64");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray11 = new int[] { (-1), 64, (byte) -1, 'a', 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = python2Target1.getTokenTypesAsTargetLabels(grammar4, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 64, -1, 97, 10, 1]");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar9, sT10, "\"_hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.stringtemplate.v4.ST sT18 = null;
        python2Target1.genRecognizerHeaderFile(grammar17, sT18, "\\0");
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.stringtemplate.v4.ST sT22 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar21, sT22);
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
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target1.templates;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getImplicitTokenLabel("a");
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
        org.junit.Assert.assertNotNull(sTGroup17);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        int int3 = python2Target1.getInlineTestSetWordSize();
        boolean boolean4 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(sTGroup5);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getImplicitTokenLabel("\"_@\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python2Target1.gen = codeGenerator8;
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getImplicitTokenLabel("\"_@\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getElementListName("_tset\"hi!\"");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
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
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
        java.lang.String[] strArray6 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target1.targetCharValueEscape = strArray6;
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python2Target1.genRecognizerHeaderFile(grammar9, sT10, "\\1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String str16 = python2Target14.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python2Target14.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python2Target14.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "\"\\\"\\\"\"", false);
        int int25 = python2Target14.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup26 = python2Target14.loadTemplates();
        python2Target1.templates = sTGroup26;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = python2Target1.getRuleFunctionContextStructName(ruleFunction28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset" + "'", str16, "_tset");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"" + "'", str20, "\"\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\\"\\\"" + "'", str24, "\\\"\\\"");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup26);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        int int3 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("a");
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("4.5.2.1");
        boolean boolean12 = python2Target1.wantsBaseListener();
        boolean boolean13 = python2Target1.templatesExist();
        java.lang.String str15 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getLoopLabel(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AContext" + "'", str9, "AContext");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"4.5.2.1\"" + "'", str11, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "d" + "'", str15, "d");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("_tset");
        boolean boolean12 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tset" + "'", str11, "_tset_tset");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.getListLabel("\"_@\"");
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", false);
        java.lang.String str16 = python2Target1.getVersion();
        python2Target1.language = "AContext";
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_@\"" + "'", str12, "\"_@\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"hi!\\\"" + "'", str15, "\\\"hi!\\\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        python2Target0.addBadWords();
        boolean boolean2 = python2Target0.wantsBaseListener();
        java.lang.Class<?> wildcardClass3 = python2Target0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python2Target1.gen = codeGenerator7;
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = pythonStringRenderer0.toString((java.lang.Object) python2Target1, "_tset", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"hi!\"" + "'", str4, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tset\\64");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tset\\64" + "'", str1, "_tset\\64");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("d");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "d" + "'", str1, "d");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getImplicitTokenLabel("");
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
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_@", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("__tset\\64");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.lang.String str4 = python2Target2.getImplicitSetLabel("");
        java.util.Locale locale6 = null;
        java.lang.String str7 = pythonStringRenderer0.toString((java.lang.Object) "", "\"\"", locale6);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str12 = python2Target9.encodeIntAsCharEscape(64);
        java.lang.String str13 = python2Target9.getLanguage();
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = pythonStringRenderer0.toString((java.lang.Object) python2Target9, "\\1", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset" + "'", str4, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
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
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.getListLabel("\"_@\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_@\"" + "'", str12, "\"_@\"");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementListName("\"\\\"_@\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String[] strArray1 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "\"_tset\"", false);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target0.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tset" + "'", str5, "_tset");
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
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("\"\\\"_@\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"_@\\\"\"Context" + "'", str12, "\"\\\"_@\\\"\"Context");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        python2Target1.gen = codeGenerator19;
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.stringtemplate.v4.ST sT22 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar21, sT22, "AContext");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("hi!");
        org.antlr.v4.tool.Grammar grammar10 = null;
        int[] intArray17 = new int[] { 2147483647, (short) 100, (byte) -1, '#', (byte) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray18 = python2Target1.getTokenTypesAsTargetLabels(grammar10, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[2147483647, 100, -1, 35, 100, -1]");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.gen;
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.getListLabel("\"_@\"");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"_@\"", "\"_@\"", "Python2Context", "\"hi!\"", "\"hi!\"" };
        python2Target1.targetCharValueEscape = strArray18;
        boolean boolean20 = python2Target1.templatesExist();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_@\"" + "'", str12, "\"_@\"");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_hi!\"" + "'", str6, "\"_hi!\"");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str4 = python2Target0.getVersion();
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getElementListName("i");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        java.util.Set<java.lang.String> strSet19 = python2Target1.badWords;
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str11 = python2Target1.getVersion();
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar14, sT15, "__tset\\64");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"" + "'", str13, "\"\"");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        python2Target1.language = "a";
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar10, sT11);
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
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
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
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target2.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_@", false);
        python2Target2.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python2Target2.gen = codeGenerator8;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = pythonStringRenderer0.toString((java.lang.Object) python2Target2, "hi!", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "_tset\\64", false);
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
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str15, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tset6" + "'", str19, "tset6");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target1.gen = codeGenerator11;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String str16 = python2Target14.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        java.util.Set<java.lang.String> strSet19 = python2Target18.badWords;
        java.lang.String str21 = python2Target18.encodeIntAsCharEscape(64);
        java.lang.String str22 = python2Target18.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String[] strArray25 = python2Target24.targetCharValueEscape;
        java.lang.String str26 = python2Target24.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup27 = python2Target24.getTemplates();
        python2Target18.templates = sTGroup27;
        python2Target14.templates = sTGroup27;
        org.stringtemplate.v4.STGroup sTGroup30 = python2Target14.loadTemplates();
        python2Target1.templates = sTGroup30;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python2Target1.getElementName("\"\\\\\\\"\\\\\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset" + "'", str16, "_tset");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "@" + "'", str21, "@");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Python2" + "'", str22, "Python2");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Python2" + "'", str26, "Python2");
        org.junit.Assert.assertNotNull(sTGroup27);
        org.junit.Assert.assertNotNull(sTGroup30);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementListName("@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tset");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tset" + "'", str1, "_tset");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python2Target1.getImplicitSetLabel("");
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.loadTemplates();
        java.lang.Class<?> wildcardClass14 = sTGroup13.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset" + "'", str12, "_tset");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        python2Target1.language = "\"\\\"hi!\\\"\"";
        org.antlr.v4.codegen.model.RuleFunction ruleFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getRuleFunctionContextStructName(ruleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getImplicitTokenLabel("\\64Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target0.getLoopCounter(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet20 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python2Target1.getElementListName("\"\"Context");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String[] strArray11 = new java.lang.String[] { "\"hi!\"", "Python2", "Python2", "@", "_@" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        python2Target1.badWords = strSet12;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getRuleFunctionContextStructName(ruleFunction15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar13, sT14, "_\\\"\\\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset" + "'", str12, "_tset");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        python2Target1.language = "\"\\\"hi!\\\"\"";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"_AContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str4 = python2Target0.getVersion();
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getListLabel("Python2Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"_@\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("\"a\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2Context" + "'", str5, "Python2Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_@\"" + "'", str9, "\"_@\"");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
        java.lang.String[] strArray6 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target1.targetCharValueEscape = strArray6;
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        boolean boolean9 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar10, sT11, "\\\"\\\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("hi!");
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("\"hi!\"");
        java.lang.String str14 = python2Target1.getListLabel("_tset");
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray21 = new int[] { (-1), 100, (byte) -1, 0, 2147483647 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray22 = python2Target1.getTokenTypesAsTargetLabels(grammar15, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"hi!\"" + "'", str12, "_\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset" + "'", str14, "_tset");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 100, -1, 0, 2147483647]");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.util.Set<java.lang.String> strSet3 = python2Target2.badWords;
        java.lang.String str6 = python2Target2.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target2.getImplicitRuleLabel("@");
        java.lang.String str10 = python2Target2.getAltLabelContextStructName("a");
        java.lang.String str12 = python2Target2.getTargetStringLiteralFromString("4.5.2.1");
        java.lang.String str13 = python2Target2.language;
        java.lang.String str16 = python2Target2.getTargetStringLiteralFromString("a", true);
        java.util.Locale locale18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = pythonStringRenderer0.toString((java.lang.Object) true, "_tset_tset", locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AContext" + "'", str10, "AContext");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"4.5.2.1\"" + "'", str12, "\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"a\"" + "'", str16, "\"a\"");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str17 = python2Target1.getAltLabelContextStructName("\\1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getElementName("_AContext");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str15, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\1Context" + "'", str17, "\\1Context");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet9 = python2Target1.badWords;
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        python2Target1.language = "\"\\\"hi!\\\"\"";
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) '4');
        java.lang.String str6 = python2Target1.language;
        org.stringtemplate.v4.STGroup sTGroup7 = null;
        python2Target1.templates = sTGroup7;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\64" + "'", str5, "\\64");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str6, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.util.Set<java.lang.String> strSet3 = python2Target2.badWords;
        java.lang.String str6 = python2Target2.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target2.getImplicitRuleLabel("@");
        python2Target2.addBadWords();
        boolean boolean10 = python2Target2.wantsBaseListener();
        int int11 = python2Target2.getInlineTestSetWordSize();
        java.lang.String str12 = python2Target2.getVersion();
        java.util.Locale locale14 = null;
        java.lang.String str15 = pythonStringRenderer0.toString((java.lang.Object) str12, "\"a\"", locale14);
        java.util.Locale locale18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = pythonStringRenderer0.toString((java.lang.Object) (short) 1, " ", locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"a\"" + "'", str15, "\"a\"");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("a");
        java.lang.String str11 = python2Target1.getListLabel("\"\\\"hi!\\\"\"");
        python2Target1.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getRuleFunctionContextStructName(ruleFunction14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AContext" + "'", str9, "AContext");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str11, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.util.Set<java.lang.String> strSet12 = python2Target11.badWords;
        java.lang.String str15 = python2Target11.getTargetStringLiteralFromString("hi!", false);
        int int16 = python2Target11.getInlineTestSetWordSize();
        boolean boolean17 = python2Target11.wantsBaseListener();
        java.lang.String str19 = python2Target11.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator20);
        java.lang.String[] strArray22 = python2Target21.targetCharValueEscape;
        java.lang.String str23 = python2Target21.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup24 = python2Target21.getTemplates();
        java.lang.String[] strArray25 = python2Target21.targetCharValueEscape;
        python2Target11.targetCharValueEscape = strArray25;
        python2Target1.targetCharValueEscape = strArray25;
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.stringtemplate.v4.ST sT29 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar28, sT29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\n" + "'", str19, "\\n");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Python2" + "'", str23, "Python2");
        org.junit.Assert.assertNotNull(sTGroup24);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.getVersion();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet20 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python2Target1.getTokenTypeAsTargetLabel(grammar21, 64);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.util.Set<java.lang.String> strSet12 = python2Target11.badWords;
        java.lang.String str14 = python2Target11.encodeIntAsCharEscape(64);
        java.lang.String str17 = python2Target11.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str19 = python2Target11.getImplicitRuleLabel("hi!");
        java.lang.String str22 = python2Target11.getTargetStringLiteralFromString("_hi!", true);
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target11.templates;
        python2Target1.templates = sTGroup23;
        org.antlr.v4.tool.ast.GrammarAST grammarAST25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python2Target1.getLoopCounter(grammarAST25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"\\\"\"" + "'", str17, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_hi!" + "'", str19, "_hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"_hi!\"" + "'", str22, "\"_hi!\"");
        org.junit.Assert.assertNotNull(sTGroup23);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("\\64");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.lang.String[] strArray3 = python2Target2.targetCharValueEscape;
        java.lang.String str4 = python2Target2.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.lang.String[] strArray7 = python2Target6.targetCharValueEscape;
        java.lang.String str8 = python2Target6.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target6.getTemplates();
        python2Target2.templates = sTGroup9;
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = pythonStringRenderer0.toString((java.lang.Object) sTGroup9, "\"_@\"", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.stringtemplate.v4.STGroupFile cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar8, sT9, "_\"hi!\"");
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
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        java.lang.String str9 = python2Target6.encodeIntAsCharEscape(64);
        java.lang.String str10 = python2Target6.getLanguage();
        java.lang.String str12 = python2Target6.getListLabel("");
        java.lang.String str13 = python2Target6.getVersion();
        java.util.Set<java.lang.String> strSet14 = python2Target6.getBadWords();
        python2Target1.badWords = strSet14;
        boolean boolean16 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "@" + "'", str9, "@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        int int3 = python2Target1.getInlineTestSetWordSize();
        boolean boolean4 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "_\"\\\"\\\"\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\"\\\"\"" + "'", str9, "\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.getListLabel("i");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getRuleFunctionContextStructName(ruleFunction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "i" + "'", str12, "i");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str17 = python2Target1.getAltLabelContextStructName("\\1");
        java.lang.String str19 = python2Target1.getImplicitSetLabel("\\n");
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python2Target1.getLoopCounter(grammarAST20);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str15, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\1Context" + "'", str17, "\\1Context");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset\\n" + "'", str19, "_tset\\n");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
        java.lang.String[] strArray6 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target1.targetCharValueEscape = strArray6;
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"\\\"\\\"\"", false);
        python2Target1.language = "\\\"\\\"Context";
        org.antlr.v4.tool.Grammar grammar14 = null;
        int[] intArray19 = new int[] { 1, 0, 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray20 = python2Target1.getTokenTypesAsTargetLabels(grammar14, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\"" + "'", str11, "\\\"\\\"");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 0, 0]");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST17);
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
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\"\"" + "'", str1, "\"\\\"\\\"\"");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.loadTemplates();
        java.lang.String str21 = python2Target1.getImplicitRuleLabel("\"\\\"Python2Context\\\"\"");
        java.lang.String str22 = python2Target1.getVersion();
        org.antlr.v4.tool.Rule rule23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target1.getRuleFunctionContextStructName(rule23);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_\"\\\"Python2Context\\\"\"" + "'", str21, "_\"\\\"Python2Context\\\"\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet5 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\\1", false);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        int int16 = python2Target1.getInlineTestSetWordSize();
        int int17 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromString("\"\\\"\\\"\\\"\"", true);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str15, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\"\\\\\\\"\\\"\"" + "'", str20, "\"\\\"\\\\\\\"\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("Python2Context");
        java.lang.String str12 = python2Target1.getImplicitSetLabel("a");
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\"" + "'", str8, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python2Context\"" + "'", str10, "\"Python2Context\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tseta" + "'", str12, "_tseta");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python2Target1.gen = codeGenerator10;
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar12, sT13, "\\64Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"\\\"\\\"\"", false);
        python2Target1.language = "\\\"\\\"Context";
        java.lang.String str14 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\"" + "'", str11, "\\\"\\\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\\"\\\"Context" + "'", str14, "\\\"\\\"Context");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.util.Set<java.lang.String> strSet8 = python2Target7.badWords;
        boolean boolean9 = python2Target7.wantsBaseVisitor();
        boolean boolean10 = python2Target7.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        boolean boolean13 = python2Target12.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet14 = python2Target12.badWords;
        python2Target7.badWords = strSet14;
        int int16 = python2Target7.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target7.loadTemplates();
        python2Target1.templates = sTGroup17;
        python2Target1.addBadWords();
        java.lang.String str21 = python2Target1.getImplicitSetLabel("\"\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_tset\"\\\"\\\"\"" + "'", str21, "_tset\"\\\"\\\"\"");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_@", false);
        python2Target1.addBadWords();
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        int int4 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.language;
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.templates;
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNull(sTGroup6);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str11 = python2Target1.getVersion();
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
        java.lang.String str30 = python2Target13.getAltLabelContextStructName("Python2");
        org.stringtemplate.v4.STGroup sTGroup31 = python2Target13.loadTemplates();
        python2Target1.templates = sTGroup31;
        org.antlr.v4.tool.ast.GrammarAST grammarAST33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = python2Target1.getLoopCounter(grammarAST33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset" + "'", str15, "_tset");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "@" + "'", str20, "@");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Python2" + "'", str21, "Python2");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Python2" + "'", str25, "Python2");
        org.junit.Assert.assertNotNull(sTGroup26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Python2Context" + "'", str30, "Python2Context");
        org.junit.Assert.assertNotNull(sTGroup31);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        int int16 = python2Target1.getInlineTestSetWordSize();
        int int17 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str19 = python2Target1.encodeIntAsCharEscape(0);
        java.lang.Class<?> wildcardClass20 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str15, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\0" + "'", str19, "\\0");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        java.lang.String str10 = python2Target1.getListLabel("\"\\\\0\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementListName("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\0\"" + "'", str10, "\"\\\\0\"");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "\"\\\"_tset\\\"\"");
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\\\"\\\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\"\\\"" + "'", str1, "\\\"\\\"");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tset\\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tset\\n" + "'", str1, "_tset\\n");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_" + "'", str1, "_");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        org.antlr.v4.tool.Grammar grammar17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getTokenTypeAsTargetLabel(grammar17, (int) (byte) 0);
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
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        int int3 = python2Target1.getInlineTestSetWordSize();
        int int4 = python2Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementName("\"a\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        python2Target1.addBadWords();
        java.lang.String[] strArray11 = python2Target1.targetCharValueEscape;
        boolean boolean12 = python2Target1.templatesExist();
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"\\\"\\\\\\\"\\\\\\\"\\\\\\\"\\\"\"", true);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str15, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        int int3 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar4, sT5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_hi!", true);
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.templates;
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_hi!\"" + "'", str12, "\"_hi!\"");
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("_tset");
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tset" + "'", str11, "_tset_tset");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.getAltLabelContextStructName("\\\"\\\"");
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.loadTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\"\\\"Context" + "'", str4, "\\\"\\\"Context");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.gen;
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar10, sT11, "\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.util.Set<java.lang.String> strSet3 = python2Target2.badWords;
        java.lang.String str6 = python2Target2.getTargetStringLiteralFromString("hi!", false);
        int int7 = python2Target2.getInlineTestSetWordSize();
        boolean boolean8 = python2Target2.wantsBaseListener();
        java.util.Set<java.lang.String> strSet9 = python2Target2.badWords;
        java.lang.String str10 = python2Target2.getLanguage();
        java.lang.String str11 = python2Target2.getVersion();
        int int12 = python2Target2.getSerializedATNSegmentLimit();
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = pythonStringRenderer0.toString((java.lang.Object) python2Target2, "", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("a");
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("4.5.2.1");
        boolean boolean12 = python2Target1.wantsBaseListener();
        boolean boolean13 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getTokenTypeAsTargetLabel(grammar14, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AContext" + "'", str9, "AContext");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"4.5.2.1\"" + "'", str11, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.getAltLabelContextStructName("\\\"\\\"");
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\"\\\"Context" + "'", str4, "\\\"\\\"Context");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target1.genRecognizerHeaderFile(grammar11, sT12, "AContext");
        java.lang.String str15 = python2Target1.language;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        int int3 = python2Target1.getInlineTestSetWordSize();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getImplicitTokenLabel("\\64Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitSetLabel("a");
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("_tset\\64");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tseta" + "'", str9, "_tseta");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tset\\\\64\"" + "'", str11, "\"_tset\\\\64\"");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        python2Target1.language = "\"\\\"hi!\\\"\"";
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) '4');
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.language;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\64" + "'", str5, "\\64");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str8, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("Python2Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementListName("tset6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\"" + "'", str8, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python2Context\"" + "'", str10, "\"Python2Context\"");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"\\\"\\\"\"", false);
        int int12 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getRuleFunctionContextStructName(ruleFunction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\"" + "'", str11, "\\\"\\\"");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        python2Target1.language = "a";
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getListLabel("_AContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray10);
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
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.stringtemplate.v4.ST sT19 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar18, sT19);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str15, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertNull(codeGenerator17);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str4 = python2Target0.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tseti");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tseti" + "'", str1, "_tseti");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target1.gen = codeGenerator11;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String str16 = python2Target14.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        java.util.Set<java.lang.String> strSet19 = python2Target18.badWords;
        java.lang.String str21 = python2Target18.encodeIntAsCharEscape(64);
        java.lang.String str22 = python2Target18.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String[] strArray25 = python2Target24.targetCharValueEscape;
        java.lang.String str26 = python2Target24.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup27 = python2Target24.getTemplates();
        python2Target18.templates = sTGroup27;
        python2Target14.templates = sTGroup27;
        org.stringtemplate.v4.STGroup sTGroup30 = python2Target14.loadTemplates();
        python2Target1.templates = sTGroup30;
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.stringtemplate.v4.ST sT33 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar32, sT33, "\"_@\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset" + "'", str16, "_tset");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "@" + "'", str21, "@");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Python2" + "'", str22, "Python2");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Python2" + "'", str26, "Python2");
        org.junit.Assert.assertNotNull(sTGroup27);
        org.junit.Assert.assertNotNull(sTGroup30);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator12);
        java.lang.String[] strArray14 = python2Target13.targetCharValueEscape;
        java.lang.String str15 = python2Target13.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target13.getTemplates();
        python2Target1.templates = sTGroup16;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        python2Target1.gen = codeGenerator18;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tset" + "'", str11, "_tset_tset");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(sTGroup16);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target1.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tset" + "'", str11, "_tset_tset");
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        boolean boolean7 = python2Target6.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet8 = python2Target6.badWords;
        python2Target1.badWords = strSet8;
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("AContext");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_AContext" + "'", str12, "_AContext");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"\\\"\\\"\"", false);
        java.lang.String[] strArray12 = python2Target1.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementListName("\"_@\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\"" + "'", str11, "\\\"\\\"");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("AContext");
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("tset6");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_AContext" + "'", str12, "_AContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset6" + "'", str14, "_tset6");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_hi!", true);
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.templates;
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_hi!\"" + "'", str12, "\"_hi!\"");
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator12);
        java.lang.String[] strArray14 = python2Target13.targetCharValueEscape;
        java.lang.String str15 = python2Target13.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target13.getTemplates();
        python2Target1.templates = sTGroup16;
        boolean boolean18 = python2Target1.wantsBaseListener();
        boolean boolean19 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python2Target1.getElementName("_tseta");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tset" + "'", str11, "_tset_tset");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python2Target1.genRecognizerHeaderFile(grammar10, sT11, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\"" + "'", str8, "\"_tset\"");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.getAltLabelContextStructName("\\\"\\\"");
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("\"Python2Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\"\\\"Context" + "'", str4, "\\\"\\\"Context");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("a");
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("4.5.2.1");
        java.lang.String str12 = python2Target1.language;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("a", true);
        java.lang.String str18 = python2Target1.getTargetStringLiteralFromString("\"\\\"\\\"\\\"\"", false);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AContext" + "'", str9, "AContext");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"4.5.2.1\"" + "'", str11, "\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python2" + "'", str12, "Python2");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"a\"" + "'", str15, "\"a\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\\"\\\\\\\"\\\\\\\"\\\\\\\"\\\"" + "'", str18, "\\\"\\\\\\\"\\\\\\\"\\\\\\\"\\\"");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        boolean boolean7 = python2Target6.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet8 = python2Target6.badWords;
        python2Target1.badWords = strSet8;
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_hi!", true);
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.loadTemplates();
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar14, sT15, "d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_hi!\"" + "'", str12, "\"_hi!\"");
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target1.gen = codeGenerator11;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        boolean boolean6 = python2Target1.wantsBaseVisitor();
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        java.util.Set<java.lang.String> strSet13 = python2Target12.badWords;
        java.lang.String str15 = python2Target12.encodeIntAsCharEscape(64);
        java.lang.String str16 = python2Target12.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        java.lang.String[] strArray19 = python2Target18.targetCharValueEscape;
        java.lang.String str20 = python2Target18.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup21 = python2Target18.getTemplates();
        python2Target12.templates = sTGroup21;
        java.util.Set<java.lang.String> strSet23 = python2Target12.getBadWords();
        java.lang.String str26 = python2Target12.getTargetStringLiteralFromString("\"hi!\"", true);
        org.stringtemplate.v4.STGroup sTGroup27 = python2Target12.templates;
        python2Target1.templates = sTGroup27;
        org.stringtemplate.v4.STGroup sTGroup29 = python2Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = python2Target1.getTokenTypeAsTargetLabel(grammar30, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "@" + "'", str15, "@");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Python2" + "'", str16, "Python2");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Python2" + "'", str20, "Python2");
        org.junit.Assert.assertNotNull(sTGroup21);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str26, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup27);
        org.junit.Assert.assertNotNull(sTGroup29);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_hi!", true);
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_\"\\\\0\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_hi!\"" + "'", str6, "\"_hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"\\\\0\"Context" + "'", str8, "_\"\\\\0\"Context");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("a");
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("4.5.2.1");
        java.lang.String[] strArray12 = python2Target1.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "\"\\\"Python2Context\\\"\"", true);
        java.lang.String str18 = python2Target1.getImplicitSetLabel("tset6");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AContext" + "'", str9, "AContext");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"4.5.2.1\"" + "'", str11, "\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"Python2Context\\\"\"" + "'", str16, "\"\\\"Python2Context\\\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tsettset6" + "'", str18, "_tsettset6");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.loadTemplates();
        java.lang.String str22 = python2Target1.getTargetStringLiteralFromString("\"_tset\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar24 = null;
        int[] intArray30 = new int[] { (-1), ' ', (byte) 1, (byte) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray31 = python2Target1.getTokenTypesAsTargetLabels(grammar24, intArray30);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\"_tset\\\"\"" + "'", str22, "\"\\\"_tset\\\"\"");
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 32, 1, 100, 0]");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.loadTemplates();
        java.lang.String str22 = python2Target1.getTargetStringLiteralFromString("\"_tset\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Rule rule25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python2Target1.getRuleFunctionContextStructName(rule25);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\"_tset\\\"\"" + "'", str22, "\"\\\"_tset\\\"\"");
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertNull(codeGenerator24);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        java.lang.String str18 = python2Target1.getTargetStringLiteralFromString("\"Python2Context\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getRuleFunctionContextStructName(ruleFunction19);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"Python2Context\\\"\"" + "'", str18, "\"\\\"Python2Context\\\"\"");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        python2Target1.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementListName("_\\\"\\\\\\\"\\\\\\\"\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "\"\\\"_tset\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementListName("\"_hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator12);
        java.lang.String[] strArray14 = python2Target13.targetCharValueEscape;
        java.lang.String str15 = python2Target13.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target13.getTemplates();
        python2Target1.templates = sTGroup16;
        int int18 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tset" + "'", str11, "_tset_tset");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        java.lang.String[] strArray15 = python2Target11.targetCharValueEscape;
        python2Target1.targetCharValueEscape = strArray15;
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target1.loadTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(sTGroup17);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"\\\"\\\"\"", false);
        java.util.Set<java.lang.String> strSet12 = python2Target1.badWords;
        java.lang.String str14 = python2Target1.getAltLabelContextStructName("\\64");
        java.lang.String[] strArray15 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray15;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray15;
        python2Target1.targetCharValueEscape = strArray15;
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getLoopLabel(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\"" + "'", str11, "\\\"\\\"");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\64Context" + "'", str14, "\\64Context");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator12);
        java.lang.String[] strArray14 = python2Target13.targetCharValueEscape;
        java.lang.String str15 = python2Target13.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target13.getTemplates();
        python2Target1.templates = sTGroup16;
        boolean boolean18 = python2Target1.wantsBaseListener();
        boolean boolean19 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python2Target1.getImplicitTokenLabel("_tseti");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tset" + "'", str11, "_tset_tset");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"\\\"\\\"\"", false);
        java.util.Set<java.lang.String> strSet12 = python2Target1.badWords;
        java.lang.String str14 = python2Target1.getImplicitSetLabel("i");
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\"" + "'", str11, "\\\"\\\"");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tseti" + "'", str14, "_tseti");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("Python2");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Python2" + "'", str1, "Python2");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tset\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tset\"\\\"\\\"\"" + "'", str1, "_tset\"\\\"\\\"\"");
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
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getLoopLabel(grammarAST13);
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
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python2Target1.genRecognizerHeaderFile(grammar10, sT11, "\"\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.lang.String str4 = python2Target2.getImplicitSetLabel("");
        java.util.Locale locale6 = null;
        java.lang.String str7 = pythonStringRenderer0.toString((java.lang.Object) "", "\"\"", locale6);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str13 = python2Target9.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str15 = python2Target9.getImplicitRuleLabel("@");
        java.lang.String str17 = python2Target9.getAltLabelContextStructName("a");
        java.lang.String str19 = python2Target9.getTargetStringLiteralFromString("4.5.2.1");
        java.util.Locale locale21 = null;
        java.lang.String str22 = pythonStringRenderer0.toString((java.lang.Object) str19, "_@", locale21);
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String str26 = python2Target24.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        java.lang.String str30 = python2Target24.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator27, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        java.lang.String str34 = python2Target24.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator31, "\"\\\"\\\"\"", false);
        int int35 = python2Target24.getSerializedATNSegmentLimit();
        java.util.Locale locale37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = pythonStringRenderer0.toString((java.lang.Object) int35, "_\"\\\\0\"Context", locale37);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset" + "'", str4, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_@" + "'", str15, "_@");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AContext" + "'", str17, "AContext");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"4.5.2.1\"" + "'", str19, "\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "_@" + "'", str22, "_@");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_tset" + "'", str26, "_tset");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"\"" + "'", str30, "\"\"");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\\\"\\\"" + "'", str34, "\\\"\\\"");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
        java.lang.String[] strArray6 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target1.targetCharValueEscape = strArray6;
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python2Target1.genRecognizerHeaderFile(grammar9, sT10, "\\1");
        org.antlr.v4.tool.Grammar grammar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getTokenTypeAsTargetLabel(grammar13, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        java.lang.String[] strArray15 = python2Target11.targetCharValueEscape;
        python2Target1.targetCharValueEscape = strArray15;
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertNull(codeGenerator18);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        python2Target0.addBadWords();
        int int2 = python2Target0.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getVersion();
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("@", false);
        java.lang.String str14 = python2Target1.getImplicitSetLabel("a");
        boolean boolean15 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tseta" + "'", str14, "_tseta");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String[] strArray1 = python2Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar2, sT3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("hi!");
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        boolean boolean11 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getTokenTypeAsTargetLabel(grammar12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.loadTemplates();
        java.lang.String str22 = python2Target1.getTargetStringLiteralFromString("\"_tset\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python2Target1.getTokenTypeAsTargetLabel(grammar25, (int) (byte) 100);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\"_tset\\\"\"" + "'", str22, "\"\\\"_tset\\\"\"");
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertNull(codeGenerator24);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        python2Target1.addBadWords();
        java.lang.String[] strArray11 = python2Target1.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_\"\\\"Python2Context\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_\"\\\"Python2Context\\\"\"" + "'", str1, "_\"\\\"Python2Context\\\"\"");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str4 = python2Target0.getVersion();
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target0.getAltLabelContextStructName("\"\\\"_@\\\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet5 = python2Target1.badWords;
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.getListLabel("\"_@\"");
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", false);
        java.lang.String str16 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getLoopLabel(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_@\"" + "'", str12, "\"_@\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"hi!\\\"" + "'", str15, "\\\"hi!\\\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
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
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("_@");
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\\\"\\\"Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getElementName("_\\\"\\\\\\\"\\\\\\\"\\\"");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_@\"" + "'", str13, "\"_@\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\\\\\"\\\\\\\"Context\"" + "'", str15, "\"\\\\\\\"\\\\\\\"Context\"");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_@", false);
        python2Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python2Target1.gen = codeGenerator7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        boolean boolean7 = python2Target6.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet8 = python2Target6.badWords;
        python2Target1.badWords = strSet8;
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.loadTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.stringtemplate.v4.ST sT18 = null;
        python2Target1.genRecognizerHeaderFile(grammar17, sT18, "\\0");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python2Target1.getRuleFunctionContextStructName(ruleFunction21);
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
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str4 = python2Target0.getVersion();
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar6, sT7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        java.lang.String[] strArray15 = python2Target11.targetCharValueEscape;
        python2Target1.targetCharValueEscape = strArray15;
        java.lang.String str17 = python2Target1.language;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getImplicitTokenLabel("_hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.stringtemplate.v4.ST sT18 = null;
        python2Target1.genRecognizerHeaderFile(grammar17, sT18, "\\0");
        java.lang.String str22 = python2Target1.getListLabel("\"a\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST23);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"a\"" + "'", str22, "\"a\"");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.lang.String str4 = python2Target2.getImplicitSetLabel("");
        java.util.Locale locale6 = null;
        java.lang.String str7 = pythonStringRenderer0.toString((java.lang.Object) "", "\"\"", locale6);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str13 = python2Target9.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str15 = python2Target9.getImplicitRuleLabel("@");
        java.lang.String str17 = python2Target9.getAltLabelContextStructName("a");
        java.lang.String str19 = python2Target9.getTargetStringLiteralFromString("4.5.2.1");
        java.util.Locale locale21 = null;
        java.lang.String str22 = pythonStringRenderer0.toString((java.lang.Object) str19, "_@", locale21);
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.util.Set<java.lang.String> strSet25 = python2Target24.badWords;
        java.lang.String str27 = python2Target24.encodeIntAsCharEscape(64);
        java.lang.String str30 = python2Target24.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str32 = python2Target24.getImplicitRuleLabel("hi!");
        java.lang.String str35 = python2Target24.getTargetStringLiteralFromString("_hi!", true);
        java.lang.String[] strArray36 = python2Target24.targetCharValueEscape;
        java.util.Locale locale38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = pythonStringRenderer0.toString((java.lang.Object) python2Target24, "\"\\\\0\"", locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset" + "'", str4, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_@" + "'", str15, "_@");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AContext" + "'", str17, "AContext");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"4.5.2.1\"" + "'", str19, "\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "_@" + "'", str22, "_@");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "@" + "'", str27, "@");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"\\\"\\\"\"" + "'", str30, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "_hi!" + "'", str32, "_hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"_hi!\"" + "'", str35, "\"_hi!\"");
        org.junit.Assert.assertNotNull(strArray36);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        java.lang.String[] strArray15 = python2Target11.targetCharValueEscape;
        python2Target1.targetCharValueEscape = strArray15;
        java.lang.String str17 = python2Target1.language;
        java.lang.Class<?> wildcardClass18 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str4 = python2Target1.getImplicitSetLabel("\\64");
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\\64" + "'", str4, "_tset\\64");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\0" + "'", str9, "\\0");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
        java.lang.String[] strArray6 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target1.targetCharValueEscape = strArray6;
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar9, sT10, "\"_@\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        python2Target1.language = "a";
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target1.genRecognizerHeaderFile(grammar11, sT12, "\"4.5.2.1\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getImplicitTokenLabel("#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getElementName("_tset6Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("hi!");
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("\"hi!\"");
        java.lang.String str14 = python2Target1.getListLabel("_tset");
        java.lang.Class<?> wildcardClass15 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"hi!\"" + "'", str12, "_\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset" + "'", str14, "_tset");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        java.lang.String[] strArray15 = python2Target11.targetCharValueEscape;
        python2Target1.targetCharValueEscape = strArray15;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getElementName("@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("AContext");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getRuleFunctionContextStructName(ruleFunction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_AContext" + "'", str12, "_AContext");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_@", false);
        python2Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python2Target1.gen = codeGenerator7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) "_tset\\n", "Python2Context", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        java.lang.String str10 = python2Target6.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str12 = python2Target6.getImplicitRuleLabel("@");
        java.lang.String str14 = python2Target6.getAltLabelContextStructName("a");
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromString("4.5.2.1");
        boolean boolean17 = python2Target6.wantsBaseListener();
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = pythonStringRenderer0.toString((java.lang.Object) boolean17, "_@", locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2Context" + "'", str4, "Python2Context");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_@" + "'", str12, "_@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AContext" + "'", str14, "AContext");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"4.5.2.1\"" + "'", str16, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        python2Target1.addBadWords();
        java.lang.String[] strArray11 = python2Target1.targetCharValueEscape;
        boolean boolean12 = python2Target1.templatesExist();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitSetLabel("a");
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tseta" + "'", str9, "_tseta");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python2Target1.genRecognizerHeaderFile(grammar8, sT9, "_@");
        java.lang.String[] strArray12 = null;
        python2Target1.targetCharValueEscape = strArray12;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("_tset6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String[] strArray1 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "\"_tset\"", false);
        java.lang.String str6 = python2Target0.getLanguage();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tset" + "'", str5, "_tset");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target4 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator3);
        java.util.Set<java.lang.String> strSet5 = python2Target4.badWords;
        java.lang.String str8 = python2Target4.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str10 = python2Target4.getImplicitRuleLabel("@");
        python2Target4.addBadWords();
        boolean boolean12 = python2Target4.wantsBaseListener();
        int int13 = python2Target4.getInlineTestSetWordSize();
        java.lang.String str14 = python2Target4.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String str18 = python2Target16.getImplicitSetLabel("");
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
        python2Target16.templates = sTGroup29;
        java.lang.String str33 = python2Target16.getAltLabelContextStructName("Python2");
        org.stringtemplate.v4.STGroup sTGroup34 = python2Target16.loadTemplates();
        python2Target4.templates = sTGroup34;
        python2Target1.templates = sTGroup34;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_@" + "'", str10, "_@");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset" + "'", str18, "_tset");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "@" + "'", str23, "@");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Python2" + "'", str28, "Python2");
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Python2Context" + "'", str33, "Python2Context");
        org.junit.Assert.assertNotNull(sTGroup34);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"\\\"\\\"\"", false);
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\"" + "'", str11, "\\\"\\\"");
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        int int3 = python2Target1.getInlineTestSetWordSize();
        int int4 = python2Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup5);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.stringtemplate.v4.ST sT18 = null;
        python2Target1.genRecognizerHeaderFile(grammar17, sT18, "\\0");
        boolean boolean21 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet22 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target1.getLoopCounter(grammarAST23);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target1.getCodeGenerator();
        java.lang.String str13 = python2Target1.getVersion();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tset" + "'", str11, "_tset_tset");
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("a");
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("4.5.2.1");
        boolean boolean12 = python2Target1.wantsBaseListener();
        boolean boolean13 = python2Target1.templatesExist();
        java.lang.String str15 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AContext" + "'", str9, "AContext");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"4.5.2.1\"" + "'", str11, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "d" + "'", str15, "d");
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"\\\"\\\"\"", false);
        python2Target1.language = "\\\"\\\"Context";
        java.lang.Class<?> wildcardClass14 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\"" + "'", str11, "\\\"\\\"");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        python2Target1.language = "a";
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target1.genRecognizerHeaderFile(grammar11, sT12, "\"4.5.2.1\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getListLabel("_tset\"_AContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        boolean boolean7 = python2Target6.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet8 = python2Target6.badWords;
        python2Target1.badWords = strSet8;
        java.lang.String str11 = python2Target1.getListLabel("\"\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\"\"" + "'", str11, "\"\\\"\\\"\"");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getListLabel("Python2Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"_@\"", true);
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("@", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "_tset\\n", true);
        java.lang.String str19 = python2Target1.getImplicitSetLabel("i");
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python2Target1.getLoopLabel(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2Context" + "'", str5, "Python2Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_@\"" + "'", str9, "\"_@\"");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"@\"" + "'", str13, "\"@\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"tset\\n\"" + "'", str17, "\"tset\\n\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tseti" + "'", str19, "_tseti");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("AContext");
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("tset6");
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_AContext" + "'", str12, "_AContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset6" + "'", str14, "_tset6");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet5 = python2Target1.badWords;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("Python2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"Python2\"" + "'", str7, "\"Python2\"");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.lang.String[] strArray0 = null;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray0;
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\\"_@\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"_@\\\"\"" + "'", str1, "\"\\\"_@\\\"\"");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("a");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AContext" + "'", str9, "AContext");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getListLabel("Python2Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"_@\"", true);
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("\\64");
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2Context" + "'", str5, "Python2Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_@\"" + "'", str9, "\"_@\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\\64\"" + "'", str11, "\"\\\\64\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"4.5.2.1\"" + "'", str14, "\"4.5.2.1\"");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        python2Target1.language = "\"\\\"hi!\\\"\"";
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) '4');
        java.lang.String str6 = python2Target1.language;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset\\64");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\64" + "'", str5, "\\64");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str6, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\\\\64\"" + "'", str8, "\"_tset\\\\64\"");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.loadTemplates();
        java.lang.String str22 = python2Target1.getTargetStringLiteralFromString("\"_tset\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup25 = python2Target1.loadTemplates();
        org.antlr.v4.tool.Grammar grammar26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python2Target1.getTokenTypeAsTargetLabel(grammar26, (int) (short) 10);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\"_tset\\\"\"" + "'", str22, "\"\\\"_tset\\\"\"");
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertNull(codeGenerator24);
        org.junit.Assert.assertNotNull(sTGroup25);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        python2Target1.language = "\"\\\"hi!\\\"\"";
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) '4');
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        java.lang.String str7 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementName("_\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\64" + "'", str5, "\\64");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        python2Target1.language = "\"\\\"hi!\\\"\"";
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) '4');
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\\\"\\\"", false);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\64" + "'", str5, "\\64");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\"" + "'", str11, "\\\"\\\"");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        int int3 = python2Target1.getInlineTestSetWordSize();
        int int4 = python2Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.loadTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.getListLabel("\"_@\"");
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", false);
        java.lang.String str16 = python2Target1.getVersion();
        python2Target1.language = "AContext";
        boolean boolean19 = python2Target1.templatesExist();
        python2Target1.language = "@";
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_@\"" + "'", str12, "\"_@\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"hi!\\\"" + "'", str15, "\\\"hi!\\\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.loadTemplates();
        java.lang.String str22 = python2Target1.getTargetStringLiteralFromString("\"_tset\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup25 = python2Target1.loadTemplates();
        java.lang.String str27 = python2Target1.getImplicitRuleLabel("\"\\\\\\\"\\\\\\\"Context\"");
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.stringtemplate.v4.ST sT29 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar28, sT29);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\"_tset\\\"\"" + "'", str22, "\"\\\"_tset\\\"\"");
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertNull(codeGenerator24);
        org.junit.Assert.assertNotNull(sTGroup25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "_\"\\\\\\\"\\\\\\\"Context\"" + "'", str27, "_\"\\\\\\\"\\\\\\\"Context\"");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
        java.lang.String[] strArray6 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target1.targetCharValueEscape = strArray6;
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python2Target1.genRecognizerHeaderFile(grammar9, sT10, "\\1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String str16 = python2Target14.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python2Target14.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python2Target14.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "\"\\\"\\\"\"", false);
        int int25 = python2Target14.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup26 = python2Target14.loadTemplates();
        python2Target1.templates = sTGroup26;
        int int28 = python2Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup29 = python2Target1.templates;
        java.lang.String str31 = python2Target1.getAltLabelContextStructName("_\"\\\"Python2Context\\\"\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
// flaky:         org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset" + "'", str16, "_tset");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"" + "'", str20, "\"\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\\"\\\"" + "'", str24, "\\\"\\\"");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "_\"\\\"Python2Context\\\"\"Context" + "'", str31, "_\"\\\"Python2Context\\\"\"Context");
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
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) 'a');
        java.util.Set<java.lang.String> strSet11 = null; // flaky: python2Target1.getBadWords();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
// flaky:         org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        python2Target1.language = "a";
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("@", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_\"\\\"\\\"\"", true);
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target0.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "@" + "'", str3, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target1.templates;
        int int17 = python2Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target1.templates;
        java.lang.String[] strArray19 = python2Target1.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray19;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
// flaky:         org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str15, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str4 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        boolean boolean6 = python2Target0.supportsOverloadedMethods();
        java.lang.String str7 = python2Target0.getLanguage();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("@", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_\"\\\"\\\"\"", true);
        java.lang.String str9 = python2Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "@" + "'", str3, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) "_tset\\n", "Python2Context", locale3);
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target5.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str9 = python2Target5.getLanguage();
        boolean boolean10 = python2Target5.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target5.gen;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = pythonStringRenderer0.toString((java.lang.Object) python2Target5, "\"\\\"\\\\\\\\0\\\"\"", locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2Context" + "'", str4, "Python2Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"hi!\"" + "'", str8, "\"hi!\"");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        java.lang.String str20 = python2Target1.getImplicitRuleLabel("_tset\\64");
        org.antlr.v4.tool.Grammar grammar21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python2Target1.getTokenTypeAsTargetLabel(grammar21, (int) (byte) 0);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "__tset\\64" + "'", str20, "__tset\\64");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitSetLabel("a");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tseta" + "'", str9, "_tseta");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target1.gen = codeGenerator11;
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target1.loadTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(sTGroup14);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        int int3 = python2Target1.getInlineTestSetWordSize();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getImplicitTokenLabel("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#" + "'", str8, "#");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("a");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AContext" + "'", str9, "AContext");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        int int16 = python2Target1.getInlineTestSetWordSize();
        int int17 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str19 = python2Target1.encodeIntAsCharEscape(0);
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
// flaky:         org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str15, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\0" + "'", str19, "\\0");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getListLabel("Python2Context");
        java.lang.String str6 = python2Target1.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2Context" + "'", str5, "Python2Context");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.language;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.getListLabel("\"_@\"");
        boolean boolean13 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getRuleFunctionContextStructName(rule14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_@\"" + "'", str12, "\"_@\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target1.templates;
        int int17 = python2Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getImplicitTokenLabel("\\\"\\\"");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str15, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        boolean boolean4 = python2Target0.supportsOverloadedMethods();
        boolean boolean5 = python2Target0.templatesExist();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String[] strArray8 = python2Target7.targetCharValueEscape;
        java.lang.String str9 = python2Target7.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target7.getTemplates();
        python2Target1.templates = sTGroup10;
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("_@");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getRuleFunctionContextStructName(ruleFunction14);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_@\"" + "'", str13, "\"_@\"");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet9 = python2Target1.badWords;
        int int10 = python2Target1.getSerializedATNSegmentLimit();
// flaky:         python2Target1.addBadWords();
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
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        int int10 = python2Target1.getInlineTestSetWordSize();
        int int11 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.getImplicitRuleLabel("\"\\\"\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        python2Target1.gen = codeGenerator5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("\"@\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_\"\\\"\\\"\"" + "'", str4, "_\"\\\"\\\"\"");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        python2Target1.language = "_\"hi!\"";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getImplicitRuleLabel("tset6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        python2Target1.gen = codeGenerator12;
        java.lang.String str15 = python2Target1.getImplicitSetLabel("\"\\\"\\\\\\\"\\\\\\\"\\\"Context\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python2Target1.gen = codeGenerator16;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tset" + "'", str11, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset\"\\\"\\\\\\\"\\\\\\\"\\\"Context\"" + "'", str15, "_tset\"\\\"\\\\\\\"\\\\\\\"\\\"Context\"");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.util.Set<java.lang.String> strSet5 = python2Target1.badWords;
        java.lang.String str6 = python2Target1.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.gen;
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
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.getAltLabelContextStructName("\\\"\\\"");
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = null; // flaky: python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup8 = null;
        python2Target1.templates = sTGroup8;
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\"\\\"Context" + "'", str4, "\\\"\\\"Context");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) 'a');
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target1.genRecognizerHeaderFile(grammar11, sT12, "\\\"\\\"");
        boolean boolean15 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getElementListName("_\"\\\"Python2Context\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.getListLabel("\"_@\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"_hi!\"", false);
        java.util.Set<java.lang.String> strSet18 = python2Target1.badWords;
        java.lang.Class<?> wildcardClass19 = strSet18.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_@\"" + "'", str12, "\"_@\"");
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_hi!" + "'", str17, "_hi!");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("_@");
        java.lang.String str14 = python2Target1.getVersion();
        boolean boolean15 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getElementListName("_tset\"\\\"\\\"\"");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_@\"" + "'", str13, "\"_@\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\\64Context");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\64Context" + "'", str1, "\\64Context");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("hi!");
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("\"hi!\"");
        java.lang.String str14 = python2Target1.getAltLabelContextStructName("\"_@\"");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"hi!\"" + "'", str12, "_\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_@\"Context" + "'", str14, "\"_@\"Context");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
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
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("hi!");
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("\"hi!\"");
        java.lang.String str14 = python2Target1.getListLabel("_tset");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getImplicitTokenLabel("_\"\\\"Python2Context\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"hi!\"" + "'", str12, "_\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset" + "'", str14, "_tset");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"_AContext\"");
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"a\"", true);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset\"_AContext\"" + "'", str8, "_tset\"_AContext\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"a\\\"\"" + "'", str12, "\"\\\"a\\\"\"");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet9 = python2Target1.badWords;
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target12.templates;
        int int14 = python2Target12.getInlineTestSetWordSize();
        boolean boolean15 = python2Target12.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target12.getTemplates();
        python2Target1.templates = sTGroup16;
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(sTGroup16);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet4 = null; // flaky: python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
// flaky:         org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        int int3 = python2Target1.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet4 = null; // flaky: python2Target1.getBadWords();
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar6, sT7, "_d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
// flaky:         org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_hi!", true);
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target1.getTemplates();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_hi!\"" + "'", str12, "\"_hi!\"");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(sTGroup14);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"\\\"\\\"\"", false);
        java.util.Set<java.lang.String> strSet12 = null; // flaky: python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getLoopLabel(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\"" + "'", str11, "\\\"\\\"");
// flaky:         org.junit.Assert.assertNotNull(strSet12);
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
        java.util.Set<java.lang.String> strSet12 = null; // flaky: python2Target1.getBadWords();
        boolean boolean13 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String str17 = python2Target15.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator18);
        java.util.Set<java.lang.String> strSet20 = python2Target19.badWords;
        java.lang.String str22 = python2Target19.encodeIntAsCharEscape(64);
        java.lang.String str23 = python2Target19.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator24);
        java.lang.String[] strArray26 = python2Target25.targetCharValueEscape;
        java.lang.String str27 = python2Target25.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup28 = python2Target25.getTemplates();
        python2Target19.templates = sTGroup28;
        python2Target15.templates = sTGroup28;
        org.stringtemplate.v4.STGroup sTGroup31 = python2Target15.templates;
        python2Target1.templates = sTGroup31;
        java.util.Set<java.lang.String> strSet33 = python2Target1.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str37 = python2Target34.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str38 = python2Target34.getVersion();
        java.lang.String str39 = python2Target34.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        python2Target34.gen = codeGenerator40;
        java.util.Set<java.lang.String> strSet42 = python2Target34.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target44 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator43);
        java.lang.String[] strArray45 = python2Target44.targetCharValueEscape;
        java.lang.String str46 = python2Target44.getLanguage();
        int int47 = python2Target44.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target49 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator48);
        java.util.Set<java.lang.String> strSet50 = python2Target49.badWords;
        java.lang.String str52 = python2Target49.encodeIntAsCharEscape(64);
        java.lang.String str53 = python2Target49.getLanguage();
        java.lang.String str55 = python2Target49.getListLabel("");
        java.lang.String str56 = python2Target49.getVersion();
        java.util.Set<java.lang.String> strSet57 = python2Target49.getBadWords();
        python2Target44.badWords = strSet57;
        python2Target34.badWords = strSet57;
        python2Target1.badWords = strSet57;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str62 = python2Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
// flaky:         org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset" + "'", str17, "_tset");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "@" + "'", str22, "@");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Python2" + "'", str23, "Python2");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Python2" + "'", str27, "Python2");
        org.junit.Assert.assertNotNull(sTGroup28);
        org.junit.Assert.assertNotNull(sTGroup31);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"hi!\"" + "'", str37, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "4.5.2.1" + "'", str38, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "4.5.2.1" + "'", str39, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Python2" + "'", str46, "Python2");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 64 + "'", int47 == 64);
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "@" + "'", str52, "@");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Python2" + "'", str53, "Python2");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "4.5.2.1" + "'", str56, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet57);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        python2Target1.gen = codeGenerator12;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String[] strArray16 = python2Target15.targetCharValueEscape;
        java.lang.String str17 = python2Target15.getLanguage();
        int int18 = python2Target15.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        java.util.Set<java.lang.String> strSet21 = python2Target20.badWords;
        java.lang.String str23 = python2Target20.encodeIntAsCharEscape(64);
        java.lang.String str24 = python2Target20.getLanguage();
        java.lang.String str26 = python2Target20.getListLabel("");
        java.lang.String str27 = python2Target20.getVersion();
        java.util.Set<java.lang.String> strSet28 = python2Target20.getBadWords();
        python2Target15.badWords = strSet28;
        python2Target1.badWords = strSet28;
        org.antlr.v4.tool.Grammar grammar31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python2Target1.getTokenTypeAsTargetLabel(grammar31, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tset" + "'", str11, "_tset_tset");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "@" + "'", str23, "@");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "4.5.2.1" + "'", str27, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_@", false);
// flaky:         python2Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python2Target1.gen = codeGenerator7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        boolean boolean7 = python2Target6.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet8 = python2Target6.badWords;
        python2Target1.badWords = strSet8;
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        java.lang.String str14 = python2Target12.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python2Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python2Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "\"\\\"\\\"\"", false);
        int int23 = python2Target12.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar24 = null;
        int[] intArray25 = new int[] {};
        java.lang.String[] strArray26 = python2Target12.getTokenTypesAsTargetLabels(grammar24, intArray25);
        java.lang.String[] strArray27 = python2Target1.getTokenTypesAsTargetLabels(grammar10, intArray25);
        org.antlr.v4.tool.ast.GrammarAST grammarAST28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset" + "'", str14, "_tset");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\\\"\\\"" + "'", str22, "\\\"\\\"");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.loadTemplates();
        java.lang.String str21 = python2Target1.getImplicitRuleLabel("\"\\\"Python2Context\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target1.getImplicitTokenLabel("\" \"");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_\"\\\"Python2Context\\\"\"" + "'", str21, "_\"\\\"Python2Context\\\"\"");
        org.junit.Assert.assertNull(codeGenerator22);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        int int3 = python2Target1.getInlineTestSetWordSize();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getVersion();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        org.antlr.v4.tool.Rule rule19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getRuleFunctionContextStructName(rule19);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator4);
        java.lang.String[] strArray6 = python2Target5.targetCharValueEscape;
        java.lang.String str7 = python2Target5.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target5.getTemplates();
        python2Target1.templates = sTGroup8;
        java.lang.String str10 = python2Target1.language;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.getImplicitRuleLabel("\"\\\"a\\\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getLoopLabel(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_\"\\\"a\\\"\"" + "'", str4, "_\"\\\"a\\\"\"");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target1.templates;
        int int17 = python2Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target1.templates;
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar19, sT20, "_tset\"_AContext\"");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str15, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup18);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.getListLabel("\"_@\"");
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", false);
        java.lang.String str16 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target1.getTemplates();
        java.util.Set<java.lang.String> strSet18 = python2Target1.getBadWords();
        org.antlr.v4.tool.Rule rule19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getRuleFunctionContextStructName(rule19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_@\"" + "'", str12, "\"_@\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"hi!\\\"" + "'", str15, "\\\"hi!\\\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet4 = null; // flaky: python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet5 = python2Target1.badWords;
        java.lang.String str6 = python2Target1.language;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python2Target1.genRecognizerHeaderFile(grammar7, sT8, "\"\\\\\\\"\\\\\\\"Context\"");
        boolean boolean11 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
// flaky:         org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target1.templates;
        org.antlr.v4.tool.Rule rule18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getRuleFunctionContextStructName(rule18);
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
        org.junit.Assert.assertNotNull(sTGroup17);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_hi!", true);
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.loadTemplates();
        java.lang.String str14 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getElementListName("_tset\"\\\"\\\\\\\"\\\\\\\"\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_hi!\"" + "'", str12, "\"_hi!\"");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        python2Target1.gen = codeGenerator19;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator21);
        java.util.Set<java.lang.String> strSet23 = python2Target22.badWords;
        java.lang.String str25 = python2Target22.encodeIntAsCharEscape(64);
        java.lang.String str26 = python2Target22.getLanguage();
        java.lang.String str28 = python2Target22.getListLabel("");
        java.lang.String str29 = python2Target22.getVersion();
        java.util.Set<java.lang.String> strSet30 = null; // flaky: python2Target22.getBadWords();
        java.lang.String str33 = python2Target22.getTargetStringLiteralFromString("@", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator34);
        java.util.Set<java.lang.String> strSet36 = python2Target35.badWords;
        java.lang.String str39 = python2Target35.getTargetStringLiteralFromString("hi!", false);
        int int40 = python2Target35.getInlineTestSetWordSize();
        boolean boolean41 = python2Target35.wantsBaseListener();
        java.lang.String str43 = python2Target35.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target45 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator44);
        java.lang.String[] strArray46 = python2Target45.targetCharValueEscape;
        java.lang.String str47 = python2Target45.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup48 = python2Target45.getTemplates();
        java.lang.String[] strArray49 = python2Target45.targetCharValueEscape;
        python2Target35.targetCharValueEscape = strArray49;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray49;
        python2Target22.targetCharValueEscape = strArray49;
        python2Target1.targetCharValueEscape = strArray49;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "@" + "'", str25, "@");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Python2" + "'", str26, "Python2");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4.5.2.1" + "'", str29, "4.5.2.1");
// flaky:         org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "@" + "'", str33, "@");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 64 + "'", int40 == 64);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\\n" + "'", str43, "\\n");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Python2" + "'", str47, "Python2");
        org.junit.Assert.assertNotNull(sTGroup48);
        org.junit.Assert.assertNotNull(strArray49);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        python2Target1.gen = codeGenerator12;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String[] strArray16 = python2Target15.targetCharValueEscape;
        java.lang.String str17 = python2Target15.getLanguage();
        int int18 = python2Target15.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        java.util.Set<java.lang.String> strSet21 = python2Target20.badWords;
        java.lang.String str23 = python2Target20.encodeIntAsCharEscape(64);
        java.lang.String str24 = python2Target20.getLanguage();
        java.lang.String str26 = python2Target20.getListLabel("");
        java.lang.String str27 = python2Target20.getVersion();
        java.util.Set<java.lang.String> strSet28 = python2Target20.getBadWords();
        python2Target15.badWords = strSet28;
        python2Target1.badWords = strSet28;
        java.lang.String str32 = python2Target1.getListLabel("\"\\\"_@\\\"\"");
        java.lang.String str34 = python2Target1.getImplicitRuleLabel("\"Python2Context\"Context");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tset" + "'", str11, "_tset_tset");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "@" + "'", str23, "@");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "4.5.2.1" + "'", str27, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\"_@\\\"\"" + "'", str32, "\"\\\"_@\\\"\"");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "_\"Python2Context\"Context" + "'", str34, "_\"Python2Context\"Context");
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
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) 'a');
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target1.genRecognizerHeaderFile(grammar11, sT12, "\\\"\\\"");
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("\"\\\\0\"");
        python2Target1.language = "\"\\\"\\\\\\\"\\\\\\\"\\\\\\\"\\\"\"";
        java.lang.String str20 = python2Target1.getListLabel("\"\"Context");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_\"\\\\0\"" + "'", str16, "_\"\\\\0\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"Context" + "'", str20, "\"\"Context");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python2Target1.gen = codeGenerator8;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.util.Set<java.lang.String> strSet12 = python2Target11.badWords;
        java.lang.String str14 = python2Target11.encodeIntAsCharEscape(64);
        java.lang.String str15 = python2Target11.getLanguage();
        java.lang.String[] strArray21 = new java.lang.String[] { "\"hi!\"", "Python2", "Python2", "@", "_@" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target11.badWords = strSet22;
        python2Target1.badWords = strSet22;
        org.antlr.v4.tool.ast.GrammarAST grammarAST26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python2Target1.getLoopLabel(grammarAST26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("Python2Context");
        boolean boolean11 = python2Target1.wantsBaseVisitor();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\"" + "'", str8, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python2Context\"" + "'", str10, "\"Python2Context\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\"\\\"\"" + "'", str1, "\"\\\"\\\"\\\"\"");
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
        java.lang.String[] strArray11 = new java.lang.String[] { "\"hi!\"", "Python2", "Python2", "@", "_@" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        python2Target1.badWords = strSet12;
        boolean boolean15 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target1.loadTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getElementListName("\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertNotNull(sTGroup17);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target1.badWords;
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar9, sT10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getListLabel("_@");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        java.lang.String str10 = python2Target6.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str12 = python2Target6.getImplicitRuleLabel("@");
        java.lang.String str14 = python2Target6.getAltLabelContextStructName("a");
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromString("4.5.2.1");
        java.lang.String[] strArray17 = python2Target6.targetCharValueEscape;
        python2Target1.targetCharValueEscape = strArray17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python2Target1.getElementListName("DContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_@" + "'", str12, "_@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AContext" + "'", str14, "AContext");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"4.5.2.1\"" + "'", str16, "\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNull(codeGenerator19);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getListLabel("Python2Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"_@\"", true);
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("\\64");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2Context" + "'", str5, "Python2Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_@\"" + "'", str9, "\"_@\"");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\64Context" + "'", str12, "\\64Context");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.getListLabel("i");
        java.lang.String str13 = python2Target1.getLanguage();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "i" + "'", str12, "i");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet9 = python2Target1.badWords;
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) '4');
        java.lang.String[] strArray13 = python2Target1.targetCharValueEscape;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\64" + "'", str12, "\\64");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.loadTemplates();
        java.lang.String str21 = python2Target1.getImplicitRuleLabel("\"\\\"Python2Context\\\"\"");
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.stringtemplate.v4.ST sT23 = null;
        python2Target1.genRecognizerHeaderFile(grammar22, sT23, "_tset\\64");
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        java.lang.String str29 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator26, "\"\\\"_@\\\"\"Context", true);
        int int30 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_\"\\\"Python2Context\\\"\"" + "'", str21, "_\"\\\"Python2Context\\\"\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\\"_@\\\"\\\"Contex\"" + "'", str29, "\"\\\"_@\\\"\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet9 = python2Target1.badWords;
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "@" + "'", str11, "@");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        int int3 = python2Target1.getInlineTestSetWordSize();
        boolean boolean4 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "_\"\\\"\\\"\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\"\\\"\"" + "'", str9, "\"\\\"\\\"\\\"\"");
        org.junit.Assert.assertNull(codeGenerator10);
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.loadTemplates();
        java.lang.String str21 = python2Target1.getImplicitRuleLabel("\"\\\"Python2Context\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target1.getImplicitTokenLabel("_\"\\\"\\\"\\\"\"");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_\"\\\"Python2Context\\\"\"" + "'", str21, "_\"\\\"Python2Context\\\"\"");
        org.junit.Assert.assertNull(codeGenerator22);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_hi!", true);
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.loadTemplates();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_hi!\"" + "'", str12, "\"_hi!\"");
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("hi!");
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        boolean boolean11 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("_@");
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\\\"\\\"Context");
        boolean boolean16 = python2Target1.templatesExist();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_@\"" + "'", str13, "\"_@\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\\\\\"\\\\\\\"Context\"" + "'", str15, "\"\\\\\\\"\\\\\\\"Context\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_\"\\\"a\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_\"\\\"a\\\"\"" + "'", str1, "_\"\\\"a\\\"\"");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.util.Set<java.lang.String> strSet5 = python2Target1.badWords;
        java.lang.String str6 = python2Target1.language;
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"_AContext\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"_AContext\"" + "'", str1, "\"_AContext\"");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.getImplicitRuleLabel("\"\\\"\\\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getLoopLabel(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_\"\\\"\\\"\"" + "'", str4, "_\"\\\"\\\"\"");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_hi!", true);
        java.lang.String str7 = python2Target1.getLanguage();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_hi!\"" + "'", str6, "\"_hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target1.badWords;
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) 'a');
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target1.genRecognizerHeaderFile(grammar11, sT12, "\\\"\\\"");
        boolean boolean15 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getElementListName("\"_@\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.util.Set<java.lang.String> strSet8 = python2Target7.badWords;
        boolean boolean9 = python2Target7.wantsBaseVisitor();
        boolean boolean10 = python2Target7.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        boolean boolean13 = python2Target12.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet14 = python2Target12.badWords;
        python2Target7.badWords = strSet14;
        int int16 = python2Target7.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target7.loadTemplates();
        python2Target1.templates = sTGroup17;
        java.util.Set<java.lang.String> strSet19 = null; // flaky: python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet20 = python2Target1.badWords;
        org.stringtemplate.v4.STGroup sTGroup21 = python2Target1.getTemplates();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup17);
// flaky:         org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(sTGroup21);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
        java.lang.String[] strArray6 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target1.targetCharValueEscape = strArray6;
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        java.lang.String str11 = null; // flaky: python2Target1.getTargetStringLiteralFromString("_AContext", true);
        java.lang.String str13 = python2Target1.getImplicitSetLabel("_\"\\\\0\"");
        boolean boolean14 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_AContext\"" + "'", str11, "\"_AContext\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_\"\\\\0\"" + "'", str13, "_tset_\"\\\\0\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.lang.String str11 = python2Target1.getLanguage();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        java.lang.String str4 = python2Target1.getListLabel("\"\\\"Python2Context\\\"\"");
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\\\"\\\"\"Context", true);
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar8, sT9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\\\"Python2Context\\\"\"" + "'", str4, "\"\\\"Python2Context\\\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\"\\\"Context\"" + "'", str7, "\"\\\"\\\\\\\"\\\\\\\"\\\"Context\"");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet4 = null; // flaky: python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        java.lang.String str10 = python2Target1.getListLabel("\"\\\\0\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
// flaky:         org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\0\"" + "'", str10, "\"\\\\0\"");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target1.loadTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getLoopLabel(grammarAST18);
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
        org.junit.Assert.assertNotNull(sTGroup17);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        python2Target1.language = "a";
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementListName("_tset\\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.tool.Grammar grammar1 = null;
        org.stringtemplate.v4.ST sT2 = null;
        python2Target0.genRecognizerHeaderFile(grammar1, sT2, "_@");
        java.util.Set<java.lang.String> strSet5 = python2Target0.badWords;
        java.lang.String str7 = python2Target0.encodeIntAsCharEscape((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target0.getImplicitTokenLabel("\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        int int3 = python2Target1.getInlineTestSetWordSize();
        boolean boolean4 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.language;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementListName("\\1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) "\"Python2Context\"Context", "\"\\\"a\\\"\"", locale3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\\\"a\\\"\"" + "'", str4, "\"\\\"a\\\"\"");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.getListLabel("i");
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "i" + "'", str12, "i");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_hi!", true);
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.templates;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getElementListName("Python2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_hi!\"" + "'", str12, "\"_hi!\"");
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getListLabel("Python2Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"_@\"", true);
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2Context" + "'", str5, "Python2Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_@\"" + "'", str9, "\"_@\"");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet4 = null; // flaky: python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        java.lang.String str9 = python2Target6.encodeIntAsCharEscape(64);
        java.lang.String str10 = python2Target6.getLanguage();
        java.lang.String str12 = python2Target6.getListLabel("");
        java.lang.String str13 = python2Target6.getVersion();
        java.util.Set<java.lang.String> strSet14 = python2Target6.getBadWords();
        java.lang.String str15 = python2Target6.language;
        java.lang.String[] strArray16 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray16;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray16;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray16;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray16;
        python2Target6.targetCharValueEscape = strArray16;
        python2Target1.targetCharValueEscape = strArray16;
        java.lang.String str24 = python2Target1.getImplicitRuleLabel("\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
// flaky:         org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "@" + "'", str9, "@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_\"\"Context" + "'", str24, "_\"\"Context");
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
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
        java.lang.String[] strArray6 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target1.targetCharValueEscape = strArray6;
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python2Target1.genRecognizerHeaderFile(grammar9, sT10, "\\1");
        boolean boolean13 = python2Target1.templatesExist();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
// flaky:         org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getListLabel("Python2Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"_@\"", true);
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("@", true);
        java.lang.String str15 = python2Target1.encodeIntAsCharEscape((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2Context" + "'", str5, "Python2Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_@\"" + "'", str9, "\"_@\"");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"@\"" + "'", str13, "\"@\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#" + "'", str15, "#");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        int int3 = python2Target1.getInlineTestSetWordSize();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) '#');
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#" + "'", str8, "#");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        python2Target1.language = "\"\\\"hi!\\\"\"";
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) '4');
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\\\"\\\"", false);
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        python2Target1.genRecognizerHeaderFile(grammar12, sT13, "\"_tset\\\\64\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\64" + "'", str5, "\\64");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\"" + "'", str11, "\\\"\\\"");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.util.Set<java.lang.String> strSet8 = python2Target7.badWords;
        boolean boolean9 = python2Target7.wantsBaseVisitor();
        boolean boolean10 = python2Target7.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        boolean boolean13 = python2Target12.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet14 = python2Target12.badWords;
        python2Target7.badWords = strSet14;
        int int16 = python2Target7.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target7.loadTemplates();
        python2Target1.templates = sTGroup17;
        java.lang.String str20 = python2Target1.getImplicitRuleLabel("d");
        boolean boolean21 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_d" + "'", str20, "_d");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar11, sT12, "_\"\\\\0\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("a");
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("4.5.2.1");
        boolean boolean12 = python2Target1.wantsBaseListener();
        boolean boolean13 = python2Target1.templatesExist();
        java.lang.String str15 = python2Target1.getListLabel("_tset\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python2Target1.gen;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AContext" + "'", str9, "AContext");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"4.5.2.1\"" + "'", str11, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset\\n" + "'", str15, "_tset\\n");
        org.junit.Assert.assertNull(codeGenerator16);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
        java.lang.String[] strArray6 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target1.targetCharValueEscape = strArray6;
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python2Target1.genRecognizerHeaderFile(grammar9, sT10, "\\1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String str16 = python2Target14.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python2Target14.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python2Target14.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "\"\\\"\\\"\"", false);
        int int25 = python2Target14.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup26 = python2Target14.loadTemplates();
        python2Target1.templates = sTGroup26;
        org.stringtemplate.v4.STGroup sTGroup28 = python2Target1.templates;
        java.lang.String str30 = null; // flaky: python2Target1.getTargetStringLiteralFromString("\"_tset\\\\64\"");
        org.antlr.v4.tool.Grammar grammar31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python2Target1.getTokenTypeAsTargetLabel(grammar31, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset" + "'", str16, "_tset");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"" + "'", str20, "\"\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\\"\\\"" + "'", str24, "\\\"\\\"");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup26);
        org.junit.Assert.assertNotNull(sTGroup28);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"\\\"_tset\\\\\\\\64\\\"\"" + "'", str30, "\"\\\"_tset\\\\\\\\64\\\"\"");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "\"\\\"_tset\\\"\"");
        java.util.Set<java.lang.String> strSet8 = null; // flaky: python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
// flaky:         org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        java.lang.String str23 = python2Target6.getAltLabelContextStructName("Python2");
        org.stringtemplate.v4.STGroup sTGroup24 = python2Target6.loadTemplates();
        java.lang.String str27 = python2Target6.getTargetStringLiteralFromString("\"_tset\"", true);
// flaky:         python2Target6.addBadWords();
        java.util.Set<java.lang.String> strSet29 = python2Target6.badWords;
        python2Target6.addBadWords();
        java.util.Locale locale32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = pythonStringRenderer0.toString((java.lang.Object) python2Target6, "_hi!", locale32);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Python2Context" + "'", str23, "Python2Context");
        org.junit.Assert.assertNotNull(sTGroup24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\\\"_tset\\\"\"" + "'", str27, "\"\\\"_tset\\\"\"");
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.tool.Grammar grammar1 = null;
        org.stringtemplate.v4.ST sT2 = null;
        python2Target0.genRecognizerHeaderFile(grammar1, sT2, "_@");
        java.util.Set<java.lang.String> strSet5 = python2Target0.badWords;
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        java.lang.String[] strArray15 = python2Target11.targetCharValueEscape;
        python2Target1.targetCharValueEscape = strArray15;
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target1.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target1.templates;
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getLoopLabel(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertNull(sTGroup18);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_AContext");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_AContext" + "'", str1, "_AContext");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        python2Target1.language = "a";
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        int int11 = python2Target1.getInlineTestSetWordSize();
        int int12 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        python2Target1.language = "\"\\\"hi!\\\"\"";
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) '4');
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        java.lang.String str7 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\64" + "'", str5, "\\64");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python2Target1.gen = codeGenerator8;
        java.lang.String str10 = python2Target1.getLanguage();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        java.lang.String[] strArray15 = python2Target11.targetCharValueEscape;
        python2Target1.targetCharValueEscape = strArray15;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getElementListName("\"\\\"\\\\\\\"_@\\\\\\\"\\\\\\\"Contex\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str11 = python2Target1.getVersion();
        java.lang.String str12 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar13, sT14, "\"\\\"_tset\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python2Target1.gen = codeGenerator8;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.util.Set<java.lang.String> strSet12 = python2Target11.badWords;
        java.lang.String str14 = python2Target11.encodeIntAsCharEscape(64);
        java.lang.String str15 = python2Target11.getLanguage();
        java.lang.String[] strArray21 = new java.lang.String[] { "\"hi!\"", "Python2", "Python2", "@", "_@" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target11.badWords = strSet22;
        python2Target1.badWords = strSet22;
        int int26 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str28 = python2Target1.getAltLabelContextStructName("\"\\\"\\\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = python2Target1.getLoopLabel(grammarAST29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\\\"\\\"\"Context" + "'", str28, "\"\\\"\\\"\"Context");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.loadTemplates();
        java.lang.String str21 = python2Target1.getImplicitRuleLabel("\"\\\"Python2Context\\\"\"");
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.stringtemplate.v4.ST sT23 = null;
        python2Target1.genRecognizerHeaderFile(grammar22, sT23, "_tset\\64");
        org.antlr.v4.tool.ast.GrammarAST grammarAST26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python2Target1.getLoopLabel(grammarAST26);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_\"\\\"Python2Context\\\"\"" + "'", str21, "_\"\\\"Python2Context\\\"\"");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet4 = null; // flaky: python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str7 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.templates;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
// flaky:         org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertNull(sTGroup8);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String[] strArray1 = python2Target0.targetCharValueEscape;
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.getListLabel("\"_@\"");
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", false);
        java.lang.String str17 = python2Target1.encodeIntAsCharEscape(1);
        java.lang.String str19 = python2Target1.getListLabel("\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator20);
        java.lang.String[] strArray22 = python2Target21.targetCharValueEscape;
        java.lang.String str23 = python2Target21.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup24 = python2Target21.getTemplates();
        java.lang.String[] strArray25 = python2Target21.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup26 = python2Target21.getTemplates();
        python2Target1.templates = sTGroup26;
        org.antlr.v4.tool.Grammar grammar28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = python2Target1.getTokenTypeAsTargetLabel(grammar28, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_@\"" + "'", str12, "\"_@\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"hi!\\\"" + "'", str15, "\\\"hi!\\\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\1" + "'", str17, "\\1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Python2" + "'", str23, "Python2");
        org.junit.Assert.assertNotNull(sTGroup24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(sTGroup26);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        boolean boolean13 = python2Target1.wantsBaseVisitor();
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
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
// flaky:         org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.loadTemplates();
        java.lang.String str22 = python2Target1.getTargetStringLiteralFromString("\"_tset\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup25 = python2Target1.loadTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python2Target1.getElementName("hi!");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\"_tset\\\"\"" + "'", str22, "\"\\\"_tset\\\"\"");
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertNull(codeGenerator24);
        org.junit.Assert.assertNotNull(sTGroup25);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("a");
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AContext" + "'", str9, "AContext");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.getListLabel("\"_@\"");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"_@\"", "\"_@\"", "Python2Context", "\"hi!\"", "\"hi!\"" };
        python2Target1.targetCharValueEscape = strArray18;
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar20, sT21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_@\"" + "'", str12, "\"_@\"");
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        int int3 = python2Target1.getInlineTestSetWordSize();
        boolean boolean4 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "_\"\\\"\\\"\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\"Context");
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\"\\\"\"" + "'", str9, "\"\\\"\\\"\\\"\"");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\"Context\"" + "'", str12, "\"\\\"\\\"Context\"");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target1.gen = codeGenerator11;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String str16 = python2Target14.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        java.util.Set<java.lang.String> strSet19 = python2Target18.badWords;
        java.lang.String str21 = python2Target18.encodeIntAsCharEscape(64);
        java.lang.String str22 = python2Target18.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String[] strArray25 = python2Target24.targetCharValueEscape;
        java.lang.String str26 = python2Target24.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup27 = python2Target24.getTemplates();
        python2Target18.templates = sTGroup27;
        python2Target14.templates = sTGroup27;
        org.stringtemplate.v4.STGroup sTGroup30 = python2Target14.loadTemplates();
        python2Target1.templates = sTGroup30;
        org.antlr.v4.tool.Grammar grammar32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = python2Target1.getTokenTypeAsTargetLabel(grammar32, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset" + "'", str16, "_tset");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "@" + "'", str21, "@");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Python2" + "'", str22, "Python2");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Python2" + "'", str26, "Python2");
        org.junit.Assert.assertNotNull(sTGroup27);
        org.junit.Assert.assertNotNull(sTGroup30);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python2Target1.gen = codeGenerator8;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.util.Set<java.lang.String> strSet12 = python2Target11.badWords;
        java.lang.String str14 = python2Target11.encodeIntAsCharEscape(64);
        java.lang.String str15 = python2Target11.getLanguage();
        java.lang.String[] strArray21 = new java.lang.String[] { "\"hi!\"", "Python2", "Python2", "@", "_@" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target11.badWords = strSet22;
        python2Target1.badWords = strSet22;
        int int26 = python2Target1.getInlineTestSetWordSize();
        boolean boolean27 = python2Target1.wantsBaseListener();
        java.lang.String str29 = python2Target1.getAltLabelContextStructName("_AContext");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "_AContextContext" + "'", str29, "_AContextContext");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.gen;
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str11 = python2Target1.getVersion();
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
        java.lang.String str30 = python2Target13.getAltLabelContextStructName("Python2");
        org.stringtemplate.v4.STGroup sTGroup31 = python2Target13.loadTemplates();
        python2Target1.templates = sTGroup31;
        java.lang.String str34 = python2Target1.getImplicitSetLabel("\"hi!\"");
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.stringtemplate.v4.ST sT36 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar35, sT36, "_tseti");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset" + "'", str15, "_tset");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "@" + "'", str20, "@");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Python2" + "'", str21, "Python2");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Python2" + "'", str25, "Python2");
        org.junit.Assert.assertNotNull(sTGroup26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Python2Context" + "'", str30, "Python2Context");
        org.junit.Assert.assertNotNull(sTGroup31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "_tset\"hi!\"" + "'", str34, "_tset\"hi!\"");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.tool.Grammar grammar1 = null;
        org.stringtemplate.v4.ST sT2 = null;
        python2Target0.genRecognizerHeaderFile(grammar1, sT2, "_@");
        java.util.Set<java.lang.String> strSet5 = python2Target0.badWords;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup6 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
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
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) 'a');
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target1.genRecognizerHeaderFile(grammar11, sT12, "\\\"\\\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getLoopLabel(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) 'a');
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target1.genRecognizerHeaderFile(grammar11, sT12, "\\\"\\\"");
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("\"\\\\0\"");
        python2Target1.language = "\"\\\"\\\\\\\"\\\\\\\"\\\\\\\"\\\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "_\"\\\"\\\"\\\"\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target1.getImplicitTokenLabel("_\"\\\\0\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_\"\\\\0\"" + "'", str16, "_\"\\\\0\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\\\"\\\"\\\"\\\"" + "'", str22, "\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("Python2Context");
        boolean boolean11 = python2Target1.wantsBaseVisitor();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\"" + "'", str8, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python2Context\"" + "'", str10, "\"Python2Context\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("Python2");
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target1.loadTemplates();
        java.lang.String str21 = python2Target1.getImplicitRuleLabel("\"\\\"Python2Context\\\"\"");
        java.lang.String str22 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "_tset_tset\"hi!\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python2Target1.getLoopCounter(grammarAST27);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_\"\\\"Python2Context\\\"\"" + "'", str21, "_\"\\\"Python2Context\\\"\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "tset_tset\\\"hi!" + "'", str26, "tset_tset\\\"hi!");
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
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String[] strArray12 = python2Target11.targetCharValueEscape;
        java.lang.String str13 = python2Target11.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target11.getTemplates();
        java.lang.String[] strArray15 = python2Target11.targetCharValueEscape;
        python2Target1.targetCharValueEscape = strArray15;
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target1.gen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getElementName("_AContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertNull(codeGenerator18);
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
// flaky:         python2Target1.addBadWords();
        boolean boolean9 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.util.Set<java.lang.String> strSet12 = python2Target11.badWords;
        java.lang.String str14 = python2Target11.encodeIntAsCharEscape(64);
        java.lang.String str17 = python2Target11.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str19 = python2Target11.getImplicitRuleLabel("hi!");
        java.lang.String str22 = python2Target11.getTargetStringLiteralFromString("_hi!", true);
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target11.templates;
        python2Target1.templates = sTGroup23;
        org.antlr.v4.tool.ast.GrammarAST grammarAST25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python2Target1.getLoopLabel(grammarAST25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"\\\"\"" + "'", str17, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_hi!" + "'", str19, "_hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"_hi!\"" + "'", str22, "\"_hi!\"");
        org.junit.Assert.assertNotNull(sTGroup23);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getListLabel("");
        java.lang.String str8 = python2Target1.getVersion();
        java.util.Set<java.lang.String> strSet9 = null; // flaky: python2Target1.getBadWords();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
// flaky:         org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python2Target1.genRecognizerHeaderFile(grammar10, sT11, "\"\\\"_tset\\\"\"");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.util.Set<java.lang.String> strSet8 = python2Target7.badWords;
        boolean boolean9 = python2Target7.wantsBaseVisitor();
        boolean boolean10 = python2Target7.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        boolean boolean13 = python2Target12.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet14 = python2Target12.badWords;
        python2Target7.badWords = strSet14;
        int int16 = python2Target7.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target7.loadTemplates();
        python2Target1.templates = sTGroup17;
        java.lang.String str20 = python2Target1.getImplicitRuleLabel("d");
        java.lang.String str22 = python2Target1.getAltLabelContextStructName("\"\\\"hi!\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        python2Target1.gen = codeGenerator23;
        java.lang.String[] strArray25 = python2Target1.targetCharValueEscape;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_d" + "'", str20, "_d");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\"hi!\\\"\"Context" + "'", str22, "\"\\\"hi!\\\"\"Context");
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_hi!", true);
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar13, sT14, "_\\\"\\\"ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_hi!\"" + "'", str12, "\"_hi!\"");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.getListLabel("\"_@\"");
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", false);
        java.lang.String str17 = python2Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target1.getTemplates();
        python2Target1.language = "__";
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_@\"" + "'", str12, "\"_@\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"hi!\\\"" + "'", str15, "\\\"hi!\\\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\1" + "'", str17, "\\1");
        org.junit.Assert.assertNotNull(sTGroup18);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python2Target1.getCodeGenerator();
        java.lang.String str18 = python2Target1.getLanguage();
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromString("__tset\\64");
        java.lang.String str22 = python2Target1.getAltLabelContextStructName("\"Python2Context\"");
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target1.loadTemplates();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
// flaky:         org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str15, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"__tset\\\\64\"" + "'", str20, "\"__tset\\\\64\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"Python2Context\"Context" + "'", str22, "\"Python2Context\"Context");
        org.junit.Assert.assertNotNull(sTGroup23);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.lang.String str4 = python2Target2.getImplicitSetLabel("");
        java.util.Locale locale6 = null;
        java.lang.String str7 = pythonStringRenderer0.toString((java.lang.Object) "", "\"\"", locale6);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str13 = python2Target9.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str15 = python2Target9.getImplicitRuleLabel("@");
        java.lang.String str17 = python2Target9.getAltLabelContextStructName("a");
        java.lang.String str19 = python2Target9.getTargetStringLiteralFromString("4.5.2.1");
        java.util.Locale locale21 = null;
        java.lang.String str22 = pythonStringRenderer0.toString((java.lang.Object) str19, "_@", locale21);
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.util.Set<java.lang.String> strSet25 = python2Target24.badWords;
        java.lang.String str28 = python2Target24.getTargetStringLiteralFromString("hi!", false);
        boolean boolean29 = python2Target24.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet30 = null; // flaky: python2Target24.getBadWords();
        java.util.Locale locale32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = pythonStringRenderer0.toString((java.lang.Object) python2Target24, "_tset_\"Python2Context\"Context", locale32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset" + "'", str4, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_@" + "'", str15, "_@");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AContext" + "'", str17, "AContext");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"4.5.2.1\"" + "'", str19, "\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "_@" + "'", str22, "_@");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky:         org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet4 = null; // flaky: python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        java.lang.String str9 = python2Target6.encodeIntAsCharEscape(64);
        java.lang.String str10 = python2Target6.getLanguage();
        java.lang.String str12 = python2Target6.getListLabel("");
        java.lang.String str13 = python2Target6.getVersion();
        java.util.Set<java.lang.String> strSet14 = python2Target6.getBadWords();
        java.lang.String str15 = python2Target6.language;
        java.lang.String[] strArray16 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray16;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray16;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray16;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray16;
        python2Target6.targetCharValueEscape = strArray16;
        python2Target1.targetCharValueEscape = strArray16;
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.stringtemplate.v4.ST sT24 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar23, sT24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
// flaky:         org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "@" + "'", str9, "@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar10, sT11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str4 = python2Target0.getVersion();
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("\"\\\"_hi!\\\"\"", true);
        boolean boolean9 = python2Target0.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\\\"_hi!\\\"\"\"" + "'", str8, "\"\"\\\"_hi!\\\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        boolean boolean7 = python2Target6.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet8 = python2Target6.badWords;
        python2Target1.badWords = strSet8;
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNull(sTGroup12);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        python2Target1.gen = codeGenerator17;
        java.lang.Class<?> wildcardClass19 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        java.lang.String str9 = python2Target6.encodeIntAsCharEscape(64);
        java.lang.String str10 = python2Target6.getLanguage();
        java.lang.String str12 = python2Target6.getListLabel("");
        java.lang.String str13 = python2Target6.getVersion();
        java.util.Set<java.lang.String> strSet14 = null; // flaky: python2Target6.getBadWords();
        python2Target1.badWords = strSet14;
        boolean boolean16 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.templates;
        int int20 = python2Target18.getInlineTestSetWordSize();
        int int21 = python2Target18.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup22 = python2Target18.loadTemplates();
        python2Target1.templates = sTGroup22;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python2Target1.getRuleFunctionContextStructName(ruleFunction24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "@" + "'", str9, "@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
// flaky:         org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(sTGroup19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup22);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
// flaky:         python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.getListLabel("\"_@\"");
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", false);
        java.lang.String str17 = python2Target1.encodeIntAsCharEscape(1);
        java.lang.String str18 = python2Target1.getVersion();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_@\"" + "'", str12, "\"_@\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"hi!\\\"" + "'", str15, "\\\"hi!\\\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\1" + "'", str17, "\\1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target1.templates;
        int int17 = python2Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target1.templates;
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST19);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str15, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup18);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target1.badWords;
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getVersion();
        java.lang.String str11 = python2Target1.getVersion();
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("_@");
        java.lang.String str14 = python2Target1.getVersion();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getRuleFunctionContextStructName(ruleFunction15);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_@\"" + "'", str13, "\"_@\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray0;
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass10 = strSet9.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\"" + "'", str8, "\"_tset\"");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
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
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "_tset\\64", false);
        java.lang.String str20 = python2Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.stringtemplate.v4.ST sT22 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar21, sT22);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str15, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tset6" + "'", str19, "tset6");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Python2" + "'", str20, "Python2");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) "\\n", "\"\\\"\\\"\"", locale7);
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target9.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str13 = python2Target9.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python2Target9.gen;
        boolean boolean15 = python2Target9.supportsOverloadedMethods();
        python2Target9.language = "\\\"\\\\\\\"\\\\\\\"\\\\\\\"\\\"";
        java.util.Locale locale19 = null;
        java.lang.String str20 = pythonStringRenderer0.toString((java.lang.Object) "\\\"\\\\\\\"\\\\\\\"\\\\\\\"\\\"", "_\"\\\\\\\"\\\\\\\"Context\"", locale19);
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator21);
        java.util.Set<java.lang.String> strSet23 = python2Target22.badWords;
        java.lang.String str25 = python2Target22.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = python2Target22.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator27);
        java.util.Set<java.lang.String> strSet29 = python2Target28.badWords;
        boolean boolean30 = python2Target28.wantsBaseVisitor();
        boolean boolean31 = python2Target28.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target33 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator32);
        boolean boolean34 = python2Target33.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet35 = python2Target33.badWords;
        python2Target28.badWords = strSet35;
        int int37 = python2Target28.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup38 = python2Target28.loadTemplates();
        python2Target22.templates = sTGroup38;
        java.util.Set<java.lang.String> strSet40 = python2Target22.getBadWords();
        java.util.Set<java.lang.String> strSet41 = python2Target22.badWords;
        java.util.Locale locale43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = pythonStringRenderer0.toString((java.lang.Object) python2Target22, "\"\\\"a\\\"\"", locale43);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"\\\"\"" + "'", str8, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_\"\\\\\\\"\\\\\\\"Context\"" + "'", str20, "_\"\\\\\\\"\\\\\\\"Context\"");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "@" + "'", str25, "@");
        org.junit.Assert.assertNull(codeGenerator26);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup38);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(strSet41);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "_@", locale3);
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) "\\n", "\"\\\"\\\"\"", locale7);
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target9.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str13 = python2Target9.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python2Target9.gen;
        boolean boolean15 = python2Target9.supportsOverloadedMethods();
        python2Target9.language = "\\\"\\\\\\\"\\\\\\\"\\\\\\\"\\\"";
        java.util.Locale locale19 = null;
        java.lang.String str20 = pythonStringRenderer0.toString((java.lang.Object) "\\\"\\\\\\\"\\\\\\\"\\\\\\\"\\\"", "_\"\\\\\\\"\\\\\\\"Context\"", locale19);
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator21);
        java.lang.String str24 = python2Target22.getImplicitSetLabel("");
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
        python2Target22.templates = sTGroup35;
        java.lang.String str39 = python2Target22.getAltLabelContextStructName("Python2");
        java.util.Set<java.lang.String> strSet40 = python2Target22.badWords;
        java.lang.String str42 = python2Target22.getListLabel("\"_@\"");
        java.lang.String[] strArray43 = python2Target22.targetCharValueEscape;
        java.util.Locale locale45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = pythonStringRenderer0.toString((java.lang.Object) strArray43, "\"\\\"hi!\\\"\"Context", locale45);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.String; cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_@" + "'", str4, "_@");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"\\\"\"" + "'", str8, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_\"\\\\\\\"\\\\\\\"Context\"" + "'", str20, "_\"\\\\\\\"\\\\\\\"Context\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_tset" + "'", str24, "_tset");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "@" + "'", str29, "@");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Python2" + "'", str30, "Python2");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Python2" + "'", str34, "Python2");
        org.junit.Assert.assertNotNull(sTGroup35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Python2Context" + "'", str39, "Python2Context");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\"_@\"" + "'", str42, "\"_@\"");
        org.junit.Assert.assertNotNull(strArray43);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        int int3 = python2Target1.getInlineTestSetWordSize();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python2Target1.gen = codeGenerator8;
        python2Target1.language = "_tseti";
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator12);
        java.util.Set<java.lang.String> strSet14 = python2Target13.badWords;
        java.lang.String str17 = python2Target13.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str19 = python2Target13.getImplicitRuleLabel("@");
        python2Target13.addBadWords();
        int int21 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray22 = python2Target13.targetCharValueEscape;
        java.lang.String str24 = python2Target13.getListLabel("\"_@\"");
        java.lang.String str27 = python2Target13.getTargetStringLiteralFromString("\"hi!\"", false);
        java.lang.String str29 = python2Target13.encodeIntAsCharEscape(1);
        java.lang.String str31 = python2Target13.getListLabel("\"\"");
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator33);
        java.util.Set<java.lang.String> strSet35 = python2Target34.badWords;
        boolean boolean36 = python2Target34.wantsBaseVisitor();
        boolean boolean37 = python2Target34.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator38);
        boolean boolean40 = python2Target39.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet41 = python2Target39.badWords;
        python2Target34.badWords = strSet41;
        org.antlr.v4.tool.Grammar grammar43 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target45 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator44);
        java.lang.String str47 = python2Target45.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = null;
        java.lang.String str51 = python2Target45.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator48, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        java.lang.String str55 = python2Target45.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator52, "\"\\\"\\\"\"", false);
        int int56 = python2Target45.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar57 = null;
        int[] intArray58 = new int[] {};
        java.lang.String[] strArray59 = python2Target45.getTokenTypesAsTargetLabels(grammar57, intArray58);
        java.lang.String[] strArray60 = python2Target34.getTokenTypesAsTargetLabels(grammar43, intArray58);
        java.lang.String[] strArray61 = python2Target13.getTokenTypesAsTargetLabels(grammar32, intArray58);
        python2Target1.targetCharValueEscape = strArray61;
        boolean boolean63 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_@" + "'", str19, "_@");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"_@\"" + "'", str24, "\"_@\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\\\"hi!\\\"" + "'", str27, "\\\"hi!\\\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\\1" + "'", str29, "\\1");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\"" + "'", str31, "\"\"");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "_tset" + "'", str47, "_tset");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\"\"" + "'", str51, "\"\"");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\\\"\\\"" + "'", str55, "\\\"\\\"");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2147483647 + "'", int56 == 2147483647);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[]");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\\"_AContext\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"_AContext\\\"\"" + "'", str1, "\"\\\"_AContext\\\"\"");
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
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.getListLabel("\"_@\"");
        boolean boolean13 = python2Target1.wantsBaseVisitor();
        java.lang.Class<?> wildcardClass14 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_@\"" + "'", str12, "\"_@\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.addBadWords();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.lang.String str12 = python2Target1.getListLabel("\"_@\"");
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", false);
        java.lang.String str16 = python2Target1.getVersion();
        python2Target1.language = "AContext";
        boolean boolean19 = python2Target1.templatesExist();
        java.lang.String str21 = python2Target1.getListLabel("_\\\"\\\"Context");
        org.antlr.v4.tool.Grammar grammar22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target1.getTokenTypeAsTargetLabel(grammar22, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_@\"" + "'", str12, "\"_@\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"hi!\\\"" + "'", str15, "\\\"hi!\\\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_\\\"\\\"Context" + "'", str21, "_\\\"\\\"Context");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"\\\"\\\"\"", false);
        python2Target1.language = "\\\"\\\"Context";
        java.lang.String str14 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getElementName("_tset\"_AContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\"" + "'", str11, "\\\"\\\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\\"\\\"Context" + "'", str14, "\\\"\\\"Context");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "\"\\\"_tset\\\"\"");
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.loadTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.gen;
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        python2Target1.language = "\"\\\"hi!\\\"\"";
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) '4');
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\64" + "'", str5, "\\64");
        org.junit.Assert.assertNull(codeGenerator6);
    }
}
