import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python3Target1.genRecognizerHeaderFile(grammar5, sT6, "\\n");
        java.lang.String str9 = python3Target1.getVersion();
        python3Target1.language = "_tset_tset4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator12);
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        python3Target13.genRecognizerHeaderFile(grammar14, sT15, "hi!");
        java.lang.String str18 = python3Target13.getVersion();
        org.stringtemplate.v4.STGroup sTGroup19 = python3Target13.loadTemplates();
        java.util.Set<java.lang.String> strSet20 = python3Target13.badWords;
        python3Target13.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator24);
        java.lang.String str27 = python3Target25.getAltLabelContextStructName("\\n");
        int int28 = python3Target25.getInlineTestSetWordSize();
        boolean boolean29 = python3Target25.wantsBaseVisitor();
        java.lang.String str31 = python3Target25.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray32 = python3Target25.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target35 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator34);
        org.antlr.v4.tool.Grammar grammar36 = null;
        org.stringtemplate.v4.ST sT37 = null;
        python3Target35.genRecognizerHeaderFile(grammar36, sT37, "hi!");
        java.lang.String str40 = python3Target35.getVersion();
        org.stringtemplate.v4.STGroup sTGroup41 = python3Target35.loadTemplates();
        java.util.Set<java.lang.String> strSet42 = python3Target35.badWords;
        org.antlr.v4.tool.Grammar grammar43 = null;
        int[] intArray44 = new int[] {};
        java.lang.String[] strArray45 = python3Target35.getTokenTypesAsTargetLabels(grammar43, intArray44);
        java.lang.String[] strArray46 = python3Target25.getTokenTypesAsTargetLabels(grammar33, intArray44);
        java.lang.String[] strArray47 = python3Target13.getTokenTypesAsTargetLabels(grammar23, intArray44);
        python3Target1.targetCharValueEscape = strArray47;
        org.antlr.v4.tool.ast.GrammarAST grammarAST49 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = python3Target1.getLoopCounter(grammarAST49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\\nContext" + "'", str27, "\\nContext");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 64 + "'", int28 == 64);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "d" + "'", str31, "d");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "4.5.2.1" + "'", str40, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        int int29 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str31 = python3Target1.getImplicitSetLabel("\"\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\\n\\\\\\\"\\\"\"");
        boolean boolean32 = python3Target1.wantsBaseVisitor();
        int int33 = python3Target1.getInlineTestSetWordSize();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "_tset\"\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\\n\\\\\\\"\\\"\"" + "'", str31, "_tset\"\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\\n\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 64 + "'", int33 == 64);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) ' ');
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.getTemplates();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str10 = python3Target1.getLanguage();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset_tset4.5.2.1");
        java.lang.String str7 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_", true);
        boolean boolean13 = python3Target1.wantsBaseListener();
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("_tset\"\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\\n\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset_tset4.5.2.1" + "'", str6, "_tset_tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"_tset\\\"\\\\\\\"_tset\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str15, "\"_tset\\\"\\\\\\\"_tset\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"_tset\\\"tset4.5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"_tset\\\"tset4.5.2.\\\"\"" + "'", str1, "\"_tset\\\"tset4.5.2.\\\"\"");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        int int21 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python3Target1.getTokenTypeAsTargetLabel(grammar22, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        java.lang.String str14 = python3Target1.encodeIntAsCharEscape((int) '#');
        int int15 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getTokenTypeAsTargetLabel(grammar16, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset4.5.2.1" + "'", str8, "_tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#" + "'", str14, "#");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        java.lang.String str8 = python3Target6.getAltLabelContextStructName("\\n");
        python3Target6.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target6.gen = codeGenerator10;
        java.lang.String str13 = python3Target6.getAltLabelContextStructName("\\n");
        boolean boolean14 = python3Target6.supportsOverloadedMethods();
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = pythonStringRenderer0.toString((java.lang.Object) python3Target6, "_tset\"\\\"_Python3\\\"\"", locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\nContext" + "'", str8, "\\nContext");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\nContext" + "'", str13, "\\nContext");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "tset4.5.2.";
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target9.getCodeGenerator();
        boolean boolean11 = python3Target9.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator12);
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        python3Target13.genRecognizerHeaderFile(grammar14, sT15, "hi!");
        java.lang.String str18 = python3Target13.getVersion();
        org.stringtemplate.v4.STGroup sTGroup19 = python3Target13.loadTemplates();
        python3Target9.templates = sTGroup19;
        org.stringtemplate.v4.STGroup sTGroup21 = python3Target9.getTemplates();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.stringtemplate.v4.ST sT23 = null;
        python3Target9.genRecognizerHeaderFile(grammar22, sT23, "\"4.5.2.1\"");
        java.lang.String str27 = python3Target9.encodeIntAsCharEscape((int) (byte) 10);
        org.stringtemplate.v4.STGroup sTGroup28 = python3Target9.getTemplates();
        python3Target1.templates = sTGroup28;
        java.lang.String str30 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target32 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator31);
        java.lang.String str34 = python3Target32.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup35 = python3Target32.templates;
        java.lang.String str37 = python3Target32.getImplicitRuleLabel("\"tset4.5.2.\"");
        java.lang.String str39 = python3Target32.getAltLabelContextStructName("Python3");
        java.lang.String[] strArray40 = python3Target32.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray40;
        python3Target1.targetCharValueEscape = strArray40;
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNotNull(sTGroup21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\\n" + "'", str27, "\\n");
        org.junit.Assert.assertNotNull(sTGroup28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "4.5.2.1" + "'", str30, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\\nContext" + "'", str34, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "_\"tset4.5.2.\"" + "'", str37, "_\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Python3Context" + "'", str39, "Python3Context");
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target13.templates;
        java.lang.String str18 = python3Target13.getImplicitSetLabel("_tset_tset4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup19 = python3Target13.loadTemplates();
        python3Target13.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python3Target13.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator23);
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        java.lang.String str28 = python3Target24.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator25, "", true);
        java.lang.String str29 = python3Target24.getLanguage();
        python3Target24.language = "Python3";
        boolean boolean32 = python3Target24.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target35 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator34);
        org.antlr.v4.tool.Grammar grammar36 = null;
        org.stringtemplate.v4.ST sT37 = null;
        python3Target35.genRecognizerHeaderFile(grammar36, sT37, "hi!");
        java.lang.String str40 = python3Target35.getVersion();
        org.stringtemplate.v4.STGroup sTGroup41 = python3Target35.loadTemplates();
        java.util.Set<java.lang.String> strSet42 = python3Target35.badWords;
        python3Target35.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar45 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target47 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator46);
        java.lang.String str49 = python3Target47.getAltLabelContextStructName("\\n");
        int int50 = python3Target47.getInlineTestSetWordSize();
        boolean boolean51 = python3Target47.wantsBaseVisitor();
        java.lang.String str53 = python3Target47.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray54 = python3Target47.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar55 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator56 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target57 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator56);
        org.antlr.v4.tool.Grammar grammar58 = null;
        org.stringtemplate.v4.ST sT59 = null;
        python3Target57.genRecognizerHeaderFile(grammar58, sT59, "hi!");
        java.lang.String str62 = python3Target57.getVersion();
        org.stringtemplate.v4.STGroup sTGroup63 = python3Target57.loadTemplates();
        java.util.Set<java.lang.String> strSet64 = python3Target57.badWords;
        org.antlr.v4.tool.Grammar grammar65 = null;
        int[] intArray66 = new int[] {};
        java.lang.String[] strArray67 = python3Target57.getTokenTypesAsTargetLabels(grammar65, intArray66);
        java.lang.String[] strArray68 = python3Target47.getTokenTypesAsTargetLabels(grammar55, intArray66);
        java.lang.String[] strArray69 = python3Target35.getTokenTypesAsTargetLabels(grammar45, intArray66);
        java.lang.String[] strArray70 = python3Target24.getTokenTypesAsTargetLabels(grammar33, intArray66);
        java.lang.String[] strArray71 = python3Target13.getTokenTypesAsTargetLabels(grammar22, intArray66);
        python3Target1.targetCharValueEscape = strArray71;
        java.lang.String str73 = python3Target1.language;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\n" + "'", str15, "\\n");
        org.junit.Assert.assertNull(sTGroup16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset_tset_tset4.5.2.1" + "'", str18, "_tset_tset_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\"" + "'", str28, "\"\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Python3" + "'", str29, "Python3");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "4.5.2.1" + "'", str40, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\\nContext" + "'", str49, "\\nContext");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 64 + "'", int50 == 64);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "d" + "'", str53, "d");
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "4.5.2.1" + "'", str62, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup63);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[]");
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Python3" + "'", str73, "Python3");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        python3Target1.addBadWords();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target1.genRecognizerHeaderFile(grammar6, sT7, "_tset\"\\\\n\"");
        boolean boolean10 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"4.5.2.1\"" + "'", str5, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        python3Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        python3Target1.gen = codeGenerator5;
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.templates;
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"\"");
        python3Target1.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.loadTemplates();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        python3Target1.genRecognizerHeaderFile(grammar12, sT13, "\"_tset\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"\"" + "'", str9, "_\"\"");
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST20);
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
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        java.util.Set<java.lang.String> strSet20 = python3Target1.badWords;
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\nContext" + "'", str17, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        python3Target1.language = "\"_\\\"_tset\\\\n\\\"\"Context";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        java.lang.String str13 = python3Target1.getListLabel("@");
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar14, sT15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        python3Target1.gen = codeGenerator14;
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("\"\\\\n\"Context", false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\\"\\\\\\\\n\\\"Context" + "'", str18, "\\\"\\\\\\\\n\\\"Context");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        python3Target1.addBadWords();
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("_tsetPython3");
        java.util.Set<java.lang.String> strSet19 = python3Target1.badWords;
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset4.5.2.1" + "'", str15, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"_tsetPython3\"" + "'", str18, "\"_tsetPython3\"");
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST21);
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
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray8 = python3Target1.targetCharValueEscape;
        int int9 = python3Target1.getInlineTestSetWordSize();
        int int10 = python3Target1.getInlineTestSetWordSize();
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
        org.stringtemplate.v4.STGroup sTGroup24 = python3Target12.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        java.lang.String str28 = python3Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator25, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup29 = python3Target12.getTemplates();
        java.lang.String str31 = python3Target12.getListLabel("\\1");
        java.util.Set<java.lang.String> strSet32 = python3Target12.badWords;
        python3Target1.badWords = strSet32;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup22);
        org.junit.Assert.assertNotNull(sTGroup24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "4.5.2.1" + "'", str28, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\\1" + "'", str31, "\\1");
        org.junit.Assert.assertNotNull(strSet32);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        org.antlr.v4.codegen.target.Python3Target python3Target62 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator61);
        org.antlr.v4.codegen.CodeGenerator codeGenerator63 = python3Target62.getCodeGenerator();
        boolean boolean64 = python3Target62.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator65 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target66 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator65);
        java.lang.String str68 = python3Target66.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup69 = python3Target66.templates;
        java.lang.String[] strArray70 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target66.targetCharValueEscape = strArray70;
        python3Target62.targetCharValueEscape = strArray70;
        python3Target1.targetCharValueEscape = strArray70;
        java.lang.String str74 = python3Target1.language;
        java.lang.String[] strArray75 = python3Target1.targetCharValueEscape;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction76 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str77 = python3Target1.getRuleFunctionContextStructName(ruleFunction76);
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
        org.junit.Assert.assertNull(codeGenerator63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\\nContext" + "'", str68, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Python3" + "'", str74, "Python3");
        org.junit.Assert.assertNotNull(strArray75);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset_tset4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        python3Target1.addBadWords();
        python3Target1.language = "\"\\\"\\\\\\\"\\\\\\\\n\\\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset_tset4.5.2.1" + "'", str6, "_tset_tset_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        java.lang.String str27 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator24, "\\1", true);
        java.util.Set<java.lang.String> strSet28 = python3Target1.getBadWords();
        java.lang.String[] strArray29 = python3Target1.targetCharValueEscape;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\"" + "'", str27, "\"\"");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        java.lang.String str25 = python3Target1.getTargetStringLiteralFromString("\"\\\\1\"");
        int int26 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str28 = python3Target1.getListLabel("_tset\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"Context");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str25, "\"\\\"\\\\\\\\1\\\"\"");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "_tset\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"Context" + "'", str28, "_tset\\\"\\\\\\\"tset4.5.2.\\\\\\\"Context\\\"Context");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python3Target1.genRecognizerHeaderFile(grammar5, sT6, "\\n");
        python3Target1.addBadWords();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"\\\"_tset_tset_tset4.5.2.1\"");
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("_tset\"tset4.5.2.\"", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"_tset_tset_tset4.5.2.1\"Context" + "'", str11, "\"\\\"_tset_tset_tset4.5.2.1\"Context");
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"_tset\\\"tset4.5.2.\\\"\"" + "'", str15, "\"_tset\\\"tset4.5.2.\\\"\"");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        boolean boolean46 = python3Target1.wantsBaseVisitor();
        java.lang.String str47 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = null;
        java.lang.String str51 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator48, "_\"_\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = python3Target1.getImplicitTokenLabel("_\\12");
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Python3" + "'", str47, "Python3");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\"\\\"_\"" + "'", str51, "\"\\\"_\"");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.util.Set<java.lang.String> strSet1 = python3Target0.badWords;
        java.lang.String str3 = python3Target0.encodeIntAsCharEscape(1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        java.lang.String str11 = python3Target9.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        python3Target9.genRecognizerHeaderFile(grammar12, sT13, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.stringtemplate.v4.ST sT19 = null;
        python3Target17.genRecognizerHeaderFile(grammar18, sT19, "hi!");
        java.lang.String str22 = python3Target17.getVersion();
        org.stringtemplate.v4.STGroup sTGroup23 = python3Target17.loadTemplates();
        python3Target9.templates = sTGroup23;
        java.lang.String str26 = python3Target9.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.stringtemplate.v4.ST sT28 = null;
        python3Target9.genRecognizerHeaderFile(grammar27, sT28, "_tset");
        boolean boolean31 = python3Target9.supportsOverloadedMethods();
        java.lang.String str32 = python3Target9.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target34 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator33);
        java.lang.String str36 = python3Target34.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup37 = python3Target34.templates;
        java.lang.String[] strArray38 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target34.targetCharValueEscape = strArray38;
        python3Target9.targetCharValueEscape = strArray38;
        python3Target0.targetCharValueEscape = strArray38;
        java.util.Set<java.lang.String> strSet42 = python3Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target44 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator43);
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = python3Target44.getCodeGenerator();
        boolean boolean46 = python3Target44.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator47 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target48 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator47);
        org.antlr.v4.tool.Grammar grammar49 = null;
        org.stringtemplate.v4.ST sT50 = null;
        python3Target48.genRecognizerHeaderFile(grammar49, sT50, "hi!");
        java.lang.String str53 = python3Target48.getVersion();
        org.stringtemplate.v4.STGroup sTGroup54 = python3Target48.loadTemplates();
        python3Target44.templates = sTGroup54;
        python3Target44.language = "_tset";
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = python3Target44.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator59 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target60 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator59);
        org.antlr.v4.tool.Grammar grammar61 = null;
        org.stringtemplate.v4.ST sT62 = null;
        python3Target60.genRecognizerHeaderFile(grammar61, sT62, "hi!");
        java.lang.String str65 = python3Target60.getVersion();
        java.lang.String str67 = python3Target60.getImplicitSetLabel("_tset4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator68 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target69 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator68);
        java.lang.String str71 = python3Target69.getAltLabelContextStructName("\\n");
        python3Target69.addBadWords();
        java.util.Set<java.lang.String> strSet73 = python3Target69.badWords;
        python3Target60.badWords = strSet73;
        python3Target44.badWords = strSet73;
        python3Target0.badWords = strSet73;
        java.lang.String[] strArray77 = python3Target0.targetCharValueEscape;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\n" + "'", str11, "\\n");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_tset4.5.2.1" + "'", str26, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Python3" + "'", str32, "Python3");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\\nContext" + "'", str36, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNull(codeGenerator45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "4.5.2.1" + "'", str53, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup54);
        org.junit.Assert.assertNull(codeGenerator58);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "4.5.2.1" + "'", str65, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "_tset_tset4.5.2.1" + "'", str67, "_tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "\\nContext" + "'", str71, "\\nContext");
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(strArray77);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator35);
        java.lang.String str38 = python3Target36.encodeIntAsCharEscape(10);
        int int39 = python3Target36.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.stringtemplate.v4.ST sT41 = null;
        python3Target36.genRecognizerHeaderFile(grammar40, sT41, "\\n");
        python3Target36.addBadWords();
        java.lang.String[] strArray45 = python3Target36.targetCharValueEscape;
        python3Target1.targetCharValueEscape = strArray45;
        org.antlr.v4.tool.Grammar grammar47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = python3Target1.getTokenTypeAsTargetLabel(grammar47, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\"tset\\\\\\\"_tset\\\"\"Context" + "'", str32, "\"\\\"tset\\\\\\\"_tset\\\"\"Context");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\n" + "'", str38, "\\n");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 29 + "'", int39 == 29);
        org.junit.Assert.assertNotNull(strArray45);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator7);
        java.lang.String str10 = python3Target8.getAltLabelContextStructName("\\n");
        int int11 = python3Target8.getInlineTestSetWordSize();
        boolean boolean12 = python3Target8.wantsBaseVisitor();
        java.lang.String str14 = python3Target8.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray15 = python3Target8.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator17);
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target18.genRecognizerHeaderFile(grammar19, sT20, "hi!");
        java.lang.String str23 = python3Target18.getVersion();
        org.stringtemplate.v4.STGroup sTGroup24 = python3Target18.loadTemplates();
        java.util.Set<java.lang.String> strSet25 = python3Target18.badWords;
        org.antlr.v4.tool.Grammar grammar26 = null;
        int[] intArray27 = new int[] {};
        java.lang.String[] strArray28 = python3Target18.getTokenTypesAsTargetLabels(grammar26, intArray27);
        java.lang.String[] strArray29 = python3Target8.getTokenTypesAsTargetLabels(grammar16, intArray27);
        java.lang.String str31 = python3Target8.encodeIntAsCharEscape(64);
        java.lang.String[] strArray32 = python3Target8.targetCharValueEscape;
        python3Target1.targetCharValueEscape = strArray32;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target35 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator34);
        org.antlr.v4.tool.Grammar grammar36 = null;
        org.stringtemplate.v4.ST sT37 = null;
        python3Target35.genRecognizerHeaderFile(grammar36, sT37, "hi!");
        int int40 = python3Target35.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.stringtemplate.v4.ST sT42 = null;
        python3Target35.genRecognizerHeaderFile(grammar41, sT42, "\\nContext");
        int int45 = python3Target35.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target47 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator46);
        java.lang.String str49 = python3Target47.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup50 = python3Target47.templates;
        java.lang.String str52 = python3Target47.getTargetStringLiteralFromString("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator53 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target54 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator53);
        java.lang.String str56 = python3Target54.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup57 = python3Target54.templates;
        java.lang.String[] strArray58 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target54.targetCharValueEscape = strArray58;
        java.lang.String str61 = python3Target54.getImplicitSetLabel("");
        java.lang.String[] strArray71 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        python3Target54.badWords = strSet72;
        python3Target47.badWords = strSet72;
        int int76 = python3Target47.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup77 = python3Target47.loadTemplates();
        python3Target35.templates = sTGroup77;
        java.lang.String str79 = python3Target35.getLanguage();
        int int80 = python3Target35.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator81 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target82 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator81);
        java.lang.String str84 = python3Target82.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup85 = python3Target82.templates;
        org.stringtemplate.v4.STGroup sTGroup86 = python3Target82.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator87 = python3Target82.gen;
        java.lang.String[] strArray88 = python3Target82.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray88;
        python3Target35.targetCharValueEscape = strArray88;
        python3Target1.targetCharValueEscape = strArray88;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\nContext" + "'", str10, "\\nContext");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4.5.2.1" + "'", str23, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "@" + "'", str31, "@");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 64 + "'", int40 == 64);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 29 + "'", int45 == 29);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\\nContext" + "'", str49, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\"\\\\n\"" + "'", str52, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\\nContext" + "'", str56, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "_tset" + "'", str61, "_tset");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 64 + "'", int76 == 64);
        org.junit.Assert.assertNotNull(sTGroup77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Python3" + "'", str79, "Python3");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 64 + "'", int80 == 64);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\\n" + "'", str84, "\\n");
        org.junit.Assert.assertNull(sTGroup85);
        org.junit.Assert.assertNull(sTGroup86);
        org.junit.Assert.assertNull(codeGenerator87);
        org.junit.Assert.assertNotNull(strArray88);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.stringtemplate.v4.ST sT19 = null;
        python3Target1.genRecognizerHeaderFile(grammar18, sT19, "\"tset\\\"Python\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        java.lang.String str25 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator22, "_tset\"\\\\n\"Context", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "tset\\\"\\\\n\\\"Contex" + "'", str25, "tset\\\"\\\\n\\\"Contex");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = python3Target1.getLoopCounter(grammarAST31);
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
        org.junit.Assert.assertNull(codeGenerator30);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target27 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator26);
        java.lang.String str29 = python3Target27.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup30 = python3Target27.templates;
        java.lang.String str32 = python3Target27.getImplicitRuleLabel("\"tset4.5.2.\"");
        python3Target27.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target35 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator34);
        java.lang.String str37 = python3Target35.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup38 = python3Target35.templates;
        org.stringtemplate.v4.STGroup sTGroup39 = python3Target35.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = python3Target35.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target42 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator41);
        java.lang.String str44 = python3Target42.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar45 = null;
        org.stringtemplate.v4.ST sT46 = null;
        python3Target42.genRecognizerHeaderFile(grammar45, sT46, "\\nContext");
        java.lang.String[] strArray53 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        python3Target42.badWords = strSet54;
        python3Target35.badWords = strSet54;
        python3Target27.badWords = strSet54;
        python3Target1.badWords = strSet54;
        org.stringtemplate.v4.STGroup sTGroup60 = python3Target1.templates;
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset4.5.2.1" + "'", str15, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup23);
        org.junit.Assert.assertNotNull(sTGroup25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\\nContext" + "'", str29, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "_\"tset4.5.2.\"" + "'", str32, "_\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\\n" + "'", str37, "\\n");
        org.junit.Assert.assertNull(sTGroup38);
        org.junit.Assert.assertNull(sTGroup39);
        org.junit.Assert.assertNull(codeGenerator40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\\n" + "'", str44, "\\n");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(sTGroup60);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        java.lang.String str13 = python3Target1.getListLabel("@");
        java.lang.String str15 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\n" + "'", str15, "\\n");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_tset4.5.2.1", false);
        java.lang.String str8 = python3Target1.getVersion();
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "tset4.5.2." + "'", str7, "tset4.5.2.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementListName("_tset\"tset4.5.2.\"ContextContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        org.stringtemplate.v4.STGroup sTGroup21 = python3Target1.templates;
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.stringtemplate.v4.ST sT23 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar22, sT23, "Python3");
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
        org.junit.Assert.assertNotNull(sTGroup21);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        java.lang.String str25 = python3Target1.getTargetStringLiteralFromString("\"\\\\1\"");
        int int26 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python3Target1.gen = codeGenerator27;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str25, "\"\\\"\\\\\\\\1\\\"\"");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getImplicitSetLabel("_tset4.5.2.1");
        python3Target1.addBadWords();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "__Python3", true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset4.5.2.1" + "'", str8, "_tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"\"" + "'", str11, "_tset\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"_Python\"" + "'", str15, "\"_Python\"");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        java.lang.String str20 = python3Target1.getImplicitRuleLabel("\"_tset_tset_tset4.5.2.1\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target1.getImplicitTokenLabel("\"\\\"tset4.5.2.\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_\"_tset_tset_tset4.5.2.1\"" + "'", str20, "_\"_tset_tset_tset4.5.2.1\"");
        org.junit.Assert.assertNull(codeGenerator21);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tset\"tset4.5.2.\"ContextContext");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tset\"tset4.5.2.\"ContextContext" + "'", str1, "_tset\"tset4.5.2.\"ContextContext");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_tset4.5.2.1", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "tset4.5.2." + "'", str7, "tset4.5.2.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator65 = null;
        java.lang.String str68 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator65, "_tset ", false);
        java.lang.String str70 = python3Target1.getImplicitSetLabel("_tset\"\\\"tset4.5.2.\\\"Context\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator71 = python3Target1.gen;
        java.lang.String str73 = python3Target1.getImplicitSetLabel("\"_tset_tset_tset4.5.2.1\"");
        java.lang.String[] strArray74 = python3Target1.targetCharValueEscape;
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
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "tset" + "'", str68, "tset");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "_tset_tset\"\\\"tset4.5.2.\\\"Context\"" + "'", str70, "_tset_tset\"\\\"tset4.5.2.\\\"Context\"");
        org.junit.Assert.assertNull(codeGenerator71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "_tset\"_tset_tset_tset4.5.2.1\"" + "'", str73, "_tset\"_tset_tset_tset4.5.2.1\"");
        org.junit.Assert.assertNotNull(strArray74);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        java.lang.Class<?> wildcardClass2 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass14 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass13 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass12 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass15 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass16 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        java.lang.Class<?> wildcardClass5 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        java.lang.Class<?> wildcardClass3 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        java.lang.Class<?> wildcardClass6 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        java.lang.Class<?> wildcardClass6 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass17 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        java.lang.Class<?> wildcardClass5 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass13 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        java.lang.Class<?> wildcardClass6 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        java.lang.Class<?> wildcardClass4 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        java.lang.Class<?> wildcardClass8 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass12 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        java.lang.Class<?> wildcardClass8 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        java.lang.Class<?> wildcardClass9 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        java.lang.Class<?> wildcardClass7 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        java.lang.Class<?> wildcardClass8 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass18 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        java.lang.Class<?> wildcardClass10 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass21 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass19 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray4;
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass20 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        java.lang.Class<?> wildcardClass12 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        java.lang.Class<?> wildcardClass10 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        java.lang.Class<?> wildcardClass11 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        java.lang.Class<?> wildcardClass15 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        java.lang.Class<?> wildcardClass14 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        java.lang.Class<?> wildcardClass16 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        java.lang.Class<?> wildcardClass13 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        java.lang.Class<?> wildcardClass17 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass22 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        java.lang.Class<?> wildcardClass9 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        java.lang.Class<?> wildcardClass10 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass14 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        java.lang.Class<?> wildcardClass11 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        java.lang.Class<?> wildcardClass7 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray4;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray4;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray4;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray4;
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        java.lang.Class<?> wildcardClass18 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        java.lang.Class<?> wildcardClass11 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        java.lang.Class<?> wildcardClass12 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        java.lang.Class<?> wildcardClass13 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        java.lang.Class<?> wildcardClass12 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass15 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray4;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray4;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray4;
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        java.lang.Class<?> wildcardClass23 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray4;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray4;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray4;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray4;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray4;
        java.lang.Class<?> wildcardClass10 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        java.lang.Class<?> wildcardClass14 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        java.lang.Class<?> wildcardClass13 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        java.lang.Class<?> wildcardClass15 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray4;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray4;
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray2;
        org.junit.Assert.assertNotNull(strArray2);
    }
}

