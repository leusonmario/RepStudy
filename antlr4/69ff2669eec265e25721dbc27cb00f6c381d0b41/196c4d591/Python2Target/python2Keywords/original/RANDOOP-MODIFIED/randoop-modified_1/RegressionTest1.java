import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
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
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator20);
        boolean boolean22 = python2Target21.supportsOverloadedMethods();
        boolean boolean23 = python2Target21.supportsOverloadedMethods();
        boolean boolean24 = python2Target21.templatesExist();
        boolean boolean25 = python2Target21.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator27);
        boolean boolean29 = python2Target28.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = python2Target28.getCodeGenerator();
        java.lang.String str32 = python2Target28.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.tool.Grammar grammar33 = null;
        int[] intArray34 = new int[] {};
        java.lang.String[] strArray35 = python2Target28.getTokenTypesAsTargetLabels(grammar33, intArray34);
        java.lang.String[] strArray36 = python2Target21.getTokenTypesAsTargetLabels(grammar26, intArray34);
        java.lang.String[] strArray37 = python2Target1.getTokenTypesAsTargetLabels(grammar19, intArray34);
        java.lang.String str40 = python2Target1.getTargetStringLiteralFromString("__tset_tset4.5.2.1", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str7, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tsethi!\"" + "'", str11, "\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"1\"" + "'", str15, "\"1\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_\"\\\\n\"Context" + "'", str17, "_\"\\\\n\"Context");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(codeGenerator30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\\1\"" + "'", str32, "\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[]");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"__tset_tset4.5.2.1\"" + "'", str40, "\"__tset_tset4.5.2.1\"");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        int int9 = python2Target1.getSerializedATNSegmentLimit();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementListName("6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"\\\\n\"Context", false);
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String str13 = python2Target11.getTargetStringLiteralFromString("");
        java.lang.String str15 = python2Target11.getAltLabelContextStructName("\"\\\"_tsetPython2\\\"\"");
        boolean boolean16 = python2Target11.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python2Target11.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        boolean boolean21 = python2Target20.wantsBaseListener();
        java.lang.String str23 = python2Target20.getListLabel("");
        java.lang.String str25 = python2Target20.getTargetStringLiteralFromString("");
        java.lang.String str27 = python2Target20.getListLabel("_tset4.5.2.1");
        java.lang.String str28 = python2Target20.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = python2Target20.getCodeGenerator();
        java.lang.String str31 = python2Target20.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator33);
        boolean boolean35 = python2Target34.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar36 = null;
        int[] intArray37 = new int[] {};
        java.lang.String[] strArray38 = python2Target34.getTokenTypesAsTargetLabels(grammar36, intArray37);
        java.lang.String[] strArray39 = python2Target20.getTokenTypesAsTargetLabels(grammar32, intArray37);
        java.lang.String[] strArray40 = python2Target11.getTokenTypesAsTargetLabels(grammar18, intArray37);
        java.lang.String[] strArray41 = python2Target1.getTokenTypesAsTargetLabels(grammar9, intArray37);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"\\\\\\\\n\\\"Context" + "'", str8, "\\\"\\\\\\\\n\\\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"" + "'", str13, "\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"_tsetPython2\\\"\"Context" + "'", str15, "\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\"" + "'", str25, "\"\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "_tset4.5.2.1" + "'", str27, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Python2" + "'", str28, "Python2");
        org.junit.Assert.assertNull(codeGenerator29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\\\"ython\\\"\"" + "'", str31, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[]");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray41);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str11 = python2Target1.getImplicitSetLabel("_tset\"_tset4.5.2.1\"");
        java.lang.String str12 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tsetContext" + "'", str9, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tset\"_tset4.5.2.1\"" + "'", str11, "_tset_tset\"_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python2" + "'", str12, "Python2");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str5 = python2Target1.getVersion();
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str11 = python2Target1.getListLabel("_tsetPython2");
        java.lang.String str13 = python2Target1.getImplicitRuleLabel("\\\"Contex");
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getLoopLabel(grammarAST14);
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
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("_tsethi!");
        java.lang.String str6 = python2Target1.getListLabel("hi!");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tsethi!" + "'", str4, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("_tset");
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tset" + "'", str6, "__tset");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(ruleFunction6);
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
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
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
        java.lang.String str16 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "__tsetPython2Context" + "'", str15, "__tsetPython2Context");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Python2" + "'", str16, "Python2");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup3 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "tsetPython", true);
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(sTGroup3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"setPytho\"" + "'", str7, "\"setPytho\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#" + "'", str9, "#");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
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
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("_tsetPython2Context", true);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tsethi!\\\"\"" + "'", str10, "\"\\\"_tsethi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_tsetPython2Context\"" + "'", str14, "\"_tsetPython2Context\"");
        org.junit.Assert.assertNotNull(sTGroup15);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1");
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getImplicitTokenLabel("YthonContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str7, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST15);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_tset");
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("\"\\\"ython\\\"\"");
        boolean boolean12 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getLoopCounter(grammarAST13);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("hi");
        boolean boolean11 = python2Target1.templatesExist();
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("_hi");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"1\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getLoopLabel(grammarAST18);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_hi\"" + "'", str13, "\"_hi\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"1\"" + "'", str17, "\"1\"");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        boolean boolean6 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str7 = python2Target1.getListLabel("_tset_tset4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_tset4.5.2.1" + "'", str7, "_tset_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementName("\"hi!\"");
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
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tsetPython2\\\"Contex");
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        int int11 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset4.5.2.1" + "'", str6, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tsetPython2\\\\\\\"Contex\"" + "'", str8, "\"_tsetPython2\\\\\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("_tsethi!");
        boolean boolean5 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("\"_tsetPython2\"");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_\"\\\\n\"Context", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tsethi!" + "'", str4, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"_tsetPython2\"" + "'", str7, "_\"_tsetPython2\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_\\\"\\\\\\\\n\\\"Context\"" + "'", str10, "\"_tset_\\\"\\\\\\\\n\\\"Context\"");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        int int3 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getListLabel("\"d\"Context");
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("thonContex");
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"d\"Context" + "'", str6, "\"d\"Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_thonContex" + "'", str8, "_thonContex");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\\\"_tsetPython2\\\"\"");
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementListName("\"\\\"\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\"_tsetPython2\\\"\"Context" + "'", str5, "\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        boolean boolean19 = python2Target18.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar20 = null;
        int[] intArray21 = new int[] {};
        java.lang.String[] strArray22 = python2Target18.getTokenTypesAsTargetLabels(grammar20, intArray21);
        java.lang.String[] strArray23 = python2Target1.getTokenTypesAsTargetLabels(grammar16, intArray21);
        java.lang.Class<?> wildcardClass24 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"\\\"Context\"Context" + "'", str15, "\"\\\"\\\"Context\"Context");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.tool.Grammar grammar6 = null;
        int[] intArray7 = new int[] {};
        java.lang.String[] strArray8 = python2Target1.getTokenTypesAsTargetLabels(grammar6, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\\1\"" + "'", str5, "\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        java.lang.String str13 = python2Target1.getListLabel("___4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"tset_tse\\\"\"" + "'", str11, "\"\\\"tset_tse\\\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "___4.5.2.1" + "'", str13, "___4.5.2.1");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        boolean boolean5 = python2Target1.wantsBaseListener();
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
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.templatesExist();
        java.lang.String str5 = python2Target1.getLanguage();
        boolean boolean6 = python2Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("Contex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        boolean boolean7 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\\64", false);
        org.antlr.v4.tool.Grammar grammar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getTokenTypeAsTargetLabel(grammar12, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6" + "'", str11, "6");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("\"\\\"ython\\\"\"");
        int int12 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str13 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"ython\\\"\"Context" + "'", str11, "\"\\\"ython\\\"\"Context");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementName("\"__tset_tset4.5.2.1\"");
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
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        boolean boolean13 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getElementName("\\\"\\\\\\\\n\\\"Context");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "@" + "'", str10, "@");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_tset");
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("\"\\\"ython\\\"\"");
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        int int13 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getRuleFunctionContextStructName(ruleFunction14);
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
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getVersion();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
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
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        int int5 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementListName("\"d\"");
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
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("tsetPython");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tsetContext" + "'", str9, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"tsetPython\"" + "'", str11, "\"tsetPython\"");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean6 = python2Target1.templatesExist();
        boolean boolean7 = python2Target1.templatesExist();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getVersion();
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str4 = python2Target1.getVersion();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("4.5.2.1");
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\"\\\"ython\\\"\"", false);
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getVersion();
        int int13 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "@" + "'", str6, "@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\\"ython\\\"" + "'", str10, "\\\"ython\\\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\\\"_tsetPython2\\\"\"");
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\"_tsetPython2\\\"\"Context" + "'", str5, "\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = python2Target1.getImplicitTokenLabel("\"\\\"__tset4.5.2.1\\\"\"");
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
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        boolean boolean6 = python2Target1.wantsBaseListener();
        boolean boolean7 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("\\0");
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
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("hi!");
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!Context" + "'", str11, "Hi!Context");
        org.junit.Assert.assertNotNull(sTGroup12);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\\1", true);
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementListName("\"\\\"hi\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\\1\"" + "'", str7, "\"\\\\1\"");
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target1.getTemplates();
        int int21 = python2Target1.getSerializedATNSegmentLimit();
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
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("4.5.2.1");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("_tsetPython2");
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\"\\\"\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "__tsetPython2" + "'", str7, "__tsetPython2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\"\\\"\\\"\"" + "'", str9, "_tset\"\\\"\\\"\"");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("\\1");
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("_tset\"\\\"_tsetPython2\\\"\"ContextContext");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\\1" + "'", str6, "_\\1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\"\\\"_tsetPython2\\\"\"ContextContextContext" + "'", str9, "_tset\"\\\"_tsetPython2\\\"\"ContextContextContext");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("Hi!Context", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!Context" + "'", str8, "Hi!Context");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
            boolean boolean15 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST14);
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
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        boolean boolean6 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getVersion();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("");
        boolean boolean10 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_" + "'", str9, "_");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.lang.String str4 = python2Target1.getImplicitSetLabel("");
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("\"\\\"_tsethi!\\\"\"");
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset" + "'", str4, "_tset");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"_tsethi!\\\"\"Context" + "'", str6, "\"\\\"_tsethi!\\\"\"Context");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset4.5.2.1", true);
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\\"_tsetPython2\\\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset4.5.2.1\"" + "'", str7, "\"_tset4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\\\\"_tsetPython2\\\\\\\"\"" + "'", str10, "\"\\\\\\\"_tsetPython2\\\\\\\"\"");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "_\"\\\\n\"Context", false);
        boolean boolean12 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\\n\\\"Contex" + "'", str11, "\\\"\\\\n\\\"Contex");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("\"tset\\\"\\\"\\\"\\\"Contex\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementName("\"ython\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\"tset\\\"\\\"\\\"\\\"Contex\"" + "'", str7, "_tset\"tset\\\"\\\"\\\"\\\"Contex\"");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"_tsetPython2\"");
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
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"_tsetPython2\\\"\"" + "'", str9, "\"\\\"_tsetPython2\\\"\"");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset4.5.2.1", true);
        int int8 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset4.5.2.1\"" + "'", str7, "\"_tset4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        boolean boolean14 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet15 = python2Target1.getBadWords();
        java.lang.String str17 = python2Target1.encodeIntAsCharEscape(64);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "@" + "'", str17, "@");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tsetPython2\\\"Contex");
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        boolean boolean11 = python2Target1.templatesExist();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(ruleFunction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset4.5.2.1" + "'", str6, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tsetPython2\\\\\\\"Contex\"" + "'", str8, "\"_tsetPython2\\\\\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("Hi!Context", false);
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("hi");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "\"_tset_\\\"\\\\\\\\n\\\"Context\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getImplicitTokenLabel("\"_\\\"\\\\\\\\n\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!Context" + "'", str8, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_hi" + "'", str10, "_hi");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_tset_\\\"\\\\\\\\n\\\"Context\"" + "'", str14, "\"_tset_\\\"\\\\\\\\n\\\"Context\"");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        boolean boolean7 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        int int4 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("__tsetPython2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"__tsetPython2\"" + "'", str6, "\"__tsetPython2\"");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean6 = python2Target1.templatesExist();
        boolean boolean7 = python2Target1.templatesExist();
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        java.lang.String str10 = python2Target1.getImplicitSetLabel("hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tsethi" + "'", str10, "_tsethi");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        boolean boolean12 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getTokenTypeAsTargetLabel(grammar13, 0);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"tset_tse\\\"\"" + "'", str11, "\"\\\"tset_tse\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\\\"_tsetPython2\\\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getVersion();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\"_tsetPython2\\\"\"Context" + "'", str5, "\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\\\n\"Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getImplicitTokenLabel("\"__tset_tset4.5.2.1\"");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"ContextContext" + "'", str10, "\"\\\\n\"ContextContext");
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        int int13 = python2Target1.getSerializedATNSegmentLimit();
        int int14 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tsethi!\\\"\"" + "'", str10, "\"\\\"_tsethi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_" + "'", str12, "_");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        java.lang.String str16 = python2Target1.getVersion();
        java.lang.String str18 = python2Target1.getTargetStringLiteralFromString("#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\1" + "'", str11, "\\1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi" + "'", str15, "hi");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"#\"" + "'", str18, "\"#\"");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        boolean boolean8 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("\\64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\\64" + "'", str12, "_\\64");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"_tsetPython2\"", false);
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementListName("\"Python2\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\\"_tsetPython2\\\"" + "'", str9, "\\\"_tsetPython2\\\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\"__tset4.5.2.1\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"__tset4.5.2.1\\\"\"" + "'", str10, "\"\\\"__tset4.5.2.1\\\"\"");
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("_tsethi!");
        boolean boolean5 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("\"_tsetPython2\"");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_\"\\\\n\"Context", true);
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tsethi!" + "'", str4, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"_tsetPython2\"" + "'", str7, "_\"_tsetPython2\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_\\\"\\\\\\\\n\\\"Context\"" + "'", str10, "\"_tset_\\\"\\\\\\\\n\\\"Context\"");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str7 = python2Target1.getListLabel("_tset_tset4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str11 = python2Target1.getListLabel("_tset\\\"\\\\\\\"_tsetPython2\\\\\\\"\\\"ContextContext");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(ruleFunction12);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\\\"\\\\\\\"_tsetPython2\\\\\\\"\\\"ContextContext" + "'", str11, "_tset\\\"\\\\\\\"_tsetPython2\\\\\\\"\\\"ContextContext");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromString("_\"_tsetPython2\"");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"_\\\"_tsetPython2\\\"\"" + "'", str16, "\"_\\\"_tsetPython2\\\"\"");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_tset");
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("\"\\\"ython\\\"\"");
        java.lang.String str12 = python2Target1.getLanguage();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_tset" + "'", str9, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_\"\\\"ython\\\"\"" + "'", str11, "_\"\\\"ython\\\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python2" + "'", str12, "Python2");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\\n");
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\\n\"" + "'", str8, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\"_tsethi!\"" + "'", str10, "_\"_tsethi!\"");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("__tsetPython2ContextContext", false);
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__tsetPython2ContextContext" + "'", str8, "__tsetPython2ContextContext");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("_tset");
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("Hi!Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tset" + "'", str6, "__tset");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_Hi!Context" + "'", str10, "_Hi!Context");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getElementName("\"\\\"\\\"\\\"Contex\"");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "@" + "'", str10, "@");
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("\"\\\"ython\\\"\"");
        boolean boolean12 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"ython\\\"\"Context" + "'", str11, "\"\\\"ython\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset4.5.2.1", true);
        int int8 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset4.5.2.1\"" + "'", str7, "\"_tset4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "_tset\"\\\"\\\"\"Context", true);
        java.lang.String str10 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"tset\\\"\\\"\\\"\\\"Contex\"" + "'", str9, "\"tset\\\"\\\"\\\"\\\"Contex\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        boolean boolean7 = python2Target1.templatesExist();
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        java.lang.String str9 = python2Target1.getVersion();
        boolean boolean10 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        int int15 = python2Target1.getSerializedATNSegmentLimit();
        int int16 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"Context" + "'", str10, "\"\\\\n\"Context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset" + "'", str14, "_tset");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean7 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\\1", true);
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("__4.5.2.1");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\\1\"" + "'", str7, "\"\\\\1\"");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "___4.5.2.1" + "'", str10, "___4.5.2.1");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"_tsetPython2\"");
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
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
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"_tsetPython2\\\"\"" + "'", str9, "\"\\\"_tsetPython2\\\"\"");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset4.5.2.1", true);
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getListLabel("___tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset4.5.2.1\"" + "'", str7, "\"_tset4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "___tset4.5.2.1" + "'", str10, "___tset4.5.2.1");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        java.lang.String str12 = python2Target1.getLanguage();
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("_\"\\\"d\\\"Context\"");
        java.lang.String str16 = python2Target1.getImplicitRuleLabel(" ");
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
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"_tsetPython2\\\"\"" + "'", str9, "\"\\\"_tsetPython2\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\"\"" + "'", str11, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python2" + "'", str12, "Python2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_\\\"\\\\\\\"d\\\\\\\"Context\\\"\"" + "'", str14, "\"_\\\"\\\\\\\"d\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_ " + "'", str16, "_ ");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementName("\"_tsetPython2Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "\"\\\\1\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST17);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\\\1" + "'", str16, "\\\\1");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_tset");
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, (int) (byte) 0);
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
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\"Context", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("__tset");
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
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape(1);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        java.lang.String str31 = python2Target1.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Python2" + "'", str31, "Python2");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\\1", true);
        int int8 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\\1\"" + "'", str7, "\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("tset\\\\");
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
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("_tset\"\\\"ython\\\"\"Context");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tset\"\\\"ython\\\"\"Context" + "'", str11, "_tset_tset\"\\\"ython\\\"\"Context");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python2Target1.getVersion();
        java.lang.String str10 = python2Target1.getImplicitSetLabel("\\64");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset\\64" + "'", str10, "_tset\\64");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        java.lang.String str15 = python2Target1.getImplicitSetLabel("_tsetPython2Context");
        boolean boolean16 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "_tset\\\\1", false);
        java.lang.String str22 = python2Target1.getImplicitRuleLabel("___tsetContext");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset_tsetPython2Context" + "'", str15, "_tset_tsetPython2Context");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "tset\\\\" + "'", str20, "tset\\\\");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "____tsetContext" + "'", str22, "____tsetContext");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getRuleFunctionContextStructName(ruleFunction19);
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
        org.junit.Assert.assertNull(codeGenerator18);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.getVersion();
        boolean boolean6 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"_tset_tset\\\"\\\\\\\"_tsetPython2\\\\\\\"\\\"ContextContext\"", false);
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\\"_tset_tset\\\\\\\"\\\\\\\\\\\\\\\"_tsetPython2\\\\\\\\\\\\\\\"\\\\\\\"ContextContext\\\"" + "'", str9, "\\\"_tset_tset\\\\\\\"\\\\\\\\\\\\\\\"_tsetPython2\\\\\\\\\\\\\\\"\\\\\\\"ContextContext\\\"");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("Python2");
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.getListLabel("_\\\\1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python2\"" + "'", str6, "\"Python2\"");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\\\\1" + "'", str9, "_\\\\1");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("\"\\\"\\\"\"Context");
        boolean boolean4 = python2Target1.templatesExist();
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset\"\\\"\\\"\"Context" + "'", str3, "_tset\"\\\"\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
        org.antlr.v4.tool.Rule rule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getRuleFunctionContextStructName(rule16);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\\1", true);
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\\1\"" + "'", str7, "\"\\\\1\"");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str12 = python2Target1.getVersion();
        boolean boolean13 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\1" + "'", str11, "\\1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("4.5.2.1");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("_tsetPython2");
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\"\\\"\\\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "__tsetPython2" + "'", str7, "__tsetPython2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\"\\\"\\\"\"" + "'", str9, "_tset\"\\\"\\\"\"");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("\"\\\"ython\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_\\n", true);
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"ython\\\"\"Context" + "'", str11, "\"\\\"ython\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\n\"" + "'", str15, "\"\\n\"");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getImplicitTokenLabel("_tsetPython2\\\\\\\"Contex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("\"d\"");
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("_tset\"\\\"\\\"\"Context");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        boolean boolean12 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"d\"Context" + "'", str7, "\"d\"Context");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset\"\\\"\\\"\"Context" + "'", str10, "__tset\"\\\"\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("Hi!Context", false);
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getTokenTypeAsTargetLabel(grammar9, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!Context" + "'", str8, "Hi!Context");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getListLabel("hi!");
        java.lang.String str12 = python2Target1.getListLabel("____tsetContextContext");
        int int13 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getElementName("tset\\\"");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "____tsetContextContext" + "'", str12, "____tsetContextContext");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\"Context", false);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"Contex" + "'", str8, "\\\"Contex");
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\"\"Context");
        java.lang.String str11 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"\\\"Context\"" + "'", str10, "\"\\\"\\\"Context\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        boolean boolean15 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str7, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tsethi!\"" + "'", str11, "\"_tsethi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset_tset4.5.2.1" + "'", str14, "_tset_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("hi");
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "\"\\\"\\\"\"Context", true);
        java.lang.String str17 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.encodeIntAsCharEscape(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: 2147483647");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\\n" + "'", str7, "_\\n");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi\"" + "'", str10, "\"hi\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_tsethi!Context" + "'", str12, "_tset_tsethi!Context");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"\\\"\\\"Contex\"" + "'", str16, "\"\\\"\\\"\\\"Contex\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.wantsBaseListener();
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
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("_tset_tset4.5.2.1Context");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_tset4.5.2.1ContextContext" + "'", str7, "_tset_tset4.5.2.1ContextContext");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\\1", true);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\\1\"" + "'", str7, "\"\\\\1\"");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str4 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "ython", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tho" + "'", str8, "tho");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "\"\\\\1\"", false);
        java.lang.String str18 = python2Target1.getImplicitRuleLabel("___tsetContext");
        boolean boolean19 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\\\1" + "'", str16, "\\\\1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "____tsetContext" + "'", str18, "____tsetContext");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromString("\\\"Contex");
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "\"ython\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python2Target1.getElementName("__tsetContext");
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
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\\\\\"Contex\"" + "'", str16, "\"\\\\\\\"Contex\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ython" + "'", str20, "ython");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str7 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1", true);
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementListName("\"hi!\"");
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
        org.junit.Assert.assertNotNull(sTGroup12);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_tset");
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("\"\\\"ython\\\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopCounter(grammarAST12);
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
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "YthonContext", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("_tset_tset4.5.2.1");
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
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"d\"Context", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"d\\\"Context\"" + "'", str8, "\"\\\"d\\\"Context\"");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("@", false);
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("\"_tsethi!\"");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"_tsethi!\\\"\"" + "'", str14, "\"\\\"_tsethi!\\\"\"");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tsetPython2");
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        java.lang.String str12 = python2Target1.getImplicitSetLabel("\"d\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetPython2Context" + "'", str8, "_tsetPython2Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\0" + "'", str10, "\\0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\"d\"" + "'", str12, "_tset\"d\"");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("_tset_\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str7, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_tset_\\\"\\\\\\\"ython\\\\\\\"\\\"\"" + "'", str9, "\"_tset_\\\"\\\\\\\"ython\\\\\\\"\\\"\"");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        boolean boolean8 = python2Target1.wantsBaseListener();
        boolean boolean9 = python2Target1.wantsBaseListener();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\"Context", false);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"Contex" + "'", str8, "\\\"Contex");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("__tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"__tset4.5.2.1\"" + "'", str8, "\"__tset4.5.2.1\"");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("4.5.2.1");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_4.5.2.1" + "'", str12, "_4.5.2.1");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("hi");
        java.lang.String str16 = python2Target1.getVersion();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getRuleFunctionContextStructName(ruleFunction17);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"hi\"" + "'", str15, "\"hi\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean7 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("_tset_\"\\\\n\"Context");
        boolean boolean10 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_tset_\\\"\\\\\\\\n\\\"Context\"" + "'", str9, "\"_tset_\\\"\\\\\\\\n\\\"Context\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"\\n\"", false);
        int int9 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"\\\\n\\\"" + "'", str8, "\\\"\\\\n\\\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\\\"_tsetPython2\\\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        int int8 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementListName("\"\\\\\\\"ython\\\\\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\"_tsetPython2\\\"\"Context" + "'", str5, "\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("_tsetPython2");
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("\"\\\"ython\\\"\"Context");
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_tsetPython2\"" + "'", str9, "\"_tsetPython2\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_\"\\\"ython\\\"\"Context" + "'", str11, "_\"\\\"ython\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str13, "\"\\\"\\\\\\\\1\\\"\"");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_\\\"Contex", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\\\\\\\"Contex\"" + "'", str8, "\"_\\\\\\\"Contex\"");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
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
        org.junit.Assert.assertNull(codeGenerator4);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str4 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "ython", false);
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tho" + "'", str8, "tho");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("\"\\\"_tset_\\\\\\\"\\\\\\\\\\\\\\\\n\\\\\\\"Context\\\"\"");
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getVersion();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getTokenTypeAsTargetLabel(grammar9, 64);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        boolean boolean6 = python2Target1.wantsBaseListener();
        boolean boolean7 = python2Target1.templatesExist();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("_\"\\\"_tsethi!\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "__\"\\\"_tsethi!\\\"\"" + "'", str9, "__\"\\\"_tsethi!\\\"\"");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("__tset_tset4.5.2.1");
        java.lang.String str6 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"__tset_tset4.5.2.1\"" + "'", str5, "\"__tset_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\"Context", false);
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"Contex" + "'", str8, "\\\"Contex");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str5 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("__tsetContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "_\"_tsetPython2\"", true);
        int int12 = python2Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getImplicitTokenLabel("\"\\\"d\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "___tsetContext" + "'", str7, "___tsetContext");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"_tsetPython2\"" + "'", str11, "\"\\\"_tsetPython2\"");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean6 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape(100);
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        boolean boolean7 = python2Target1.templatesExist();
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("\"\\\"\\\"\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\"\\\"Contex\"Context" + "'", str11, "\"\\\"\\\"\\\"Contex\"Context");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("\"\\\"\\\"\"Context");
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset\"\\\"\\\"\"Context" + "'", str3, "_tset\"\\\"\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("\"\\\"\\\\\\\"d\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"d\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"" + "'", str13, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"d\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tsetPython2\\\"Contex");
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        boolean boolean11 = python2Target1.templatesExist();
        boolean boolean12 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset4.5.2.1" + "'", str6, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tsetPython2\\\\\\\"Contex\"" + "'", str8, "\"_tsetPython2\\\\\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python2Target1.getListLabel("_tsetd");
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tsetd" + "'", str6, "_tsetd");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#" + "'", str9, "#");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        boolean boolean7 = python2Target1.templatesExist();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        boolean boolean9 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape(100);
        java.lang.String str16 = python2Target1.getImplicitSetLabel("Hi!Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getElementListName("_tset\"\\\"\\\"\"");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tsetHi!Context" + "'", str16, "_tsetHi!Context");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\"\\\\n\"ContextContext");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\"\\\\n\"ContextContext" + "'", str9, "_tset\"\\\\n\"ContextContext");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("_tset\"\\\"ython\\\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getVersion();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getImplicitSetLabel("");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset" + "'", str10, "_tset");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(rule8);
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
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getTokenTypeAsTargetLabel(grammar4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\\\"_tsetPython2\\\"\"");
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset_tsethi!ContextContext");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\"_tsetPython2\\\"\"Context" + "'", str5, "\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tsethi!ContextContextContext" + "'", str8, "_tset_tsethi!ContextContextContext");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        int int4 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("\"_\\\"\\\\\\\\n\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup6);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        java.lang.String str12 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementName("");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python2" + "'", str12, "Python2");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator20);
        boolean boolean22 = python2Target21.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python2Target21.getCodeGenerator();
        java.lang.String str25 = python2Target21.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.tool.Grammar grammar26 = null;
        int[] intArray27 = new int[] {};
        java.lang.String[] strArray28 = python2Target21.getTokenTypesAsTargetLabels(grammar26, intArray27);
        java.lang.String[] strArray29 = python2Target1.getTokenTypesAsTargetLabels(grammar19, intArray27);
        java.util.Set<java.lang.String> strSet30 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str7, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tsethi!\"" + "'", str11, "\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"1\"" + "'", str15, "\"1\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_\"\\\\n\"Context" + "'", str17, "_\"\\\\n\"Context");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\\\\1\"" + "'", str25, "\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("_\"_tset\\\"\\\\\\\"\\\\\\\"\\\"Context\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"Context\\\"\"" + "'", str11, "\"_\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"Context\\\"\"");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\1" + "'", str11, "\\1");
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str11 = python2Target1.getListLabel("_tsetPython2");
        java.lang.String str13 = python2Target1.getImplicitRuleLabel("\\\"Contex");
        java.lang.String str15 = python2Target1.encodeIntAsCharEscape(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\"\"" + "'", str9, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tsetPython2" + "'", str11, "_tsetPython2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\\\"Contex" + "'", str13, "_\\\"Contex");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\0" + "'", str15, "\\0");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("__tset_tset4.5.2.1", false);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\1" + "'", str11, "\\1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "__tset_tset4.5.2.1" + "'", str14, "__tset_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean6 = python2Target1.templatesExist();
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str4 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator7);
        boolean boolean9 = python2Target8.wantsBaseListener();
        java.lang.String str11 = python2Target8.getListLabel("");
        java.lang.String str13 = python2Target8.getTargetStringLiteralFromString("");
        java.lang.String str15 = python2Target8.getListLabel("_tset4.5.2.1");
        java.lang.String str16 = python2Target8.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python2Target8.getCodeGenerator();
        java.lang.String str19 = python2Target8.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator21);
        boolean boolean23 = python2Target22.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar24 = null;
        int[] intArray25 = new int[] {};
        java.lang.String[] strArray26 = python2Target22.getTokenTypesAsTargetLabels(grammar24, intArray25);
        java.lang.String[] strArray27 = python2Target8.getTokenTypesAsTargetLabels(grammar20, intArray25);
        java.lang.String[] strArray28 = python2Target1.getTokenTypesAsTargetLabels(grammar6, intArray25);
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"" + "'", str13, "\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset4.5.2.1" + "'", str15, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Python2" + "'", str16, "Python2");
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\\\"ython\\\"\"" + "'", str19, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNull(codeGenerator29);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str11 = python2Target1.getLanguage();
        boolean boolean12 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\64" + "'", str8, "\\64");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopCounter(grammarAST9);
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
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        boolean boolean15 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Rule rule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getRuleFunctionContextStructName(rule16);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\\\"_tsetPython2\\\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementName("_tset__hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\"_tsetPython2\\\"\"Context" + "'", str5, "\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("Python2");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getImplicitTokenLabel("_tsetPython2");
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
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
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
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("_tsethi!");
        boolean boolean5 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("\"_tsetPython2\"");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_\"\\\\n\"Context", true);
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass12 = strSet11.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tsethi!" + "'", str4, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"_tsetPython2\"" + "'", str7, "_\"_tsetPython2\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_\\\"\\\\\\\\n\\\"Context\"" + "'", str10, "\"_tset_\\\"\\\\\\\\n\\\"Context\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"_tset_\\\"\\\\\\\\n\\\"Context\"", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_\\\"\\\\\\\\n\\\"Context" + "'", str9, "_tset_\\\"\\\\\\\\n\\\"Context");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_\"\\\"_tset_tset4.5.2.1\\\"\"", false);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getRuleFunctionContextStructName(ruleFunction17);
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
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\\"\\\"_tset_tset4.5.2.1\\\"" + "'", str16, "\\\"\\\"_tset_tset4.5.2.1\\\"");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        boolean boolean5 = python2Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("\"d\"");
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("_tset\"\\\"\\\"\"Context");
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("\\\"_tsetPython2\\\"", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"d\"Context" + "'", str7, "\"d\"Context");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset\"\\\"\\\"\"Context" + "'", str10, "__tset\"\\\"\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\\\\\\"_tsetPython2\\\\\\\"" + "'", str13, "\\\\\\\"_tsetPython2\\\\\\\"");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tsetd" + "'", str9, "_tsetd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        boolean boolean7 = python2Target1.templatesExist();
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        int int11 = python2Target1.getInlineTestSetWordSize();
        int int12 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\n" + "'", str10, "\\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tsetPython2\\\"Contex");
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset4.5.2.1" + "'", str6, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tsetPython2\\\\\\\"Contex\"" + "'", str8, "\"_tsetPython2\\\\\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("_tset_tset4.5.2.1Context");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\"tset_tse\"", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_tset4.5.2.1ContextContext" + "'", str7, "_tset_tset4.5.2.1ContextContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"tset_tse\\\"\"" + "'", str10, "\"\\\"tset_tse\\\"\"");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getLoopLabel(grammarAST14);
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
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("\"\\\"d\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("_tsethi!");
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass11 = strSet10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tsethi!" + "'", str8, "_tset_tsethi!");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        java.lang.String str12 = python2Target1.getLanguage();
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("_\"\\\"d\\\"Context\"");
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getTokenTypeAsTargetLabel(grammar15, 0);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python2" + "'", str12, "Python2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_\\\"\\\\\\\"d\\\\\\\"Context\\\"\"" + "'", str14, "\"_\\\"\\\\\\\"d\\\\\\\"Context\\\"\"");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("__tsetPython2ContextContext", false);
        java.lang.String str9 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("_tset\\64");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__tsetPython2ContextContext" + "'", str8, "__tsetPython2ContextContext");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
            boolean boolean14 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
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
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        boolean boolean5 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tsetd");
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getImplicitTokenLabel("\"__tset4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tsetd\"" + "'", str7, "\"_tsetd\"");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\0" + "'", str10, "\\0");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean4 = python2Target1.templatesExist();
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\\\"\\\\n\\\"Contex");
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\\\\\"\\\\\\\\n\\\\\\\"Contex\"" + "'", str7, "\"\\\\\\\"\\\\\\\\n\\\\\\\"Contex\"");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator12);
        boolean boolean14 = python2Target13.wantsBaseListener();
        java.lang.String str16 = python2Target13.getListLabel("");
        java.lang.String str18 = python2Target13.getTargetStringLiteralFromString("");
        java.lang.String str20 = python2Target13.getListLabel("_tset4.5.2.1");
        java.lang.String str21 = python2Target13.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python2Target13.getCodeGenerator();
        java.lang.String str24 = python2Target13.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator26);
        boolean boolean28 = python2Target27.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar29 = null;
        int[] intArray30 = new int[] {};
        java.lang.String[] strArray31 = python2Target27.getTokenTypesAsTargetLabels(grammar29, intArray30);
        java.lang.String[] strArray32 = python2Target13.getTokenTypesAsTargetLabels(grammar25, intArray30);
        java.lang.String[] strArray33 = python2Target1.getTokenTypesAsTargetLabels(grammar11, intArray30);
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target36 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator35);
        java.lang.String str38 = python2Target36.getTargetStringLiteralFromString("");
        java.lang.String str40 = python2Target36.getAltLabelContextStructName("\"\\\"_tsetPython2\\\"\"");
        boolean boolean41 = python2Target36.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = python2Target36.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar43 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target45 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator44);
        boolean boolean46 = python2Target45.wantsBaseListener();
        java.lang.String str48 = python2Target45.getListLabel("");
        java.lang.String str50 = python2Target45.getTargetStringLiteralFromString("");
        java.lang.String str52 = python2Target45.getListLabel("_tset4.5.2.1");
        java.lang.String str53 = python2Target45.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = python2Target45.getCodeGenerator();
        java.lang.String str56 = python2Target45.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar57 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target59 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator58);
        boolean boolean60 = python2Target59.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar61 = null;
        int[] intArray62 = new int[] {};
        java.lang.String[] strArray63 = python2Target59.getTokenTypesAsTargetLabels(grammar61, intArray62);
        java.lang.String[] strArray64 = python2Target45.getTokenTypesAsTargetLabels(grammar57, intArray62);
        java.lang.String[] strArray65 = python2Target36.getTokenTypesAsTargetLabels(grammar43, intArray62);
        java.lang.String[] strArray66 = python2Target1.getTokenTypesAsTargetLabels(grammar34, intArray62);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tsethi!\\\"\"" + "'", str10, "\"\\\"_tsethi!\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_tset4.5.2.1" + "'", str20, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Python2" + "'", str21, "Python2");
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\\\"ython\\\"\"" + "'", str24, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\"" + "'", str38, "\"\"");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"\\\"_tsetPython2\\\"\"Context" + "'", str40, "\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(codeGenerator42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\"\"" + "'", str50, "\"\"");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "_tset4.5.2.1" + "'", str52, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Python2" + "'", str53, "Python2");
        org.junit.Assert.assertNull(codeGenerator54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\"\\\"ython\\\"\"" + "'", str56, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[]");
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape(0);
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\0" + "'", str11, "\\0");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        java.lang.String str8 = python2Target1.getListLabel("_\\1");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String str13 = python2Target11.getTargetStringLiteralFromString("");
        java.lang.String str15 = python2Target11.getAltLabelContextStructName("\"\\\"_tsetPython2\\\"\"");
        boolean boolean16 = python2Target11.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python2Target11.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        boolean boolean21 = python2Target20.wantsBaseListener();
        java.lang.String str23 = python2Target20.getListLabel("");
        java.lang.String str25 = python2Target20.getTargetStringLiteralFromString("");
        java.lang.String str27 = python2Target20.getListLabel("_tset4.5.2.1");
        java.lang.String str28 = python2Target20.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = python2Target20.getCodeGenerator();
        java.lang.String str31 = python2Target20.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator33);
        boolean boolean35 = python2Target34.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar36 = null;
        int[] intArray37 = new int[] {};
        java.lang.String[] strArray38 = python2Target34.getTokenTypesAsTargetLabels(grammar36, intArray37);
        java.lang.String[] strArray39 = python2Target20.getTokenTypesAsTargetLabels(grammar32, intArray37);
        java.lang.String[] strArray40 = python2Target11.getTokenTypesAsTargetLabels(grammar18, intArray37);
        java.lang.String[] strArray41 = python2Target1.getTokenTypesAsTargetLabels(grammar9, intArray37);
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = python2Target1.getLoopCounter(grammarAST43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\\1" + "'", str8, "_\\1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"" + "'", str13, "\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"_tsetPython2\\\"\"Context" + "'", str15, "\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\"" + "'", str25, "\"\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "_tset4.5.2.1" + "'", str27, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Python2" + "'", str28, "Python2");
        org.junit.Assert.assertNull(codeGenerator29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\\\"ython\\\"\"" + "'", str31, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[]");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNull(codeGenerator42);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getListLabel("");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
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
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator20);
        boolean boolean22 = python2Target21.supportsOverloadedMethods();
        boolean boolean23 = python2Target21.supportsOverloadedMethods();
        boolean boolean24 = python2Target21.templatesExist();
        boolean boolean25 = python2Target21.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator27);
        boolean boolean29 = python2Target28.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = python2Target28.getCodeGenerator();
        java.lang.String str32 = python2Target28.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.tool.Grammar grammar33 = null;
        int[] intArray34 = new int[] {};
        java.lang.String[] strArray35 = python2Target28.getTokenTypesAsTargetLabels(grammar33, intArray34);
        java.lang.String[] strArray36 = python2Target21.getTokenTypesAsTargetLabels(grammar26, intArray34);
        java.lang.String[] strArray37 = python2Target1.getTokenTypesAsTargetLabels(grammar19, intArray34);
        org.antlr.v4.tool.Rule rule38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = python2Target1.getRuleFunctionContextStructName(rule38);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(codeGenerator30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\\1\"" + "'", str32, "\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[]");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "YthonContext", false);
        java.lang.String str10 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("\\\"\\\\n\\\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "thonContex" + "'", str9, "thonContex");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\\"\\\\n\\\"Context" + "'", str13, "\\\"\\\\n\\\"Context");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(ruleFunction9);
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
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str5 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementName("_\\\"ython\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("_tsetPython2Context", true);
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("\\\"ython\\\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getLoopLabel(grammarAST18);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_tsetPython2Context\"" + "'", str14, "\"_tsetPython2Context\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_\\\"ython\\\"" + "'", str16, "_\\\"ython\\\"");
        org.junit.Assert.assertNull(codeGenerator17);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getVersion();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\"\\\"_tsetPython2\\\"\"Context");
        java.lang.String str10 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\"\\\"_tsetPython2\\\"\"Context" + "'", str9, "_tset\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.templatesExist();
        java.lang.String str5 = python2Target1.getLanguage();
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_tsethi!Context");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_tsethi!Context" + "'", str9, "_tset_tsethi!Context");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("4.5.2.1");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("_tsetPython2");
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\"\\\"\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\"\\\"Python2\\\"\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getImplicitTokenLabel("_\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "__tsetPython2" + "'", str7, "__tsetPython2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\"\\\"\\\"\"" + "'", str9, "_tset\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"Python2\\\"\"" + "'", str13, "\"\\\"Python2\\\"\"");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("__tsetPython2ContextContext", false);
        java.lang.String str10 = python2Target1.getListLabel("_tsetPython2\\\"Contex");
        int int11 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__tsetPython2ContextContext" + "'", str8, "__tsetPython2ContextContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tsetPython2\\\"Contex" + "'", str10, "_tsetPython2\\\"Contex");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        boolean boolean12 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"\\\"Context\"" + "'", str10, "\"\\\"\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("_tset");
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean9 = python2Target1.wantsBaseVisitor();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tset" + "'", str6, "__tset");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("\"\\\"\\\"\"Context");
        boolean boolean4 = python2Target1.templatesExist();
        int int5 = python2Target1.getInlineTestSetWordSize();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset\"\\\"\\\"\"Context" + "'", str3, "_tset\"\\\"\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        boolean boolean6 = python2Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("\\\"\\\\\\\\n\\\"Context");
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
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.templatesExist();
        java.lang.String str5 = python2Target1.getLanguage();
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("_tset_tsethi!ContextContext", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_tsethi!ContextContext" + "'", str9, "_tset_tsethi!ContextContext");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getLoopCounter(grammarAST17);
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
        org.junit.Assert.assertNull(codeGenerator16);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.templatesExist();
        java.lang.String str5 = python2Target1.getLanguage();
        int int6 = python2Target1.getInlineTestSetWordSize();
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getTokenTypeAsTargetLabel(grammar9, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape(64);
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getLoopLabel(grammarAST13);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "@" + "'", str11, "@");
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromString("\"__tset4.5.2.1\"");
        int int17 = python2Target1.getSerializedATNSegmentLimit();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"Context" + "'", str10, "\"\\\\n\"Context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"__tset4.5.2.1\"" + "'", str14, "\"__tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"__tset4.5.2.1\\\"\"" + "'", str16, "\"\\\"__tset4.5.2.1\\\"\"");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("\\1");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\\1" + "'", str6, "_\\1");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean4 = python2Target1.templatesExist();
        int int5 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_tset_tset\"\\\"_tsetPython2\\\"\"ContextContext", true);
        boolean boolean13 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getTokenTypeAsTargetLabel(grammar14, 100);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("\"d\"");
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"d\"Context" + "'", str7, "\"d\"Context");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset\"ython\"");
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset\"ython\"Context" + "'", str8, "_tset\"ython\"Context");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.getListLabel("__tsetContext");
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "__tsetContext" + "'", str9, "__tsetContext");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getListLabel("\"\"Context");
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"Context" + "'", str8, "\"\"Context");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("Python2");
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        java.lang.String str8 = python2Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getTokenTypeAsTargetLabel(grammar9, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python2\"" + "'", str6, "\"Python2\"");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        boolean boolean7 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getImplicitTokenLabel("_Hi!Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        boolean boolean7 = python2Target1.templatesExist();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        java.lang.String str10 = python2Target1.getImplicitSetLabel("\\1Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset\\1Context" + "'", str10, "_tset\\1Context");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        java.lang.String str13 = python2Target1.getImplicitRuleLabel("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_" + "'", str13, "_");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("hi");
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset_tsethi!");
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("\"\\\\n\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getLoopCounter(grammarAST15);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_tsethi!Context" + "'", str12, "_tset_tsethi!Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_\"\\\\n\"" + "'", str14, "_\"\\\\n\"");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("__tsetContext");
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset__tsetContext" + "'", str6, "_tset__tsetContext");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
            java.lang.String str13 = python2Target1.getElementName("6Context");
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
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        java.lang.String str15 = python2Target1.getImplicitSetLabel("_tsetPython2Context");
        org.antlr.v4.tool.Rule rule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getRuleFunctionContextStructName(rule16);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset_tsetPython2Context" + "'", str15, "_tset_tsetPython2Context");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("____tsetContext");
        java.lang.String str10 = python2Target1.getImplicitSetLabel("\"\\\"ython\\\"\"");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "____tsetContextContext" + "'", str8, "____tsetContextContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset\"\\\"ython\\\"\"" + "'", str10, "_tset\"\\\"ython\\\"\"");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        java.lang.String str15 = python2Target1.getImplicitSetLabel("_tsetPython2Context");
        java.lang.String str17 = python2Target1.getImplicitRuleLabel("\"\\\"_tset_tset4.5.2.1\\\"\"");
        boolean boolean18 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST19);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset_tsetPython2Context" + "'", str15, "_tset_tsetPython2Context");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_\"\\\"_tset_tset4.5.2.1\\\"\"" + "'", str17, "_\"\\\"_tset_tset4.5.2.1\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getLoopCounter(grammarAST6);
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
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean7 = python2Target1.templatesExist();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "YthonContext", false);
        java.lang.String str10 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementListName("_\"\\\"_tsethi!\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "thonContex" + "'", str9, "thonContex");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("__tset_tset4.5.2.1", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST15);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "__tset_tset4.5.2.1" + "'", str14, "__tset_tset4.5.2.1");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        java.lang.String str12 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        java.lang.String str15 = python2Target1.getListLabel("_tset\"\\\"_tsetPython2\\\"\"ContextContextContext");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getElementName("\"tset\\\"\\\"\\\"\\\"Contex\"");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python2" + "'", str12, "Python2");
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset\"\\\"_tsetPython2\\\"\"ContextContextContext" + "'", str15, "_tset\"\\\"_tsetPython2\\\"\"ContextContextContext");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"_tsetPython2\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("\"_tsetd\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\\"_tsetPython2\\\"" + "'", str9, "\\\"_tsetPython2\\\"");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("_tsethi!");
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementName("\\\"Contex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tsethi!" + "'", str8, "_tset_tsethi!");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean10 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("hi");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "_tset\"ython\"Context", false);
        boolean boolean20 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"_tsetPython2\\\"\"" + "'", str9, "\"\\\"_tsetPython2\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\"\"" + "'", str11, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"ython\"Context" + "'", str13, "\"ython\"Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"hi\"" + "'", str15, "\"hi\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tset\\\"ython\\\"Contex" + "'", str19, "tset\\\"ython\\\"Contex");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("hi");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopLabel(grammarAST11);
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
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("4.5.2.1");
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\"\\\"ython\\\"\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "@" + "'", str6, "@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\\"ython\\\"" + "'", str10, "\\\"ython\\\"");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("hi!");
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.getLanguage();
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
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
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        int int4 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("\\64");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup6);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"\\\\n\"Context", false);
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("tho");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"\\\\\\\\n\\\"Context" + "'", str8, "\\\"\\\\\\\\n\\\"Context");
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getElementName("_tsetdContext");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DContext" + "'", str15, "DContext");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getImplicitTokenLabel("\"\\\\\\\"ython\\\\\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target1.getElementName("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"d\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Rule rule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getRuleFunctionContextStructName(rule13);
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
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("\"d\"");
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        java.lang.String str9 = python2Target1.getLanguage();
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"d\"Context" + "'", str7, "\"d\"Context");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str7 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1", true);
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        java.lang.String str14 = python2Target1.getImplicitSetLabel("\"\\\"\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str10, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset\"\\\"\\\"\"Context" + "'", str14, "_tset\"\\\"\\\"\"Context");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        int int15 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getRuleFunctionContextStructName(ruleFunction16);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str7 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.lang.String str10 = python2Target1.getListLabel("");
        java.lang.String str11 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        boolean boolean7 = python2Target6.wantsBaseListener();
        java.lang.String str9 = python2Target6.getListLabel("");
        java.lang.String str11 = python2Target6.getTargetStringLiteralFromString("");
        java.lang.String str13 = python2Target6.getListLabel("_tset4.5.2.1");
        java.lang.String str14 = python2Target6.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target6.getCodeGenerator();
        java.lang.String str17 = python2Target6.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        boolean boolean21 = python2Target20.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar22 = null;
        int[] intArray23 = new int[] {};
        java.lang.String[] strArray24 = python2Target20.getTokenTypesAsTargetLabels(grammar22, intArray23);
        java.lang.String[] strArray25 = python2Target6.getTokenTypesAsTargetLabels(grammar18, intArray23);
        java.lang.String[] strArray26 = python2Target1.getTokenTypesAsTargetLabels(grammar4, intArray23);
        boolean boolean27 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"" + "'", str11, "\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset4.5.2.1" + "'", str13, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"ython\\\"\"" + "'", str17, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean6 = python2Target1.templatesExist();
        boolean boolean7 = python2Target1.templatesExist();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getImplicitTokenLabel("Tset\\\\Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        boolean boolean7 = python2Target1.templatesExist();
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("tho", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"tho\"" + "'", str12, "\"tho\"");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        boolean boolean14 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet15 = python2Target1.getBadWords();
        java.lang.String str17 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str19 = python2Target1.getTargetStringLiteralFromString("__tsetContext");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "@" + "'", str17, "@");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"__tsetContext\"" + "'", str19, "\"__tsetContext\"");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        boolean boolean7 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, (int) ' ');
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
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tsetd" + "'", str9, "_tsetd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str13 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\1" + "'", str11, "\\1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\1" + "'", str13, "\\1");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("_tset_tset4.5.2.1ContextContext");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_tset4.5.2.1ContextContextContext" + "'", str9, "_tset_tset4.5.2.1ContextContextContext");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset4.5.2.1", true);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\n", true);
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("\"\\\"_tsethi!\\\"\"Context");
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
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset4.5.2.1\"" + "'", str7, "\"_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"" + "'", str10, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"\\\"_tsethi!\\\"\"Context" + "'", str12, "_\"\\\"_tsethi!\\\"\"Context");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_\"\\\\n\"Context");
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"\\\\n\"ContextContext" + "'", str8, "_\"\\\\n\"ContextContext");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "hi", true);
        boolean boolean11 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("\"\\\"ython\\\"\"");
        boolean boolean12 = python2Target1.wantsBaseListener();
        int int13 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"ython\\\"\"Context" + "'", str11, "\"\\\"ython\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("_tsethi!");
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) 'a');
        java.lang.String str7 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tsethi!" + "'", str4, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str5 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getImplicitTokenLabel("_tset_\"\\\\n\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.getTemplates();
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("\\\"ython\\\"");
        java.lang.String str15 = python2Target1.encodeIntAsCharEscape((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\\\\\"ython\\\\\\\"\"" + "'", str13, "\"\\\\\\\"ython\\\\\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\0" + "'", str15, "\\0");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        int int8 = python2Target1.getInlineTestSetWordSize();
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str11 = python2Target1.getListLabel("_tset_tsethi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopLabel(grammarAST12);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tsethi!" + "'", str11, "_tset_tsethi!");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("4.5.2.1");
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\"\\\"ython\\\"\"", false);
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getVersion();
        boolean boolean13 = python2Target1.supportsOverloadedMethods();
        java.lang.String str15 = python2Target1.getListLabel("_tset\\\\1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "@" + "'", str6, "@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\\"ython\\\"" + "'", str10, "\\\"ython\\\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset\\\\1" + "'", str15, "_tset\\\\1");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("\"\\\"ython\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_\\n", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getElementListName("_tset_\"\\\\n\"ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"ython\\\"\"Context" + "'", str11, "\"\\\"ython\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\n\"" + "'", str15, "\"\\n\"");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        boolean boolean13 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getImplicitTokenLabel("DContext");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str7 = python2Target1.getListLabel("_tset_tset4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        java.lang.String str11 = python2Target1.getListLabel("\"\\\"tset_tse\\\"\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(ruleFunction12);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"tset_tse\\\"\"" + "'", str11, "\"\\\"tset_tse\\\"\"");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        java.lang.String str13 = python2Target1.getListLabel("_tset_tsetPython2Context");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_tsetPython2Context" + "'", str13, "_tset_tsetPython2Context");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "Python2", true);
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
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"ython\"" + "'", str9, "\"ython\"");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar3 = null;
        int[] intArray4 = new int[] {};
        java.lang.String[] strArray5 = python2Target1.getTokenTypesAsTargetLabels(grammar3, intArray4);
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.templatesExist();
        java.lang.String str5 = python2Target1.getLanguage();
        boolean boolean6 = python2Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementName("\\1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("\"\\\"\\\"\"Context");
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("__hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset\"\\\"\\\"\"Context" + "'", str3, "_tset\"\\\"\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "__hi!Context" + "'", str7, "__hi!Context");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("4.5.2.1");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("_tsetPython2");
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\"\\\"\\\"\"");
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean11 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "__tsetPython2" + "'", str7, "__tsetPython2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\"\\\"\\\"\"" + "'", str9, "_tset\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\\\"ython\\\"\"");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\"ython\\\"\"Context" + "'", str5, "\"\\\"ython\\\"\"Context");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromString("\\\"Contex");
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "\"ython\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST21);
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
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\\\\\"Contex\"" + "'", str16, "\"\\\\\\\"Contex\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ython" + "'", str20, "ython");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str7 = python2Target1.getListLabel("_tset_tset4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        int int9 = python2Target1.getInlineTestSetWordSize();
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("\\\"Contex", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_tset4.5.2.1" + "'", str7, "_tset_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\\\\\\"Contex" + "'", str13, "\\\\\\\"Contex");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("__tsetPython2ContextContext");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "__tsetPython2ContextContextContext" + "'", str12, "__tsetPython2ContextContextContext");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        boolean boolean7 = python2Target6.wantsBaseListener();
        java.lang.String str9 = python2Target6.getListLabel("");
        java.lang.String str11 = python2Target6.getTargetStringLiteralFromString("");
        java.lang.String str13 = python2Target6.getListLabel("_tset4.5.2.1");
        java.lang.String str14 = python2Target6.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target6.getCodeGenerator();
        java.lang.String str17 = python2Target6.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        boolean boolean21 = python2Target20.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar22 = null;
        int[] intArray23 = new int[] {};
        java.lang.String[] strArray24 = python2Target20.getTokenTypesAsTargetLabels(grammar22, intArray23);
        java.lang.String[] strArray25 = python2Target6.getTokenTypesAsTargetLabels(grammar18, intArray23);
        java.lang.String[] strArray26 = python2Target1.getTokenTypesAsTargetLabels(grammar4, intArray23);
        boolean boolean27 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = python2Target1.getTokenTypeAsTargetLabel(grammar28, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"" + "'", str11, "\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset4.5.2.1" + "'", str13, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"ython\\\"\"" + "'", str17, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        boolean boolean6 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("\"_tsetPython2\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getImplicitSetLabel("d");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementListName("_\\\"Contex");
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
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.templatesExist();
        java.lang.String str5 = python2Target1.getLanguage();
        boolean boolean6 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\1" + "'", str8, "\\1");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tsethi!");
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        java.lang.String str9 = python2Target1.getVersion();
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tsethi!\"" + "'", str6, "\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_" + "'", str11, "_");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator7);
        boolean boolean9 = python2Target8.wantsBaseListener();
        boolean boolean10 = python2Target8.wantsBaseVisitor();
        java.lang.String str11 = python2Target8.getVersion();
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target8.getTemplates();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        boolean boolean16 = python2Target15.wantsBaseListener();
        java.lang.String str18 = python2Target15.getListLabel("");
        java.lang.String str20 = python2Target15.getTargetStringLiteralFromString("");
        java.lang.String str22 = python2Target15.getListLabel("_tset4.5.2.1");
        java.lang.String str23 = python2Target15.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python2Target15.getCodeGenerator();
        java.lang.String str26 = python2Target15.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target29 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator28);
        boolean boolean30 = python2Target29.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar31 = null;
        int[] intArray32 = new int[] {};
        java.lang.String[] strArray33 = python2Target29.getTokenTypesAsTargetLabels(grammar31, intArray32);
        java.lang.String[] strArray34 = python2Target15.getTokenTypesAsTargetLabels(grammar27, intArray32);
        java.lang.String[] strArray35 = python2Target8.getTokenTypesAsTargetLabels(grammar13, intArray32);
        java.lang.String[] strArray36 = python2Target1.getTokenTypesAsTargetLabels(grammar6, intArray32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"" + "'", str20, "\"\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "_tset4.5.2.1" + "'", str22, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Python2" + "'", str23, "Python2");
        org.junit.Assert.assertNull(codeGenerator24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\\\"ython\\\"\"" + "'", str26, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getListLabel("_\"\\\\n\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\"\\\\n\"" + "'", str10, "_\"\\\\n\"");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_tset");
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("\"\\\"ython\\\"\"");
        int int12 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementName("\"_tset_tset4.5.2.1\"");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        java.lang.Class<?> wildcardClass16 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "__tsetPython2Context" + "'", str15, "__tsetPython2Context");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("_tsetPython2\\\"Contex", false);
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tsetPython2\\\\\\\"Contex" + "'", str9, "_tsetPython2\\\\\\\"Contex");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tsethi!");
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        boolean boolean13 = python2Target12.wantsBaseListener();
        java.lang.String str15 = python2Target12.getListLabel("");
        java.lang.String str17 = python2Target12.getTargetStringLiteralFromString("");
        java.lang.String str19 = python2Target12.getListLabel("_tset4.5.2.1");
        java.lang.String str20 = python2Target12.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python2Target12.getCodeGenerator();
        java.util.Set<java.lang.String> strSet22 = python2Target12.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python2Target12.getCodeGenerator();
        boolean boolean24 = python2Target12.templatesExist();
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator26);
        boolean boolean28 = python2Target27.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = python2Target27.getCodeGenerator();
        java.lang.String str31 = python2Target27.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.tool.Grammar grammar32 = null;
        int[] intArray33 = new int[] {};
        java.lang.String[] strArray34 = python2Target27.getTokenTypesAsTargetLabels(grammar32, intArray33);
        java.lang.String[] strArray35 = python2Target12.getTokenTypesAsTargetLabels(grammar25, intArray33);
        java.lang.String[] strArray36 = python2Target1.getTokenTypesAsTargetLabels(grammar10, intArray33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = python2Target1.getElementName("_tset_tset4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tsethi!\"" + "'", str6, "\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset4.5.2.1" + "'", str19, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Python2" + "'", str20, "Python2");
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(codeGenerator29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\\\\1\"" + "'", str31, "\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("ython");
        int int10 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "YthonContext" + "'", str9, "YthonContext");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        boolean boolean13 = python2Target1.templatesExist();
        boolean boolean14 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_tset");
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("\"\\\"ython\\\"\"");
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        boolean boolean13 = python2Target1.templatesExist();
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("_\"\\\"ython\\\"\"Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getElementListName("\"\\\"\\\"Context\"");
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
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"_\\\"\\\\\\\"ython\\\\\\\"\\\"Context\"" + "'", str15, "\"_\\\"\\\\\\\"ython\\\\\\\"\\\"Context\"");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str8 = python2Target1.getListLabel("\"_tsetd\"Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tsetd\"Context" + "'", str8, "\"_tsetd\"Context");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getVersion();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementListName("\"tset\\\"\\\"\\\"\\\"Contex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("_tsetPython2Context", true);
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("\\\"ython\\\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python2Target1.getCodeGenerator();
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
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tsethi!\\\"\"" + "'", str10, "\"\\\"_tsethi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_tsetPython2Context\"" + "'", str14, "\"_tsetPython2Context\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_\\\"ython\\\"" + "'", str16, "_\\\"ython\\\"");
        org.junit.Assert.assertNull(codeGenerator17);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape(10);
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\"\\\\1\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"\\\\1\"" + "'", str11, "_tset\"\\\\1\"");
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        boolean boolean12 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        boolean boolean16 = python2Target15.wantsBaseListener();
        int int17 = python2Target15.getInlineTestSetWordSize();
        java.lang.String str19 = python2Target15.encodeIntAsCharEscape((int) (byte) 100);
        boolean boolean20 = python2Target15.supportsOverloadedMethods();
        int int21 = python2Target15.getSerializedATNSegmentLimit();
        boolean boolean22 = python2Target15.supportsOverloadedMethods();
        java.lang.String str23 = python2Target15.getLanguage();
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator25);
        boolean boolean27 = python2Target26.wantsBaseListener();
        boolean boolean28 = python2Target26.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar29 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator30);
        boolean boolean32 = python2Target31.wantsBaseListener();
        java.lang.String str34 = python2Target31.getListLabel("");
        java.lang.String str36 = python2Target31.getTargetStringLiteralFromString("");
        java.lang.String str38 = python2Target31.getListLabel("_tset4.5.2.1");
        java.lang.String str39 = python2Target31.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = python2Target31.getCodeGenerator();
        java.lang.String str42 = python2Target31.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar43 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target45 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator44);
        boolean boolean46 = python2Target45.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar47 = null;
        int[] intArray48 = new int[] {};
        java.lang.String[] strArray49 = python2Target45.getTokenTypesAsTargetLabels(grammar47, intArray48);
        java.lang.String[] strArray50 = python2Target31.getTokenTypesAsTargetLabels(grammar43, intArray48);
        java.lang.String[] strArray51 = python2Target26.getTokenTypesAsTargetLabels(grammar29, intArray48);
        java.lang.String[] strArray52 = python2Target15.getTokenTypesAsTargetLabels(grammar24, intArray48);
        java.lang.String[] strArray53 = python2Target1.getTokenTypesAsTargetLabels(grammar13, intArray48);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d" + "'", str19, "d");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Python2" + "'", str23, "Python2");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"\"" + "'", str36, "\"\"");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "_tset4.5.2.1" + "'", str38, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Python2" + "'", str39, "Python2");
        org.junit.Assert.assertNull(codeGenerator40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\"\\\"ython\\\"\"" + "'", str42, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[]");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("\"\\\"\\\"\"Context");
        boolean boolean4 = python2Target1.templatesExist();
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass6 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset\"\\\"\\\"\"Context" + "'", str3, "_tset\"\\\"\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("\"\\\"\\\"\"Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getElementName("__\"\\\"_tsethi!\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset\"\\\"\\\"\"Context" + "'", str3, "_tset\"\\\"\\\"\"Context");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("__tsetContext");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("\"hi\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset__tsetContext" + "'", str6, "_tset__tsetContext");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        java.lang.String str15 = python2Target1.getListLabel("\\\"_tsetPython2\\\"");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\1" + "'", str11, "\\1");
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"_tsetPython2\\\"" + "'", str15, "\\\"_tsetPython2\\\"");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        boolean boolean7 = python2Target1.templatesExist();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("__tset_tset4.5.2.1", false);
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        boolean boolean16 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getTokenTypeAsTargetLabel(grammar17, 0);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "__tset_tset4.5.2.1" + "'", str14, "__tset_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        boolean boolean19 = python2Target18.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar20 = null;
        int[] intArray21 = new int[] {};
        java.lang.String[] strArray22 = python2Target18.getTokenTypesAsTargetLabels(grammar20, intArray21);
        java.lang.String[] strArray23 = python2Target1.getTokenTypesAsTargetLabels(grammar16, intArray21);
        boolean boolean24 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python2Target1.getLoopCounter(grammarAST25);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"Context" + "'", str10, "\"\\\\n\"Context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset" + "'", str14, "_tset");
        org.junit.Assert.assertNotNull(sTGroup15);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tsetPython2");
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        boolean boolean11 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetPython2Context" + "'", str8, "_tsetPython2Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\0" + "'", str10, "\\0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        java.lang.String str14 = python2Target1.getImplicitSetLabel("\\1Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset\\1Context" + "'", str14, "_tset\\1Context");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape(10);
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\"\\\\1\"");
        boolean boolean12 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"\\\\1\"" + "'", str11, "_tset\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_\"\\\\n\"Context");
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"\\\\n\"ContextContext" + "'", str8, "_\"\\\\n\"ContextContext");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopCounter(grammarAST12);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"\\\"Context\"" + "'", str10, "\"\\\"\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("\"tset\\\"\\\"\\\"\\\"Contex\"");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("", false);
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
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\"tset\\\"\\\"\\\"\\\"Contex\"" + "'", str7, "_tset\"tset\\\"\\\"\\\"\\\"Contex\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean7 = python2Target1.wantsBaseListener();
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        boolean boolean9 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("__tsetPython2ContextContext");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "__tsetPython2ContextContextContext" + "'", str12, "__tsetPython2ContextContextContext");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        int int8 = python2Target1.getInlineTestSetWordSize();
        boolean boolean9 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("_tset\\\\1");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        java.lang.String str16 = python2Target1.encodeIntAsCharEscape(0);
        java.util.Set<java.lang.String> strSet17 = python2Target1.getBadWords();
        int int18 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\0" + "'", str16, "\\0");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("_tsethi!");
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("\"\\\"\\\"\"");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tsethi!" + "'", str4, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"\\\"\"Context" + "'", str6, "\"\\\"\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean7 = python2Target1.wantsBaseListener();
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementName("\"\\\\1Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("_");
        java.lang.String str13 = python2Target1.getImplicitSetLabel("_tset_tsetHi!Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_\"" + "'", str11, "\"_\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_tset_tsetHi!Context" + "'", str13, "_tset_tset_tsetHi!Context");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        boolean boolean7 = python2Target1.templatesExist();
        java.lang.String str8 = python2Target1.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getElementName("\\\"\\\\\\\\n\\\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("4.5.2.1");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("_tsetPython2");
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "__tsetPython2" + "'", str7, "__tsetPython2");
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromString("\"__tset4.5.2.1\"");
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator18);
        boolean boolean20 = python2Target19.wantsBaseListener();
        java.lang.String str22 = python2Target19.getListLabel("4.5.2.1");
        int int23 = python2Target19.getInlineTestSetWordSize();
        java.lang.String str25 = python2Target19.encodeIntAsCharEscape((int) '#');
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator27);
        boolean boolean29 = python2Target28.wantsBaseListener();
        boolean boolean30 = python2Target28.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target33 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator32);
        boolean boolean34 = python2Target33.wantsBaseListener();
        java.lang.String str36 = python2Target33.getListLabel("");
        java.lang.String str38 = python2Target33.getTargetStringLiteralFromString("");
        java.lang.String str40 = python2Target33.getListLabel("_tset4.5.2.1");
        java.lang.String str41 = python2Target33.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = python2Target33.getCodeGenerator();
        java.lang.String str44 = python2Target33.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar45 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target47 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator46);
        boolean boolean48 = python2Target47.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar49 = null;
        int[] intArray50 = new int[] {};
        java.lang.String[] strArray51 = python2Target47.getTokenTypesAsTargetLabels(grammar49, intArray50);
        java.lang.String[] strArray52 = python2Target33.getTokenTypesAsTargetLabels(grammar45, intArray50);
        java.lang.String[] strArray53 = python2Target28.getTokenTypesAsTargetLabels(grammar31, intArray50);
        java.lang.String[] strArray54 = python2Target19.getTokenTypesAsTargetLabels(grammar26, intArray50);
        java.lang.String[] strArray55 = python2Target1.getTokenTypesAsTargetLabels(grammar17, intArray50);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"Context" + "'", str10, "\"\\\\n\"Context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"__tset4.5.2.1\"" + "'", str14, "\"__tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"__tset4.5.2.1\\\"\"" + "'", str16, "\"\\\"__tset4.5.2.1\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#" + "'", str25, "#");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\"" + "'", str38, "\"\"");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "_tset4.5.2.1" + "'", str40, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Python2" + "'", str41, "Python2");
        org.junit.Assert.assertNull(codeGenerator42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\"\\\"ython\\\"\"" + "'", str44, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[]");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray55);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.getLanguage();
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "_tsetPython2", true);
        java.lang.String str15 = python2Target1.getImplicitRuleLabel("tsethi");
        java.lang.String str16 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"tsetPython\"" + "'", str13, "\"tsetPython\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tsethi" + "'", str15, "_tsethi");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Python2" + "'", str16, "Python2");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\"_tsetPython2Context\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "_tset_tsethi!ContextContext", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tsetPython2Context" + "'", str10, "_tsetPython2Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"tset_tsethi!ContextContex\"" + "'", str14, "\"tset_tsethi!ContextContex\"");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_tset");
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("\"\\\"ython\\\"\"");
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        boolean boolean13 = python2Target1.templatesExist();
        java.lang.String str14 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_tset" + "'", str9, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_\"\\\"ython\\\"\"" + "'", str11, "_\"\\\"ython\\\"\"");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(sTGroup15);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        boolean boolean5 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tsetd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("___4.5.2.1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tsetd\"" + "'", str7, "\"_tsetd\"");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("hi");
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "\"\\\"\\\"\"Context", true);
        boolean boolean17 = python2Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getElementListName("\\\"_tset_tset\\\\\\\"\\\\\\\\\\\\\\\"_tsetPython2\\\\\\\\\\\\\\\"\\\\\\\"ContextContext\\\"");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_tsethi!Context" + "'", str12, "_tset_tsethi!Context");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"\\\"\\\"Contex\"" + "'", str16, "\"\\\"\\\"\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("_tsetPython2\\\"Contex", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("DContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tsetPython2\\\\\\\"Contex" + "'", str9, "_tsetPython2\\\\\\\"Contex");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean6 = python2Target1.templatesExist();
        boolean boolean7 = python2Target1.templatesExist();
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str10 = python2Target1.getImplicitSetLabel("\"\\\"\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset\"\\\"\\\"\"Context" + "'", str10, "_tset\"\\\"\\\"\"Context");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("_tsethi!");
        boolean boolean5 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getListLabel("_tset___4.5.2.1");
        java.lang.String str9 = python2Target1.getImplicitSetLabel("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tsethi!" + "'", str4, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset___4.5.2.1" + "'", str7, "_tset___4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset" + "'", str9, "_tset");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("_thonContexContext");
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "__thonContexContext" + "'", str11, "__thonContexContext");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean7 = python2Target1.wantsBaseListener();
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        boolean boolean9 = python2Target1.templatesExist();
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementListName("_tset\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("_tset_tset4.5.2.1");
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        boolean boolean11 = python2Target10.wantsBaseListener();
        java.lang.String str13 = python2Target10.getListLabel("");
        java.lang.String str15 = python2Target10.getTargetStringLiteralFromString("");
        java.lang.String str17 = python2Target10.getListLabel("_tset4.5.2.1");
        java.lang.String str18 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python2Target10.getCodeGenerator();
        java.util.Set<java.lang.String> strSet20 = python2Target10.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python2Target10.getCodeGenerator();
        java.lang.String str22 = python2Target10.getVersion();
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator24);
        boolean boolean26 = python2Target25.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar27 = null;
        int[] intArray28 = new int[] {};
        java.lang.String[] strArray29 = python2Target25.getTokenTypesAsTargetLabels(grammar27, intArray28);
        java.lang.String[] strArray30 = python2Target10.getTokenTypesAsTargetLabels(grammar23, intArray28);
        java.lang.String[] strArray31 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray28);
        int int32 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean33 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = python2Target1.getElementListName("\\\\\\\"_tsetPython2\\\\\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tset_tset4.5.2.1" + "'", str6, "__tset_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\"" + "'", str15, "\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset4.5.2.1" + "'", str17, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNull(codeGenerator19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[]");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        boolean boolean7 = python2Target6.wantsBaseListener();
        java.lang.String str9 = python2Target6.getListLabel("");
        java.lang.String str11 = python2Target6.getTargetStringLiteralFromString("");
        java.lang.String str13 = python2Target6.getListLabel("_tset4.5.2.1");
        java.lang.String str14 = python2Target6.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target6.getCodeGenerator();
        java.lang.String str17 = python2Target6.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        boolean boolean21 = python2Target20.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar22 = null;
        int[] intArray23 = new int[] {};
        java.lang.String[] strArray24 = python2Target20.getTokenTypesAsTargetLabels(grammar22, intArray23);
        java.lang.String[] strArray25 = python2Target6.getTokenTypesAsTargetLabels(grammar18, intArray23);
        java.lang.String[] strArray26 = python2Target1.getTokenTypesAsTargetLabels(grammar4, intArray23);
        int int27 = python2Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = python2Target1.encodeIntAsCharEscape(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: 2147483647");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"" + "'", str11, "\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset4.5.2.1" + "'", str13, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"ython\\\"\"" + "'", str17, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        int int8 = python2Target1.getInlineTestSetWordSize();
        boolean boolean9 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.lang.String str11 = python2Target1.getVersion();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getImplicitSetLabel("_tset\"\\\"_tsetPython2\\\"\"ContextContext");
        java.lang.String str12 = python2Target1.getListLabel("\"\\\"hi\\\"\"");
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset_tset\"\\\"_tsetPython2\\\"\"ContextContext" + "'", str10, "_tset_tset\"\\\"_tsetPython2\\\"\"ContextContext");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"hi\\\"\"" + "'", str12, "\"\\\"hi\\\"\"");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_tset_tset", true);
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"tset_tse\"" + "'", str8, "\"tset_tse\"");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_hi!" + "'", str8, "_hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("hi");
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset_tsethi!");
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("\"\\\\n\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getLoopLabel(grammarAST15);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_tsethi!Context" + "'", str12, "_tset_tsethi!Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_\"\\\\n\"" + "'", str14, "_\"\\\\n\"");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\"\"Context");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"\\\"Context\"" + "'", str10, "\"\\\"\\\"Context\"");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str7 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1", true);
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getLoopCounter(grammarAST13);
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
        org.junit.Assert.assertNotNull(sTGroup12);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getElementName("__tsetPython2ContextContext");
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
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getVersion();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("\"_\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"Context\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean6 = python2Target1.templatesExist();
        boolean boolean7 = python2Target1.templatesExist();
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("\"d\"");
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(rule9);
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
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"_tsetPython2\\\\\\\"Contex\"", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"_tsetPython2\\\\\\\\\\\\\\\"Contex\\\"" + "'", str8, "\\\"_tsetPython2\\\\\\\\\\\\\\\"Contex\\\"");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        boolean boolean8 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape(64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getImplicitTokenLabel("_#");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "@" + "'", str10, "@");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1");
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) ' ');
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
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str7, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        java.lang.String str10 = python2Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator12);
        boolean boolean14 = python2Target13.wantsBaseListener();
        java.lang.String str16 = python2Target13.getListLabel("");
        java.lang.String str18 = python2Target13.getTargetStringLiteralFromString("");
        java.lang.String str20 = python2Target13.getListLabel("_tset4.5.2.1");
        java.lang.String str21 = python2Target13.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python2Target13.getCodeGenerator();
        java.lang.String str24 = python2Target13.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator26);
        boolean boolean28 = python2Target27.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar29 = null;
        int[] intArray30 = new int[] {};
        java.lang.String[] strArray31 = python2Target27.getTokenTypesAsTargetLabels(grammar29, intArray30);
        java.lang.String[] strArray32 = python2Target13.getTokenTypesAsTargetLabels(grammar25, intArray30);
        java.lang.String[] strArray33 = python2Target1.getTokenTypesAsTargetLabels(grammar11, intArray30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_tset4.5.2.1" + "'", str20, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Python2" + "'", str21, "Python2");
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\\\"ython\\\"\"" + "'", str24, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.lang.String str7 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset4.5.2.1", true);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\\n", true);
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("\"\\\"_tsethi!\\\"\"Context");
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("\\0", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset4.5.2.1\"" + "'", str7, "\"_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"" + "'", str10, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"\\\"_tsethi!\\\"\"Context" + "'", str12, "_\"\\\"_tsethi!\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\\0\"" + "'", str15, "\"\\\\0\"");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("Python2");
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        boolean boolean8 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementListName("\"_tset_\\\"\\\\\\\\n\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python2\"" + "'", str6, "\"Python2\"");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("tsethi", false);
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "tsethi" + "'", str10, "tsethi");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tsethi!");
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        java.lang.String str9 = python2Target1.getVersion();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tsethi!\"" + "'", str6, "\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_tset");
        java.lang.String str10 = python2Target1.getLanguage();
        boolean boolean11 = python2Target1.wantsBaseListener();
        java.lang.String str12 = python2Target1.getLanguage();
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("\"_tsetPython2Context\"");
        java.lang.String str16 = python2Target1.getListLabel("\"__tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_tset" + "'", str9, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python2" + "'", str12, "Python2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"_tsetPython2Context\\\"\"" + "'", str14, "\"\\\"_tsetPython2Context\\\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"__tset4.5.2.1\"" + "'", str16, "\"__tset4.5.2.1\"");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str9 = python2Target1.getVersion();
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("\"\\\"\\\"\\\"Contex\"");
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_hi!" + "'", str8, "_hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_\"\\\"\\\"\\\"Contex\"" + "'", str11, "_\"\\\"\\\"\\\"Contex\"");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        boolean boolean5 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str5 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("__tsetContext");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementName("\"\\\"_tsethi!\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "___tsetContext" + "'", str7, "___tsetContext");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String str16 = python2Target14.getTargetStringLiteralFromString("");
        java.lang.String str17 = python2Target14.getLanguage();
        java.util.Set<java.lang.String> strSet18 = python2Target14.getBadWords();
        boolean boolean19 = python2Target14.wantsBaseVisitor();
        int int20 = python2Target14.getInlineTestSetWordSize();
        java.lang.String str22 = python2Target14.encodeIntAsCharEscape(10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python2Target14.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "_tsetPython2", false);
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target29 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator28);
        boolean boolean30 = python2Target29.supportsOverloadedMethods();
        boolean boolean31 = python2Target29.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        java.lang.String str35 = python2Target29.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator32, "", true);
        java.lang.String str36 = python2Target29.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = python2Target29.getCodeGenerator();
        java.lang.String str40 = python2Target29.getTargetStringLiteralFromString("@", false);
        boolean boolean41 = python2Target29.templatesExist();
        java.lang.String str43 = python2Target29.getAltLabelContextStructName("\"\\\"\\\"Context\"");
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target46 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator45);
        boolean boolean47 = python2Target46.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar48 = null;
        int[] intArray49 = new int[] {};
        java.lang.String[] strArray50 = python2Target46.getTokenTypesAsTargetLabels(grammar48, intArray49);
        java.lang.String[] strArray51 = python2Target29.getTokenTypesAsTargetLabels(grammar44, intArray49);
        java.lang.String[] strArray52 = python2Target14.getTokenTypesAsTargetLabels(grammar27, intArray49);
        java.lang.String[] strArray53 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray49);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\\n" + "'", str22, "\\n");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "tsetPython" + "'", str26, "tsetPython");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"" + "'", str35, "\"\"");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Python2" + "'", str36, "Python2");
        org.junit.Assert.assertNull(codeGenerator37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "@" + "'", str40, "@");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"\\\"\\\"Context\"Context" + "'", str43, "\"\\\"\\\"Context\"Context");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[]");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("_tsetPython2Context", true);
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("\\\"ython\\\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python2Target1.getCodeGenerator();
        java.lang.String str18 = python2Target1.getLanguage();
        java.lang.String str19 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tsethi!\\\"\"" + "'", str10, "\"\\\"_tsethi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_tsetPython2Context\"" + "'", str14, "\"_tsetPython2Context\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_\\\"ython\\\"" + "'", str16, "_\\\"ython\\\"");
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "\"\\\\1\"", false);
        java.lang.String str18 = python2Target1.getImplicitRuleLabel("___tsetContext");
        boolean boolean19 = python2Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python2Target1.getElementName("\\\\\\\"_tsetPython2\\\\\\\"");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\\\1" + "'", str16, "\\\\1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "____tsetContext" + "'", str18, "____tsetContext");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator20);
        boolean boolean22 = python2Target21.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python2Target21.getCodeGenerator();
        java.lang.String str25 = python2Target21.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.tool.Grammar grammar26 = null;
        int[] intArray27 = new int[] {};
        java.lang.String[] strArray28 = python2Target21.getTokenTypesAsTargetLabels(grammar26, intArray27);
        java.lang.String[] strArray29 = python2Target1.getTokenTypesAsTargetLabels(grammar19, intArray27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = python2Target1.getElementName("_\\\"Contex");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\\\\1\"" + "'", str25, "\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str5 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\\\"\\\"\"", true);
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("_tsetPython2ContextContex");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\"\"" + "'", str9, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tsetPython2ContextContexContext" + "'", str11, "_tsetPython2ContextContexContext");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str4 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "ython", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tho" + "'", str8, "tho");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        boolean boolean6 = python2Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("_thonContexContext");
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
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean6 = python2Target1.templatesExist();
        boolean boolean7 = python2Target1.templatesExist();
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset\\0", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementListName("_tset\"tsetPython\"");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "tset0" + "'", str12, "tset0");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_tset");
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("\"\\\"ython\\\"\"");
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        int int13 = python2Target1.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_tset" + "'", str9, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_\"\\\"ython\\\"\"" + "'", str11, "_\"\\\"ython\\\"\"");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        boolean boolean14 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet15 = python2Target1.getBadWords();
        java.lang.String str17 = python2Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "@" + "'", str17, "@");
        org.junit.Assert.assertNull(codeGenerator18);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        int int8 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("#");
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (byte) 0);
        int int11 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_#" + "'", str7, "_#");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\0" + "'", str10, "\\0");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str11 = python2Target1.getListLabel("_tsetPython2");
        java.lang.String str13 = python2Target1.getImplicitRuleLabel("\\\"Contex");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\"\"" + "'", str9, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tsetPython2" + "'", str11, "_tsetPython2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\\\"Contex" + "'", str13, "_\\\"Contex");
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        java.lang.String str12 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tsethi!\\\"\"" + "'", str10, "\"\\\"_tsethi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset" + "'", str12, "_tset");
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python2Target1.getElementName("tsetPython");
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
        org.junit.Assert.assertNull(codeGenerator21);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("__tsetPython2ContextContext");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementListName("_thonContex");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "__tsetPython2ContextContextContext" + "'", str12, "__tsetPython2ContextContextContext");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python2Target1.getCodeGenerator();
        java.lang.String str24 = python2Target1.getTargetStringLiteralFromString("tset\\\"ython\\\"Contex", false);
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
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "tset\\\\\\\"ython\\\\\\\"Contex" + "'", str24, "tset\\\\\\\"ython\\\\\\\"Contex");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\\\"_tsetPython2\\\"\"");
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset_tsethi!ContextContext");
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape(0);
        boolean boolean11 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass14 = strSet13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\"_tsetPython2\\\"\"Context" + "'", str5, "\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tsethi!ContextContextContext" + "'", str8, "_tset_tsethi!ContextContextContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\0" + "'", str10, "\\0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getLoopCounter(grammarAST15);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        int int15 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getElementListName("_\"\\\"\\\"\\\"Contex\"");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        int int5 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getImplicitTokenLabel("_tsetPython2\\\"ContexContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getElementName("tsetPython");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertNotNull(sTGroup4);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str4 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"\\\"hi\\\"\"");
        java.lang.String str10 = python2Target1.getImplicitSetLabel("\"_tsetPython2\\\\\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"\\\\\\\"hi\\\\\\\"\\\"\"" + "'", str8, "\"\\\"\\\\\\\"hi\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset\"_tsetPython2\\\\\\\"Contex\"" + "'", str10, "_tset\"_tsetPython2\\\\\\\"Contex\"");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tsetPython2\\\"Contex");
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("\"\\\"_tsetPython2\\\"\"", true);
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("YthonContext", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset4.5.2.1" + "'", str6, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tsetPython2\\\\\\\"Contex\"" + "'", str8, "\"_tsetPython2\\\\\\\"Contex\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\\\\\"_tsetPython2\\\\\\\"\\\"\"" + "'", str11, "\"\\\"\\\\\\\"_tsetPython2\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"YthonContext\"" + "'", str14, "\"YthonContext\"");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean6 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("__tset4.5.2.1");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\\\"_tset_tset\\\\\\\"\\\\\\\\\\\\\\\"_tsetPython2\\\\\\\\\\\\\\\"\\\\\\\"ContextContext\\\"");
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tset4.5.2.1" + "'", str8, "___tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\\"_tset_tset\\\\\\\"\\\\\\\\\\\\\\\"_tsetPython2\\\\\\\\\\\\\\\"\\\\\\\"ContextContext\\\"Context" + "'", str10, "\\\"_tset_tset\\\\\\\"\\\\\\\\\\\\\\\"_tsetPython2\\\\\\\\\\\\\\\"\\\\\\\"ContextContext\\\"Context");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\\\"_tsetPython2\\\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getLanguage();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\"_tsetPython2\\\"\"Context" + "'", str5, "\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("_tset");
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, (int) '#');
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tsetContext" + "'", str9, "_tsetContext");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("_tsethi!");
        boolean boolean5 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("_tsetPython2Context");
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tsethi!" + "'", str4, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "__tsetPython2Context" + "'", str7, "__tsetPython2Context");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
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
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str4 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"\\\"hi\\\"\"");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"\\\\\\\"hi\\\\\\\"\\\"\"" + "'", str8, "\"\\\"\\\\\\\"hi\\\\\\\"\\\"\"");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("Python2");
        boolean boolean9 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetPython2" + "'", str8, "_tsetPython2");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementName("_tset__tsetContext");
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
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("__tset", false);
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) 'a');
        boolean boolean13 = python2Target1.templatesExist();
        org.antlr.v4.tool.Rule rule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getRuleFunctionContextStructName(rule14);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("_tsetPython2");
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("\"\\\"ython\\\"\"Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopLabel(grammarAST12);
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
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("4.5.2.1");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) '#');
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#" + "'", str7, "#");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str8 = python2Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        boolean boolean12 = python2Target11.wantsBaseListener();
        java.lang.String str14 = python2Target11.getListLabel("");
        int int15 = python2Target11.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target11.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python2Target11.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "", true);
        java.lang.String str22 = python2Target11.getImplicitSetLabel("d");
        boolean boolean23 = python2Target11.wantsBaseVisitor();
        java.lang.String str24 = python2Target11.getVersion();
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator26);
        boolean boolean28 = python2Target27.wantsBaseListener();
        int int29 = python2Target27.getInlineTestSetWordSize();
        java.lang.String str31 = python2Target27.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str32 = python2Target27.getVersion();
        java.lang.String str35 = python2Target27.getTargetStringLiteralFromString("\"_tsetPython2\"", false);
        boolean boolean36 = python2Target27.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar37 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator38);
        boolean boolean40 = python2Target39.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = python2Target39.getCodeGenerator();
        java.lang.String str43 = python2Target39.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.tool.Grammar grammar44 = null;
        int[] intArray45 = new int[] {};
        java.lang.String[] strArray46 = python2Target39.getTokenTypesAsTargetLabels(grammar44, intArray45);
        java.lang.String[] strArray47 = python2Target27.getTokenTypesAsTargetLabels(grammar37, intArray45);
        java.lang.String[] strArray48 = python2Target11.getTokenTypesAsTargetLabels(grammar25, intArray45);
        java.lang.String[] strArray49 = python2Target1.getTokenTypesAsTargetLabels(grammar9, intArray45);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\\1\"" + "'", str7, "\"\\\\1\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"" + "'", str20, "\"\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "_tsetd" + "'", str22, "_tsetd");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4.5.2.1" + "'", str24, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "d" + "'", str31, "d");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "4.5.2.1" + "'", str32, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\\\"_tsetPython2\\\"" + "'", str35, "\\\"_tsetPython2\\\"");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(codeGenerator41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"\\\\1\"" + "'", str43, "\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[]");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass10 = strSet9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\\\"_tsetPython2\\\"\"");
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset_tsethi!ContextContext");
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\"_tsetPython2\\\"\"Context" + "'", str5, "\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tsethi!ContextContextContext" + "'", str8, "_tset_tsethi!ContextContextContext");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\n" + "'", str11, "\\n");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        boolean boolean7 = python2Target6.wantsBaseListener();
        java.lang.String str9 = python2Target6.getListLabel("");
        java.lang.String str11 = python2Target6.getTargetStringLiteralFromString("");
        java.lang.String str13 = python2Target6.getListLabel("_tset4.5.2.1");
        java.lang.String str14 = python2Target6.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target6.getCodeGenerator();
        java.lang.String str17 = python2Target6.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        boolean boolean21 = python2Target20.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar22 = null;
        int[] intArray23 = new int[] {};
        java.lang.String[] strArray24 = python2Target20.getTokenTypesAsTargetLabels(grammar22, intArray23);
        java.lang.String[] strArray25 = python2Target6.getTokenTypesAsTargetLabels(grammar18, intArray23);
        java.lang.String[] strArray26 = python2Target1.getTokenTypesAsTargetLabels(grammar4, intArray23);
        int int27 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = python2Target1.getRuleFunctionContextStructName(rule28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"" + "'", str11, "\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset4.5.2.1" + "'", str13, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"ython\\\"\"" + "'", str17, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getListLabel("\"\\\"Python2\\\"\"");
        boolean boolean9 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"Python2\\\"\"" + "'", str8, "\"\\\"Python2\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        java.lang.String str15 = python2Target1.getImplicitSetLabel("_tsetPython2Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getImplicitTokenLabel("\"\\\\\\\"Contex\"");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset_tsetPython2Context" + "'", str15, "_tset_tsetPython2Context");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        boolean boolean7 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\\64", false);
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("Python2");
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6" + "'", str11, "6");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"Python2\"" + "'", str13, "\"Python2\"");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) '#');
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#" + "'", str6, "#");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        boolean boolean19 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python2Target1.getLoopCounter(grammarAST20);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("Python2");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\"ython\"ContextContext");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetPython2" + "'", str8, "_tsetPython2");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"ython\"ContextContext" + "'", str11, "_tset\"ython\"ContextContext");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tsetPython2\\\"Contex");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetPython2\\\"ContexContext" + "'", str8, "_tsetPython2\\\"ContexContext");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str4 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "ython", false);
        java.lang.String str9 = python2Target1.getVersion();
        boolean boolean10 = python2Target1.wantsBaseVisitor();
        java.lang.String str12 = python2Target1.getImplicitSetLabel("__tsetPython2ContextContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_\"_\\\"_tsetPython2\\\"\"", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tho" + "'", str8, "tho");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset__tsetPython2ContextContext" + "'", str12, "_tset__tsetPython2ContextContext");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"_\\\"_tsetPython2\\\"\"" + "'", str16, "\"\\\"_\\\"_tsetPython2\\\"\"");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        java.lang.String str11 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\"\\\"_tsetPython2\\\"\"Context" + "'", str9, "_tset\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.lang.String str13 = python2Target1.getListLabel("\\\"_tsetd\\\"Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\\"_tsetd\\\"Context" + "'", str13, "\\\"_tsetd\\\"Context");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_tsethi!ContextContextContext");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_tsethi!ContextContextContext\"" + "'", str10, "\"_tset_tsethi!ContextContextContext\"");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("_tsetPython2Context", true);
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("\\\"ython\\\"");
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("\"\\\"d\\\"Context\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tsethi!\\\"\"" + "'", str10, "\"\\\"_tsethi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_tsetPython2Context\"" + "'", str14, "\"_tsetPython2Context\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_\\\"ython\\\"" + "'", str16, "_\\\"ython\\\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"d\\\"Context\"Context" + "'", str18, "\"\\\"d\\\"Context\"Context");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean7 = python2Target1.wantsBaseListener();
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\\1", true);
        int int8 = python2Target1.getInlineTestSetWordSize();
        boolean boolean9 = python2Target1.wantsBaseVisitor();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\\1\"" + "'", str7, "\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        java.lang.String str12 = python2Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getTokenTypeAsTargetLabel(grammar13, (int) (byte) 10);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python2" + "'", str12, "Python2");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("_tset");
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str11 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tsetContext" + "'", str9, "_tsetContext");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str8 = python2Target1.getListLabel("\"_tsetd\"Context");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tsetd\"Context" + "'", str8, "\"_tsetd\"Context");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"_tset_tset\\\"\\\\\\\"_tsetPython2\\\\\\\"\\\"ContextContext\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset\"_tset_tset\\\"\\\\\\\"_tsetPython2\\\\\\\"\\\"ContextContext\"" + "'", str8, "_tset\"_tset_tset\\\"\\\\\\\"_tsetPython2\\\\\\\"\\\"ContextContext\"");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\\\"_tsetPython2\\\"\"");
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("_\\1", false);
        boolean boolean10 = python2Target1.templatesExist();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\"_tsetPython2\\\"\"Context" + "'", str5, "\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\\\\1" + "'", str9, "_\\\\1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "\"\\\\1\"", false);
        int int17 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.encodeIntAsCharEscape(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: 2147483647");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\\\1" + "'", str16, "\\\\1");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\"" + "'", str8, "\"_tset\"");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"_tset\\\"\\\\\\\"\\\\\\\"\\\"Context\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementListName("\"_tset_tset4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"_tset\\\"\\\\\\\"\\\\\\\"\\\"Context\"" + "'", str5, "_\"_tset\\\"\\\\\\\"\\\\\\\"\\\"Context\"");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        int int31 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str32 = python2Target1.getLanguage();
        java.lang.String str34 = python2Target1.getAltLabelContextStructName("__tset_tset4.5.2.1");
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 64 + "'", int31 == 64);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Python2" + "'", str32, "Python2");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "__tset_tset4.5.2.1Context" + "'", str34, "__tset_tset4.5.2.1Context");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromString("\"\\\"\\\\\\\"hi\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tsetPython2\\\"Contex" + "'", str17, "_tsetPython2\\\"Contex");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str20, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("hi");
        java.util.Set<java.lang.String> strSet16 = python2Target1.getBadWords();
        java.lang.String str18 = python2Target1.encodeIntAsCharEscape(0);
        java.lang.String str21 = python2Target1.getTargetStringLiteralFromString("___4.5.2.1", false);
        java.lang.String str22 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"_tsetPython2\\\"\"" + "'", str9, "\"\\\"_tsetPython2\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\"\"" + "'", str11, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"ython\"Context" + "'", str13, "\"ython\"Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"hi\"" + "'", str15, "\"hi\"");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\0" + "'", str18, "\\0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "___4.5.2.1" + "'", str21, "___4.5.2.1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
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
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target1.getTemplates();
        java.lang.String str16 = python2Target1.encodeIntAsCharEscape(0);
        java.lang.String str17 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_4.5.2.1" + "'", str12, "_4.5.2.1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\0" + "'", str16, "\\0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getTokenTypeAsTargetLabel(grammar9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        boolean boolean7 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("___tsetPython2Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("__tsetPython2ContextContext", false);
        java.lang.String str10 = python2Target1.getListLabel("_tsetPython2\\\"Contex");
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(ruleFunction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__tsetPython2ContextContext" + "'", str8, "__tsetPython2ContextContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tsetPython2\\\"Contex" + "'", str10, "_tsetPython2\\\"Contex");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset\"_tset4.5.2.1\"", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"_tset4.5.2.1\\\"" + "'", str7, "_tset\\\"_tset4.5.2.1\\\"");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("hi!");
        int int4 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementName("_tset\"__tset_tset4.5.2.1\"ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tsethi!\"" + "'", str6, "\"_tsethi!\"");
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getLoopCounter(grammarAST15);
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
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        boolean boolean7 = python2Target1.templatesExist();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tsethi!");
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        boolean boolean13 = python2Target12.wantsBaseListener();
        java.lang.String str15 = python2Target12.getListLabel("");
        int int16 = python2Target12.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target12.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python2Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "", true);
        java.lang.String str23 = python2Target12.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator25);
        boolean boolean27 = python2Target26.supportsOverloadedMethods();
        boolean boolean28 = python2Target26.supportsOverloadedMethods();
        boolean boolean29 = python2Target26.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target32 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator31);
        boolean boolean33 = python2Target32.wantsBaseListener();
        boolean boolean34 = python2Target32.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = python2Target32.getCodeGenerator();
        boolean boolean36 = python2Target32.templatesExist();
        int int37 = python2Target32.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = python2Target32.getCodeGenerator();
        java.lang.String str39 = python2Target32.getLanguage();
        java.lang.String str41 = python2Target32.getTargetStringLiteralFromString("\"_tsethi!\"");
        org.antlr.v4.tool.Grammar grammar42 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target44 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator43);
        boolean boolean45 = python2Target44.wantsBaseListener();
        java.lang.String str47 = python2Target44.getListLabel("");
        java.lang.String str49 = python2Target44.getTargetStringLiteralFromString("");
        java.lang.String str51 = python2Target44.getListLabel("_tset4.5.2.1");
        java.lang.String str52 = python2Target44.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator53 = python2Target44.getCodeGenerator();
        java.lang.String str55 = python2Target44.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar56 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator57 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target58 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator57);
        boolean boolean59 = python2Target58.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar60 = null;
        int[] intArray61 = new int[] {};
        java.lang.String[] strArray62 = python2Target58.getTokenTypesAsTargetLabels(grammar60, intArray61);
        java.lang.String[] strArray63 = python2Target44.getTokenTypesAsTargetLabels(grammar56, intArray61);
        java.lang.String[] strArray64 = python2Target32.getTokenTypesAsTargetLabels(grammar42, intArray61);
        java.lang.String[] strArray65 = python2Target26.getTokenTypesAsTargetLabels(grammar30, intArray61);
        java.lang.String[] strArray66 = python2Target12.getTokenTypesAsTargetLabels(grammar24, intArray61);
        java.lang.String[] strArray67 = python2Target1.getTokenTypesAsTargetLabels(grammar10, intArray61);
        java.lang.String str68 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar69 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str71 = python2Target1.getTokenTypeAsTargetLabel(grammar69, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tsethi!\"" + "'", str6, "\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\"" + "'", str21, "\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\\n" + "'", str23, "\\n");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(codeGenerator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Python2" + "'", str39, "Python2");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"\\\"_tsethi!\\\"\"" + "'", str41, "\"\\\"_tsethi!\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"\"" + "'", str49, "\"\"");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "_tset4.5.2.1" + "'", str51, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Python2" + "'", str52, "Python2");
        org.junit.Assert.assertNull(codeGenerator53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\"\\\"ython\\\"\"" + "'", str55, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[]");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "4.5.2.1" + "'", str68, "4.5.2.1");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup3 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "tsetPython", true);
        java.lang.String str8 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(sTGroup3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"setPytho\"" + "'", str7, "\"setPytho\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("\"_tset\"");
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_tset\"Context" + "'", str9, "\"_tset\"Context");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\\1", true);
        int int8 = python2Target1.getInlineTestSetWordSize();
        boolean boolean9 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("\\\"\\\\n\\\"Contex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\\1\"" + "'", str7, "\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("_tset4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tset4.5.2.1" + "'", str6, "__tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getListLabel("_tsethi!");
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementName("_tset\"_tset_tset\\\"\\\\\\\"_tsetPython2\\\\\\\"\\\"ContextContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\0" + "'", str7, "\\0");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopLabel(grammarAST12);
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
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str4 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("_tset_tsethi!", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_tsethi!" + "'", str9, "_tset_tsethi!");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("__thonContexContext");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "__thonContexContextContext" + "'", str9, "__thonContexContextContext");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("__tset_tset4.5.2.1", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getImplicitTokenLabel("_tset___tsetPython2Context");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "__tset_tset4.5.2.1" + "'", str14, "__tset_tset4.5.2.1");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        boolean boolean7 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        boolean boolean10 = python2Target1.templatesExist();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        boolean boolean9 = python2Target1.wantsBaseListener();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("_tset\"\\\"ython\\\"\"Context");
        java.lang.String str13 = python2Target1.encodeIntAsCharEscape((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getImplicitTokenLabel("\"\\\"\\\\\\\\\\\\\\\"_tsetPython2\\\\\\\\\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tset\"\\\"ython\\\"\"Context" + "'", str11, "_tset_tset\"\\\"ython\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\0" + "'", str13, "\\0");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        boolean boolean19 = python2Target18.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar20 = null;
        int[] intArray21 = new int[] {};
        java.lang.String[] strArray22 = python2Target18.getTokenTypesAsTargetLabels(grammar20, intArray21);
        java.lang.String[] strArray23 = python2Target1.getTokenTypesAsTargetLabels(grammar16, intArray21);
        boolean boolean24 = python2Target1.wantsBaseVisitor();
        boolean boolean25 = python2Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python2Target1.getImplicitTokenLabel("\"\\\"ython\\\"ContextContext\"");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        boolean boolean8 = python2Target7.wantsBaseListener();
        java.lang.String str10 = python2Target7.getListLabel("");
        java.lang.String str12 = python2Target7.getTargetStringLiteralFromString("");
        java.lang.String str14 = python2Target7.getListLabel("_tset4.5.2.1");
        java.lang.String str15 = python2Target7.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python2Target7.getCodeGenerator();
        java.lang.String str18 = python2Target7.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator20);
        boolean boolean22 = python2Target21.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar23 = null;
        int[] intArray24 = new int[] {};
        java.lang.String[] strArray25 = python2Target21.getTokenTypesAsTargetLabels(grammar23, intArray24);
        java.lang.String[] strArray26 = python2Target7.getTokenTypesAsTargetLabels(grammar19, intArray24);
        java.lang.String[] strArray27 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray24);
        java.lang.String str29 = python2Target1.getAltLabelContextStructName("\"\\\"_tset_tset4.5.2.1\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = python2Target1.getElementName("i");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset4.5.2.1" + "'", str14, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"ython\\\"\"" + "'", str18, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\\"_tset_tset4.5.2.1\\\"\"Context" + "'", str29, "\"\\\"_tset_tset4.5.2.1\\\"\"Context");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        java.lang.Class<?> wildcardClass13 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean6 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape(100);
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\\0");
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\\0\"" + "'", str12, "\"\\\\0\"");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        java.lang.String str8 = python2Target1.getListLabel("_\\1");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset\"\\\"_tsetPython2\\\"\"ContextContextContext");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\\1" + "'", str8, "_\\1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset\\\"\\\\\\\"_tsetPython2\\\\\\\"\\\"ContextContextContext\"" + "'", str10, "\"_tset\\\"\\\\\\\"_tsetPython2\\\\\\\"\\\"ContextContextContext\"");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
        org.antlr.v4.codegen.model.RuleFunction ruleFunction19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getRuleFunctionContextStructName(ruleFunction19);
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
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getVersion();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator12);
        boolean boolean14 = python2Target13.wantsBaseListener();
        java.lang.String str16 = python2Target13.getListLabel("");
        java.lang.String str18 = python2Target13.getTargetStringLiteralFromString("");
        java.lang.String str20 = python2Target13.getListLabel("_tset4.5.2.1");
        java.lang.String str21 = python2Target13.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python2Target13.getCodeGenerator();
        java.lang.String str24 = python2Target13.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator26);
        boolean boolean28 = python2Target27.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar29 = null;
        int[] intArray30 = new int[] {};
        java.lang.String[] strArray31 = python2Target27.getTokenTypesAsTargetLabels(grammar29, intArray30);
        java.lang.String[] strArray32 = python2Target13.getTokenTypesAsTargetLabels(grammar25, intArray30);
        java.lang.String[] strArray33 = python2Target1.getTokenTypesAsTargetLabels(grammar11, intArray30);
        org.antlr.v4.tool.Grammar grammar34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = python2Target1.getTokenTypeAsTargetLabel(grammar34, (-1));
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_tset4.5.2.1" + "'", str20, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Python2" + "'", str21, "Python2");
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\\\"ython\\\"\"" + "'", str24, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "\"\\\\1\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\\\1" + "'", str16, "\\\\1");
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertNotNull(sTGroup18);
    }
}

