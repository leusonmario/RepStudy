import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest34 {

    public static boolean debug = false;

    @Test
    public void test17001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17001");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(10);
        boolean boolean7 = python3Target0.templatesExist();
        java.lang.String[] strArray8 = python3Target0.targetCharValueEscape;
        boolean boolean9 = python3Target0.templatesExist();
        java.util.Set<java.lang.String> strSet10 = python3Target0.badWords;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test17002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17002");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        boolean boolean10 = python3Target0.templatesExist();
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("\"\\\"\\\"\\\"i\\\"\\\"\\\"\"Context", false);
        boolean boolean14 = python3Target0.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8, "\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"\\\"\\\"i\\\"\\\"\\\"\"Context" + "'", str13, "\"\\\"\\\"\\\"i\\\"\\\"\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test17003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17003");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        boolean boolean8 = python3Target0.templatesExist();
        int int9 = python3Target0.getInlineTestSetWordSize();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"hi!\"\"" + "'", str5, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test17004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17004");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        boolean boolean6 = python3Target0.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(sTGroup7);
    }

    @Test
    public void test17005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17005");
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
        java.lang.String str17 = python3Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup19 = null;
        python3Target18.templates = sTGroup19;
        java.util.Set<java.lang.String> strSet21 = null;
        python3Target18.badWords = strSet21;
        boolean boolean23 = python3Target18.wantsBaseListener();
        java.util.Set<java.lang.String> strSet24 = python3Target18.badWords;
        boolean boolean25 = python3Target18.supportsOverloadedMethods();
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target();
        int int27 = python3Target26.getInlineTestSetWordSize();
        java.lang.String str28 = python3Target26.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = python3Target26.getCodeGenerator();
        java.util.Set<java.lang.String> strSet30 = python3Target26.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target31 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        python3Target31.badWords = strSet34;
        python3Target26.badWords = strSet34;
        java.lang.String str38 = python3Target26.getVersion();
        java.lang.String str40 = python3Target26.encodeIntAsCharEscape(29);
        java.lang.String str43 = python3Target26.getTargetStringLiteralFromString("", true);
        org.antlr.v4.codegen.target.Python3Target python3Target44 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup45 = null;
        python3Target44.templates = sTGroup45;
        java.util.Set<java.lang.String> strSet47 = null;
        python3Target44.badWords = strSet47;
        boolean boolean49 = python3Target44.supportsOverloadedMethods();
        int int50 = python3Target44.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python3Target python3Target51 = new org.antlr.v4.codegen.target.Python3Target();
        int int52 = python3Target51.getInlineTestSetWordSize();
        boolean boolean53 = python3Target51.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = python3Target51.gen;
        boolean boolean55 = python3Target51.wantsBaseVisitor();
        boolean boolean56 = python3Target51.supportsOverloadedMethods();
        java.lang.String str59 = python3Target51.getTargetStringLiteralFromString("\\0", false);
        boolean boolean60 = python3Target51.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator61 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target62 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator61);
        java.lang.String str64 = python3Target62.encodeIntAsCharEscape((int) (short) 1);
        org.stringtemplate.v4.STGroup sTGroup65 = python3Target62.loadTemplates();
        python3Target51.templates = sTGroup65;
        python3Target44.templates = sTGroup65;
        python3Target26.templates = sTGroup65;
        python3Target18.templates = sTGroup65;
        python3Target0.templates = sTGroup65;
        java.lang.String str72 = python3Target0.getTargetStringLiteralFromString("\"\\\"35\\\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST73 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str74 = python3Target0.getLoopCounter(grammarAST73);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(codeGenerator29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "4.5.2.1" + "'", str38, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\\35" + "'", str40, "\\35");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"\"" + "'", str43, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 64 + "'", int50 == 64);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 64 + "'", int52 == 64);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(codeGenerator54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\\0" + "'", str59, "\\0");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\\1" + "'", str64, "\\1");
        org.junit.Assert.assertNotNull(sTGroup65);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "\"\"\\\"35\\\"\"\"" + "'", str72, "\"\"\\\"35\\\"\"\"");
    }

    @Test
    public void test17006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17006");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str3 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        int int6 = python3Target5.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target5.language;
        java.lang.String str8 = python3Target5.getVersion();
        int int9 = python3Target5.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target5.getLanguage();
        java.lang.String str13 = python3Target5.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target5.gen;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target();
        int int16 = python3Target15.getInlineTestSetWordSize();
        java.lang.String str17 = python3Target15.language;
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target15.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python3Target15.gen;
        java.util.Set<java.lang.String> strSet20 = python3Target15.badWords;
        python3Target5.badWords = strSet20;
        python3Target0.badWords = strSet20;
        int int23 = python3Target0.getInlineTestSetWordSize();
        python3Target0.addBadWords();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(sTGroup18);
        org.junit.Assert.assertNull(codeGenerator19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
    }

    @Test
    public void test17007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17007");
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
        java.lang.String str17 = python3Target0.language;
        boolean boolean18 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup20 = null;
        python3Target19.templates = sTGroup20;
        java.lang.String[] strArray25 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        python3Target19.badWords = strSet26;
        python3Target19.addBadWords();
        boolean boolean30 = python3Target19.supportsOverloadedMethods();
        python3Target19.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        java.lang.String str35 = python3Target19.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator32, "\"1\"", false);
        python3Target19.language = "\\\"1\\\"";
        java.lang.String str39 = python3Target19.encodeIntAsCharEscape(100);
        org.antlr.v4.codegen.target.Python3Target python3Target40 = new org.antlr.v4.codegen.target.Python3Target();
        int int41 = python3Target40.getInlineTestSetWordSize();
        boolean boolean42 = python3Target40.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = python3Target40.gen;
        boolean boolean44 = python3Target40.wantsBaseVisitor();
        boolean boolean45 = python3Target40.supportsOverloadedMethods();
        java.lang.String str48 = python3Target40.getTargetStringLiteralFromString("\\0", false);
        boolean boolean49 = python3Target40.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target51 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator50);
        java.lang.String str53 = python3Target51.encodeIntAsCharEscape((int) (short) 1);
        org.stringtemplate.v4.STGroup sTGroup54 = python3Target51.loadTemplates();
        python3Target40.templates = sTGroup54;
        python3Target19.templates = sTGroup54;
        python3Target0.templates = sTGroup54;
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1" + "'", str35, "1");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "d" + "'", str39, "d");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 64 + "'", int41 == 64);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(codeGenerator43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\\0" + "'", str48, "\\0");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\\1" + "'", str53, "\\1");
        org.junit.Assert.assertNotNull(sTGroup54);
    }

    @Test
    public void test17008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17008");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.addBadWords();
        boolean boolean11 = python3Target0.supportsOverloadedMethods();
        python3Target0.addBadWords();
        java.lang.String str14 = python3Target0.getTargetStringLiteralFromString("\"\\0\"");
        org.stringtemplate.v4.STGroup sTGroup15 = null;
        python3Target0.templates = sTGroup15;
        python3Target0.addBadWords();
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.stringtemplate.v4.ST sT19 = null;
        python3Target0.genRecognizerHeaderFile(grammar18, sT19, "\\\"\\\"12\\\"\\\"");
        java.util.Set<java.lang.String> strSet22 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup23 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        java.lang.String str27 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator24, "\"\"\\\"\\\"\\\"\\\"i\\\"\\\"\\\"\\\"\"\"", true);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"\\0\"\"" + "'", str14, "\"\"\\0\"\"");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(sTGroup23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\\\"\\\"\\\"\\\"\\\"i\\\"\\\"\\\"\\\"\\\"\"" + "'", str27, "\"\\\"\\\"\\\"\\\"\\\"i\\\"\\\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test17009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17009");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"4.5.2.1\"\"");
        java.lang.String str7 = python3Target0.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.templates;
        int int9 = python3Target0.getInlineTestSetWordSize();
        int int10 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str11 = python3Target0.getLanguage();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"\"4.5.2.1\"\"\"" + "'", str6, "\"\"\"4.5.2.1\"\"\"");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test17010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17010");
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
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        int int20 = python3Target19.getInlineTestSetWordSize();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "" };
        python3Target19.targetCharValueEscape = strArray23;
        java.lang.String[] strArray25 = python3Target19.targetCharValueEscape;
        boolean boolean26 = python3Target19.supportsOverloadedMethods();
        java.lang.String[] strArray27 = new java.lang.String[] {};
        python3Target19.targetCharValueEscape = strArray27;
        python3Target0.targetCharValueEscape = strArray27;
        int int30 = python3Target0.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = python3Target0.getElementName("\"\"\\\"\\\"\\\" \\\"\\\"\\\"\"\"");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 29 + "'", int30 == 29);
    }

    @Test
    public void test17011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17011");
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
        int int22 = python3Target0.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup23 = null;
        python3Target0.templates = sTGroup23;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python3Target0.getElementName("\"\"\\\"\\\"\\\"\\\"\\\"\\\"hi!\\\"\\\"\\\"\\\"\\\"\\\"\"\"");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
    }

    @Test
    public void test17012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17012");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        boolean boolean10 = python3Target0.templatesExist();
        java.lang.String str12 = python3Target0.encodeIntAsCharEscape(64);
        int int13 = python3Target0.getSerializedATNSegmentLimit();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
    }

    @Test
    public void test17013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17013");
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
        org.stringtemplate.v4.STGroup sTGroup11 = null;
        python3Target0.templates = sTGroup11;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target();
        int int14 = python3Target13.getInlineTestSetWordSize();
        java.lang.String str15 = python3Target13.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target13.getCodeGenerator();
        java.util.Set<java.lang.String> strSet17 = python3Target13.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        python3Target18.badWords = strSet21;
        python3Target13.badWords = strSet21;
        java.lang.String str25 = python3Target13.getVersion();
        java.lang.String str27 = python3Target13.encodeIntAsCharEscape(29);
        java.lang.String str30 = python3Target13.getTargetStringLiteralFromString("", true);
        org.antlr.v4.codegen.target.Python3Target python3Target31 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup32 = null;
        python3Target31.templates = sTGroup32;
        java.util.Set<java.lang.String> strSet34 = null;
        python3Target31.badWords = strSet34;
        boolean boolean36 = python3Target31.supportsOverloadedMethods();
        int int37 = python3Target31.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python3Target python3Target38 = new org.antlr.v4.codegen.target.Python3Target();
        int int39 = python3Target38.getInlineTestSetWordSize();
        boolean boolean40 = python3Target38.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = python3Target38.gen;
        boolean boolean42 = python3Target38.wantsBaseVisitor();
        boolean boolean43 = python3Target38.supportsOverloadedMethods();
        java.lang.String str46 = python3Target38.getTargetStringLiteralFromString("\\0", false);
        boolean boolean47 = python3Target38.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target49 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator48);
        java.lang.String str51 = python3Target49.encodeIntAsCharEscape((int) (short) 1);
        org.stringtemplate.v4.STGroup sTGroup52 = python3Target49.loadTemplates();
        python3Target38.templates = sTGroup52;
        python3Target31.templates = sTGroup52;
        python3Target13.templates = sTGroup52;
        python3Target0.templates = sTGroup52;
        boolean boolean57 = python3Target0.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\\35" + "'", str27, "\\35");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"\"" + "'", str30, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 64 + "'", int37 == 64);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(codeGenerator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\\0" + "'", str46, "\\0");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\\1" + "'", str51, "\\1");
        org.junit.Assert.assertNotNull(sTGroup52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test17014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17014");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        java.util.Set<java.lang.String> strSet10 = python3Target0.badWords;
        java.lang.String str11 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        python3Target0.gen = codeGenerator12;
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target0.templates;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getImplicitTokenLabel("\"\"\"\\\"\\\"\\\"d\\\"\\\"\\\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(sTGroup14);
    }

    @Test
    public void test17015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17015");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.addBadWords();
        boolean boolean11 = python3Target0.supportsOverloadedMethods();
        python3Target0.addBadWords();
        java.lang.String str14 = python3Target0.getTargetStringLiteralFromString("\"\\0\"");
        org.stringtemplate.v4.STGroup sTGroup15 = null;
        python3Target0.templates = sTGroup15;
        java.lang.String[] strArray17 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        int int19 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"\\0\"\"" + "'", str14, "\"\"\\0\"\"");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
    }

    @Test
    public void test17016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17016");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\"", false);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.templates;
        java.lang.String str15 = python3Target0.getTargetStringLiteralFromString("\"\"\\\"\\\"4.5.2.1\\\"\\\"\"\"", false);
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup17 = null;
        python3Target16.templates = sTGroup17;
        java.util.Set<java.lang.String> strSet19 = null;
        python3Target16.badWords = strSet19;
        boolean boolean21 = python3Target16.wantsBaseListener();
        java.lang.String[] strArray22 = python3Target16.targetCharValueEscape;
        java.lang.String str24 = python3Target16.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"");
        python3Target16.language = "\\35";
        boolean boolean27 = python3Target16.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = python3Target16.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar29 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target30 = new org.antlr.v4.codegen.target.Python3Target();
        int int31 = python3Target30.getInlineTestSetWordSize();
        boolean boolean32 = python3Target30.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = python3Target30.gen;
        boolean boolean34 = python3Target30.wantsBaseVisitor();
        boolean boolean35 = python3Target30.supportsOverloadedMethods();
        java.lang.String str38 = python3Target30.getTargetStringLiteralFromString("\\0", false);
        boolean boolean39 = python3Target30.templatesExist();
        python3Target30.addBadWords();
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target42 = new org.antlr.v4.codegen.target.Python3Target();
        int int43 = python3Target42.getInlineTestSetWordSize();
        java.lang.String str44 = python3Target42.language;
        java.lang.String str45 = python3Target42.getVersion();
        int int46 = python3Target42.getInlineTestSetWordSize();
        java.lang.String str47 = python3Target42.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = python3Target42.gen;
        org.antlr.v4.tool.Grammar grammar49 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target50 = new org.antlr.v4.codegen.target.Python3Target();
        int int51 = python3Target50.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup52 = python3Target50.templates;
        org.antlr.v4.tool.Grammar grammar53 = null;
        int[] intArray54 = new int[] {};
        java.lang.String[] strArray55 = python3Target50.getTokenTypesAsTargetLabels(grammar53, intArray54);
        java.lang.String[] strArray56 = python3Target42.getTokenTypesAsTargetLabels(grammar49, intArray54);
        java.lang.String[] strArray57 = python3Target30.getTokenTypesAsTargetLabels(grammar41, intArray54);
        java.lang.String[] strArray58 = python3Target16.getTokenTypesAsTargetLabels(grammar29, intArray54);
        python3Target0.targetCharValueEscape = strArray58;
        java.lang.String str60 = python3Target0.language;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertNull(sTGroup12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\"\\\"\\\"4.5.2.1\\\"\\\"\"\"" + "'", str15, "\"\"\\\"\\\"4.5.2.1\\\"\\\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"\\\"hi!\\\"\"\"" + "'", str24, "\"\"\\\"hi!\\\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(codeGenerator28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 64 + "'", int31 == 64);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(codeGenerator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\0" + "'", str38, "\\0");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 64 + "'", int43 == 64);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "4.5.2.1" + "'", str45, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 64 + "'", int46 == 64);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(codeGenerator48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 64 + "'", int51 == 64);
        org.junit.Assert.assertNull(sTGroup52);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[]");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test17017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17017");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) (short) 100);
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        boolean boolean10 = python3Target0.wantsBaseListener();
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str13 = python3Target11.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target11.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "", true);
        java.lang.String str19 = python3Target11.encodeIntAsCharEscape((int) (short) 100);
        org.stringtemplate.v4.STGroup sTGroup20 = python3Target11.templates;
        java.lang.String str22 = python3Target11.encodeIntAsCharEscape(29);
        java.lang.String str24 = python3Target11.getTargetStringLiteralFromString("");
        java.lang.String str25 = python3Target11.getLanguage();
        java.lang.String[] strArray26 = python3Target11.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray26;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = python3Target0.getImplicitTokenLabel("\"\\\"\\\"\\\" \\\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d" + "'", str19, "d");
        org.junit.Assert.assertNull(sTGroup20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\\35" + "'", str22, "\\35");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test17018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17018");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        int int9 = python3Target0.getInlineTestSetWordSize();
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.templates;
        java.lang.String str14 = python3Target0.encodeIntAsCharEscape((int) '#');
        boolean boolean15 = python3Target0.supportsOverloadedMethods();
        boolean boolean16 = python3Target0.wantsBaseListener();
        boolean boolean17 = python3Target0.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertNull(sTGroup12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#" + "'", str14, "#");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test17019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17019");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\"i\"\"", true);
        boolean boolean9 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target0.genRecognizerHeaderFile(grammar10, sT11, "\"\"\"\"i\"\"\"\"");
        java.lang.String[] strArray14 = null;
        python3Target0.targetCharValueEscape = strArray14;
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getLoopCounter(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\1" + "'", str4, "\\1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"i\\\"\"" + "'", str8, "\"\\\"i\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }
}

