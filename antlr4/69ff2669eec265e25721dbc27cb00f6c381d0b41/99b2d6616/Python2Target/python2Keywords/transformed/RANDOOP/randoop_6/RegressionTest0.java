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
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) 0.0d, "", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.tool.Grammar grammar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python2Target0.getTokenTypeAsTargetLabel(grammar1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar5, sT6, "\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python2Target0.getLoopLabel(grammarAST2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar5, sT6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar5, sT6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar3, sT4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        java.lang.Class<?> wildcardClass3 = python2Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) ' ', "\"hi!\"", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar3, sT4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target0.getLoopLabel(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) (byte) 0, "", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar3, sT4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target0.getLoopLabel(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar11, sT12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar4, sT5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.Class<?> wildcardClass5 = python2Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target0.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target0.getLoopLabel(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target0.getListLabel("\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar3 = null;
        int[] intArray5 = new int[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = python2Target0.getTokenTypesAsTargetLabels(grammar3, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97]");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python2Target1.badWords = strSet7;
        org.stringtemplate.v4.STGroup sTGroup10 = null;
        python2Target1.templates = sTGroup10;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = pythonStringRenderer0.toString((java.lang.Object) python2Target1, "\"i\"", locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar11, sT12, "\"\"hi!\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target0.getLoopLabel(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup24 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target0.getElementName("\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target0.getListLabel("\\12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target0.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target0.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        int int4 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target0.getTokenTypeAsTargetLabel(grammar9, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) 100L, "\\\"i", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        boolean boolean24 = python2Target0.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar13, sT14, "\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String[] strArray12 = new java.lang.String[] { "\\0", "\\1", "\"hi!\"", "\\0", "i", "\"i\"", "\"\"hi!\"\"", "\"hi!\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python2Target0.badWords = strSet13;
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) 2147483647, "4.5.2.1", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = pythonStringRenderer0.toString((java.lang.Object) python2Target1, "\"\"", locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup9 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getImplicitTokenLabel("i");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python2Target0.genRecognizerHeaderFile(grammar5, sT6, "\\1");
        java.lang.Class<?> wildcardClass9 = python2Target0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        org.antlr.v4.tool.Rule rule27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python2Target0.getRuleFunctionContextStructName(rule27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar7 = null;
        int[] intArray11 = new int[] { 64, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = python2Target0.getTokenTypesAsTargetLabels(grammar7, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[64, 1, 10]");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6, "\"\\\\\\\"i\"");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.util.Set<java.lang.String> strSet11 = python2Target0.getBadWords();
        org.antlr.v4.tool.Grammar grammar12 = null;
        int[] intArray15 = new int[] { '4', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray16 = python2Target0.getTokenTypesAsTargetLabels(grammar12, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 0]");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) 100L, "\"\\\"hi!\\\"\\\"Contex\"", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.Class<?> wildcardClass5 = python2Target0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar5, sT6, "_\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\\\\\\"i\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\\\\\"i\"" + "'", str1, "\"\\\\\\\"i\"");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python2Target0.genRecognizerHeaderFile(grammar5, sT6, "\\1");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar9, sT10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar6, sT7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target0.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python2Target1.badWords = strSet7;
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = pythonStringRenderer0.toString((java.lang.Object) int10, "\"\"hi!\"\"Context", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        python2Target0.language = "\\1";
        org.antlr.v4.tool.Rule rule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target0.getRuleFunctionContextStructName(rule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        org.antlr.v4.tool.ast.GrammarAST grammarAST27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python2Target0.getLoopCounter(grammarAST27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Rule rule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target0.getRuleFunctionContextStructName(rule3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.util.Set<java.lang.String> strSet11 = python2Target0.getBadWords();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar12, sT13, "\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.tool.ast.GrammarAST grammarAST1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = python2Target0.getLoopCounter(grammarAST1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target0.getTokenTypeAsTargetLabel(grammar4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.util.Set<java.lang.String> strSet11 = python2Target0.getBadWords();
        java.lang.Class<?> wildcardClass12 = python2Target0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = python2Target0.getElementListName("\"\\\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\\\\\"i\"" + "'", str32, "\"\\\\\\\"i\"");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target0.getElementName("\"_\"i\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\\\\\"i\"" + "'", str32, "\"\\\\\\\"i\"");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i" + "'", str1, "i");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target0.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target0.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup11 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target0.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6, "\"\\\\\\\"i\"");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup25 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        python2Target0.gen = codeGenerator18;
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar20, sT21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.language = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target0.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String[] strArray12 = new java.lang.String[] { "\\0", "\\1", "\"hi!\"", "\\0", "i", "\"i\"", "\"\"hi!\"\"", "\"hi!\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python2Target0.badWords = strSet13;
        org.antlr.v4.tool.Grammar grammar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target0.getTokenTypeAsTargetLabel(grammar16, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.String[] strArray0 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target0.gen = codeGenerator11;
        java.util.Set<java.lang.String> strSet13 = python2Target0.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target0.getListLabel("\\12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target0.templates;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getImplicitRuleLabel("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(sTGroup8);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar10 = null;
        int[] intArray16 = new int[] { 0, 'a', '#', 2147483647, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray17 = python2Target0.getTokenTypesAsTargetLabels(grammar10, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 97, 35, 2147483647, 35]");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target0.getRuleFunctionContextStructName(ruleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str26 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python2Target0.getLoopCounter(grammarAST27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26, "\"\"i\"\"");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        python2Target0.language = "\\1";
        java.lang.String str13 = python2Target0.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target0.getImplicitRuleLabel("\"\"i\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.stringtemplate.v4.ST sT34 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar33, sT34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\\\\\"i\"" + "'", str32, "\"\\\\\\\"i\"");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target12.loadTemplates();
        python2Target0.templates = sTGroup13;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target0.getRuleFunctionContextStructName(ruleFunction15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6, "\"\\\\\\\"i\"");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar12, sT13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"i\"" + "'", str10, "\"\\\"i\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String[] strArray10 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        python2Target0.targetCharValueEscape = strArray10;
        boolean boolean14 = python2Target0.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target0.getListLabel("1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        java.lang.String str6 = python2Target1.language;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        org.antlr.v4.tool.Grammar grammar27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = python2Target0.getTokenTypeAsTargetLabel(grammar27, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target10.loadTemplates();
        python2Target0.templates = sTGroup11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target0.getElementListName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\\\\\"i\"" + "'", str32, "\"\\\\\\\"i\"");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("\\12");
        java.lang.String str10 = python2Target1.getListLabel("\"i\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6, "\"\\\\\\\"i\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\12Context" + "'", str8, "\\12Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"i\"" + "'", str10, "\"i\"");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target();
        int int8 = python2Target7.getInlineTestSetWordSize();
        java.lang.String str11 = python2Target7.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str12 = python2Target7.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str15 = python2Target13.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python2Target13.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        java.lang.String str23 = python2Target13.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator20, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator24);
        org.stringtemplate.v4.STGroup sTGroup26 = python2Target25.loadTemplates();
        python2Target13.templates = sTGroup26;
        python2Target7.templates = sTGroup26;
        python2Target0.templates = sTGroup26;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = python2Target0.getElementListName("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"hi!\"\"" + "'", str11, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"hi!\"" + "'", str15, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\"" + "'", str23, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup26);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str9 = python2Target0.getVersion();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target0.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0", true);
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.stringtemplate.v4.ST sT19 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar18, sT19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        python2Target0.language = "";
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar13, sT14, "1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) "4.5.2.1", "\\0", locale3);
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str7 = python2Target5.encodeIntAsCharEscape(0);
        java.lang.String str9 = python2Target5.encodeIntAsCharEscape((int) (short) 1);
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = pythonStringRenderer0.toString((java.lang.Object) python2Target5, "\"\"", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\0" + "'", str4, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\0" + "'", str7, "\\0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\1" + "'", str9, "\\1");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python2Target0.getCodeGenerator();
        boolean boolean25 = python2Target0.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python2Target0.getImplicitTokenLabel("Python2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(codeGenerator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target0.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"\"hi!\"\"Context", true);
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.stringtemplate.v4.ST sT19 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar18, sT19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"hi!\\\"\\\"Contex\"" + "'", str17, "\"\\\"hi!\\\"\\\"Contex\"");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getRuleFunctionContextStructName(ruleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(sTGroup2);
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python2Target1.badWords = strSet7;
        python2Target0.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "\\12", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target0.gen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target0.getElementListName("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertNull(codeGenerator15);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        python2Target1.gen = codeGenerator4;
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python2Target0.getCodeGenerator();
        boolean boolean25 = python2Target0.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup26 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(codeGenerator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) (byte) -1, "\"\\\\\\\"i\"", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target0.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.gen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target0.getImplicitTokenLabel("\"_\"i\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertNull(codeGenerator18);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python2Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.stringtemplate.v4.ST sT16 = null;
        python2Target0.genRecognizerHeaderFile(grammar15, sT16, "\"\\\\\\\"i\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target0.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.stringtemplate.v4.ST sT28 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar27, sT28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str15 = python2Target13.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python2Target13.gen = codeGenerator16;
        java.lang.String[] strArray23 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray23;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray23;
        python2Target13.targetCharValueEscape = strArray23;
        python2Target0.targetCharValueEscape = strArray23;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = python2Target0.getListLabel("\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\0" + "'", str15, "\\0");
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python2Target1.badWords = strSet7;
        python2Target0.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "\\12", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target0.getLoopCounter(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        java.lang.String[] strArray4 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target0.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        python2Target0.genRecognizerHeaderFile(grammar14, sT15, "_\"i\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target0.getImplicitTokenLabel("\"\\12\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target0.getElementListName("Python2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        boolean boolean27 = python2Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.stringtemplate.v4.ST sT29 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar28, sT29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromString("i", true);
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"i\"" + "'", str7, "\"i\"");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.language = "";
        java.lang.String[] strArray5 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target0.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape(1);
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) ' ');
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target0.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\1" + "'", str4, "\\1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.wantsBaseListener();
        python2Target0.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str31 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        java.lang.String str33 = python2Target0.getTargetStringLiteralFromString("\"\"i\"\"");
        java.lang.Class<?> wildcardClass34 = python2Target0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\"i\"\"" + "'", str31, "\"\"i\"\"");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\"\"i\"\"\"" + "'", str33, "\"\"\"i\"\"\"");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        java.util.Set<java.lang.String> strSet33 = python2Target0.badWords;
        java.lang.String str34 = python2Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = python2Target0.getImplicitRuleLabel("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\\\\\"i\"" + "'", str32, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        java.lang.String[] strArray4 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target0.getTokenTypeAsTargetLabel(grammar6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target0.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target0.getLoopLabel(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\1" + "'", str4, "\\1");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String[] strArray10 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        python2Target0.targetCharValueEscape = strArray10;
        java.lang.String str16 = python2Target0.getTargetStringLiteralFromString(" ", true);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup17 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\" \"" + "'", str16, "\" \"");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target0.getElementListName("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) "4.5.2.1", "\\0", locale3);
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) 0, "4.5.2.1", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\0" + "'", str4, "\\0");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.addBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target0.getRuleFunctionContextStructName(ruleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        java.lang.String[] strArray14 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray14;
        python2Target0.targetCharValueEscape = strArray14;
        java.lang.String[] strArray17 = python2Target0.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup18 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"i" + "'", str8, "\\\"i");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str15 = python2Target13.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python2Target13.gen = codeGenerator16;
        java.lang.String[] strArray23 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray23;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray23;
        python2Target13.targetCharValueEscape = strArray23;
        python2Target0.targetCharValueEscape = strArray23;
        org.antlr.v4.tool.Rule rule28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = python2Target0.getRuleFunctionContextStructName(rule28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\0" + "'", str15, "\\0");
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        java.lang.String str8 = python2Target0.language;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        python2Target0.genRecognizerHeaderFile(grammar14, sT15, "_\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.gen;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(codeGenerator18);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        java.lang.String[] strArray14 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray14;
        python2Target0.targetCharValueEscape = strArray14;
        boolean boolean17 = python2Target0.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target0.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"i" + "'", str8, "\\\"i");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target10.loadTemplates();
        python2Target0.templates = sTGroup11;
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar13, sT14, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        boolean boolean27 = python2Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = python2Target0.getTokenTypeAsTargetLabel(grammar28, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python2Target0.genRecognizerHeaderFile(grammar9, sT10, "Python2");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target0.getListLabel("\"\\\"hi!\\\"\\\"Contex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target();
        int int8 = python2Target7.getInlineTestSetWordSize();
        int int9 = python2Target7.getInlineTestSetWordSize();
        boolean boolean10 = python2Target7.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target7.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target7.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_\"i\"", false);
        java.lang.String[] strArray21 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray21;
        python2Target7.targetCharValueEscape = strArray21;
        python2Target0.targetCharValueEscape = strArray21;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python2Target0.getElementListName("\"\"i\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"i" + "'", str15, "\\\"i");
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        java.util.Set<java.lang.String> strSet11 = python2Target0.getBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target0.getRuleFunctionContextStructName(ruleFunction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"i\"" + "'", str10, "\"\\\"i\"");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar3, sT4, "\\\"i");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getRuleFunctionContextStructName(ruleFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromString("\\\"i\\\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target0.getImplicitTokenLabel("\"\\12\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"i\\\"\"" + "'", str6, "\"\\\"i\\\"\"");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target6.templates = sTGroup19;
        python2Target0.templates = sTGroup19;
        boolean boolean22 = python2Target0.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass23 = python2Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"hi!\"" + "'", str8, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\" \"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getImplicitTokenLabel("\"\\\"hi!\\\"\\\"Contex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\" \"Context" + "'", str10, "\" \"Context");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"\"\"i\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"\"\"i\"\"\"\"" + "'", str1, "\"\"\"\"i\"\"\"\"");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target0.getImplicitRuleLabel("\"\\\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str26 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        org.stringtemplate.v4.STGroup sTGroup27 = python2Target0.templates;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = python2Target0.getElementListName("1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26, "\"\"i\"\"");
        org.junit.Assert.assertNull(sTGroup27);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromString("\\\"i\\\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target0.getImplicitRuleLabel("i");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"i\\\"\"" + "'", str6, "\"\\\"i\\\"\"");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str9 = python2Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar10, sT11, "\\12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        int int4 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup11 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target0.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        java.lang.String str8 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementListName("\\\"i\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0", true);
        java.lang.String str20 = python2Target0.getTargetStringLiteralFromString("\"\"hi!\"\"", true);
        boolean boolean21 = python2Target0.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python2Target0.getImplicitSetLabel("\"_\"i\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str20, "\"\"\"hi!\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target2 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator1);
        java.lang.String str4 = python2Target2.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target2.getVersion();
        java.lang.String str8 = python2Target2.getTargetStringLiteralFromString("", true);
        java.util.Set<java.lang.String> strSet9 = python2Target2.getBadWords();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = pythonStringRenderer0.toString((java.lang.Object) python2Target2, " ", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"Context" + "'", str4, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"" + "'", str8, "\"\"");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        java.lang.String str9 = python2Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\"\\\"i\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target0.getLoopCounter(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\"i\"\"" + "'", str8, "\"_\"i\"\"");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"i\"" + "'", str13, "\"\\\"i\"");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        int int3 = python2Target1.getInlineTestSetWordSize();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator5, "\"\"i\"\"", locale7);
        java.util.Locale locale11 = null;
        java.lang.String str12 = pythonStringRenderer0.toString((java.lang.Object) "Python2", "_\"i\"", locale11);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str15 = python2Target13.getTargetStringLiteralFromString("hi!");
        python2Target13.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python2Target13.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "hi!", false);
        int int22 = python2Target13.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target23 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str25 = python2Target23.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target();
        int int27 = python2Target26.getInlineTestSetWordSize();
        java.lang.String[] strArray31 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        python2Target26.badWords = strSet32;
        python2Target23.badWords = strSet32;
        python2Target13.badWords = strSet32;
        python2Target13.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup38 = null;
        python2Target13.templates = sTGroup38;
        boolean boolean40 = python2Target13.templatesExist();
        java.util.Locale locale42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = pythonStringRenderer0.toString((java.lang.Object) python2Target13, "\"\"hi!\"\"Context", locale42);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"i\"\"" + "'", str8, "\"\"i\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"i\"" + "'", str12, "_\"i\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"hi!\"" + "'", str15, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "i" + "'", str21, "i");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\0" + "'", str25, "\\0");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target0.gen = codeGenerator11;
        java.util.Set<java.lang.String> strSet13 = python2Target0.getBadWords();
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar14, sT15, "i");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"_\"i\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"_\"i\"\"" + "'", str1, "\"_\"i\"\"");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        int int4 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"\"hi!\"\"\"", false);
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str7, "\\\"\\\"\\\"hi!\\\"\\\"\\\"");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target0.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str11 = python2Target9.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target();
        int int13 = python2Target12.getInlineTestSetWordSize();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        python2Target12.badWords = strSet18;
        python2Target9.badWords = strSet18;
        python2Target0.badWords = strSet18;
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.stringtemplate.v4.ST sT24 = null;
        python2Target0.genRecognizerHeaderFile(grammar23, sT24, "_\"i\"");
        java.lang.String str28 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup29 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\0" + "'", str11, "\\0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\\\"i\"" + "'", str28, "\"\\\"i\"");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.tool.Rule rule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target0.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        java.util.Set<java.lang.String> strSet33 = python2Target0.badWords;
        org.antlr.v4.tool.ast.GrammarAST grammarAST34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\\\\\"i\"" + "'", str32, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(strSet33);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target0.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getAltLabelContextStructName("\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target0.gen = codeGenerator11;
        java.util.Set<java.lang.String> strSet13 = python2Target0.getBadWords();
        java.lang.String str14 = python2Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python2Target0.getTokenTypesAsTargetLabels(grammar15, intArray16);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target0.getRuleFunctionContextStructName(ruleFunction18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        python2Target0.addBadWords();
        python2Target0.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target();
        int int6 = python2Target5.getInlineTestSetWordSize();
        int int7 = python2Target5.getInlineTestSetWordSize();
        boolean boolean8 = python2Target5.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target5.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target5.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "_\"i\"", false);
        java.lang.String[] strArray19 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray19;
        python2Target5.targetCharValueEscape = strArray19;
        python2Target1.targetCharValueEscape = strArray19;
        org.antlr.v4.tool.ast.GrammarAST grammarAST23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target1.getLoopCounter(grammarAST23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\\"i" + "'", str13, "\\\"i");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String[] strArray10 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        python2Target0.targetCharValueEscape = strArray10;
        boolean boolean14 = python2Target0.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\\\"i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\"i" + "'", str1, "\\\"i");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str15 = python2Target13.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python2Target13.gen = codeGenerator16;
        java.lang.String[] strArray23 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray23;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray23;
        python2Target13.targetCharValueEscape = strArray23;
        python2Target0.targetCharValueEscape = strArray23;
        java.lang.String[] strArray28 = python2Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = python2Target0.getTokenTypeAsTargetLabel(grammar29, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\0" + "'", str15, "\\0");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target12.loadTemplates();
        python2Target0.templates = sTGroup13;
        java.lang.String str15 = python2Target0.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python2Target0.gen = codeGenerator7;
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar9, sT10, "\"\"\\12Context\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"\"hi!\"\"Context", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target0.getListLabel("\"_\\\\0\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"hi!\\\"\\\"Contex\"" + "'", str17, "\"\\\"hi!\\\"\\\"Contex\"");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        python2Target0.gen = codeGenerator18;
        java.lang.String str20 = python2Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup21 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        java.lang.String[] strArray4 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target();
        int int8 = python2Target7.getInlineTestSetWordSize();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python2Target7.badWords = strSet13;
        org.stringtemplate.v4.STGroup sTGroup16 = null;
        python2Target7.templates = sTGroup16;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        python2Target7.gen = codeGenerator18;
        java.util.Set<java.lang.String> strSet20 = python2Target7.getBadWords();
        java.lang.String str21 = python2Target7.getVersion();
        org.antlr.v4.tool.Grammar grammar22 = null;
        int[] intArray23 = new int[] {};
        java.lang.String[] strArray24 = python2Target7.getTokenTypesAsTargetLabels(grammar22, intArray23);
        java.lang.String[] strArray25 = python2Target0.getTokenTypesAsTargetLabels(grammar6, intArray23);
        org.antlr.v4.tool.ast.GrammarAST grammarAST26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target();
        int int9 = python2Target8.getInlineTestSetWordSize();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        python2Target8.badWords = strSet14;
        org.stringtemplate.v4.STGroup sTGroup17 = null;
        python2Target8.templates = sTGroup17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        python2Target8.gen = codeGenerator19;
        java.util.Set<java.lang.String> strSet21 = python2Target8.getBadWords();
        java.lang.String str22 = python2Target8.getVersion();
        org.antlr.v4.tool.Grammar grammar23 = null;
        int[] intArray24 = new int[] {};
        java.lang.String[] strArray25 = python2Target8.getTokenTypesAsTargetLabels(grammar23, intArray24);
        java.lang.String[] strArray26 = python2Target0.getTokenTypesAsTargetLabels(grammar7, intArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python2Target0.getImplicitSetLabel("_\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0", true);
        java.lang.String str20 = python2Target0.getTargetStringLiteralFromString("\"\"hi!\"\"", true);
        java.lang.Class<?> wildcardClass21 = python2Target0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str20, "\"\"\"hi!\"\"\"");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.tool.Grammar grammar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target0.getTokenTypeAsTargetLabel(grammar5, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\12\"");
        org.stringtemplate.v4.STGroup sTGroup33 = python2Target0.templates;
        org.antlr.v4.tool.ast.GrammarAST grammarAST34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = python2Target0.getLoopCounter(grammarAST34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"\\12\"\"" + "'", str32, "\"\"\\12\"\"");
        org.junit.Assert.assertNull(sTGroup33);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String[] strArray12 = new java.lang.String[] { "\\0", "\\1", "\"hi!\"", "\\0", "i", "\"i\"", "\"\"hi!\"\"", "\"hi!\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python2Target0.badWords = strSet13;
        java.lang.Class<?> wildcardClass16 = strSet13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar8, sT9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str26 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        boolean boolean27 = python2Target0.wantsBaseListener();
        java.lang.String[] strArray28 = null;
        python2Target0.targetCharValueEscape = strArray28;
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str33 = python2Target31.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        python2Target31.gen = codeGenerator34;
        java.lang.String str37 = python2Target31.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str41 = python2Target39.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        python2Target39.gen = codeGenerator42;
        java.lang.String str45 = python2Target39.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar46 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target47 = new org.antlr.v4.codegen.target.Python2Target();
        int int48 = python2Target47.getInlineTestSetWordSize();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        python2Target47.badWords = strSet53;
        org.stringtemplate.v4.STGroup sTGroup56 = null;
        python2Target47.templates = sTGroup56;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        python2Target47.gen = codeGenerator58;
        java.util.Set<java.lang.String> strSet60 = python2Target47.getBadWords();
        java.lang.String str61 = python2Target47.getVersion();
        org.antlr.v4.tool.Grammar grammar62 = null;
        int[] intArray63 = new int[] {};
        java.lang.String[] strArray64 = python2Target47.getTokenTypesAsTargetLabels(grammar62, intArray63);
        java.lang.String[] strArray65 = python2Target39.getTokenTypesAsTargetLabels(grammar46, intArray63);
        java.lang.String[] strArray66 = python2Target31.getTokenTypesAsTargetLabels(grammar38, intArray63);
        java.lang.String[] strArray67 = python2Target0.getTokenTypesAsTargetLabels(grammar30, intArray63);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = python2Target0.getImplicitRuleLabel("\" \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\\0" + "'", str33, "\\0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\\12" + "'", str37, "\\12");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\\0" + "'", str41, "\\0");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\\12" + "'", str45, "\\12");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 64 + "'", int48 == 64);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "4.5.2.1" + "'", str61, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[]");
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target0.gen = codeGenerator11;
        java.util.Set<java.lang.String> strSet13 = python2Target0.getBadWords();
        java.lang.String str14 = python2Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python2Target0.getTokenTypesAsTargetLabels(grammar15, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup18 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"\"hi!\"\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str1, "\"\"\"hi!\"\"\"");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python2Target1.badWords = strSet7;
        python2Target0.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "\\12", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target0.gen;
        java.lang.String str16 = python2Target0.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup17 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        int int10 = python2Target0.getInlineTestSetWordSize();
        int int11 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target0.getTokenTypeAsTargetLabel(grammar12, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target0.getCodeGenerator();
        python2Target0.language = "\\12Context";
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target0.getCodeGenerator();
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target0.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet7 = python2Target0.badWords;
        java.lang.String str9 = python2Target0.encodeIntAsCharEscape((int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#" + "'", str9, "#");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String[] strArray10 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        python2Target0.targetCharValueEscape = strArray10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target0.getImplicitSetLabel("\" \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String[] strArray10 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        python2Target0.targetCharValueEscape = strArray10;
        java.lang.String str16 = python2Target0.getTargetStringLiteralFromString(" ", true);
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.stringtemplate.v4.ST sT18 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar17, sT18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\" \"" + "'", str16, "\" \"");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet7 = python2Target0.badWords;
        java.lang.Class<?> wildcardClass8 = python2Target0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target0.templates;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup9 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(sTGroup8);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.loadTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getImplicitTokenLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(sTGroup2);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target10.loadTemplates();
        python2Target0.templates = sTGroup11;
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        int int5 = python2Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target0.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python2Target0.genRecognizerHeaderFile(grammar9, sT10, "Python2");
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar13, sT14, "#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        int int3 = python2Target1.getInlineTestSetWordSize();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator5, "\"\"i\"\"", locale7);
        java.util.Locale locale11 = null;
        java.lang.String str12 = pythonStringRenderer0.toString((java.lang.Object) "Python2", "_\"i\"", locale11);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target14.loadTemplates();
        java.lang.String str17 = python2Target14.getImplicitRuleLabel("\\0");
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = pythonStringRenderer0.toString((java.lang.Object) python2Target14, "", locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"i\"\"" + "'", str8, "\"\"i\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"i\"" + "'", str12, "_\"i\"");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_\\0" + "'", str17, "_\\0");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target6.templates = sTGroup19;
        python2Target0.templates = sTGroup19;
        java.util.Set<java.lang.String> strSet22 = python2Target0.badWords;
        org.antlr.v4.tool.Grammar grammar23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python2Target0.getTokenTypeAsTargetLabel(grammar23, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"hi!\"" + "'", str8, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.util.Set<java.lang.String> strSet11 = python2Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target0.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar3, sT4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target0.getRuleFunctionContextStructName(ruleFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str13 = python2Target11.getTargetStringLiteralFromString("hi!");
        python2Target11.language = "hi!";
        java.util.Set<java.lang.String> strSet16 = python2Target11.badWords;
        python2Target0.badWords = strSet16;
        org.antlr.v4.tool.Grammar grammar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target0.getTokenTypeAsTargetLabel(grammar18, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"i\"" + "'", str10, "\"\\\"i\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"hi!\"" + "'", str13, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str31 = python2Target0.encodeIntAsCharEscape(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python2Target0.getElementListName("\"\"\\12Context\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\\0" + "'", str31, "\\0");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target0.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.util.Set<java.lang.String> strSet13 = python2Target0.badWords;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target0.getListLabel("\"\\\"i\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        python2Target0.gen = codeGenerator1;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar3, sT4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"i\"" + "'", str10, "\"\\\"i\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\12Context\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\12Context\"" + "'", str1, "\"\\12Context\"");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.stringtemplate.v4.ST sT26 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar25, sT26, "\"\"\\12Context\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str31 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python2Target0.getImplicitRuleLabel("\"\\12\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\"i\"\"" + "'", str31, "\"\"i\"\"");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"i" + "'", str8, "\\\"i");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target();
        int int10 = python2Target9.getInlineTestSetWordSize();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        python2Target9.badWords = strSet15;
        python2Target0.badWords = strSet15;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup19 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"i" + "'", str8, "\\\"i");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = python2Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\\\\\"i\"" + "'", str32, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNull(codeGenerator33);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        python2Target0.language = "\\1";
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str26 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        boolean boolean27 = python2Target0.wantsBaseListener();
        java.lang.String[] strArray28 = null;
        python2Target0.targetCharValueEscape = strArray28;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = python2Target0.getImplicitRuleLabel("\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.gen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target0.getAltLabelContextStructName("\\12Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertNull(codeGenerator18);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        java.lang.String[] strArray14 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray14;
        python2Target0.targetCharValueEscape = strArray14;
        java.lang.String[] strArray17 = python2Target0.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target0.getImplicitTokenLabel("\\12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"i" + "'", str8, "\\\"i");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python2Target0.getCodeGenerator();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target0.getRuleFunctionContextStructName(ruleFunction15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        java.lang.String str14 = python2Target0.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.getLanguage();
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target0.genRecognizerHeaderFile(grammar6, sT7, "\"\"\\12\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target0.getElementName("\"\\12Context\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator33);
        java.lang.String str36 = python2Target34.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str37 = python2Target34.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target();
        int int39 = python2Target38.getInlineTestSetWordSize();
        int int40 = python2Target38.getInlineTestSetWordSize();
        boolean boolean41 = python2Target38.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = python2Target38.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = null;
        java.lang.String str46 = python2Target38.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator43, "_\"i\"", false);
        java.lang.String[] strArray52 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray52;
        python2Target38.targetCharValueEscape = strArray52;
        python2Target34.targetCharValueEscape = strArray52;
        python2Target0.targetCharValueEscape = strArray52;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str58 = python2Target0.getElementName(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\\\\\"i\"" + "'", str32, "\"\\\\\\\"i\"");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"\"hi!\"\"Context" + "'", str36, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Python2" + "'", str37, "Python2");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 64 + "'", int40 == 64);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(codeGenerator42);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\\\"i" + "'", str46, "\\\"i");
        org.junit.Assert.assertNotNull(strArray52);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0", true);
        java.lang.String str20 = python2Target0.getTargetStringLiteralFromString("\"\"hi!\"\"", true);
        boolean boolean21 = python2Target0.templatesExist();
        java.lang.String[] strArray22 = python2Target0.targetCharValueEscape;
        java.lang.String str23 = python2Target0.language;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python2Target0.getImplicitRuleLabel(" \\\"Contex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str20, "\"\"\"hi!\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\"i\"\"", false);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target0.getRuleFunctionContextStructName(ruleFunction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\"i\\\"" + "'", str12, "\\\"i\\\"");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target0.gen;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar8, sT9, "\\\"i");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str11 = python2Target9.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target();
        int int13 = python2Target12.getInlineTestSetWordSize();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        python2Target12.badWords = strSet18;
        python2Target9.badWords = strSet18;
        python2Target0.badWords = strSet18;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python2Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\0" + "'", str11, "\\0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(codeGenerator23);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray13;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray13;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray13;
        java.lang.Class<?> wildcardClass17 = strArray13.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str10 = python2Target8.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python2Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "", true);
        java.util.Set<java.lang.String> strSet19 = python2Target8.getBadWords();
        python2Target1.badWords = strSet19;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str23 = python2Target21.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target();
        int int25 = python2Target24.getInlineTestSetWordSize();
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        python2Target24.badWords = strSet30;
        python2Target21.badWords = strSet30;
        python2Target1.badWords = strSet30;
        java.lang.String str35 = python2Target1.language;
        boolean boolean36 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar37 = null;
        org.stringtemplate.v4.ST sT38 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar37, sT38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\\0" + "'", str23, "\\0");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Python2" + "'", str35, "Python2");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray11 = new int[] { (-1), ' ', (byte) 1, (byte) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = python2Target0.getTokenTypesAsTargetLabels(grammar5, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\1" + "'", str4, "\\1");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 32, 1, 100, 0]");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromString("i", true);
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"i\"" + "'", str7, "\"i\"");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target7.loadTemplates();
        python2Target0.templates = sTGroup8;
        java.lang.String str11 = python2Target0.getTargetStringLiteralFromString("\\12Context");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target0.getRuleFunctionContextStructName(ruleFunction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\12Context\"" + "'", str11, "\"\\12Context\"");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str26 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        boolean boolean27 = python2Target0.wantsBaseListener();
        java.lang.String[] strArray28 = null;
        python2Target0.targetCharValueEscape = strArray28;
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str33 = python2Target31.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        python2Target31.gen = codeGenerator34;
        java.lang.String str37 = python2Target31.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str41 = python2Target39.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        python2Target39.gen = codeGenerator42;
        java.lang.String str45 = python2Target39.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar46 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target47 = new org.antlr.v4.codegen.target.Python2Target();
        int int48 = python2Target47.getInlineTestSetWordSize();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        python2Target47.badWords = strSet53;
        org.stringtemplate.v4.STGroup sTGroup56 = null;
        python2Target47.templates = sTGroup56;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        python2Target47.gen = codeGenerator58;
        java.util.Set<java.lang.String> strSet60 = python2Target47.getBadWords();
        java.lang.String str61 = python2Target47.getVersion();
        org.antlr.v4.tool.Grammar grammar62 = null;
        int[] intArray63 = new int[] {};
        java.lang.String[] strArray64 = python2Target47.getTokenTypesAsTargetLabels(grammar62, intArray63);
        java.lang.String[] strArray65 = python2Target39.getTokenTypesAsTargetLabels(grammar46, intArray63);
        java.lang.String[] strArray66 = python2Target31.getTokenTypesAsTargetLabels(grammar38, intArray63);
        java.lang.String[] strArray67 = python2Target0.getTokenTypesAsTargetLabels(grammar30, intArray63);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup68 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\\0" + "'", str33, "\\0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\\12" + "'", str37, "\\12");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\\0" + "'", str41, "\\0");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\\12" + "'", str45, "\\12");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 64 + "'", int48 == 64);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "4.5.2.1" + "'", str61, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[]");
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String[] strArray10 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        python2Target0.targetCharValueEscape = strArray10;
        java.lang.String str16 = python2Target0.getTargetStringLiteralFromString(" ", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target0.getListLabel("\"\"i\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\" \"" + "'", str16, "\" \"");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target0.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        python2Target0.language = "\\1";
        boolean boolean13 = python2Target0.supportsOverloadedMethods();
        java.lang.String str14 = python2Target0.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target0.getLoopLabel(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\1" + "'", str14, "\\1");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        python2Target1.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getImplicitTokenLabel("\"\"hi!\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str26 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        boolean boolean27 = python2Target0.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = python2Target0.getImplicitSetLabel("\\\"i");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str26 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        boolean boolean27 = python2Target0.wantsBaseListener();
        java.lang.String[] strArray28 = null;
        python2Target0.targetCharValueEscape = strArray28;
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str33 = python2Target31.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        python2Target31.gen = codeGenerator34;
        java.lang.String str37 = python2Target31.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str41 = python2Target39.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        python2Target39.gen = codeGenerator42;
        java.lang.String str45 = python2Target39.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar46 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target47 = new org.antlr.v4.codegen.target.Python2Target();
        int int48 = python2Target47.getInlineTestSetWordSize();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        python2Target47.badWords = strSet53;
        org.stringtemplate.v4.STGroup sTGroup56 = null;
        python2Target47.templates = sTGroup56;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        python2Target47.gen = codeGenerator58;
        java.util.Set<java.lang.String> strSet60 = python2Target47.getBadWords();
        java.lang.String str61 = python2Target47.getVersion();
        org.antlr.v4.tool.Grammar grammar62 = null;
        int[] intArray63 = new int[] {};
        java.lang.String[] strArray64 = python2Target47.getTokenTypesAsTargetLabels(grammar62, intArray63);
        java.lang.String[] strArray65 = python2Target39.getTokenTypesAsTargetLabels(grammar46, intArray63);
        java.lang.String[] strArray66 = python2Target31.getTokenTypesAsTargetLabels(grammar38, intArray63);
        java.lang.String[] strArray67 = python2Target0.getTokenTypesAsTargetLabels(grammar30, intArray63);
        org.stringtemplate.v4.STGroup sTGroup68 = python2Target0.templates;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str71 = python2Target0.getTargetStringLiteralFromString("1", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\\0" + "'", str33, "\\0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\\12" + "'", str37, "\\12");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\\0" + "'", str41, "\\0");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\\12" + "'", str45, "\\12");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 64 + "'", int48 == 64);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "4.5.2.1" + "'", str61, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[]");
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNull(sTGroup68);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\12\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\12\"" + "'", str1, "\"\\12\"");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str26 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        boolean boolean27 = python2Target0.wantsBaseListener();
        java.lang.String str30 = python2Target0.getTargetStringLiteralFromString("\"\\12Context\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = python2Target0.getElementName("\"\"\\12Context\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"\"\\12Context\"\"" + "'", str30, "\"\"\\12Context\"\"");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str13 = python2Target11.getTargetStringLiteralFromString("hi!");
        python2Target11.language = "hi!";
        java.util.Set<java.lang.String> strSet16 = python2Target11.badWords;
        python2Target0.badWords = strSet16;
        org.antlr.v4.tool.Grammar grammar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target0.getTokenTypeAsTargetLabel(grammar18, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"i\"" + "'", str10, "\"\\\"i\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"hi!\"" + "'", str13, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str13 = python2Target11.getTargetStringLiteralFromString("hi!");
        python2Target11.language = "hi!";
        java.util.Set<java.lang.String> strSet16 = python2Target11.badWords;
        python2Target0.badWords = strSet16;
        org.antlr.v4.tool.Grammar grammar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target0.getTokenTypeAsTargetLabel(grammar18, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"i\"" + "'", str10, "\"\\\"i\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"hi!\"" + "'", str13, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet10 = python2Target0.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        boolean boolean24 = python2Target0.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup25 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.Class<?> wildcardClass10 = python2Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String[] strArray10 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        python2Target0.targetCharValueEscape = strArray10;
        java.lang.String str16 = python2Target0.getTargetStringLiteralFromString(" ", true);
        python2Target0.addBadWords();
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.stringtemplate.v4.ST sT19 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar18, sT19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\" \"" + "'", str16, "\" \"");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        java.lang.String[] strArray14 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray14;
        python2Target0.targetCharValueEscape = strArray14;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        java.lang.String str20 = python2Target18.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str21 = python2Target18.getVersion();
        java.lang.String str23 = python2Target18.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup24 = python2Target18.templates;
        python2Target0.templates = sTGroup24;
        org.antlr.v4.tool.Grammar grammar26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python2Target0.getTokenTypeAsTargetLabel(grammar26, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"i" + "'", str8, "\\\"i");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"hi!\"\"Context" + "'", str20, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\\\\\\"i\"" + "'", str23, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(sTGroup24);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        boolean boolean5 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target0.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target1.gen = codeGenerator6;
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.lang.String str11 = python2Target9.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str13 = python2Target9.getImplicitRuleLabel("\"i\"");
        boolean boolean14 = python2Target9.wantsBaseVisitor();
        boolean boolean15 = python2Target9.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str19 = python2Target17.getTargetStringLiteralFromString("hi!");
        python2Target17.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        java.lang.String str25 = python2Target17.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator22, "hi!", false);
        int int26 = python2Target17.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str29 = python2Target27.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target30 = new org.antlr.v4.codegen.target.Python2Target();
        int int31 = python2Target30.getInlineTestSetWordSize();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        python2Target30.badWords = strSet36;
        python2Target27.badWords = strSet36;
        python2Target17.badWords = strSet36;
        python2Target17.addBadWords();
        java.lang.String str43 = python2Target17.getTargetStringLiteralFromString("\"i\"");
        boolean boolean44 = python2Target17.wantsBaseListener();
        java.lang.String[] strArray45 = null;
        python2Target17.targetCharValueEscape = strArray45;
        org.antlr.v4.tool.Grammar grammar47 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target48 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str50 = python2Target48.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator51 = null;
        python2Target48.gen = codeGenerator51;
        java.lang.String str54 = python2Target48.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar55 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target56 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str58 = python2Target56.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator59 = null;
        python2Target56.gen = codeGenerator59;
        java.lang.String str62 = python2Target56.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar63 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target64 = new org.antlr.v4.codegen.target.Python2Target();
        int int65 = python2Target64.getInlineTestSetWordSize();
        java.lang.String[] strArray69 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        python2Target64.badWords = strSet70;
        org.stringtemplate.v4.STGroup sTGroup73 = null;
        python2Target64.templates = sTGroup73;
        org.antlr.v4.codegen.CodeGenerator codeGenerator75 = null;
        python2Target64.gen = codeGenerator75;
        java.util.Set<java.lang.String> strSet77 = python2Target64.getBadWords();
        java.lang.String str78 = python2Target64.getVersion();
        org.antlr.v4.tool.Grammar grammar79 = null;
        int[] intArray80 = new int[] {};
        java.lang.String[] strArray81 = python2Target64.getTokenTypesAsTargetLabels(grammar79, intArray80);
        java.lang.String[] strArray82 = python2Target56.getTokenTypesAsTargetLabels(grammar63, intArray80);
        java.lang.String[] strArray83 = python2Target48.getTokenTypesAsTargetLabels(grammar55, intArray80);
        java.lang.String[] strArray84 = python2Target17.getTokenTypesAsTargetLabels(grammar47, intArray80);
        java.lang.String[] strArray85 = python2Target9.getTokenTypesAsTargetLabels(grammar16, intArray80);
        java.lang.String[] strArray86 = python2Target1.getTokenTypesAsTargetLabels(grammar7, intArray80);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str88 = python2Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"hi!\"\"Context" + "'", str11, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\"i\"" + "'", str13, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"hi!\"" + "'", str19, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "i" + "'", str25, "i");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\\0" + "'", str29, "\\0");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 64 + "'", int31 == 64);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"\"i\"\"" + "'", str43, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\\0" + "'", str50, "\\0");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\\12" + "'", str54, "\\12");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\\0" + "'", str58, "\\0");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\\12" + "'", str62, "\\12");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 64 + "'", int65 == 64);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "4.5.2.1" + "'", str78, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[]");
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(strArray86);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"hi!\"\"Context" + "'", str1, "\"\"hi!\"\"Context");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target7.loadTemplates();
        python2Target0.templates = sTGroup8;
        java.lang.String str11 = python2Target0.getTargetStringLiteralFromString("\\12Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target0.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\12Context\"" + "'", str11, "\"\\12Context\"");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target6.templates = sTGroup19;
        python2Target0.templates = sTGroup19;
        java.lang.String[] strArray22 = python2Target0.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target0.getLoopLabel(grammarAST23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"hi!\"" + "'", str8, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        boolean boolean31 = python2Target0.templatesExist();
        boolean boolean32 = python2Target0.templatesExist();
        java.lang.String str33 = python2Target0.getVersion();
        python2Target0.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup35 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4.5.2.1" + "'", str33, "4.5.2.1");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String[] strArray10 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        python2Target0.targetCharValueEscape = strArray10;
        java.lang.String str16 = python2Target0.getTargetStringLiteralFromString(" ", true);
        boolean boolean17 = python2Target0.templatesExist();
        boolean boolean18 = python2Target0.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\" \"" + "'", str16, "\" \"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target7.loadTemplates();
        python2Target0.templates = sTGroup8;
        java.lang.String str11 = python2Target0.getTargetStringLiteralFromString("\\12Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target0.getElementName("\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\12Context\"" + "'", str11, "\"\\12Context\"");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target0.getRuleFunctionContextStructName(ruleFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_\\0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_\\0" + "'", str1, "_\\0");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        java.lang.String str5 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target0.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target0.genRecognizerHeaderFile(grammar11, sT12, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target0.getImplicitTokenLabel("\"\"hi!\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        java.lang.String[] strArray3 = python2Target1.targetCharValueEscape;
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target0.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"i\"" + "'", str10, "\"\\\"i\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        int int3 = python2Target1.getInlineTestSetWordSize();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator5, "\"\"i\"\"", locale7);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target10.loadTemplates();
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = pythonStringRenderer0.toString((java.lang.Object) python2Target10, "\"\"\"i\"\"\"", locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"i\"\"" + "'", str8, "\"\"i\"\"");
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        boolean boolean4 = python2Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.templates;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = sTGroup5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(sTGroup5);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        python2Target0.addBadWords();
        java.lang.String[] strArray6 = python2Target0.targetCharValueEscape;
        java.lang.String str7 = python2Target0.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target0.getElementListName("\"_\\\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        java.lang.String[] strArray3 = python2Target1.targetCharValueEscape;
        python2Target1.language = "4.5.2.1";
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target0.gen = codeGenerator11;
        java.util.Set<java.lang.String> strSet13 = python2Target0.getBadWords();
        java.lang.String str14 = python2Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python2Target0.getTokenTypesAsTargetLabels(grammar15, intArray16);
        java.lang.Class<?> wildcardClass18 = python2Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target();
        int int8 = python2Target7.getInlineTestSetWordSize();
        java.lang.String str11 = python2Target7.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str12 = python2Target7.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str15 = python2Target13.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python2Target13.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        java.lang.String str23 = python2Target13.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator20, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator24);
        org.stringtemplate.v4.STGroup sTGroup26 = python2Target25.loadTemplates();
        python2Target13.templates = sTGroup26;
        python2Target7.templates = sTGroup26;
        python2Target0.templates = sTGroup26;
        java.lang.String str31 = python2Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python2Target0.getLoopLabel(grammarAST32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"hi!\"\"" + "'", str11, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"hi!\"" + "'", str15, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\"" + "'", str23, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\"" + "'", str31, "\"\"");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) "\"\\\\\\\"i\"", "\\12", locale3);
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str7 = python2Target5.encodeIntAsCharEscape(0);
        java.lang.String str9 = python2Target5.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target5.gen;
        java.lang.String str11 = python2Target5.getLanguage();
        boolean boolean12 = python2Target5.wantsBaseVisitor();
        java.lang.String str13 = python2Target5.language;
        java.util.Locale locale15 = null;
        java.lang.String str16 = pythonStringRenderer0.toString((java.lang.Object) str13, "\"\\\\\\\"i\"", locale15);
        java.util.Locale locale19 = null;
        java.lang.String str20 = pythonStringRenderer0.toString((java.lang.Object) "\"0\"", "\"\\\"hi!\\\"\\\"Contex\"", locale19);
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str23 = python2Target21.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        python2Target21.gen = codeGenerator24;
        python2Target21.addBadWords();
        java.lang.String[] strArray27 = python2Target21.targetCharValueEscape;
        java.util.Locale locale29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = pythonStringRenderer0.toString((java.lang.Object) strArray27, "\"\"\\12Context\"Context\"", locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.String; cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\12" + "'", str4, "\\12");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\0" + "'", str7, "\\0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\1" + "'", str9, "\\1");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\\\\\"i\"" + "'", str16, "\"\\\\\\\"i\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\\\"hi!\\\"\\\"Contex\"" + "'", str20, "\"\\\"hi!\\\"\\\"Contex\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\\0" + "'", str23, "\\0");
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"\"hi!\"\"Context", true);
        org.antlr.v4.tool.Rule rule18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target0.getRuleFunctionContextStructName(rule18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"hi!\\\"\\\"Contex\"" + "'", str17, "\"\\\"hi!\\\"\\\"Contex\"");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        python2Target0.language = "\\1";
        boolean boolean13 = python2Target0.supportsOverloadedMethods();
        java.lang.String str14 = python2Target0.language;
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target0.getTokenTypeAsTargetLabel(grammar15, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\1" + "'", str14, "\\1");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target6.templates = sTGroup19;
        python2Target0.templates = sTGroup19;
        java.util.Set<java.lang.String> strSet22 = python2Target0.badWords;
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.stringtemplate.v4.ST sT24 = null;
        python2Target0.genRecognizerHeaderFile(grammar23, sT24, "\"i\"");
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup27 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"hi!\"" + "'", str8, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getLanguage();
        python2Target1.language = "\"\"i\"\"";
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\"i\"\"" + "'", str8, "\"_\"i\"\"");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        int int10 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target0.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str15 = python2Target13.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python2Target13.gen = codeGenerator16;
        java.lang.String[] strArray23 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray23;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray23;
        python2Target13.targetCharValueEscape = strArray23;
        python2Target0.targetCharValueEscape = strArray23;
        org.stringtemplate.v4.STGroup sTGroup28 = python2Target0.templates;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\0" + "'", str15, "\\0");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(sTGroup28);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target();
        int int10 = python2Target9.getInlineTestSetWordSize();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        python2Target9.badWords = strSet15;
        python2Target0.badWords = strSet15;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target0.getAltLabelContextStructName("\"0\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"i" + "'", str8, "\\\"i");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target0.gen = codeGenerator11;
        boolean boolean13 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        java.lang.String[] strArray14 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray14;
        python2Target0.targetCharValueEscape = strArray14;
        boolean boolean17 = python2Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet18 = python2Target0.badWords;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target0.getRuleFunctionContextStructName(ruleFunction19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"i" + "'", str8, "\\\"i");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0", true);
        java.lang.String str20 = python2Target0.getTargetStringLiteralFromString("\"\"hi!\"\"", true);
        boolean boolean21 = python2Target0.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python2Target0.getListLabel("\"\"_\"i\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str20, "\"\"\"hi!\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target();
        int int8 = python2Target7.getInlineTestSetWordSize();
        java.lang.String str11 = python2Target7.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str12 = python2Target7.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str15 = python2Target13.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python2Target13.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        java.lang.String str23 = python2Target13.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator20, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator24);
        org.stringtemplate.v4.STGroup sTGroup26 = python2Target25.loadTemplates();
        python2Target13.templates = sTGroup26;
        python2Target7.templates = sTGroup26;
        python2Target0.templates = sTGroup26;
        java.util.Set<java.lang.String> strSet30 = python2Target0.getBadWords();
        java.lang.Class<?> wildcardClass31 = strSet30.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"hi!\"\"" + "'", str11, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"hi!\"" + "'", str15, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\"" + "'", str23, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup26);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str31 = python2Target0.encodeIntAsCharEscape(0);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup32 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\\0" + "'", str31, "\\0");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        java.lang.String str9 = python2Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "1", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target0.getLoopLabel(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\"i\"\"" + "'", str8, "\"_\"i\"\"");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str31 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        boolean boolean32 = python2Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\"i\"\"" + "'", str31, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.lang.String[] strArray0 = null;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray0;
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        python2Target0.gen = codeGenerator18;
        java.lang.String str20 = python2Target0.getLanguage();
        org.antlr.v4.tool.Rule rule21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python2Target0.getRuleFunctionContextStructName(rule21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
// flaky:         python2Target0.addBadWords();
        java.lang.String str26 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        boolean boolean27 = python2Target0.wantsBaseListener();
        java.lang.String[] strArray28 = null;
        python2Target0.targetCharValueEscape = strArray28;
        java.util.Set<java.lang.String> strSet30 = python2Target0.badWords;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = python2Target0.getImplicitRuleLabel("i");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0", true);
        java.lang.String str20 = python2Target0.getTargetStringLiteralFromString("\"\"hi!\"\"", true);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup21 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str20, "\"\"\"hi!\"\"\"");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        python2Target0.language = "\" \"Context";
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup10 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
// flaky:         python2Target0.addBadWords();
        java.lang.String[] strArray6 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray6;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        int int3 = python2Target1.getInlineTestSetWordSize();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator5, "\"\"i\"\"", locale7);
        java.util.Locale locale11 = null;
        java.lang.String str12 = pythonStringRenderer0.toString((java.lang.Object) "Python2", "_\"i\"", locale11);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String str16 = python2Target14.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str17 = python2Target14.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target();
        int int19 = python2Target18.getInlineTestSetWordSize();
        int int20 = python2Target18.getInlineTestSetWordSize();
        boolean boolean21 = python2Target18.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python2Target18.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python2Target18.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "_\"i\"", false);
        java.lang.String[] strArray32 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray32;
        python2Target18.targetCharValueEscape = strArray32;
        python2Target14.targetCharValueEscape = strArray32;
        java.util.Locale locale37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = pythonStringRenderer0.toString((java.lang.Object) python2Target14, "\"\"hi!\"\"", locale37);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"i\"\"" + "'", str8, "\"\"i\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"i\"" + "'", str12, "_\"i\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"hi!\"\"Context" + "'", str16, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\\\"i" + "'", str26, "\\\"i");
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str26 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        boolean boolean27 = python2Target0.wantsBaseListener();
        java.lang.String[] strArray28 = null;
        python2Target0.targetCharValueEscape = strArray28;
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str33 = python2Target31.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        python2Target31.gen = codeGenerator34;
        java.lang.String str37 = python2Target31.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str41 = python2Target39.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        python2Target39.gen = codeGenerator42;
        java.lang.String str45 = python2Target39.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar46 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target47 = new org.antlr.v4.codegen.target.Python2Target();
        int int48 = python2Target47.getInlineTestSetWordSize();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        python2Target47.badWords = strSet53;
        org.stringtemplate.v4.STGroup sTGroup56 = null;
        python2Target47.templates = sTGroup56;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        python2Target47.gen = codeGenerator58;
        java.util.Set<java.lang.String> strSet60 = python2Target47.getBadWords();
        java.lang.String str61 = python2Target47.getVersion();
        org.antlr.v4.tool.Grammar grammar62 = null;
        int[] intArray63 = new int[] {};
        java.lang.String[] strArray64 = python2Target47.getTokenTypesAsTargetLabels(grammar62, intArray63);
        java.lang.String[] strArray65 = python2Target39.getTokenTypesAsTargetLabels(grammar46, intArray63);
        java.lang.String[] strArray66 = python2Target31.getTokenTypesAsTargetLabels(grammar38, intArray63);
        java.lang.String[] strArray67 = python2Target0.getTokenTypesAsTargetLabels(grammar30, intArray63);
        org.stringtemplate.v4.STGroup sTGroup68 = python2Target0.templates;
        boolean boolean69 = python2Target0.supportsOverloadedMethods();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\\0" + "'", str33, "\\0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\\12" + "'", str37, "\\12");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\\0" + "'", str41, "\\0");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\\12" + "'", str45, "\\12");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 64 + "'", int48 == 64);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "4.5.2.1" + "'", str61, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[]");
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNull(sTGroup68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target6.templates = sTGroup19;
        python2Target0.templates = sTGroup19;
        boolean boolean22 = python2Target0.supportsOverloadedMethods();
        python2Target0.language = "_\"i\"";
        python2Target0.addBadWords();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"hi!\"" + "'", str8, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.util.Set<java.lang.String> strSet13 = python2Target0.badWords;
        boolean boolean14 = python2Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target0.getLoopLabel(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target6.templates = sTGroup19;
        python2Target0.templates = sTGroup19;
        java.util.Set<java.lang.String> strSet22 = python2Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python2Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"hi!\"" + "'", str8, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(codeGenerator23);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target6.templates = sTGroup19;
        python2Target0.templates = sTGroup19;
        org.antlr.v4.tool.ast.GrammarAST grammarAST22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python2Target0.getLoopLabel(grammarAST22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"hi!\"" + "'", str8, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup19);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        python2Target0.gen = codeGenerator12;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python2Target0.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target0.getAltLabelContextStructName("\\\"\\\"\\\"hi!\\\"\\\"\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        java.lang.String str8 = python2Target0.language;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getImplicitRuleLabel("\\\"\\\"\\\"hi!\\\"\\\"\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String[] strArray12 = new java.lang.String[] { "\\0", "\\1", "\"hi!\"", "\\0", "i", "\"i\"", "\"\"hi!\"\"", "\"hi!\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python2Target0.badWords = strSet13;
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        python2Target0.genRecognizerHeaderFile(grammar16, sT17, "\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
        boolean boolean20 = python2Target0.templatesExist();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python2Target0.getRuleFunctionContextStructName(ruleFunction21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        boolean boolean31 = python2Target0.templatesExist();
        boolean boolean32 = python2Target0.templatesExist();
        java.lang.String str33 = python2Target0.getVersion();
        python2Target0.addBadWords();
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.stringtemplate.v4.ST sT36 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar35, sT36, "\"\"i\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4.5.2.1" + "'", str33, "4.5.2.1");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        java.lang.String[] strArray14 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray14;
        python2Target0.targetCharValueEscape = strArray14;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup17 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"i" + "'", str8, "\\\"i");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("\\12");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        int int11 = python2Target10.getInlineTestSetWordSize();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        python2Target10.badWords = strSet16;
        org.stringtemplate.v4.STGroup sTGroup19 = null;
        python2Target10.templates = sTGroup19;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        python2Target10.gen = codeGenerator21;
        java.util.Set<java.lang.String> strSet23 = python2Target10.getBadWords();
        java.lang.String str24 = python2Target10.getVersion();
        org.antlr.v4.tool.Grammar grammar25 = null;
        int[] intArray26 = new int[] {};
        java.lang.String[] strArray27 = python2Target10.getTokenTypesAsTargetLabels(grammar25, intArray26);
        java.lang.String[] strArray28 = python2Target1.getTokenTypesAsTargetLabels(grammar9, intArray26);
        python2Target1.addBadWords();
        boolean boolean30 = python2Target1.wantsBaseVisitor();
        boolean boolean31 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6, "\"\\\\\\\"i\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\12Context" + "'", str8, "\\12Context");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4.5.2.1" + "'", str24, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str26 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        boolean boolean27 = python2Target0.wantsBaseListener();
        java.lang.String[] strArray28 = null;
        python2Target0.targetCharValueEscape = strArray28;
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.stringtemplate.v4.ST sT31 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar30, sT31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target();
        int int8 = python2Target7.getInlineTestSetWordSize();
        java.lang.String str11 = python2Target7.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str12 = python2Target7.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str15 = python2Target13.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python2Target13.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        java.lang.String str23 = python2Target13.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator20, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator24);
        org.stringtemplate.v4.STGroup sTGroup26 = python2Target25.loadTemplates();
        python2Target13.templates = sTGroup26;
        python2Target7.templates = sTGroup26;
        python2Target0.templates = sTGroup26;
        java.lang.String str31 = python2Target0.getTargetStringLiteralFromString("");
        java.lang.String str33 = python2Target0.getListLabel("_\\0");
        org.antlr.v4.tool.ast.GrammarAST grammarAST34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = python2Target0.getLoopCounter(grammarAST34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"hi!\"\"" + "'", str11, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"hi!\"" + "'", str15, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\"" + "'", str23, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\"" + "'", str31, "\"\"");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "_\\0" + "'", str33, "_\\0");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        java.lang.String str6 = python2Target0.getLanguage();
        boolean boolean7 = python2Target0.wantsBaseVisitor();
        java.lang.String str8 = python2Target0.language;
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\1" + "'", str4, "\\1");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertNotNull(sTGroup6);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target0.gen = codeGenerator11;
        java.util.Set<java.lang.String> strSet13 = python2Target0.getBadWords();
        java.lang.String str14 = python2Target0.getVersion();
        python2Target0.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target0.getListLabel("\"\\12Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target();
        int int8 = python2Target7.getInlineTestSetWordSize();
        int int9 = python2Target7.getInlineTestSetWordSize();
        boolean boolean10 = python2Target7.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target7.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target7.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_\"i\"", false);
        java.lang.String[] strArray21 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray21;
        python2Target7.targetCharValueEscape = strArray21;
        python2Target0.targetCharValueEscape = strArray21;
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.stringtemplate.v4.ST sT26 = null;
        python2Target0.genRecognizerHeaderFile(grammar25, sT26, "\"_\"i\"\"");
        java.lang.Class<?> wildcardClass29 = python2Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"i" + "'", str15, "\\\"i");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"\\\\\\\"i\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target0.getImplicitSetLabel("\"_\"i\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\\\\\"i\"" + "'", str11, "\"\\\\\\\"i\"");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target0.getCodeGenerator();
        python2Target0.language = "\\12Context";
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target0.getImplicitRuleLabel("\"\"_\"i\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        int int4 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar5, sT6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        python2Target0.language = "\" \"Context";
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python2Target0.getImplicitSetLabel("\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target0.gen;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape(1);
        java.lang.String[] strArray5 = python2Target0.targetCharValueEscape;
        int int6 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target0.encodeIntAsCharEscape(100);
        java.lang.String str9 = python2Target0.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\1" + "'", str4, "\\1");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"\"hi!\"\"Context", true);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup18 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"hi!\\\"\\\"Contex\"" + "'", str17, "\"\\\"hi!\\\"\\\"Contex\"");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        java.lang.String str8 = python2Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar9, sT10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        java.lang.String[] strArray12 = new java.lang.String[] { "\\0", "\\1", "\"hi!\"", "\\0", "i", "\"i\"", "\"\"hi!\"\"", "\"hi!\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python2Target0.badWords = strSet13;
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        python2Target0.genRecognizerHeaderFile(grammar16, sT17, "\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
        org.antlr.v4.tool.Rule rule20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python2Target0.getRuleFunctionContextStructName(rule20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target();
        int int8 = python2Target7.getInlineTestSetWordSize();
        java.lang.String str11 = python2Target7.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str12 = python2Target7.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str15 = python2Target13.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python2Target13.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        java.lang.String str23 = python2Target13.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator20, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator24);
        org.stringtemplate.v4.STGroup sTGroup26 = python2Target25.loadTemplates();
        python2Target13.templates = sTGroup26;
        python2Target7.templates = sTGroup26;
        python2Target0.templates = sTGroup26;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        java.lang.String str33 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator30, "_\\0", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = python2Target0.getImplicitTokenLabel("\"\\12\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"hi!\"\"" + "'", str11, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"hi!\"" + "'", str15, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\"" + "'", str23, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"0\"" + "'", str33, "\"0\"");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        python2Target0.language = "\\1";
        org.antlr.v4.codegen.model.RuleFunction ruleFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target0.getRuleFunctionContextStructName(ruleFunction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str26 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        boolean boolean27 = python2Target0.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup28 = python2Target0.templates;
        java.lang.String str29 = python2Target0.getVersion();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = python2Target0.getRuleFunctionContextStructName(ruleFunction30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(sTGroup28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4.5.2.1" + "'", str29, "4.5.2.1");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        python2Target0.genRecognizerHeaderFile(grammar14, sT15, "_\"i\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target0.getImplicitSetLabel("\"0\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str10 = python2Target8.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python2Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "", true);
        java.util.Set<java.lang.String> strSet19 = python2Target8.getBadWords();
        python2Target1.badWords = strSet19;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str23 = python2Target21.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target();
        int int25 = python2Target24.getInlineTestSetWordSize();
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        python2Target24.badWords = strSet30;
        python2Target21.badWords = strSet30;
        python2Target1.badWords = strSet30;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = python2Target1.getElementListName("\"\"\\\"i\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\\0" + "'", str23, "\\0");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"_\\\\0\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"_\\\\0\"" + "'", str1, "\"_\\\\0\"");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"\"\"i\"\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target0.getLoopLabel(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"\"\"i\"\"\"\"" + "'", str4, "\"\"\"\"i\"\"\"\"");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        python2Target0.gen = codeGenerator12;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup14 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target12.loadTemplates();
        python2Target0.templates = sTGroup13;
        java.lang.Class<?> wildcardClass15 = python2Target0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\12\"");
        java.lang.String str33 = python2Target0.getLanguage();
        java.lang.String str34 = python2Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = python2Target0.getElementListName("_\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"\\12\"\"" + "'", str32, "\"\"\\12\"\"");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("@");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "@" + "'", str1, "@");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0", true);
        boolean boolean18 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        java.lang.String[] strArray14 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray14;
        python2Target0.targetCharValueEscape = strArray14;
        boolean boolean17 = python2Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet18 = python2Target0.badWords;
        python2Target0.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python2Target0.getImplicitTokenLabel("\"\"\"hi!\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"i" + "'", str8, "\\\"i");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = python2Target0.getCodeGenerator();
        java.lang.String str34 = python2Target0.language;
        boolean boolean35 = python2Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST36 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\\\\\"i\"" + "'", str32, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNull(codeGenerator33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python2Target0.getCodeGenerator();
        boolean boolean25 = python2Target0.supportsOverloadedMethods();
        int int26 = python2Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python2Target0.getLoopLabel(grammarAST27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(codeGenerator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target0.gen;
        boolean boolean8 = python2Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar9, sT10, "\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__\"i\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\\\"i\"" + "'", str8, "\"_\\\"i\"");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        python2Target0.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python2Target0.gen = codeGenerator7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getAltLabelContextStructName("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        org.antlr.v4.tool.Grammar grammar24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python2Target0.getTokenTypeAsTargetLabel(grammar24, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target12.loadTemplates();
        python2Target0.templates = sTGroup13;
        java.lang.String str15 = python2Target0.language;
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target0.templates;
        java.lang.String str18 = python2Target0.getTargetStringLiteralFromString("#");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar19, sT20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"#\"" + "'", str18, "\"#\"");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target0.genRecognizerHeaderFile(grammar6, sT7, "\"\\12\"");
        java.lang.String str10 = python2Target0.language;
        int int11 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str14 = python2Target0.getTargetStringLiteralFromString("\"_\\\\0\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target0.getImplicitSetLabel("\"\\\"0\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"_\\\\0\"\"" + "'", str14, "\"\"_\\\\0\"\"");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\"i\"\"" + "'", str8, "\"_\"i\"\"");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str13 = python2Target11.getTargetStringLiteralFromString("hi!");
        python2Target11.language = "hi!";
        java.util.Set<java.lang.String> strSet16 = python2Target11.badWords;
        python2Target0.badWords = strSet16;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "hi!", true);
        org.antlr.v4.tool.Grammar grammar22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target0.getTokenTypeAsTargetLabel(grammar22, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"i\"" + "'", str10, "\"\\\"i\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"hi!\"" + "'", str13, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"i\"" + "'", str21, "\"i\"");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str26 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        boolean boolean27 = python2Target0.wantsBaseListener();
        java.lang.String[] strArray28 = null;
        python2Target0.targetCharValueEscape = strArray28;
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str33 = python2Target31.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        python2Target31.gen = codeGenerator34;
        java.lang.String str37 = python2Target31.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str41 = python2Target39.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        python2Target39.gen = codeGenerator42;
        java.lang.String str45 = python2Target39.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar46 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target47 = new org.antlr.v4.codegen.target.Python2Target();
        int int48 = python2Target47.getInlineTestSetWordSize();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        python2Target47.badWords = strSet53;
        org.stringtemplate.v4.STGroup sTGroup56 = null;
        python2Target47.templates = sTGroup56;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        python2Target47.gen = codeGenerator58;
        java.util.Set<java.lang.String> strSet60 = python2Target47.getBadWords();
        java.lang.String str61 = python2Target47.getVersion();
        org.antlr.v4.tool.Grammar grammar62 = null;
        int[] intArray63 = new int[] {};
        java.lang.String[] strArray64 = python2Target47.getTokenTypesAsTargetLabels(grammar62, intArray63);
        java.lang.String[] strArray65 = python2Target39.getTokenTypesAsTargetLabels(grammar46, intArray63);
        java.lang.String[] strArray66 = python2Target31.getTokenTypesAsTargetLabels(grammar38, intArray63);
        java.lang.String[] strArray67 = python2Target0.getTokenTypesAsTargetLabels(grammar30, intArray63);
        org.stringtemplate.v4.STGroup sTGroup68 = python2Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator69 = python2Target0.gen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str71 = python2Target0.getAltLabelContextStructName("\"\\\"0\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\\0" + "'", str33, "\\0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\\12" + "'", str37, "\\12");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\\0" + "'", str41, "\\0");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\\12" + "'", str45, "\\12");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 64 + "'", int48 == 64);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "4.5.2.1" + "'", str61, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[]");
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNull(sTGroup68);
        org.junit.Assert.assertNull(codeGenerator69);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\\\"\\\"\\\"hi!\\\"\\\"\\\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str10, "\\\"\\\"\\\"hi!\\\"\\\"\\\"");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target6.templates = sTGroup19;
        python2Target0.templates = sTGroup19;
        java.lang.String[] strArray22 = python2Target0.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target0.getImplicitTokenLabel("Python2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"hi!\"" + "'", str8, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        java.lang.String str9 = python2Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\"\\\"i\"", true);
        java.lang.Class<?> wildcardClass14 = python2Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\"i\"\"" + "'", str8, "\"_\"i\"\"");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"i\"" + "'", str13, "\"\\\"i\"");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        int int3 = python2Target1.getInlineTestSetWordSize();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator5, "\"\"i\"\"", locale7);
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = pythonStringRenderer0.toString((java.lang.Object) (short) -1, "_\\1", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"i\"\"" + "'", str8, "\"\"i\"\"");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str31 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        java.lang.String str33 = python2Target0.getTargetStringLiteralFromString("\"\"i\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = python2Target0.gen;
        org.antlr.v4.tool.Rule rule35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = python2Target0.getRuleFunctionContextStructName(rule35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\"i\"\"" + "'", str31, "\"\"i\"\"");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\"\"i\"\"\"" + "'", str33, "\"\"\"i\"\"\"");
        org.junit.Assert.assertNull(codeGenerator34);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target0.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        java.lang.String[] strArray14 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray14;
        python2Target0.targetCharValueEscape = strArray14;
        java.lang.String[] strArray17 = python2Target0.targetCharValueEscape;
        java.lang.String[] strArray18 = python2Target0.targetCharValueEscape;
        java.lang.String str21 = python2Target0.getTargetStringLiteralFromString("i", true);
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.stringtemplate.v4.ST sT23 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar22, sT23, "\\12Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"i" + "'", str8, "\\\"i");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"i\"" + "'", str21, "\"i\"");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target();
        int int6 = python2Target5.getInlineTestSetWordSize();
        int int7 = python2Target5.getInlineTestSetWordSize();
        boolean boolean8 = python2Target5.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target5.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target5.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "_\"i\"", false);
        java.lang.String[] strArray19 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray19;
        python2Target5.targetCharValueEscape = strArray19;
        python2Target1.targetCharValueEscape = strArray19;
        java.lang.String str23 = python2Target1.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str26 = python2Target24.getTargetStringLiteralFromString("hi!");
        python2Target24.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        java.lang.String str32 = python2Target24.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator29, "hi!", false);
        int int33 = python2Target24.getInlineTestSetWordSize();
        boolean boolean34 = python2Target24.templatesExist();
        java.lang.String str36 = python2Target24.getTargetStringLiteralFromString("hi!");
        java.util.Set<java.lang.String> strSet37 = python2Target24.badWords;
        python2Target1.badWords = strSet37;
        org.antlr.v4.tool.Rule rule39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = python2Target1.getRuleFunctionContextStructName(rule39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\\"i" + "'", str13, "\\\"i");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4.5.2.1" + "'", str23, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"hi!\"" + "'", str26, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "i" + "'", str32, "i");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 64 + "'", int33 == 64);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"hi!\"" + "'", str36, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet37);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        java.lang.String[] strArray14 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray14;
        python2Target0.targetCharValueEscape = strArray14;
        boolean boolean17 = python2Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet18 = python2Target0.badWords;
        python2Target0.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"i" + "'", str8, "\\\"i");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"i" + "'", str8, "\\\"i");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        java.util.Set<java.lang.String> strSet33 = python2Target0.badWords;
        java.lang.String str34 = python2Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        python2Target0.gen = codeGenerator35;
        org.antlr.v4.tool.Grammar grammar37 = null;
        org.stringtemplate.v4.ST sT38 = null;
        python2Target0.genRecognizerHeaderFile(grammar37, sT38, "_tset\"\\\\\\\"i\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\\\\\"i\"" + "'", str32, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target0.gen = codeGenerator11;
        java.util.Set<java.lang.String> strSet13 = python2Target0.getBadWords();
        java.lang.String str14 = python2Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python2Target0.getTokenTypesAsTargetLabels(grammar15, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target0.getImplicitRuleLabel("\\12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String str9 = python2Target7.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean10 = python2Target7.templatesExist();
        boolean boolean11 = python2Target7.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target7.getCodeGenerator();
        java.util.Set<java.lang.String> strSet13 = python2Target7.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target();
        int int15 = python2Target14.getInlineTestSetWordSize();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python2Target14.badWords = strSet20;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        org.stringtemplate.v4.STGroup sTGroup25 = python2Target24.loadTemplates();
        python2Target14.templates = sTGroup25;
        python2Target7.templates = sTGroup25;
        python2Target1.templates = sTGroup25;
        org.antlr.v4.tool.ast.GrammarAST grammarAST29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = python2Target1.getLoopLabel(grammarAST29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"hi!\"\"Context" + "'", str9, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(sTGroup25);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target0.gen = codeGenerator11;
        java.lang.String str13 = python2Target0.getVersion();
        java.lang.String str14 = python2Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.stringtemplate.v4.ST sT16 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar15, sT16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        java.lang.String str11 = python2Target0.getTargetStringLiteralFromString("\"\"\\12Context\"\"", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\"i\"\"" + "'", str8, "\"_\"i\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"\"\\12Context\"\"\"" + "'", str11, "\"\"\"\\12Context\"\"\"");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target6.templates = sTGroup19;
        python2Target0.templates = sTGroup19;
        boolean boolean22 = python2Target0.supportsOverloadedMethods();
        python2Target0.language = "_\"i\"";
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.stringtemplate.v4.ST sT26 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar25, sT26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"hi!\"" + "'", str8, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        python2Target1.addBadWords();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\12Context\"");
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementListName("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\12Context\"Context" + "'", str10, "\"\\12Context\"Context");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str26 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        boolean boolean27 = python2Target0.wantsBaseListener();
        java.lang.String[] strArray28 = null;
        python2Target0.targetCharValueEscape = strArray28;
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str33 = python2Target31.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        python2Target31.gen = codeGenerator34;
        java.lang.String str37 = python2Target31.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str41 = python2Target39.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        python2Target39.gen = codeGenerator42;
        java.lang.String str45 = python2Target39.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar46 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target47 = new org.antlr.v4.codegen.target.Python2Target();
        int int48 = python2Target47.getInlineTestSetWordSize();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        python2Target47.badWords = strSet53;
        org.stringtemplate.v4.STGroup sTGroup56 = null;
        python2Target47.templates = sTGroup56;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        python2Target47.gen = codeGenerator58;
        java.util.Set<java.lang.String> strSet60 = python2Target47.getBadWords();
        java.lang.String str61 = python2Target47.getVersion();
        org.antlr.v4.tool.Grammar grammar62 = null;
        int[] intArray63 = new int[] {};
        java.lang.String[] strArray64 = python2Target47.getTokenTypesAsTargetLabels(grammar62, intArray63);
        java.lang.String[] strArray65 = python2Target39.getTokenTypesAsTargetLabels(grammar46, intArray63);
        java.lang.String[] strArray66 = python2Target31.getTokenTypesAsTargetLabels(grammar38, intArray63);
        java.lang.String[] strArray67 = python2Target0.getTokenTypesAsTargetLabels(grammar30, intArray63);
        boolean boolean68 = python2Target0.wantsBaseListener();
        java.lang.Class<?> wildcardClass69 = python2Target0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\\0" + "'", str33, "\\0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\\12" + "'", str37, "\\12");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\\0" + "'", str41, "\\0");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\\12" + "'", str45, "\\12");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 64 + "'", int48 == 64);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "4.5.2.1" + "'", str61, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[]");
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String[] strArray10 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        python2Target0.targetCharValueEscape = strArray10;
        java.lang.String str16 = python2Target0.getTargetStringLiteralFromString(" ", true);
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        python2Target0.gen = codeGenerator18;
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        python2Target0.genRecognizerHeaderFile(grammar20, sT21, "\"\"i\"\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\" \"" + "'", str16, "\" \"");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String[] strArray6 = python2Target0.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        java.lang.String[] strArray14 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray14;
        python2Target0.targetCharValueEscape = strArray14;
        java.lang.String[] strArray17 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str20 = python2Target18.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target();
        int int22 = python2Target21.getInlineTestSetWordSize();
        java.lang.String[] strArray26 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        python2Target21.badWords = strSet27;
        python2Target18.badWords = strSet27;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str33 = python2Target31.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        python2Target31.gen = codeGenerator34;
        java.lang.String[] strArray41 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray41;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray41;
        python2Target31.targetCharValueEscape = strArray41;
        python2Target18.targetCharValueEscape = strArray41;
        java.lang.String[] strArray46 = python2Target18.targetCharValueEscape;
        python2Target0.targetCharValueEscape = strArray46;
        java.util.Set<java.lang.String> strSet48 = python2Target0.getBadWords();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"i" + "'", str8, "\\\"i");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\0" + "'", str20, "\\0");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\\0" + "'", str33, "\\0");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strSet48);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("\\12");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        int int11 = python2Target10.getInlineTestSetWordSize();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        python2Target10.badWords = strSet16;
        org.stringtemplate.v4.STGroup sTGroup19 = null;
        python2Target10.templates = sTGroup19;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        python2Target10.gen = codeGenerator21;
        java.util.Set<java.lang.String> strSet23 = python2Target10.getBadWords();
        java.lang.String str24 = python2Target10.getVersion();
        org.antlr.v4.tool.Grammar grammar25 = null;
        int[] intArray26 = new int[] {};
        java.lang.String[] strArray27 = python2Target10.getTokenTypesAsTargetLabels(grammar25, intArray26);
        java.lang.String[] strArray28 = python2Target1.getTokenTypesAsTargetLabels(grammar9, intArray26);
        python2Target1.addBadWords();
        boolean boolean30 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6, "\"\\\\\\\"i\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\12Context" + "'", str8, "\\12Context");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4.5.2.1" + "'", str24, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\\\"\\\"\\\"hi!\\\"\\\"\\\"", false);
        java.lang.String str11 = python2Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target0.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target0.getListLabel("__\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str10, "\\\"\\\"\\\"hi!\\\"\\\"\\\"");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        python2Target0.gen = codeGenerator18;
        java.lang.String str20 = python2Target0.getLanguage();
        java.util.Set<java.lang.String> strSet21 = python2Target0.badWords;
        java.lang.String[] strArray22 = python2Target0.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup23 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\\1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\1" + "'", str1, "\\1");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target7.loadTemplates();
        python2Target0.templates = sTGroup8;
        java.lang.String str11 = python2Target0.getTargetStringLiteralFromString("\\12Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target0.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target0.getLoopLabel(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\12Context\"" + "'", str11, "\"\\12Context\"");
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str11 = python2Target9.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target();
        int int13 = python2Target12.getInlineTestSetWordSize();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        python2Target12.badWords = strSet18;
        python2Target9.badWords = strSet18;
        python2Target0.badWords = strSet18;
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.stringtemplate.v4.ST sT24 = null;
        python2Target0.genRecognizerHeaderFile(grammar23, sT24, "_\"i\"");
        java.lang.String str28 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = python2Target0.getElementName("_ \\\"Contex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\0" + "'", str11, "\\0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\\\"i\"" + "'", str28, "\"\\\"i\"");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"\\\"i\\\"\"");
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\\\\\"i\\\\\\\"\\\"\"" + "'", str9, "\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target0.getElementListName("\"tset\\\"\\\\\\\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup10 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = python2Target0.getCodeGenerator();
        java.lang.String str34 = python2Target0.language;
        boolean boolean35 = python2Target0.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup36 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\\\\\"i\"" + "'", str32, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNull(codeGenerator33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str10 = python2Target8.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python2Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "", true);
        java.util.Set<java.lang.String> strSet19 = python2Target8.getBadWords();
        python2Target1.badWords = strSet19;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str23 = python2Target21.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target();
        int int25 = python2Target24.getInlineTestSetWordSize();
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        python2Target24.badWords = strSet30;
        python2Target21.badWords = strSet30;
        python2Target1.badWords = strSet30;
        java.lang.String str35 = python2Target1.language;
        org.antlr.v4.tool.Grammar grammar36 = null;
        org.stringtemplate.v4.ST sT37 = null;
        python2Target1.genRecognizerHeaderFile(grammar36, sT37, "@");
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.stringtemplate.v4.ST sT42 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar41, sT42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\\0" + "'", str23, "\\0");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Python2" + "'", str35, "Python2");
        org.junit.Assert.assertNull(codeGenerator40);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target1.gen = codeGenerator6;
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getLoopCounter(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        java.lang.String str5 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target0.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target12.loadTemplates();
        python2Target0.templates = sTGroup13;
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray18 = new int[] { 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray19 = python2Target0.getTokenTypesAsTargetLabels(grammar15, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 100]");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"i" + "'", str8, "\\\"i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\"i\"\"", false);
        java.lang.String str13 = python2Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target0.getImplicitRuleLabel("\"\\\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\"i\\\"" + "'", str12, "\\\"i\\\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__\"i\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getImplicitSetLabel("\"\"\"hi!\"\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\\\"i\"" + "'", str8, "\"_\\\"i\"");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target6.templates = sTGroup19;
        python2Target0.templates = sTGroup19;
        int int22 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str24 = python2Target0.getImplicitRuleLabel("\"\\\\\\\"i\"");
        java.lang.String str26 = python2Target0.getListLabel("\"\\\"0\\\"Context\"Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python2Target0.getElementListName("\"\\\"hi!\\\"\\\"Contex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"hi!\"" + "'", str8, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_\"\\\\\\\"i\"" + "'", str24, "_\"\\\\\\\"i\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\\\"0\\\"Context\"Context" + "'", str26, "\"\\\"0\\\"Context\"Context");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target10.loadTemplates();
        python2Target0.templates = sTGroup11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target0.getElementListName("\"_\\\\0\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target0.genRecognizerHeaderFile(grammar6, sT7, "\"\\12\"");
        java.lang.String str10 = python2Target0.language;
        int int11 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str14 = python2Target0.getTargetStringLiteralFromString("\"_\\\\0\"", true);
        python2Target0.addBadWords();
        boolean boolean16 = python2Target0.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target0.getLoopLabel(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"_\\\\0\"\"" + "'", str14, "\"\"_\\\\0\"\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target0.getAltLabelContextStructName("_\"\\\\\\\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        int int13 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str16 = python2Target0.getTargetStringLiteralFromString("_tset\"\"", false);
        boolean boolean17 = python2Target0.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target0.getTokenTypeAsTargetLabel(grammar18, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset\"\"" + "'", str16, "_tset\"\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python2Target1.badWords = strSet7;
        python2Target0.badWords = strSet7;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar11, sT12, "\"\\12Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\\\"\\\"\\\"hi!\\\"\\\"\\\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target0.getAltLabelContextStructName("\"\"\"\\12Context\"Context\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str10, "\\\"\\\"\\\"hi!\\\"\\\"\\\"");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target12.loadTemplates();
        python2Target0.templates = sTGroup13;
        org.stringtemplate.v4.STGroup sTGroup15 = null;
        python2Target0.templates = sTGroup15;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup17 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        int int7 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        boolean boolean8 = python2Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar9, sT10, "\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str15 = python2Target13.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python2Target13.gen = codeGenerator16;
        java.lang.String[] strArray23 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray23;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray23;
        python2Target13.targetCharValueEscape = strArray23;
        python2Target0.targetCharValueEscape = strArray23;
        java.lang.String[] strArray28 = python2Target0.targetCharValueEscape;
        int int29 = python2Target0.getInlineTestSetWordSize();
        python2Target0.language = "\"\"\\12Context\"Context\"";
        org.antlr.v4.tool.Grammar grammar32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = python2Target0.getTokenTypeAsTargetLabel(grammar32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\0" + "'", str15, "\\0");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        boolean boolean24 = python2Target0.templatesExist();
        java.lang.String str27 = python2Target0.getTargetStringLiteralFromString("\"\\\"hi!\\\"\\\"Contex\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = python2Target0.getLoopLabel(grammarAST28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\\\"hi!\\\"\\\"Contex\"" + "'", str27, "\"\\\"hi!\\\"\\\"Contex\"");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\12\"");
        boolean boolean33 = python2Target0.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = python2Target0.getImplicitRuleLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"\\12\"\"" + "'", str32, "\"\"\\12\"\"");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) "\"\\\\\\\"i\"", "\\12", locale3);
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str7 = python2Target5.encodeIntAsCharEscape(0);
        java.lang.String str9 = python2Target5.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target5.gen;
        java.lang.String str11 = python2Target5.getLanguage();
        boolean boolean12 = python2Target5.wantsBaseVisitor();
        java.lang.String str13 = python2Target5.language;
        java.util.Locale locale15 = null;
        java.lang.String str16 = pythonStringRenderer0.toString((java.lang.Object) str13, "\"\\\\\\\"i\"", locale15);
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str19 = python2Target17.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target();
        int int21 = python2Target20.getInlineTestSetWordSize();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        python2Target20.badWords = strSet26;
        python2Target17.badWords = strSet26;
        java.lang.String[] strArray30 = python2Target17.targetCharValueEscape;
        boolean boolean31 = python2Target17.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = python2Target17.gen;
        java.util.Locale locale34 = null;
        java.lang.String str35 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator32, "\"\"i\"\"", locale34);
        org.antlr.v4.codegen.target.Python2Target python2Target36 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str38 = python2Target36.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target();
        int int40 = python2Target39.getInlineTestSetWordSize();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        python2Target39.badWords = strSet45;
        python2Target36.badWords = strSet45;
        java.lang.String[] strArray49 = python2Target36.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = null;
        java.lang.String str53 = python2Target36.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator50, "\\0", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = python2Target36.gen;
        org.antlr.v4.codegen.target.Python2Target python2Target55 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator56 = null;
        python2Target55.gen = codeGenerator56;
        org.antlr.v4.codegen.target.Python2Target python2Target58 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str60 = python2Target58.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator61 = null;
        python2Target58.gen = codeGenerator61;
        python2Target58.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator64 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target65 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator64);
        org.stringtemplate.v4.STGroup sTGroup66 = python2Target65.loadTemplates();
        python2Target58.templates = sTGroup66;
        python2Target55.templates = sTGroup66;
        python2Target36.templates = sTGroup66;
        java.util.Locale locale71 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str72 = pythonStringRenderer0.toString((java.lang.Object) sTGroup66, "", locale71);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.stringtemplate.v4.STGroupFile cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\12" + "'", str4, "\\12");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\0" + "'", str7, "\\0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\1" + "'", str9, "\\1");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\\\\\"i\"" + "'", str16, "\"\\\\\\\"i\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\0" + "'", str19, "\\0");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(codeGenerator32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"i\"\"" + "'", str35, "\"\"i\"\"");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\0" + "'", str38, "\\0");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 64 + "'", int40 == 64);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\"\"" + "'", str53, "\"\"");
        org.junit.Assert.assertNull(codeGenerator54);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\\0" + "'", str60, "\\0");
        org.junit.Assert.assertNotNull(sTGroup66);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str11 = python2Target9.getTargetStringLiteralFromString("hi!");
        python2Target9.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target9.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "hi!", false);
        int int18 = python2Target9.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str21 = python2Target19.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target();
        int int23 = python2Target22.getInlineTestSetWordSize();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        python2Target22.badWords = strSet28;
        python2Target19.badWords = strSet28;
        python2Target9.badWords = strSet28;
        python2Target9.addBadWords();
        java.lang.String str35 = python2Target9.getTargetStringLiteralFromString("\"i\"");
        boolean boolean36 = python2Target9.wantsBaseListener();
        java.lang.String[] strArray37 = null;
        python2Target9.targetCharValueEscape = strArray37;
        org.antlr.v4.tool.Grammar grammar39 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target40 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str42 = python2Target40.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = null;
        python2Target40.gen = codeGenerator43;
        java.lang.String str46 = python2Target40.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar47 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target48 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str50 = python2Target48.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator51 = null;
        python2Target48.gen = codeGenerator51;
        java.lang.String str54 = python2Target48.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar55 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target56 = new org.antlr.v4.codegen.target.Python2Target();
        int int57 = python2Target56.getInlineTestSetWordSize();
        java.lang.String[] strArray61 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        python2Target56.badWords = strSet62;
        org.stringtemplate.v4.STGroup sTGroup65 = null;
        python2Target56.templates = sTGroup65;
        org.antlr.v4.codegen.CodeGenerator codeGenerator67 = null;
        python2Target56.gen = codeGenerator67;
        java.util.Set<java.lang.String> strSet69 = python2Target56.getBadWords();
        java.lang.String str70 = python2Target56.getVersion();
        org.antlr.v4.tool.Grammar grammar71 = null;
        int[] intArray72 = new int[] {};
        java.lang.String[] strArray73 = python2Target56.getTokenTypesAsTargetLabels(grammar71, intArray72);
        java.lang.String[] strArray74 = python2Target48.getTokenTypesAsTargetLabels(grammar55, intArray72);
        java.lang.String[] strArray75 = python2Target40.getTokenTypesAsTargetLabels(grammar47, intArray72);
        java.lang.String[] strArray76 = python2Target9.getTokenTypesAsTargetLabels(grammar39, intArray72);
        java.lang.String[] strArray77 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray72);
        org.antlr.v4.tool.ast.GrammarAST grammarAST78 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str79 = python2Target1.getLoopLabel(grammarAST78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"" + "'", str11, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "i" + "'", str17, "i");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\0" + "'", str21, "\\0");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"i\"\"" + "'", str35, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\\0" + "'", str42, "\\0");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\\12" + "'", str46, "\\12");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\\0" + "'", str50, "\\0");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\\12" + "'", str54, "\\12");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 64 + "'", int57 == 64);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "4.5.2.1" + "'", str70, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[]");
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strArray77);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"_\"i\"\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"_\"i\"\"\"" + "'", str1, "\"\"_\"i\"\"\"");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target0.gen;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup14 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target();
        int int8 = python2Target7.getInlineTestSetWordSize();
        java.lang.String str11 = python2Target7.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str12 = python2Target7.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str15 = python2Target13.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python2Target13.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        java.lang.String str23 = python2Target13.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator20, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator24);
        org.stringtemplate.v4.STGroup sTGroup26 = python2Target25.loadTemplates();
        python2Target13.templates = sTGroup26;
        python2Target7.templates = sTGroup26;
        python2Target0.templates = sTGroup26;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        java.lang.String str33 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator30, "_\\0", true);
        java.lang.String str35 = python2Target0.getListLabel("_\\1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = python2Target0.getLoopLabel(grammarAST36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"hi!\"\"" + "'", str11, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"hi!\"" + "'", str15, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\"" + "'", str23, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"0\"" + "'", str33, "\"0\"");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "_\\1" + "'", str35, "_\\1");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str31 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup32 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\"i\"\"" + "'", str31, "\"\"i\"\"");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        python2Target0.genRecognizerHeaderFile(grammar14, sT15, "_\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar19, sT20, "\"\\\"0\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(codeGenerator18);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str13 = python2Target11.getTargetStringLiteralFromString("hi!");
        python2Target11.language = "hi!";
        java.util.Set<java.lang.String> strSet16 = python2Target11.badWords;
        python2Target0.badWords = strSet16;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target0.getLoopLabel(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"i\"" + "'", str10, "\"\\\"i\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"hi!\"" + "'", str13, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(codeGenerator18);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        int int7 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getLoopLabel(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        java.lang.String[] strArray14 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray14;
        python2Target0.targetCharValueEscape = strArray14;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        java.lang.String str20 = python2Target18.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str21 = python2Target18.getVersion();
        java.lang.String str23 = python2Target18.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup24 = python2Target18.templates;
        python2Target0.templates = sTGroup24;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python2Target0.getElementName("\\12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"i" + "'", str8, "\\\"i");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"hi!\"\"Context" + "'", str20, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\\\\\\"i\"" + "'", str23, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(sTGroup24);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        python2Target0.language = "\" \"Context";
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target0.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        java.util.Set<java.lang.String> strSet33 = python2Target0.badWords;
        java.lang.String str34 = python2Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = python2Target0.getImplicitSetLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\\\\\"i\"" + "'", str32, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0", true);
        java.lang.String str20 = python2Target0.getTargetStringLiteralFromString("\"\"hi!\"\"", true);
        boolean boolean21 = python2Target0.templatesExist();
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target();
        int int23 = python2Target22.getInlineTestSetWordSize();
        java.lang.String str26 = python2Target22.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str27 = python2Target22.getVersion();
        java.lang.String str28 = python2Target22.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target29 = new org.antlr.v4.codegen.target.Python2Target();
        int int30 = python2Target29.getInlineTestSetWordSize();
        java.lang.String str33 = python2Target29.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str34 = python2Target29.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str37 = python2Target35.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        java.lang.String str41 = python2Target35.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator38, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        java.lang.String str45 = python2Target35.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator42, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target47 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator46);
        org.stringtemplate.v4.STGroup sTGroup48 = python2Target47.loadTemplates();
        python2Target35.templates = sTGroup48;
        python2Target29.templates = sTGroup48;
        python2Target22.templates = sTGroup48;
        python2Target0.templates = sTGroup48;
        boolean boolean53 = python2Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar54 = null;
        org.stringtemplate.v4.ST sT55 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar54, sT55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str20, "\"\"\"hi!\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"hi!\"\"" + "'", str26, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "4.5.2.1" + "'", str27, "4.5.2.1");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\"hi!\"\"" + "'", str33, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "4.5.2.1" + "'", str34, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"hi!\"" + "'", str37, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"\"" + "'", str41, "\"\"");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"\"" + "'", str45, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        python2Target0.language = "\\1";
        java.lang.String str13 = python2Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target0.getTokenTypeAsTargetLabel(grammar14, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_\"i\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getAltLabelContextStructName("__\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"i" + "'", str8, "\\\"i");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar8, sT9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target0.gen = codeGenerator11;
        int int13 = python2Target0.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup14 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        java.util.Set<java.lang.String> strSet33 = python2Target0.badWords;
        java.lang.String str34 = python2Target0.getLanguage();
        int int35 = python2Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = python2Target0.getLoopLabel(grammarAST36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\\\\\"i\"" + "'", str32, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        boolean boolean24 = python2Target0.templatesExist();
        java.lang.String[] strArray25 = python2Target0.targetCharValueEscape;
        java.lang.Class<?> wildcardClass26 = strArray25.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.util.Set<java.lang.String> strSet13 = python2Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        python2Target0.gen = codeGenerator14;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target0.getRuleFunctionContextStructName(ruleFunction16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.getLanguage();
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String[] strArray6 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray6;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        python2Target0.language = "\\1";
        java.lang.String str13 = python2Target0.language;
        boolean boolean14 = python2Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "\"\\12Context\"", true);
        org.antlr.v4.tool.Rule rule19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target0.getRuleFunctionContextStructName(rule19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\1" + "'", str13, "\\1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"12Context\"" + "'", str18, "\"12Context\"");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str26 = python2Target0.getTargetStringLiteralFromString("\"i\"");
        boolean boolean27 = python2Target0.wantsBaseListener();
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target();
        int int29 = python2Target28.getInlineTestSetWordSize();
        java.lang.String str32 = python2Target28.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str33 = python2Target28.getVersion();
        java.lang.String str34 = python2Target28.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target();
        int int36 = python2Target35.getInlineTestSetWordSize();
        java.lang.String str39 = python2Target35.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str40 = python2Target35.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target41 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str43 = python2Target41.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        java.lang.String str47 = python2Target41.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator44, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = null;
        java.lang.String str51 = python2Target41.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator48, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target53 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator52);
        org.stringtemplate.v4.STGroup sTGroup54 = python2Target53.loadTemplates();
        python2Target41.templates = sTGroup54;
        python2Target35.templates = sTGroup54;
        python2Target28.templates = sTGroup54;
        java.util.Set<java.lang.String> strSet58 = python2Target28.getBadWords();
        python2Target0.badWords = strSet58;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = python2Target0.getImplicitTokenLabel("\"\"\"\"i\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"hi!\"\"" + "'", str32, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4.5.2.1" + "'", str33, "4.5.2.1");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 64 + "'", int36 == 64);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"\"hi!\"\"" + "'", str39, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "4.5.2.1" + "'", str40, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"hi!\"" + "'", str43, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"\"" + "'", str47, "\"\"");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\"\"" + "'", str51, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup54);
        org.junit.Assert.assertNotNull(strSet58);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        java.lang.String str25 = python2Target0.getLanguage();
        java.lang.String str26 = python2Target0.getVersion();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python2Target0.getRuleFunctionContextStructName(ruleFunction27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4.5.2.1" + "'", str26, "4.5.2.1");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.templates;
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        python2Target0.language = "\\1";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target0.getElementName("\"\\\"0\\\"Context\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"\\\"i\\\"\"");
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\\\\\"i\\\\\\\"\\\"\"" + "'", str9, "\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\\\"\\\"\\\"hi!\\\"\\\"\\\"", false);
        java.lang.String str11 = python2Target0.language;
        boolean boolean12 = python2Target0.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str10, "\\\"\\\"\\\"hi!\\\"\\\"\\\"");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        boolean boolean31 = python2Target0.templatesExist();
        boolean boolean32 = python2Target0.templatesExist();
        java.lang.String str33 = python2Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.stringtemplate.v4.ST sT35 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar34, sT35, "\"tset\\\"\\\\\\\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4.5.2.1" + "'", str33, "4.5.2.1");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\12\"");
        boolean boolean33 = python2Target0.templatesExist();
        java.lang.Class<?> wildcardClass34 = python2Target0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"\\12\"\"" + "'", str32, "\"\"\\12\"\"");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\12\"");
        java.lang.String str35 = python2Target0.getTargetStringLiteralFromString("\\12Context", true);
        java.lang.String str37 = python2Target0.getTargetStringLiteralFromString("\"\"hi!\"\"Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST38 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"\\12\"\"" + "'", str32, "\"\"\\12\"\"");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\\12Context\"" + "'", str35, "\"\\12Context\"");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"\"\"hi!\"\"Context\"" + "'", str37, "\"\"\"hi!\"\"Context\"");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python2Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.stringtemplate.v4.ST sT16 = null;
        python2Target0.genRecognizerHeaderFile(grammar15, sT16, "\"\\\\\\\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        python2Target0.gen = codeGenerator19;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python2Target0.getRuleFunctionContextStructName(ruleFunction21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target6.templates = sTGroup19;
        python2Target0.templates = sTGroup19;
        java.lang.String[] strArray22 = python2Target0.targetCharValueEscape;
        java.lang.String str24 = python2Target0.getImplicitSetLabel("d");
        org.antlr.v4.tool.Rule rule25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python2Target0.getRuleFunctionContextStructName(rule25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"hi!\"" + "'", str8, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_tsetd" + "'", str24, "_tsetd");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        boolean boolean31 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = python2Target0.getCodeGenerator();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = python2Target0.getRuleFunctionContextStructName(ruleFunction33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(codeGenerator32);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"\"hi!\"\"Context", true);
        boolean boolean18 = python2Target0.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup19 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"hi!\\\"\\\"Contex\"" + "'", str17, "\"\\\"hi!\\\"\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromString("i", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python2Target0.gen = codeGenerator8;
        boolean boolean10 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String str16 = python2Target14.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str18 = python2Target14.getImplicitRuleLabel("\"i\"");
        boolean boolean19 = python2Target14.wantsBaseVisitor();
        boolean boolean20 = python2Target14.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str24 = python2Target22.getTargetStringLiteralFromString("hi!");
        python2Target22.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        java.lang.String str30 = python2Target22.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator27, "hi!", false);
        int int31 = python2Target22.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target32 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str34 = python2Target32.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target();
        int int36 = python2Target35.getInlineTestSetWordSize();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        python2Target35.badWords = strSet41;
        python2Target32.badWords = strSet41;
        python2Target22.badWords = strSet41;
        python2Target22.addBadWords();
        java.lang.String str48 = python2Target22.getTargetStringLiteralFromString("\"i\"");
        boolean boolean49 = python2Target22.wantsBaseListener();
        java.lang.String[] strArray50 = null;
        python2Target22.targetCharValueEscape = strArray50;
        org.antlr.v4.tool.Grammar grammar52 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target53 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str55 = python2Target53.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator56 = null;
        python2Target53.gen = codeGenerator56;
        java.lang.String str59 = python2Target53.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar60 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target61 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str63 = python2Target61.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator64 = null;
        python2Target61.gen = codeGenerator64;
        java.lang.String str67 = python2Target61.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar68 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target69 = new org.antlr.v4.codegen.target.Python2Target();
        int int70 = python2Target69.getInlineTestSetWordSize();
        java.lang.String[] strArray74 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet75 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet75, strArray74);
        python2Target69.badWords = strSet75;
        org.stringtemplate.v4.STGroup sTGroup78 = null;
        python2Target69.templates = sTGroup78;
        org.antlr.v4.codegen.CodeGenerator codeGenerator80 = null;
        python2Target69.gen = codeGenerator80;
        java.util.Set<java.lang.String> strSet82 = python2Target69.getBadWords();
        java.lang.String str83 = python2Target69.getVersion();
        org.antlr.v4.tool.Grammar grammar84 = null;
        int[] intArray85 = new int[] {};
        java.lang.String[] strArray86 = python2Target69.getTokenTypesAsTargetLabels(grammar84, intArray85);
        java.lang.String[] strArray87 = python2Target61.getTokenTypesAsTargetLabels(grammar68, intArray85);
        java.lang.String[] strArray88 = python2Target53.getTokenTypesAsTargetLabels(grammar60, intArray85);
        java.lang.String[] strArray89 = python2Target22.getTokenTypesAsTargetLabels(grammar52, intArray85);
        java.lang.String[] strArray90 = python2Target14.getTokenTypesAsTargetLabels(grammar21, intArray85);
        java.lang.String[] strArray91 = python2Target0.getTokenTypesAsTargetLabels(grammar12, intArray85);
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray91;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"i\"" + "'", str7, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"hi!\"\"Context" + "'", str16, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_\"i\"" + "'", str18, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"hi!\"" + "'", str24, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "i" + "'", str30, "i");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 64 + "'", int31 == 64);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\\0" + "'", str34, "\\0");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 64 + "'", int36 == 64);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\"\"i\"\"" + "'", str48, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\\0" + "'", str55, "\\0");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\\12" + "'", str59, "\\12");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\\0" + "'", str63, "\\0");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\\12" + "'", str67, "\\12");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 64 + "'", int70 == 64);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strSet82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "4.5.2.1" + "'", str83, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[]");
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(strArray91);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        java.lang.String str9 = python2Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\"\\\"i\"", true);
        boolean boolean14 = python2Target0.templatesExist();
        java.lang.Class<?> wildcardClass15 = python2Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\"i\"\"" + "'", str8, "\"_\"i\"\"");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"i\"" + "'", str13, "\"\\\"i\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str11 = python2Target9.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target();
        int int13 = python2Target12.getInlineTestSetWordSize();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        python2Target12.badWords = strSet18;
        python2Target9.badWords = strSet18;
        python2Target0.badWords = strSet18;
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.stringtemplate.v4.ST sT24 = null;
        python2Target0.genRecognizerHeaderFile(grammar23, sT24, "_\"i\"");
        java.lang.String str28 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator29, "\"hi!\"", true);
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.stringtemplate.v4.ST sT34 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar33, sT34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\0" + "'", str11, "\\0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\\\"i\"" + "'", str28, "\"\\\"i\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"hi!\"" + "'", str32, "\"hi!\"");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        int int3 = python2Target1.getInlineTestSetWordSize();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator5, "\"\"i\"\"", locale7);
        java.util.Locale locale11 = null;
        java.lang.String str12 = pythonStringRenderer0.toString((java.lang.Object) "Python2", "_\"i\"", locale11);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str15 = python2Target13.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        python2Target13.badWords = strSet22;
        java.lang.String[] strArray26 = python2Target13.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        java.lang.String str30 = python2Target13.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator27, "\\0", true);
        boolean boolean31 = python2Target13.wantsBaseVisitor();
        java.util.Locale locale33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = pythonStringRenderer0.toString((java.lang.Object) python2Target13, "\"\\\"i\"", locale33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"i\"\"" + "'", str8, "\"\"i\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"i\"" + "'", str12, "_\"i\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\0" + "'", str15, "\\0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"\"" + "'", str30, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) "\"\\\\\\\"i\"", "\\12", locale3);
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str7 = python2Target5.encodeIntAsCharEscape(0);
        java.lang.String str9 = python2Target5.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target5.gen;
        java.lang.String str11 = python2Target5.getLanguage();
        boolean boolean12 = python2Target5.wantsBaseVisitor();
        java.lang.String str13 = python2Target5.language;
        java.util.Locale locale15 = null;
        java.lang.String str16 = pythonStringRenderer0.toString((java.lang.Object) str13, "\"\\\\\\\"i\"", locale15);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        java.lang.String str20 = python2Target18.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str22 = python2Target18.getImplicitRuleLabel("\"i\"");
        boolean boolean23 = python2Target18.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet24 = python2Target18.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str27 = python2Target25.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        java.lang.String str31 = python2Target25.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator28, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        java.lang.String str35 = python2Target25.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator32, "", true);
        java.util.Set<java.lang.String> strSet36 = python2Target25.getBadWords();
        python2Target18.badWords = strSet36;
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str40 = python2Target38.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target41 = new org.antlr.v4.codegen.target.Python2Target();
        int int42 = python2Target41.getInlineTestSetWordSize();
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        python2Target41.badWords = strSet47;
        python2Target38.badWords = strSet47;
        python2Target18.badWords = strSet47;
        org.antlr.v4.codegen.target.Python2Target python2Target52 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str54 = python2Target52.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator55 = null;
        java.lang.String str58 = python2Target52.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator55, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator59 = null;
        java.lang.String str62 = python2Target52.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator59, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator63 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target64 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator63);
        org.stringtemplate.v4.STGroup sTGroup65 = python2Target64.loadTemplates();
        python2Target52.templates = sTGroup65;
        java.lang.String str67 = python2Target52.language;
        org.stringtemplate.v4.STGroup sTGroup68 = python2Target52.templates;
        python2Target18.templates = sTGroup68;
        java.util.Locale locale71 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str72 = pythonStringRenderer0.toString((java.lang.Object) python2Target18, "_\"\\\"\\\\\\\"i\\\\\\\"\\\"\"", locale71);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\12" + "'", str4, "\\12");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\0" + "'", str7, "\\0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\1" + "'", str9, "\\1");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\\\\\"i\"" + "'", str16, "\"\\\\\\\"i\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"hi!\"\"Context" + "'", str20, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "_\"i\"" + "'", str22, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"hi!\"" + "'", str27, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\"" + "'", str31, "\"\"");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"" + "'", str35, "\"\"");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\\0" + "'", str40, "\\0");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 64 + "'", int42 == 64);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\"hi!\"" + "'", str54, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\"\"" + "'", str58, "\"\"");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\"\"" + "'", str62, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup65);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(sTGroup68);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str15 = python2Target13.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python2Target13.gen = codeGenerator16;
        java.lang.String[] strArray23 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray23;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray23;
        python2Target13.targetCharValueEscape = strArray23;
        python2Target0.targetCharValueEscape = strArray23;
        java.lang.String[] strArray28 = python2Target0.targetCharValueEscape;
        int int29 = python2Target0.getInlineTestSetWordSize();
        python2Target0.language = "\"\"\\12Context\"Context\"";
        org.antlr.v4.codegen.model.RuleFunction ruleFunction32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python2Target0.getRuleFunctionContextStructName(ruleFunction32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\0" + "'", str15, "\\0");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\\"\\\"\\\\12Context\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\"\\\\12Context\\\"\\\"\"" + "'", str1, "\"\\\"\\\"\\\\12Context\\\"\\\"\"");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target();
        int int8 = python2Target7.getInlineTestSetWordSize();
        int int9 = python2Target7.getInlineTestSetWordSize();
        boolean boolean10 = python2Target7.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target7.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target7.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_\"i\"", false);
        java.lang.String[] strArray21 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray21;
        python2Target7.targetCharValueEscape = strArray21;
        python2Target0.targetCharValueEscape = strArray21;
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.stringtemplate.v4.ST sT26 = null;
        python2Target0.genRecognizerHeaderFile(grammar25, sT26, "\"_\"i\"\"");
        org.stringtemplate.v4.STGroup sTGroup29 = python2Target0.templates;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass30 = sTGroup29.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"i" + "'", str15, "\\\"i");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNull(sTGroup29);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        python2Target0.language = "\\1";
        java.lang.String str13 = python2Target0.getVersion();
        org.antlr.v4.tool.Rule rule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target0.getRuleFunctionContextStructName(rule14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementName("\"#\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = python2Target0.getCodeGenerator();
        java.lang.String str34 = python2Target0.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = python2Target0.getLoopLabel(grammarAST35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\\\\\"i\"" + "'", str32, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNull(codeGenerator33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target4 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str6 = python2Target4.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target();
        int int8 = python2Target7.getInlineTestSetWordSize();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python2Target7.badWords = strSet13;
        python2Target4.badWords = strSet13;
        java.lang.String[] strArray17 = python2Target4.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray17;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray17;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray17;
        python2Target1.targetCharValueEscape = strArray17;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python2Target1.getImplicitTokenLabel("\\\"\\\"\\\"hi!\\\"\\\"\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        boolean boolean31 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = python2Target0.getCodeGenerator();
        java.lang.String str33 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = python2Target0.gen;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(codeGenerator32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4.5.2.1" + "'", str33, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator34);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("d");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "d" + "'", str1, "d");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        python2Target0.language = "\\1";
        java.lang.String str13 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String str17 = python2Target15.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str18 = python2Target15.getLanguage();
        java.util.Set<java.lang.String> strSet19 = python2Target15.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator20);
        java.lang.String str23 = python2Target21.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean24 = python2Target21.templatesExist();
        boolean boolean25 = python2Target21.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = python2Target21.getCodeGenerator();
        java.util.Set<java.lang.String> strSet27 = python2Target21.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target();
        int int29 = python2Target28.getInlineTestSetWordSize();
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        python2Target28.badWords = strSet34;
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator37);
        org.stringtemplate.v4.STGroup sTGroup39 = python2Target38.loadTemplates();
        python2Target28.templates = sTGroup39;
        python2Target21.templates = sTGroup39;
        python2Target15.templates = sTGroup39;
        python2Target0.templates = sTGroup39;
        org.antlr.v4.tool.ast.GrammarAST grammarAST44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = python2Target0.getLoopLabel(grammarAST44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"hi!\"\"Context" + "'", str17, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\"hi!\"\"Context" + "'", str23, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(codeGenerator26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(sTGroup39);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        int int3 = python2Target1.getInlineTestSetWordSize();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator5, "\"\"i\"\"", locale7);
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target();
        int int10 = python2Target9.getInlineTestSetWordSize();
        java.lang.String str13 = python2Target9.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str14 = python2Target9.getVersion();
        java.lang.String str15 = python2Target9.getLanguage();
        java.util.Locale locale17 = null;
        java.lang.String str18 = pythonStringRenderer0.toString((java.lang.Object) str15, "\"\"hi!\"\"Context", locale17);
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str21 = python2Target19.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target();
        int int23 = python2Target22.getInlineTestSetWordSize();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        python2Target22.badWords = strSet28;
        python2Target19.badWords = strSet28;
        java.lang.String[] strArray32 = python2Target19.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = python2Target19.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.stringtemplate.v4.ST sT35 = null;
        python2Target19.genRecognizerHeaderFile(grammar34, sT35, "\"\\\\\\\"i\"");
        java.util.Set<java.lang.String> strSet38 = python2Target19.badWords;
        java.util.Locale locale40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = pythonStringRenderer0.toString((java.lang.Object) python2Target19, "\\12Context", locale40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"i\"\"" + "'", str8, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"hi!\"\"" + "'", str13, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"hi!\"\"Context" + "'", str18, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\0" + "'", str21, "\\0");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNull(codeGenerator33);
        org.junit.Assert.assertNotNull(strSet38);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        python2Target0.gen = codeGenerator12;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup14 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromString("i", true);
        python2Target0.language = "_\\1";
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target0.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"i\"" + "'", str7, "\"i\"");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str10 = python2Target8.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python2Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "", true);
        java.util.Set<java.lang.String> strSet19 = python2Target8.getBadWords();
        python2Target1.badWords = strSet19;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str23 = python2Target21.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target();
        int int25 = python2Target24.getInlineTestSetWordSize();
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        python2Target24.badWords = strSet30;
        python2Target21.badWords = strSet30;
        python2Target1.badWords = strSet30;
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str37 = python2Target35.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        java.lang.String str41 = python2Target35.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator38, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        java.lang.String str45 = python2Target35.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator42, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target47 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator46);
        org.stringtemplate.v4.STGroup sTGroup48 = python2Target47.loadTemplates();
        python2Target35.templates = sTGroup48;
        java.lang.String str50 = python2Target35.language;
        org.stringtemplate.v4.STGroup sTGroup51 = python2Target35.templates;
        python2Target1.templates = sTGroup51;
        org.antlr.v4.tool.ast.GrammarAST grammarAST53 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\\0" + "'", str23, "\\0");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"hi!\"" + "'", str37, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"\"" + "'", str41, "\"\"");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"\"" + "'", str45, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(sTGroup51);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\12\"");
        org.stringtemplate.v4.STGroup sTGroup33 = python2Target0.templates;
        boolean boolean34 = python2Target0.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass35 = python2Target0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"\\12\"\"" + "'", str32, "\"\"\\12\"\"");
        org.junit.Assert.assertNull(sTGroup33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        boolean boolean27 = python2Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = python2Target0.getTokenTypeAsTargetLabel(grammar28, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python2Target0.templates = sTGroup9;
        python2Target0.language = "\\1";
        java.lang.String str13 = python2Target0.language;
        boolean boolean14 = python2Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "\"\\12Context\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\1" + "'", str13, "\\1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"12Context\"" + "'", str18, "\"12Context\"");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        boolean boolean31 = python2Target0.templatesExist();
        java.util.Set<java.lang.String> strSet32 = python2Target0.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = python2Target0.getListLabel("\\12Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strSet32);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target0.getTokenTypeAsTargetLabel(grammar11, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0", true);
        java.lang.String str20 = python2Target0.getTargetStringLiteralFromString("\"\"hi!\"\"", true);
        boolean boolean21 = python2Target0.templatesExist();
        java.lang.String str23 = python2Target0.getTargetStringLiteralFromString(" ");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python2Target0.getRuleFunctionContextStructName(ruleFunction24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str20, "\"\"\"hi!\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\" \"" + "'", str23, "\" \"");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str12 = python2Target10.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        int int14 = python2Target13.getInlineTestSetWordSize();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python2Target13.badWords = strSet19;
        python2Target10.badWords = strSet19;
        python2Target0.badWords = strSet19;
        python2Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target0.templates = sTGroup25;
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        java.util.Set<java.lang.String> strSet33 = python2Target0.badWords;
        java.lang.String str34 = python2Target0.getLanguage();
        java.lang.Class<?> wildcardClass35 = python2Target0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\\\\\"i\"" + "'", str32, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        boolean boolean11 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python2Target16.templates = sTGroup25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target16.gen = codeGenerator27;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        python2Target0.badWords = strSet29;
        python2Target0.addBadWords();
        org.antlr.v4.codegen.target.Python2Target python2Target32 = new org.antlr.v4.codegen.target.Python2Target();
        int int33 = python2Target32.getInlineTestSetWordSize();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        python2Target32.badWords = strSet38;
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator41);
        org.stringtemplate.v4.STGroup sTGroup43 = python2Target42.loadTemplates();
        python2Target32.templates = sTGroup43;
        org.antlr.v4.codegen.target.Python2Target python2Target45 = new org.antlr.v4.codegen.target.Python2Target();
        int int46 = python2Target45.getInlineTestSetWordSize();
        int int47 = python2Target45.getInlineTestSetWordSize();
        boolean boolean48 = python2Target45.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = python2Target45.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = null;
        java.lang.String str53 = python2Target45.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator50, "_\"i\"", false);
        java.lang.String[] strArray59 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray59;
        python2Target45.targetCharValueEscape = strArray59;
        java.lang.String[] strArray62 = python2Target45.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target python2Target63 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str65 = python2Target63.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target66 = new org.antlr.v4.codegen.target.Python2Target();
        int int67 = python2Target66.getInlineTestSetWordSize();
        java.lang.String[] strArray71 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        python2Target66.badWords = strSet72;
        python2Target63.badWords = strSet72;
        org.antlr.v4.codegen.target.Python2Target python2Target76 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str78 = python2Target76.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator79 = null;
        python2Target76.gen = codeGenerator79;
        java.lang.String[] strArray86 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray86;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray86;
        python2Target76.targetCharValueEscape = strArray86;
        python2Target63.targetCharValueEscape = strArray86;
        java.lang.String[] strArray91 = python2Target63.targetCharValueEscape;
        python2Target45.targetCharValueEscape = strArray91;
        python2Target32.targetCharValueEscape = strArray91;
        python2Target0.targetCharValueEscape = strArray91;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray91;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 64 + "'", int33 == 64);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(sTGroup43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 64 + "'", int46 == 64);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 64 + "'", int47 == 64);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(codeGenerator49);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\\\"i" + "'", str53, "\\\"i");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\\0" + "'", str65, "\\0");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 64 + "'", int67 == 64);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\\0" + "'", str78, "\\0");
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(strArray91);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\\\"\\\"\\\"hi!\\\"\\\"\\\"", false);
        boolean boolean11 = python2Target0.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup12 = python2Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str10, "\\\"\\\"\\\"hi!\\\"\\\"\\\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tset\"_tset\"\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tset\"_tset\"\"\"" + "'", str1, "_tset\"_tset\"\"\"");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target7.loadTemplates();
        python2Target0.templates = sTGroup8;
        java.lang.String str11 = python2Target0.getTargetStringLiteralFromString("\\12Context");
        boolean boolean12 = python2Target0.wantsBaseVisitor();
        java.lang.String str14 = python2Target0.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\12Context\"" + "'", str11, "\"\\12Context\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        python2Target0.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup6 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        java.lang.String str6 = python2Target0.getLanguage();
        boolean boolean7 = python2Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target0.templates;
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target0.getTokenTypeAsTargetLabel(grammar9, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\1" + "'", str4, "\\1");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sTGroup8);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.wantsBaseListener();
        python2Target0.addBadWords();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python2Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str10 = python2Target8.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python2Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "", true);
        java.util.Set<java.lang.String> strSet19 = python2Target8.getBadWords();
        python2Target1.badWords = strSet19;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str23 = python2Target21.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target();
        int int25 = python2Target24.getInlineTestSetWordSize();
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        python2Target24.badWords = strSet30;
        python2Target21.badWords = strSet30;
        python2Target1.badWords = strSet30;
        java.lang.String str36 = python2Target1.getTargetStringLiteralFromString("\"#\"");
        org.antlr.v4.tool.Grammar grammar37 = null;
        org.stringtemplate.v4.ST sT38 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar37, sT38, "1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\\0" + "'", str23, "\\0");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"\\\"#\\\"\"" + "'", str36, "\"\\\"#\\\"\"");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.getLanguage();
        org.antlr.v4.tool.Grammar grammar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target0.getTokenTypeAsTargetLabel(grammar5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target7.loadTemplates();
        python2Target0.templates = sTGroup8;
        java.lang.String str11 = python2Target0.getTargetStringLiteralFromString("\\12Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target0.gen;
        java.lang.String str14 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target0.getElementName("_\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\12Context\"" + "'", str11, "\"\\12Context\"");
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\1" + "'", str14, "\\1");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getLanguage();
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar6, sT7, "\"\"\\12Context\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar4, sT5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target6.templates = sTGroup19;
        python2Target0.templates = sTGroup19;
        boolean boolean22 = python2Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet23 = python2Target0.badWords;
        org.antlr.v4.tool.Grammar grammar24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python2Target0.getTokenTypeAsTargetLabel(grammar24, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"hi!\"" + "'", str8, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        boolean boolean8 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.loadTemplates();
        java.lang.String str4 = python2Target1.getImplicitRuleLabel("\\0");
        org.antlr.v4.tool.Grammar grammar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getTokenTypeAsTargetLabel(grammar5, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_\\0" + "'", str4, "_\\0");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target0.getCodeGenerator();
        python2Target0.language = "\\12Context";
        java.lang.Class<?> wildcardClass11 = python2Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\"i\"\"", false);
        java.lang.String str13 = python2Target0.getLanguage();
        java.lang.String str15 = python2Target0.encodeIntAsCharEscape(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target0.getElementListName("\"\"hi!\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\"i\\\"" + "'", str12, "\\\"i\\\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\1" + "'", str15, "\\1");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet7 = python2Target0.badWords;
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target0.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        python2Target0.addBadWords();
        python2Target0.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }
}
