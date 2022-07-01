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
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.addBadWords();
        boolean boolean11 = python3Target0.supportsOverloadedMethods();
        python3Target0.addBadWords();
        java.lang.String str13 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        python3Target0.gen = codeGenerator14;
        java.lang.String str16 = python3Target0.language;
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test17002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17002");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str10 = python3Target9.language;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup12 = null;
        python3Target11.templates = sTGroup12;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        python3Target11.badWords = strSet18;
        python3Target9.badWords = strSet18;
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target23 = new org.antlr.v4.codegen.target.Python3Target();
        int int24 = python3Target23.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup25 = python3Target23.templates;
        org.antlr.v4.tool.Grammar grammar26 = null;
        int[] intArray27 = new int[] {};
        java.lang.String[] strArray28 = python3Target23.getTokenTypesAsTargetLabels(grammar26, intArray27);
        java.lang.String[] strArray29 = python3Target9.getTokenTypesAsTargetLabels(grammar22, intArray27);
        java.lang.String[] strArray30 = python3Target0.getTokenTypesAsTargetLabels(grammar8, intArray27);
        java.lang.String str32 = python3Target0.encodeIntAsCharEscape((int) 'a');
        java.lang.String str35 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"hi!\"\"\"\"", true);
        java.lang.String str38 = python3Target0.getTargetStringLiteralFromString("", false);
        boolean boolean39 = python3Target0.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup40 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 64 + "'", int24 == 64);
        org.junit.Assert.assertNull(sTGroup25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "a" + "'", str32, "a");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"\"\"\"hi!\"\"\"\"\"" + "'", str35, "\"\"\"\"\"hi!\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test17003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17003");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.templates;
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.templates;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertNull(sTGroup8);
        org.junit.Assert.assertNull(sTGroup9);
    }

    @Test
    public void test17004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17004");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        python3Target0.gen = codeGenerator2;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getImplicitRuleLabel("\"\"\"\\\"\\\"4.5.2.1\\\"\\\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test17005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17005");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup7 = null;
        python3Target0.templates = sTGroup7;
        boolean boolean9 = python3Target0.wantsBaseVisitor();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17006");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        python3Target0.gen = codeGenerator2;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\"\"\"\"\"", false);
        java.lang.String str10 = python3Target0.getVersion();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"\"\"\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\"\"\"\"\"" + "'", str9, "\"\"\"\"\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
    }

    @Test
    public void test17007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17007");
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
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("\"1\"");
        int int14 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str15 = python3Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getImplicitRuleLabel("");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"1\"\"" + "'", str13, "\"\"1\"\"");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test17008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17008");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("i");
        int int5 = python3Target0.getSerializedATNSegmentLimit();
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
        python3Target7.language = "\"\"i\"\"";
        org.stringtemplate.v4.STGroup sTGroup22 = null;
        python3Target7.templates = sTGroup22;
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target();
        int int26 = python3Target25.getInlineTestSetWordSize();
        boolean boolean27 = python3Target25.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = python3Target25.gen;
        java.lang.String str29 = python3Target25.getVersion();
        org.stringtemplate.v4.STGroup sTGroup30 = null;
        python3Target25.templates = sTGroup30;
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target();
        int int34 = python3Target33.getInlineTestSetWordSize();
        java.lang.String str35 = python3Target33.language;
        java.lang.String str36 = python3Target33.getVersion();
        python3Target33.language = "@";
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
        java.lang.String[] strArray60 = python3Target33.getTokenTypesAsTargetLabels(grammar39, intArray56);
        java.lang.String[] strArray61 = python3Target25.getTokenTypesAsTargetLabels(grammar32, intArray56);
        java.lang.String[] strArray62 = python3Target7.getTokenTypesAsTargetLabels(grammar24, intArray56);
        java.lang.String[] strArray63 = python3Target0.getTokenTypesAsTargetLabels(grammar6, intArray56);
        java.lang.String str64 = python3Target0.getLanguage();
        java.lang.String str67 = python3Target0.getTargetStringLiteralFromString("\"\"64\"\"", true);
        org.antlr.v4.tool.Grammar grammar68 = null;
        org.stringtemplate.v4.ST sT69 = null;
        python3Target0.genRecognizerHeaderFile(grammar68, sT69, "\\\".5.2.\\\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str73 = python3Target0.getImplicitTokenLabel("\"\\\"1\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"i\"" + "'", str4, "\"i\"");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(codeGenerator28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4.5.2.1" + "'", str29, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 64 + "'", int34 == 64);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "4.5.2.1" + "'", str36, "4.5.2.1");
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
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\"\"\"64\"\"\"" + "'", str67, "\"\"\"64\"\"\"");
    }

    @Test
    public void test17009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17009");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        python3Target0.gen = codeGenerator1;
        java.lang.String str3 = python3Target0.getVersion();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.getVersion();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test17010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17010");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup6 = null;
        python3Target0.templates = sTGroup6;
        java.lang.String[] strArray8 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python3Target0.genRecognizerHeaderFile(grammar9, sT10, "\"\\\" \\\"\"");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strArray8);
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
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"hi!\"", false);
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        java.lang.String str11 = python3Target0.language;
        java.lang.String str12 = python3Target0.getLanguage();
        java.util.Set<java.lang.String> strSet13 = python3Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"\"\"\"\\\"i\\\"\"\"\"\"", false);
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.stringtemplate.v4.ST sT19 = null;
        python3Target0.genRecognizerHeaderFile(grammar18, sT19, "\"\"\"\"\\\"\\\"\"\"\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST22);
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\\"\\\"\\\"\\\"i\\\"\\\"\\\"\\\"" + "'", str17, "\\\"\\\"\\\"\\\"i\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test17012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17012");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "\"\"");
        java.lang.String[] strArray11 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet12 = python3Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.gen;
        boolean boolean14 = python3Target0.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test17013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17013");
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
        java.util.Set<java.lang.String> strSet17 = python3Target0.badWords;
        java.util.Set<java.lang.String> strSet18 = python3Target0.getBadWords();
        org.antlr.v4.tool.Grammar grammar19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target0.getTokenTypeAsTargetLabel(grammar19, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test17014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17014");
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
        int int16 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str18 = python3Target0.getTargetStringLiteralFromString("\"\"\"4.5.2.1\"\"\"");
        python3Target0.addBadWords();
        java.lang.String str22 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\\\"\\\"\\\"\\\"\\\"\\\"\"\"\"\"", true);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"\"\"4.5.2.1\"\"\"\"" + "'", str18, "\"\"\"\"4.5.2.1\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\"\"\"\"\\\"\\\"\\\"\\\"\\\"\\\"\"\"\"\"\"" + "'", str22, "\"\"\"\"\"\\\"\\\"\\\"\\\"\\\"\\\"\"\"\"\"\"");
    }

    @Test
    public void test17015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17015");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\\1");
        boolean boolean8 = python3Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.templates;
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup11 = null;
        python3Target0.templates = sTGroup11;
        java.lang.String[] strArray13 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        int int15 = python3Target14.getInlineTestSetWordSize();
        boolean boolean16 = python3Target14.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target14.gen;
        boolean boolean18 = python3Target14.wantsBaseVisitor();
        java.lang.String str19 = python3Target14.language;
        java.lang.String str22 = python3Target14.getTargetStringLiteralFromString("\\0", false);
        int int23 = python3Target14.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup24 = null;
        python3Target14.templates = sTGroup24;
        boolean boolean26 = python3Target14.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.stringtemplate.v4.ST sT28 = null;
        python3Target14.genRecognizerHeaderFile(grammar27, sT28, "\"\"hi!\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python3Target14.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup32 = null;
        python3Target14.templates = sTGroup32;
        int int34 = python3Target14.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = python3Target14.getCodeGenerator();
        java.util.Set<java.lang.String> strSet36 = python3Target14.badWords;
        python3Target0.badWords = strSet36;
        java.util.Set<java.lang.String> strSet38 = python3Target0.getBadWords();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\1\"" + "'", str7, "\"\\1\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\\0" + "'", str22, "\\0");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 29 + "'", int23 == 29);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(codeGenerator31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 64 + "'", int34 == 64);
        org.junit.Assert.assertNull(codeGenerator35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(strSet38);
    }

    @Test
    public void test17016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17016");
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
        java.lang.String str23 = python3Target0.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.lang.String str25 = python3Target0.getTargetStringLiteralFromString("\".5.2.\"");
        java.util.Set<java.lang.String> strSet26 = python3Target0.getBadWords();
        boolean boolean27 = python3Target0.wantsBaseListener();
        java.lang.String str30 = python3Target0.getTargetStringLiteralFromString("_", true);
        int int31 = python3Target0.getSerializedATNSegmentLimit();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\".5.2.\"\"" + "'", str23, "\"\".5.2.\"\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\".5.2.\"\"" + "'", str25, "\"\".5.2.\"\"");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"_\"" + "'", str30, "\"_\"");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 29 + "'", int31 == 29);
    }

    @Test
    public void test17017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17017");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "\"4.5.2.1\"");
        java.util.Set<java.lang.String> strSet11 = python3Target0.badWords;
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        python3Target0.genRecognizerHeaderFile(grammar12, sT13, "6");
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target();
        int int17 = python3Target16.getInlineTestSetWordSize();
        boolean boolean18 = python3Target16.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python3Target16.gen;
        boolean boolean20 = python3Target16.wantsBaseVisitor();
        java.lang.String str21 = python3Target16.language;
        java.lang.String str24 = python3Target16.getTargetStringLiteralFromString("\\0", false);
        int int25 = python3Target16.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup26 = null;
        python3Target16.templates = sTGroup26;
        java.util.Set<java.lang.String> strSet28 = python3Target16.getBadWords();
        java.lang.String str29 = python3Target16.getLanguage();
        int int30 = python3Target16.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.stringtemplate.v4.ST sT32 = null;
        python3Target16.genRecognizerHeaderFile(grammar31, sT32, "\\\"\\\"4.5.2.1\\\"\\\"");
        java.util.Set<java.lang.String> strSet35 = python3Target16.badWords;
        python3Target0.badWords = strSet35;
        java.lang.String[] strArray37 = python3Target0.targetCharValueEscape;
        java.lang.String str38 = python3Target0.language;
        org.antlr.v4.tool.Rule rule39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = python3Target0.getRuleFunctionContextStructName(rule39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(sTGroup5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(codeGenerator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\0" + "'", str24, "\\0");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 29 + "'", int25 == 29);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 29 + "'", int30 == 29);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNull(str38);
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
        python3Target0.addBadWords();
        python3Target0.addBadWords();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "\"\"\"\"\"\"");
        boolean boolean11 = python3Target0.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test17019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17019");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\\\"\\\"\\\"i\\\"\\\"\\\"\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getImplicitSetLabel("\"_tset\\\"\\\"\\\"\\\"\\\"\\\"0\\\"\\\"\\\"\\\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\"\\\"i\\\"\\\"\\\"\"" + "'", str9, "\"\\\"\\\"\\\"i\\\"\\\"\\\"\"");
    }

    @Test
    public void test17020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17020");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target8.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "", true);
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.stringtemplate.v4.ST sT16 = null;
        python3Target8.genRecognizerHeaderFile(grammar15, sT16, "");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target8.genRecognizerHeaderFile(grammar19, sT20, "\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python3Target8.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        python3Target8.gen = codeGenerator24;
        java.lang.String str27 = python3Target8.encodeIntAsCharEscape(1);
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str31 = python3Target29.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target();
        int int34 = python3Target33.getInlineTestSetWordSize();
        java.lang.String str35 = python3Target33.language;
        java.lang.String str36 = python3Target33.getVersion();
        int int37 = python3Target33.getInlineTestSetWordSize();
        java.lang.String str38 = python3Target33.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = python3Target33.gen;
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target41 = new org.antlr.v4.codegen.target.Python3Target();
        int int42 = python3Target41.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup43 = python3Target41.templates;
        org.antlr.v4.tool.Grammar grammar44 = null;
        int[] intArray45 = new int[] {};
        java.lang.String[] strArray46 = python3Target41.getTokenTypesAsTargetLabels(grammar44, intArray45);
        java.lang.String[] strArray47 = python3Target33.getTokenTypesAsTargetLabels(grammar40, intArray45);
        java.lang.String[] strArray48 = python3Target29.getTokenTypesAsTargetLabels(grammar32, intArray45);
        java.lang.String[] strArray49 = python3Target8.getTokenTypesAsTargetLabels(grammar28, intArray45);
        python3Target0.targetCharValueEscape = strArray49;
        org.stringtemplate.v4.STGroup sTGroup51 = null;
        python3Target0.templates = sTGroup51;
        python3Target0.language = "\"\"\\\"hi!\\\"\"\"";
        boolean boolean55 = python3Target0.wantsBaseListener();
        int int56 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str57 = python3Target0.getVersion();
        java.lang.String str58 = python3Target0.getVersion();
        java.lang.String str59 = python3Target0.getLanguage();
        java.lang.String[] strArray60 = python3Target0.targetCharValueEscape;
        java.lang.String[] strArray61 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator62 = python3Target0.gen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str64 = python3Target0.getAltLabelContextStructName("\"\\\"i\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\\1" + "'", str27, "\\1");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "d" + "'", str31, "d");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 64 + "'", int34 == 64);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "4.5.2.1" + "'", str36, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 64 + "'", int37 == 64);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(codeGenerator39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 64 + "'", int42 == 64);
        org.junit.Assert.assertNull(sTGroup43);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[]");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 29 + "'", int56 == 29);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "4.5.2.1" + "'", str57, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "4.5.2.1" + "'", str58, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\"\"\\\"hi!\\\"\"\"" + "'", str59, "\"\"\\\"hi!\\\"\"\"");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNull(codeGenerator62);
    }

    @Test
    public void test17021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17021");
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
        java.util.Set<java.lang.String> strSet16 = python3Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target0.getCodeGenerator();
        java.lang.String str18 = python3Target0.getVersion();
        java.lang.String str20 = python3Target0.getTargetStringLiteralFromString("\"\\\"5.2\\\"\"");
        python3Target0.language = "\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"";
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
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"\\\"5.2\\\"\"\"" + "'", str20, "\"\"\\\"5.2\\\"\"\"");
    }

    @Test
    public void test17022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17022");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        python3Target0.gen = codeGenerator9;
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
        java.util.Set<java.lang.String> strSet35 = python3Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = python3Target0.gen;
        python3Target0.language = "\\\"5.2\\\"";
        org.antlr.v4.tool.Grammar grammar39 = null;
        org.stringtemplate.v4.ST sT40 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar39, sT40);
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
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNull(codeGenerator36);
    }

    @Test
    public void test17023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17023");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        python3Target0.gen = codeGenerator9;
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
        java.util.Set<java.lang.String> strSet35 = python3Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = python3Target0.getTokenTypeAsTargetLabel(grammar37, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNull(codeGenerator36);
    }

    @Test
    public void test17024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17024");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getLanguage();
        java.lang.String str7 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target0.getCodeGenerator();
        java.lang.String str11 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target0.gen;
        int int13 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str14 = python3Target0.language;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\"" + "'", str9, "\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\"");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test17025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17025");
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
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target31 = new org.antlr.v4.codegen.target.Python3Target();
        int int32 = python3Target31.getInlineTestSetWordSize();
        java.lang.String str33 = python3Target31.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        java.lang.String str37 = python3Target31.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator34, "", true);
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.stringtemplate.v4.ST sT39 = null;
        python3Target31.genRecognizerHeaderFile(grammar38, sT39, "\"\"\"\"");
        python3Target31.language = "\"\"\"4.5.2.1\"\"\"";
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target45 = new org.antlr.v4.codegen.target.Python3Target();
        int int46 = python3Target45.getInlineTestSetWordSize();
        java.lang.String str47 = python3Target45.language;
        java.lang.String str48 = python3Target45.getVersion();
        python3Target45.language = "@";
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target52 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str54 = python3Target52.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar55 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target56 = new org.antlr.v4.codegen.target.Python3Target();
        int int57 = python3Target56.getInlineTestSetWordSize();
        java.lang.String str58 = python3Target56.language;
        java.lang.String str59 = python3Target56.getVersion();
        int int60 = python3Target56.getInlineTestSetWordSize();
        java.lang.String str61 = python3Target56.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator62 = python3Target56.gen;
        org.antlr.v4.tool.Grammar grammar63 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target64 = new org.antlr.v4.codegen.target.Python3Target();
        int int65 = python3Target64.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup66 = python3Target64.templates;
        org.antlr.v4.tool.Grammar grammar67 = null;
        int[] intArray68 = new int[] {};
        java.lang.String[] strArray69 = python3Target64.getTokenTypesAsTargetLabels(grammar67, intArray68);
        java.lang.String[] strArray70 = python3Target56.getTokenTypesAsTargetLabels(grammar63, intArray68);
        java.lang.String[] strArray71 = python3Target52.getTokenTypesAsTargetLabels(grammar55, intArray68);
        java.lang.String[] strArray72 = python3Target45.getTokenTypesAsTargetLabels(grammar51, intArray68);
        java.lang.String[] strArray73 = python3Target31.getTokenTypesAsTargetLabels(grammar44, intArray68);
        java.lang.String[] strArray74 = python3Target0.getTokenTypesAsTargetLabels(grammar30, intArray68);
        int int75 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str78 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"\"\"\"\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator79 = null;
        java.lang.String str82 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator79, "\"\\\"d\\\"\"", false);
        boolean boolean83 = python3Target0.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str85 = python3Target0.getImplicitSetLabel("\"\"\"\"\"\\\"\\\"1\\\"\\\"\"\"\"\"\"");
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 64 + "'", int32 == 64);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"\"" + "'", str37, "\"\"");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 64 + "'", int46 == 64);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "4.5.2.1" + "'", str48, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "d" + "'", str54, "d");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 64 + "'", int57 == 64);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "4.5.2.1" + "'", str59, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 64 + "'", int60 == 64);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(codeGenerator62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 64 + "'", int65 == 64);
        org.junit.Assert.assertNull(sTGroup66);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[]");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 64 + "'", int75 == 64);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\"\"\"\"\"\"\"\"\"\"\"\"" + "'", str78, "\"\"\"\"\"\"\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\\\"d\\\"" + "'", str82, "\\\"d\\\"");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test17026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17026");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        int int7 = python3Target6.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target6.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        java.lang.String str14 = python3Target6.encodeIntAsCharEscape((int) (short) 100);
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target6.templates;
        java.lang.String str17 = python3Target6.encodeIntAsCharEscape(29);
        boolean boolean18 = python3Target6.wantsBaseVisitor();
        java.lang.String[] strArray19 = python3Target6.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray19;
        int int21 = python3Target0.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet22 = python3Target0.badWords;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
        org.junit.Assert.assertNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\35" + "'", str17, "\\35");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test17027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17027");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.gen;
        java.lang.String str8 = python3Target0.language;
        java.lang.String str9 = python3Target0.getVersion();
        python3Target0.language = "\"\\\"hi!\\\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet13 = python3Target0.badWords;
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        python3Target0.genRecognizerHeaderFile(grammar14, sT15, "\"\\0\"");
        java.util.Set<java.lang.String> strSet18 = python3Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python3Target0.gen;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup20 = python3Target0.getTemplates();
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
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(codeGenerator19);
    }

    @Test
    public void test17028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17028");
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
        int int22 = python3Target0.getInlineTestSetWordSize();
        int int23 = python3Target0.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet24 = python3Target0.getBadWords();
        java.lang.String str25 = python3Target0.language;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python3Target0.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 29 + "'", int23 == 29);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test17029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17029");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python3Target0.gen;
        java.lang.String str20 = python3Target0.encodeIntAsCharEscape((int) '#');
        boolean boolean21 = python3Target0.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#" + "'", str20, "#");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test17030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17030");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getVersion();
        java.lang.String str6 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test17031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17031");
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
        boolean boolean14 = python3Target0.wantsBaseListener();
        python3Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "\"\"4.5.2.1\"\"", false);
        java.lang.String str22 = python3Target0.getTargetStringLiteralFromString("\"\\\".5.2.\\\"\"", false);
        java.lang.String str24 = python3Target0.encodeIntAsCharEscape(0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\\"4.5.2.1\\\"" + "'", str19, "\\\"4.5.2.1\\\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str22, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\0" + "'", str24, "\\0");
    }

    @Test
    public void test17032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17032");
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
        java.lang.String str18 = python3Target0.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target0.getRuleFunctionContextStructName(ruleFunction19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"\\0\"\"" + "'", str14, "\"\"\\0\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "@" + "'", str18, "@");
    }

    @Test
    public void test17033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17033");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.gen;
        java.lang.String str8 = python3Target0.language;
        java.lang.String str9 = python3Target0.getVersion();
        python3Target0.language = "\"\\\"hi!\\\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target0.gen;
        boolean boolean13 = python3Target0.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17034");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        int int6 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        boolean boolean8 = python3Target0.templatesExist();
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17035");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator63 = null;
        java.lang.String str66 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator63, "\\\"\\\"\\\"\\\"", true);
        org.stringtemplate.v4.STGroup sTGroup67 = python3Target0.templates;
        java.lang.String str68 = python3Target0.getVersion();
        java.util.Set<java.lang.String> strSet69 = python3Target0.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST70 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean71 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST70);
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
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\"\\\"\\\"\\\"\\\"\"" + "'", str66, "\"\\\"\\\"\\\"\\\"\"");
        org.junit.Assert.assertNull(sTGroup67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "4.5.2.1" + "'", str68, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet69);
    }

    @Test
    public void test17036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17036");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"\"\"\"", true);
        boolean boolean12 = python3Target0.wantsBaseListener();
        boolean boolean13 = python3Target0.wantsBaseVisitor();
        java.lang.String str15 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet16 = python3Target0.badWords;
        java.lang.String[] strArray17 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target0.templates;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup19 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\"\"" + "'", str11, "\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\12" + "'", str15, "\\12");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNull(sTGroup18);
    }

    @Test
    public void test17037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17037");
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
        boolean boolean21 = python3Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup22 = null;
        python3Target0.templates = sTGroup22;
        org.stringtemplate.v4.STGroup sTGroup24 = null;
        python3Target0.templates = sTGroup24;
        java.lang.String str27 = python3Target0.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        python3Target0.gen = codeGenerator28;
        int int30 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python3Target python3Target31 = new org.antlr.v4.codegen.target.Python3Target();
        int int32 = python3Target31.getInlineTestSetWordSize();
        java.lang.String str33 = python3Target31.language;
        org.stringtemplate.v4.STGroup sTGroup34 = python3Target31.templates;
        boolean boolean35 = python3Target31.templatesExist();
        boolean boolean36 = python3Target31.wantsBaseListener();
        boolean boolean37 = python3Target31.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        python3Target31.gen = codeGenerator38;
        java.lang.String[] strArray40 = python3Target31.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray40;
        python3Target0.targetCharValueEscape = strArray40;
        org.stringtemplate.v4.STGroup sTGroup43 = python3Target0.templates;
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "@" + "'", str27, "@");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 64 + "'", int32 == 64);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(sTGroup34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNull(sTGroup43);
    }

    @Test
    public void test17038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17038");
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
        java.lang.String str18 = python3Target0.encodeIntAsCharEscape(29);
        boolean boolean19 = python3Target0.wantsBaseVisitor();
        python3Target0.language = "\\64";
        java.lang.String str22 = python3Target0.getLanguage();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\35" + "'", str18, "\\35");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\\64" + "'", str22, "\\64");
    }

    @Test
    public void test17039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17039");
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
        org.stringtemplate.v4.STGroup sTGroup18 = null;
        python3Target0.templates = sTGroup18;
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
        python3Target0.targetCharValueEscape = strArray40;
        int int42 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str43 = python3Target0.getLanguage();
        java.lang.String str44 = python3Target0.language;
        java.lang.String str45 = python3Target0.getVersion();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 64 + "'", int35 == 64);
        org.junit.Assert.assertNull(sTGroup36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 64 + "'", int42 == 64);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"\"i\"\"" + "'", str43, "\"\"i\"\"");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\"\"i\"\"" + "'", str44, "\"\"i\"\"");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "4.5.2.1" + "'", str45, "4.5.2.1");
    }

    @Test
    public void test17040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17040");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python3Target15.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python3Target15.gen;
        java.lang.String str23 = python3Target15.getLanguage();
        java.lang.String str24 = python3Target15.language;
        boolean boolean25 = python3Target15.templatesExist();
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target();
        int int27 = python3Target26.getInlineTestSetWordSize();
        java.lang.String str28 = python3Target26.language;
        org.stringtemplate.v4.STGroup sTGroup29 = python3Target26.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = python3Target26.gen;
        java.util.Set<java.lang.String> strSet31 = python3Target26.badWords;
        java.util.Set<java.lang.String> strSet32 = python3Target26.badWords;
        python3Target15.badWords = strSet32;
        python3Target15.language = "";
        org.antlr.v4.tool.Grammar grammar36 = null;
        org.stringtemplate.v4.ST sT37 = null;
        python3Target15.genRecognizerHeaderFile(grammar36, sT37, "\"\"4.5.2.1\"\"");
        java.util.Locale locale41 = null;
        java.lang.String str42 = pythonStringRenderer0.toString((java.lang.Object) grammar36, "", locale41);
        org.antlr.v4.codegen.target.Python3Target python3Target43 = new org.antlr.v4.codegen.target.Python3Target();
        int int44 = python3Target43.getInlineTestSetWordSize();
        boolean boolean45 = python3Target43.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = python3Target43.gen;
        boolean boolean47 = python3Target43.supportsOverloadedMethods();
        boolean boolean48 = python3Target43.supportsOverloadedMethods();
        python3Target43.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = python3Target43.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator51 = null;
        java.lang.String str54 = python3Target43.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator51, "\"\"\"4.5.2.1\"\"\"", false);
        java.util.Locale locale56 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str57 = pythonStringRenderer0.toString((java.lang.Object) python3Target43, "", locale56);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\"" + "'", str21, "\"\"");
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(sTGroup29);
        org.junit.Assert.assertNull(codeGenerator30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 64 + "'", int44 == 64);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(codeGenerator46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(codeGenerator50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\\\"\\\"4.5.2.1\\\"\\\"" + "'", str54, "\\\"\\\"4.5.2.1\\\"\\\"");
    }

    @Test
    public void test17041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17041");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\"", false);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.templates;
        int int13 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"\"\"\"\"4.5.2.1\"\"\"\"\"", false);
        java.lang.String str20 = python3Target0.getTargetStringLiteralFromString("\"\"\\\"\\\"0\\\"\\\"\"\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "\\\"\\\"\\\"12\\\"\\\"\\\"", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"" + "'", str17, "\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"\"\\\"\\\"0\\\"\\\"\"\"\"" + "'", str20, "\"\"\"\\\"\\\"0\\\"\\\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\\"\\\"\\\"12\\\"\\\"\\\"" + "'", str24, "\\\"\\\"\\\"12\\\"\\\"\\\"");
    }

    @Test
    public void test17042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17042");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str8 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        boolean boolean10 = python3Target0.templatesExist();
        java.util.Set<java.lang.String> strSet11 = null;
        python3Target0.badWords = strSet11;
        java.lang.String str13 = python3Target0.language;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        int int15 = python3Target14.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target14.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target14.getCodeGenerator();
        java.util.Set<java.lang.String> strSet18 = python3Target14.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python3Target19.badWords = strSet22;
        python3Target14.badWords = strSet22;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target27 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator26);
        java.lang.String[] strArray28 = python3Target27.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        python3Target27.gen = codeGenerator29;
        java.util.Set<java.lang.String> strSet31 = python3Target27.badWords;
        python3Target14.badWords = strSet31;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target();
        int int34 = python3Target33.getInlineTestSetWordSize();
        java.lang.String str35 = python3Target33.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        java.lang.String str39 = python3Target33.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator36, "", true);
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.stringtemplate.v4.ST sT41 = null;
        python3Target33.genRecognizerHeaderFile(grammar40, sT41, "\"\"\"\"");
        org.stringtemplate.v4.STGroup sTGroup44 = null;
        python3Target33.templates = sTGroup44;
        java.lang.String str46 = python3Target33.language;
        boolean boolean47 = python3Target33.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = python3Target33.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target50 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator49);
        int int51 = python3Target50.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup52 = python3Target50.loadTemplates();
        python3Target33.templates = sTGroup52;
        python3Target14.templates = sTGroup52;
        python3Target0.templates = sTGroup52;
        python3Target0.language = "\"\\\" \\\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = python3Target0.gen;
        java.lang.String str60 = python3Target0.getListLabel("\"\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 64 + "'", int34 == 64);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"\"" + "'", str39, "\"\"");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(codeGenerator48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 64 + "'", int51 == 64);
        org.junit.Assert.assertNotNull(sTGroup52);
        org.junit.Assert.assertNull(codeGenerator58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\"\"" + "'", str60, "\"\"");
    }

    @Test
    public void test17043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17043");
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
        int int18 = python3Target0.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet19 = python3Target0.badWords;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target0.getListLabel("\"\"\\1\"\"");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test17044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17044");
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
        java.lang.String str15 = python3Target0.encodeIntAsCharEscape((int) ' ');
        java.lang.String str16 = python3Target0.language;
        boolean boolean17 = python3Target0.supportsOverloadedMethods();
        int int18 = python3Target0.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup19 = python3Target0.templates;
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
        org.junit.Assert.assertNull(sTGroup19);
    }

    @Test
    public void test17045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17045");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        boolean boolean4 = python3Target0.templatesExist();
        boolean boolean5 = python3Target0.wantsBaseListener();
        python3Target0.addBadWords();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test17046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17046");
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
        java.util.Set<java.lang.String> strSet16 = python3Target0.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target();
        int int18 = python3Target17.getInlineTestSetWordSize();
        java.lang.String str19 = python3Target17.language;
        org.stringtemplate.v4.STGroup sTGroup20 = python3Target17.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python3Target17.gen;
        java.lang.String str22 = python3Target17.getVersion();
        java.lang.String str23 = python3Target17.getLanguage();
        java.lang.String str24 = python3Target17.getLanguage();
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target();
        int int26 = python3Target25.getInlineTestSetWordSize();
        java.lang.String str27 = python3Target25.language;
        java.lang.String str28 = python3Target25.getVersion();
        int int29 = python3Target25.getInlineTestSetWordSize();
        java.lang.String str30 = python3Target25.getLanguage();
        java.lang.String str33 = python3Target25.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean34 = python3Target25.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet35 = python3Target25.getBadWords();
        boolean boolean36 = python3Target25.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python3Target python3Target37 = new org.antlr.v4.codegen.target.Python3Target();
        int int38 = python3Target37.getInlineTestSetWordSize();
        java.lang.String str39 = python3Target37.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        java.lang.String str43 = python3Target37.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator40, "", true);
        java.util.Set<java.lang.String> strSet44 = python3Target37.getBadWords();
        python3Target25.badWords = strSet44;
        python3Target17.badWords = strSet44;
        python3Target0.badWords = strSet44;
        java.lang.Class<?> wildcardClass48 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"4.5.2.1\"\"" + "'", str12, "\"\"4.5.2.1\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\"\".5.2.\"\"\"" + "'", str15, "\"\"\".5.2.\"\"\"");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(sTGroup20);
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "4.5.2.1" + "'", str28, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"4.5.2.1\"" + "'", str33, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 64 + "'", int38 == 64);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"\"" + "'", str43, "\"\"");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test17047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17047");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup6 = null;
        python3Target0.templates = sTGroup6;
        boolean boolean8 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test17048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17048");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.wantsBaseVisitor();
        python3Target0.language = "\"\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"\"";
        java.util.Set<java.lang.String> strSet8 = null;
        python3Target0.badWords = strSet8;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target0.gen = codeGenerator10;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet12 = python3Target0.getBadWords();
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
    public void test17049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17049");
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
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target0.genRecognizerHeaderFile(grammar19, sT20, "12");
        org.antlr.v4.codegen.target.Python3Target python3Target23 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str24 = python3Target23.language;
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup26 = null;
        python3Target25.templates = sTGroup26;
        java.lang.String[] strArray31 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        python3Target25.badWords = strSet32;
        python3Target23.badWords = strSet32;
        python3Target23.language = "\"\"i\"\"";
        java.lang.String str38 = python3Target23.language;
        java.lang.String str40 = python3Target23.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.target.Python3Target python3Target41 = new org.antlr.v4.codegen.target.Python3Target();
        int int42 = python3Target41.getInlineTestSetWordSize();
        java.lang.String str43 = python3Target41.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        java.lang.String str47 = python3Target41.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator44, "", true);
        java.util.Set<java.lang.String> strSet48 = python3Target41.getBadWords();
        java.lang.String str50 = python3Target41.encodeIntAsCharEscape(29);
        java.util.Set<java.lang.String> strSet51 = python3Target41.getBadWords();
        python3Target23.badWords = strSet51;
        python3Target0.badWords = strSet51;
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = python3Target0.gen;
        java.lang.String str55 = python3Target0.language;
        org.antlr.v4.codegen.target.Python3Target python3Target56 = new org.antlr.v4.codegen.target.Python3Target();
        int int57 = python3Target56.getInlineTestSetWordSize();
        java.lang.String str58 = python3Target56.language;
        java.lang.String str59 = python3Target56.getVersion();
        int int60 = python3Target56.getInlineTestSetWordSize();
        java.lang.String str61 = python3Target56.getLanguage();
        java.lang.String str62 = python3Target56.getLanguage();
        java.lang.String str64 = python3Target56.getTargetStringLiteralFromString("\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator65 = null;
        python3Target56.gen = codeGenerator65;
        org.antlr.v4.codegen.target.Python3Target python3Target67 = new org.antlr.v4.codegen.target.Python3Target();
        int int68 = python3Target67.getInlineTestSetWordSize();
        java.lang.String str69 = python3Target67.language;
        java.lang.String str70 = python3Target67.getVersion();
        int int71 = python3Target67.getInlineTestSetWordSize();
        java.lang.String str72 = python3Target67.getLanguage();
        java.lang.String str75 = python3Target67.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean76 = python3Target67.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet77 = python3Target67.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator78 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target79 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator78);
        java.lang.String str81 = python3Target79.encodeIntAsCharEscape((int) (short) 1);
        org.stringtemplate.v4.STGroup sTGroup82 = python3Target79.loadTemplates();
        python3Target67.templates = sTGroup82;
        python3Target56.templates = sTGroup82;
        python3Target0.templates = sTGroup82;
        java.lang.String str87 = python3Target0.getListLabel("\\\"\\\"\\\"0\\\"\\\"\\\"");
        java.lang.String str88 = python3Target0.language;
        java.lang.String str89 = python3Target0.language;
        java.lang.Class<?> wildcardClass90 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"\"\"\"4.5.2.1\"\"\"\"\"" + "'", str17, "\"\"\"\"\"4.5.2.1\"\"\"\"\"");
        org.junit.Assert.assertNull(sTGroup18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\"i\"\"" + "'", str38, "\"\"i\"\"");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"\"" + "'", str40, "\"\"");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 64 + "'", int42 == 64);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"\"" + "'", str47, "\"\"");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\\35" + "'", str50, "\\35");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNull(codeGenerator54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 64 + "'", int57 == 64);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "4.5.2.1" + "'", str59, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 64 + "'", int60 == 64);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\"\"i\"\"" + "'", str64, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 64 + "'", int68 == 64);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "4.5.2.1" + "'", str70, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 64 + "'", int71 == 64);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "\"4.5.2.1\"" + "'", str75, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "\\1" + "'", str81, "\\1");
        org.junit.Assert.assertNotNull(sTGroup82);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "\\\"\\\"\\\"0\\\"\\\"\\\"" + "'", str87, "\\\"\\\"\\\"0\\\"\\\"\\\"");
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test17050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17050");
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
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        python3Target0.gen = codeGenerator13;
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target();
        int int17 = python3Target16.getInlineTestSetWordSize();
        java.lang.String str18 = python3Target16.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python3Target16.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python3Target16.gen;
        java.lang.String str24 = python3Target16.language;
        python3Target16.language = "";
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target28 = new org.antlr.v4.codegen.target.Python3Target();
        int int29 = python3Target28.getInlineTestSetWordSize();
        java.lang.String str30 = python3Target28.language;
        java.lang.String str31 = python3Target28.getVersion();
        int int32 = python3Target28.getInlineTestSetWordSize();
        java.lang.String str33 = python3Target28.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = python3Target28.gen;
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target();
        int int37 = python3Target36.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup38 = python3Target36.templates;
        org.antlr.v4.tool.Grammar grammar39 = null;
        int[] intArray40 = new int[] {};
        java.lang.String[] strArray41 = python3Target36.getTokenTypesAsTargetLabels(grammar39, intArray40);
        java.lang.String[] strArray42 = python3Target28.getTokenTypesAsTargetLabels(grammar35, intArray40);
        java.lang.String[] strArray43 = python3Target16.getTokenTypesAsTargetLabels(grammar27, intArray40);
        java.lang.String[] strArray44 = python3Target0.getTokenTypesAsTargetLabels(grammar15, intArray40);
        org.antlr.v4.tool.Grammar grammar45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = python3Target0.getTokenTypeAsTargetLabel(grammar45, (int) (byte) 1);
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
        org.junit.Assert.assertNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\"" + "'", str22, "\"\"");
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "4.5.2.1" + "'", str31, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 64 + "'", int32 == 64);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(codeGenerator34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 64 + "'", int37 == 64);
        org.junit.Assert.assertNull(sTGroup38);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[]");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
    }

    @Test
    public void test17051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17051");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.gen;
        java.lang.String str8 = python3Target0.getLanguage();
        java.lang.String str9 = python3Target0.language;
        boolean boolean10 = python3Target0.templatesExist();
        python3Target0.addBadWords();
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("\"12\"");
        boolean boolean14 = python3Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.stringtemplate.v4.ST sT16 = null;
        python3Target0.genRecognizerHeaderFile(grammar15, sT16, "\"\"64\"\"");
        boolean boolean19 = python3Target0.templatesExist();
        java.lang.String str20 = python3Target0.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"12\"\"" + "'", str13, "\"\"12\"\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test17052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17052");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.gen;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python3Target0.templates = sTGroup9;
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        java.lang.String str14 = python3Target0.getTargetStringLiteralFromString("\"\"12\"\"", true);
        java.lang.String str15 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python3Target0.gen = codeGenerator16;
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.stringtemplate.v4.ST sT19 = null;
        python3Target0.genRecognizerHeaderFile(grammar18, sT19, "\"\"\"64\"\"\"");
        java.lang.Class<?> wildcardClass22 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"\"12\"\"\"" + "'", str14, "\"\"\"12\"\"\"");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test17053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17053");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet5 = python3Target0.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        int int7 = python3Target6.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target6.language;
        java.lang.String str9 = python3Target6.getLanguage();
        java.lang.String str11 = python3Target6.getTargetStringLiteralFromString("");
        java.lang.String str12 = python3Target6.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target();
        int int14 = python3Target13.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target13.templates;
        org.antlr.v4.tool.Grammar grammar16 = null;
        int[] intArray17 = new int[] {};
        java.lang.String[] strArray18 = python3Target13.getTokenTypesAsTargetLabels(grammar16, intArray17);
        python3Target6.targetCharValueEscape = strArray18;
        java.lang.String str21 = python3Target6.encodeIntAsCharEscape((int) ' ');
        java.lang.String str22 = python3Target6.language;
        python3Target6.language = "";
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        java.lang.String str28 = python3Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator25, "4.5.2.1", false);
        java.util.Set<java.lang.String> strSet29 = python3Target6.getBadWords();
        python3Target0.badWords = strSet29;
        boolean boolean31 = python3Target0.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        python3Target0.gen = codeGenerator32;
        boolean boolean34 = python3Target0.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\12" + "'", str4, "\\12");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"" + "'", str11, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNull(sTGroup15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ".5.2." + "'", str28, ".5.2.");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test17054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17054");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "", false);
        java.util.Set<java.lang.String> strSet9 = null;
        python3Target0.badWords = strSet9;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str12 = python3Target11.language;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup14 = null;
        python3Target13.templates = sTGroup14;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target13.badWords = strSet20;
        python3Target11.badWords = strSet20;
        python3Target11.language = "\"\"i\"\"";
        java.lang.String str26 = python3Target11.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python3Target11.gen = codeGenerator27;
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target();
        int int30 = python3Target29.getInlineTestSetWordSize();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "" };
        python3Target29.targetCharValueEscape = strArray33;
        java.lang.String[] strArray35 = python3Target29.targetCharValueEscape;
        boolean boolean36 = python3Target29.supportsOverloadedMethods();
        java.lang.String[] strArray37 = new java.lang.String[] {};
        python3Target29.targetCharValueEscape = strArray37;
        org.antlr.v4.codegen.target.Python3Target python3Target39 = new org.antlr.v4.codegen.target.Python3Target();
        int int40 = python3Target39.getInlineTestSetWordSize();
        java.lang.String str41 = python3Target39.language;
        java.lang.String str42 = python3Target39.getVersion();
        int int43 = python3Target39.getInlineTestSetWordSize();
        java.lang.String str44 = python3Target39.getLanguage();
        java.lang.String str47 = python3Target39.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet48 = python3Target39.badWords;
        python3Target29.badWords = strSet48;
        python3Target11.badWords = strSet48;
        python3Target0.badWords = strSet48;
        java.lang.String[] strArray52 = python3Target0.targetCharValueEscape;
        java.lang.String str53 = python3Target0.language;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4.5.2.1" + "'", str26, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 64 + "'", int40 == 64);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "4.5.2.1" + "'", str42, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 64 + "'", int43 == 64);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"4.5.2.1\"" + "'", str47, "\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test17055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17055");
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
        boolean boolean21 = python3Target0.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet22 = python3Target0.badWords;
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.stringtemplate.v4.ST sT24 = null;
        python3Target0.genRecognizerHeaderFile(grammar23, sT24, "");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python3Target0.getRuleFunctionContextStructName(ruleFunction27);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test17056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17056");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        python3Target0.addBadWords();
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "@", false);
        java.lang.String[] strArray11 = python3Target0.targetCharValueEscape;
        int int12 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str13 = python3Target0.language;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test17057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17057");
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
        java.lang.String str22 = python3Target0.getTargetStringLiteralFromString("\"4.5.2.1\"");
        python3Target0.language = "\"\"\"64\"\"\"";
        boolean boolean25 = python3Target0.wantsBaseListener();
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str28 = python3Target26.getTargetStringLiteralFromString("\"\"");
        int int29 = python3Target26.getInlineTestSetWordSize();
        boolean boolean30 = python3Target26.supportsOverloadedMethods();
        java.lang.String str32 = python3Target26.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.stringtemplate.v4.ST sT34 = null;
        python3Target26.genRecognizerHeaderFile(grammar33, sT34, "\"\"");
        org.antlr.v4.codegen.target.Python3Target python3Target37 = new org.antlr.v4.codegen.target.Python3Target();
        int int38 = python3Target37.getInlineTestSetWordSize();
        boolean boolean39 = python3Target37.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = python3Target37.gen;
        boolean boolean41 = python3Target37.wantsBaseVisitor();
        java.lang.String str42 = python3Target37.language;
        java.lang.String str45 = python3Target37.getTargetStringLiteralFromString("\\0", false);
        int int46 = python3Target37.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet47 = python3Target37.getBadWords();
        python3Target26.badWords = strSet47;
        python3Target0.badWords = strSet47;
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = null;
        java.lang.String str53 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator50, "\"\"\"\".5.2.\"\"\"\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = null;
        java.lang.String str57 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator54, "\"\\\"\\\"\\\"\\\"\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str59 = python3Target0.getImplicitRuleLabel("\"\"\"\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"\"\"\"");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\"4.5.2.1\"\"" + "'", str22, "\"\"4.5.2.1\"\"");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\"\"\"" + "'", str28, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\\12" + "'", str32, "\\12");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 64 + "'", int38 == 64);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(codeGenerator40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\\0" + "'", str45, "\\0");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 64 + "'", int46 == 64);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\\\"\\\"\\\".5.2.\\\"\\\"\\\"" + "'", str53, "\\\"\\\"\\\".5.2.\\\"\\\"\\\"");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\\\"\\\"\\\"\\\"" + "'", str57, "\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test17058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17058");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        python3Target0.addBadWords();
        python3Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\"\" \"\"", false);
        java.lang.String str12 = python3Target0.encodeIntAsCharEscape(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getElementListName("\"\"\"\"\\\"\\\"64\\\"\\\"\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\\" \\\"" + "'", str10, "\\\" \\\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d" + "'", str12, "d");
    }

    @Test
    public void test17059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17059");
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
        int int21 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        python3Target0.gen = codeGenerator23;
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python3Target0.gen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29 + "'", int21 == 29);
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertNull(codeGenerator25);
    }

    @Test
    public void test17060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17060");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "\"\"");
        java.lang.String[] strArray11 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet12 = python3Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"\"\"\"\"\"\\\"\\\"\\\"i\\\"\\\"\\\"\"\"\"\"\"\"", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"i\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\"" + "'", str17, "\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"i\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test17061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17061");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.util.Set<java.lang.String> strSet7 = python3Target0.getBadWords();
        java.lang.String str9 = python3Target0.encodeIntAsCharEscape(29);
        java.util.Set<java.lang.String> strSet10 = python3Target0.getBadWords();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target12.language;
        java.lang.String str15 = python3Target12.getVersion();
        org.stringtemplate.v4.STGroup sTGroup16 = null;
        python3Target12.templates = sTGroup16;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python3Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "d", false);
        java.util.Set<java.lang.String> strSet22 = python3Target12.getBadWords();
        java.lang.String[] strArray23 = python3Target12.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target();
        int int26 = python3Target25.getInlineTestSetWordSize();
        java.lang.String str27 = python3Target25.language;
        org.stringtemplate.v4.STGroup sTGroup28 = python3Target25.templates;
        java.lang.String str30 = python3Target25.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str32 = python3Target25.getTargetStringLiteralFromString("");
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target34 = new org.antlr.v4.codegen.target.Python3Target();
        int int35 = python3Target34.getInlineTestSetWordSize();
        boolean boolean36 = python3Target34.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = python3Target34.gen;
        boolean boolean38 = python3Target34.wantsBaseVisitor();
        boolean boolean39 = python3Target34.supportsOverloadedMethods();
        java.lang.String str42 = python3Target34.getTargetStringLiteralFromString("\\0", false);
        boolean boolean43 = python3Target34.templatesExist();
        python3Target34.addBadWords();
        org.antlr.v4.tool.Grammar grammar45 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target46 = new org.antlr.v4.codegen.target.Python3Target();
        int int47 = python3Target46.getInlineTestSetWordSize();
        java.lang.String str48 = python3Target46.language;
        java.lang.String str49 = python3Target46.getVersion();
        int int50 = python3Target46.getInlineTestSetWordSize();
        java.lang.String str51 = python3Target46.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = python3Target46.gen;
        org.antlr.v4.tool.Grammar grammar53 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target54 = new org.antlr.v4.codegen.target.Python3Target();
        int int55 = python3Target54.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup56 = python3Target54.templates;
        org.antlr.v4.tool.Grammar grammar57 = null;
        int[] intArray58 = new int[] {};
        java.lang.String[] strArray59 = python3Target54.getTokenTypesAsTargetLabels(grammar57, intArray58);
        java.lang.String[] strArray60 = python3Target46.getTokenTypesAsTargetLabels(grammar53, intArray58);
        java.lang.String[] strArray61 = python3Target34.getTokenTypesAsTargetLabels(grammar45, intArray58);
        java.lang.String[] strArray62 = python3Target25.getTokenTypesAsTargetLabels(grammar33, intArray58);
        java.lang.String[] strArray63 = python3Target12.getTokenTypesAsTargetLabels(grammar24, intArray58);
        java.lang.String[] strArray64 = python3Target0.getTokenTypesAsTargetLabels(grammar11, intArray58);
        boolean boolean65 = python3Target0.wantsBaseVisitor();
        java.lang.String[] strArray66 = python3Target0.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str68 = python3Target0.getListLabel("\".5.2.\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\35" + "'", str9, "\\35");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(sTGroup28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"\"hi!\"\"" + "'", str30, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"" + "'", str32, "\"\"");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 64 + "'", int35 == 64);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(codeGenerator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\\0" + "'", str42, "\\0");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 64 + "'", int47 == 64);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "4.5.2.1" + "'", str49, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 64 + "'", int50 == 64);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(codeGenerator52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 64 + "'", int55 == 64);
        org.junit.Assert.assertNull(sTGroup56);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[]");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strArray66);
    }

    @Test
    public void test17062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17062");
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
        java.lang.String str14 = python3Target0.encodeIntAsCharEscape(29);
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str17 = python3Target15.getTargetStringLiteralFromString("\"\"");
        int int18 = python3Target15.getInlineTestSetWordSize();
        java.lang.String str20 = python3Target15.encodeIntAsCharEscape(0);
        java.lang.String str22 = python3Target15.getTargetStringLiteralFromString("");
        int int23 = python3Target15.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        java.lang.String str27 = python3Target15.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator24, "\\12", false);
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.stringtemplate.v4.ST sT29 = null;
        python3Target15.genRecognizerHeaderFile(grammar28, sT29, "d");
        int int32 = python3Target15.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        python3Target15.gen = codeGenerator33;
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.stringtemplate.v4.ST sT36 = null;
        python3Target15.genRecognizerHeaderFile(grammar35, sT36, "\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"");
        java.util.Set<java.lang.String> strSet39 = python3Target15.badWords;
        python3Target0.badWords = strSet39;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = python3Target0.getImplicitSetLabel("\"\"\\\"35\\\"\"\"");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\35" + "'", str14, "\\35");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"\"\"" + "'", str17, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\0" + "'", str20, "\\0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\"" + "'", str22, "\"\"");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1" + "'", str27, "1");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 64 + "'", int32 == 64);
        org.junit.Assert.assertNotNull(strSet39);
    }

    @Test
    public void test17063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17063");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        boolean boolean6 = python3Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        boolean boolean9 = python3Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test17064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17064");
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
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        python3Target13.gen = codeGenerator14;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target();
        int int17 = python3Target16.getInlineTestSetWordSize();
        java.lang.String str18 = python3Target16.language;
        java.lang.String str19 = python3Target16.getVersion();
        int int20 = python3Target16.getInlineTestSetWordSize();
        java.lang.String str21 = python3Target16.getLanguage();
        java.lang.String str24 = python3Target16.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean25 = python3Target16.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet26 = python3Target16.getBadWords();
        python3Target13.badWords = strSet26;
        python3Target0.badWords = strSet26;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = python3Target0.getImplicitRuleLabel("\"se\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4.5.2.1" + "'", str19, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"4.5.2.1\"" + "'", str24, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test17065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17065");
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
        java.lang.String str14 = python3Target0.language;
        int int15 = python3Target0.getInlineTestSetWordSize();
        python3Target0.language = "3";
        boolean boolean18 = python3Target0.supportsOverloadedMethods();
        java.lang.String str20 = python3Target0.getTargetStringLiteralFromString("\"\"\".5.2.\"\"\"");
        java.lang.String str21 = python3Target0.getLanguage();
        java.lang.String[] strArray22 = python3Target0.targetCharValueEscape;
        java.lang.String str24 = python3Target0.getTargetStringLiteralFromString("\"\"\"\" \"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        java.lang.String str28 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator25, "\"\"\"\"\"\"\\1\"\"\"\"\"\"", false);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\0" + "'", str14, "\\0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"\"\".5.2.\"\"\"\"" + "'", str20, "\"\"\"\".5.2.\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "3" + "'", str21, "3");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"\"\"\" \"\"\"\"\"" + "'", str24, "\"\"\"\"\" \"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\\\"\\\"\\\"\\\"\\\"1\\\"\\\"\\\"\\\"\\\"" + "'", str28, "\\\"\\\"\\\"\\\"\\\"1\\\"\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test17066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17066");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str6 = python3Target0.language;
        java.lang.String str7 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\"hi!\"\"");
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        int int11 = python3Target10.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet12 = python3Target10.getBadWords();
        python3Target0.badWords = strSet12;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        python3Target0.gen = codeGenerator14;
        java.lang.String str16 = python3Target0.getVersion();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str9, "\"\"\"hi!\"\"\"");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
    }

    @Test
    public void test17067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17067");
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
        java.lang.String str14 = python3Target0.language;
        boolean boolean15 = python3Target0.wantsBaseListener();
        java.lang.String str18 = python3Target0.getTargetStringLiteralFromString("\"5.2\"", true);
        int int19 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str20 = python3Target0.language;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"hi!\"" + "'", str14, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"5.2\"\"" + "'", str18, "\"\"5.2\"\"");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 29 + "'", int19 == 29);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"hi!\"" + "'", str20, "\"hi!\"");
    }

    @Test
    public void test17068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17068");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python3Target0.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.gen;
        java.lang.String[] strArray12 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        python3Target0.gen = codeGenerator13;
        java.util.Set<java.lang.String> strSet15 = python3Target0.getBadWords();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8, "\"4.5.2.1\"");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test17069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17069");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        int int11 = python3Target10.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target10.language;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target10.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target10.gen;
        java.util.Set<java.lang.String> strSet15 = python3Target10.badWords;
        python3Target0.badWords = strSet15;
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.stringtemplate.v4.ST sT18 = null;
        python3Target0.genRecognizerHeaderFile(grammar17, sT18, "\"\"\\64\"\"");
        java.util.Set<java.lang.String> strSet21 = python3Target0.getBadWords();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(sTGroup13);
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test17070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17070");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target0.genRecognizerHeaderFile(grammar4, sT5, "\"\"\"\"");
        boolean boolean8 = python3Target0.wantsBaseListener();
        int int9 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str11 = python3Target0.getTargetStringLiteralFromString("\"\"\\\"4.5.2.1\\\"\"\"");
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("\"\"hi!\"\"");
        java.lang.String str14 = python3Target0.language;
        java.lang.String str17 = python3Target0.getTargetStringLiteralFromString("\"\"\\\"\\\"4.5.2.1\\\"\\\"\"\"", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"\"\\\"4.5.2.1\\\"\"\"\"" + "'", str11, "\"\"\"\\\"4.5.2.1\\\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str13, "\"\"\"hi!\"\"\"");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"\"\\\"\\\"4.5.2.1\\\"\\\"\"\"\"" + "'", str17, "\"\"\"\\\"\\\"4.5.2.1\\\"\\\"\"\"\"");
    }

    @Test
    public void test17071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17071");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        boolean boolean9 = python3Target0.templatesExist();
        boolean boolean10 = python3Target0.supportsOverloadedMethods();
        python3Target0.language = "\"\\\"\\\"hi!\\\"\\\"\"";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test17072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17072");
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
        java.lang.String str13 = python3Target0.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        int int15 = python3Target14.getInlineTestSetWordSize();
        boolean boolean16 = python3Target14.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target14.gen;
        boolean boolean18 = python3Target14.supportsOverloadedMethods();
        java.lang.String[] strArray19 = python3Target14.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray19;
        java.lang.String str22 = python3Target0.encodeIntAsCharEscape((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python3Target0.getImplicitSetLabel("\"\"\"\"\"\\\"\\\"\\\"64\\\"\\\"\\\"\"\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\\1" + "'", str22, "\\1");
    }

    @Test
    public void test17073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17073");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"#\"");
        boolean boolean10 = python3Target0.templatesExist();
        java.lang.String str12 = python3Target0.encodeIntAsCharEscape(29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"#\"\"" + "'", str9, "\"\"#\"\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\35" + "'", str12, "\\35");
    }

    @Test
    public void test17074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17074");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        python3Target0.addBadWords();
        java.lang.String str6 = python3Target0.language;
        java.util.Set<java.lang.String> strSet7 = python3Target0.getBadWords();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test17075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17075");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"\"", false);
        boolean boolean18 = python3Target0.supportsOverloadedMethods();
        java.lang.String str20 = python3Target0.encodeIntAsCharEscape((int) (short) 0);
        java.lang.String str23 = python3Target0.getTargetStringLiteralFromString("d", false);
        java.lang.String str24 = python3Target0.getLanguage();
        python3Target0.addBadWords();
        org.antlr.v4.tool.Grammar grammar26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python3Target0.getTokenTypeAsTargetLabel(grammar26, 0);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\0" + "'", str20, "\\0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test17076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17076");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.getTemplates();
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
    public void test17077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17077");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(10);
        boolean boolean7 = python3Target0.templatesExist();
        java.lang.String[] strArray8 = python3Target0.targetCharValueEscape;
        boolean boolean9 = python3Target0.templatesExist();
        java.lang.String str11 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        java.lang.String str12 = python3Target0.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target0.templates;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"\"\"\"\"" + "'", str11, "\"\"\"\"\"\"");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(sTGroup13);
    }

    @Test
    public void test17078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17078");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        python3Target0.gen = codeGenerator4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python3Target0.gen = codeGenerator6;
        int int8 = python3Target0.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.templates;
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        python3Target0.language = "\"\"\\\"\\\"\\\"0\\\"\\\"\\\"\"\"";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertNull(sTGroup9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test17079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17079");
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
        java.lang.String str14 = python3Target0.getLanguage();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test17080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17080");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target0.gen;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str18 = python3Target16.getTargetStringLiteralFromString("\"\"");
        int int19 = python3Target16.getInlineTestSetWordSize();
        boolean boolean20 = python3Target16.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup21 = python3Target16.templates;
        java.util.Set<java.lang.String> strSet22 = python3Target16.getBadWords();
        java.util.Set<java.lang.String> strSet23 = python3Target16.getBadWords();
        python3Target0.badWords = strSet23;
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        java.lang.String str28 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator25, "\"\\\"\\\"\\\"\\\"\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.stringtemplate.v4.ST sT31 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar30, sT31);
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
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"\"\"" + "'", str18, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(sTGroup21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\\\"\\\"\\\"\\\"\"" + "'", str28, "\"\\\"\\\"\\\"\\\"\"");
        org.junit.Assert.assertNull(codeGenerator29);
    }

    @Test
    public void test17081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17081");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python3Target0.gen = codeGenerator11;
        boolean boolean13 = python3Target0.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getElementName("\"\\\"\\\"\\\"\\\"\\\"\\\"1\\\"\\\"\\\"\\\"\\\"\\\"\"");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17082");
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
        java.lang.String[] strArray14 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.stringtemplate.v4.ST sT16 = null;
        python3Target0.genRecognizerHeaderFile(grammar15, sT16, "\\\"4.5.2.1\\\"");
        boolean boolean19 = python3Target0.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test17083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17083");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.addBadWords();
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        int int13 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target0.language;
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"hi!\"\"" + "'", str12, "\"\"hi!\"\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test17084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17084");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        python3Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"\"\"4.5.2.1\"\"\"", false);
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target12.language;
        java.lang.String str15 = python3Target12.getVersion();
        int int16 = python3Target12.getInlineTestSetWordSize();
        java.lang.String str17 = python3Target12.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python3Target12.gen;
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target20 = new org.antlr.v4.codegen.target.Python3Target();
        int int21 = python3Target20.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup22 = python3Target20.templates;
        org.antlr.v4.tool.Grammar grammar23 = null;
        int[] intArray24 = new int[] {};
        java.lang.String[] strArray25 = python3Target20.getTokenTypesAsTargetLabels(grammar23, intArray24);
        java.lang.String[] strArray26 = python3Target12.getTokenTypesAsTargetLabels(grammar19, intArray24);
        java.lang.String str29 = python3Target12.getTargetStringLiteralFromString("", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        java.lang.String str33 = python3Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator30, "\"i\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = python3Target12.gen;
        org.stringtemplate.v4.STGroup sTGroup35 = null;
        python3Target12.templates = sTGroup35;
        java.lang.String[] strArray37 = python3Target12.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray37;
        org.antlr.v4.tool.Rule rule39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = python3Target0.getRuleFunctionContextStructName(rule39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\"4.5.2.1\\\"\\\"" + "'", str11, "\\\"\\\"4.5.2.1\\\"\\\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNull(sTGroup22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"i\"" + "'", str33, "\"i\"");
        org.junit.Assert.assertNull(codeGenerator34);
        org.junit.Assert.assertNotNull(strArray37);
    }

    @Test
    public void test17085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17085");
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
        boolean boolean18 = python3Target0.templatesExist();
        boolean boolean19 = python3Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        python3Target0.gen = codeGenerator20;
        java.lang.String[] strArray22 = python3Target0.targetCharValueEscape;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test17086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17086");
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
        org.antlr.v4.codegen.target.Python3Target python3Target20 = new org.antlr.v4.codegen.target.Python3Target();
        int int21 = python3Target20.getInlineTestSetWordSize();
        boolean boolean22 = python3Target20.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python3Target20.gen;
        boolean boolean24 = python3Target20.wantsBaseVisitor();
        boolean boolean25 = python3Target20.supportsOverloadedMethods();
        java.lang.String str28 = python3Target20.getTargetStringLiteralFromString("\\0", false);
        java.lang.String str30 = python3Target20.encodeIntAsCharEscape(10);
        java.util.Set<java.lang.String> strSet31 = python3Target20.getBadWords();
        python3Target0.badWords = strSet31;
        java.lang.String str33 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup34 = python3Target0.templates;
        python3Target0.addBadWords();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\\0" + "'", str28, "\\0");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\\12" + "'", str30, "\\12");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(sTGroup34);
    }

    @Test
    public void test17087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17087");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("\"\"\"4.5.2.1\"\"\"");
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup7 = null;
        python3Target6.templates = sTGroup7;
        java.util.Set<java.lang.String> strSet9 = null;
        python3Target6.badWords = strSet9;
        boolean boolean11 = python3Target6.wantsBaseListener();
        java.lang.String[] strArray12 = python3Target6.targetCharValueEscape;
        java.lang.String str14 = python3Target6.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python3Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"", true);
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target20 = new org.antlr.v4.codegen.target.Python3Target();
        int int21 = python3Target20.getInlineTestSetWordSize();
        java.lang.String str22 = python3Target20.language;
        java.lang.String str23 = python3Target20.getVersion();
        python3Target20.language = "@";
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target27 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str29 = python3Target27.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target31 = new org.antlr.v4.codegen.target.Python3Target();
        int int32 = python3Target31.getInlineTestSetWordSize();
        java.lang.String str33 = python3Target31.language;
        java.lang.String str34 = python3Target31.getVersion();
        int int35 = python3Target31.getInlineTestSetWordSize();
        java.lang.String str36 = python3Target31.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = python3Target31.gen;
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target39 = new org.antlr.v4.codegen.target.Python3Target();
        int int40 = python3Target39.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup41 = python3Target39.templates;
        org.antlr.v4.tool.Grammar grammar42 = null;
        int[] intArray43 = new int[] {};
        java.lang.String[] strArray44 = python3Target39.getTokenTypesAsTargetLabels(grammar42, intArray43);
        java.lang.String[] strArray45 = python3Target31.getTokenTypesAsTargetLabels(grammar38, intArray43);
        java.lang.String[] strArray46 = python3Target27.getTokenTypesAsTargetLabels(grammar30, intArray43);
        java.lang.String[] strArray47 = python3Target20.getTokenTypesAsTargetLabels(grammar26, intArray43);
        java.lang.String[] strArray48 = python3Target6.getTokenTypesAsTargetLabels(grammar19, intArray43);
        java.lang.String[] strArray49 = python3Target0.getTokenTypesAsTargetLabels(grammar5, intArray43);
        boolean boolean50 = python3Target0.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"\"\"4.5.2.1\"\"\"\"" + "'", str4, "\"\"\"\"4.5.2.1\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"\\\"hi!\\\"\"\"" + "'", str14, "\"\"\\\"hi!\\\"\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\"" + "'", str18, "\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4.5.2.1" + "'", str23, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "d" + "'", str29, "d");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 64 + "'", int32 == 64);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "4.5.2.1" + "'", str34, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 64 + "'", int35 == 64);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(codeGenerator37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 64 + "'", int40 == 64);
        org.junit.Assert.assertNull(sTGroup41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[]");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test17088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17088");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python3Target0.genRecognizerHeaderFile(grammar8, sT9, "\"hi!\"");
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\\0\"\"\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getImplicitTokenLabel("\"\"_tset\\\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\1\"" + "'", str7, "\"\\1\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"\"\"\"\\0\"\"\"\"\"" + "'", str13, "\"\"\"\"\"\\0\"\"\"\"\"");
    }

    @Test
    public void test17089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17089");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        java.util.Set<java.lang.String> strSet7 = python3Target0.getBadWords();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str11 = python3Target9.getTargetStringLiteralFromString("\"\"");
        int int12 = python3Target9.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target9.encodeIntAsCharEscape(0);
        java.lang.String str16 = python3Target9.getTargetStringLiteralFromString("");
        java.util.Set<java.lang.String> strSet17 = python3Target9.getBadWords();
        java.lang.String str18 = python3Target9.getLanguage();
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target20 = new org.antlr.v4.codegen.target.Python3Target();
        int int21 = python3Target20.getInlineTestSetWordSize();
        java.lang.String str22 = python3Target20.language;
        java.lang.String str23 = python3Target20.getLanguage();
        java.lang.String str25 = python3Target20.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        java.lang.String str29 = python3Target20.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator26, "hi!", true);
        int int30 = python3Target20.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target32 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str33 = python3Target32.language;
        org.antlr.v4.codegen.target.Python3Target python3Target34 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup35 = null;
        python3Target34.templates = sTGroup35;
        java.lang.String[] strArray40 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        python3Target34.badWords = strSet41;
        python3Target32.badWords = strSet41;
        org.antlr.v4.tool.Grammar grammar45 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target46 = new org.antlr.v4.codegen.target.Python3Target();
        int int47 = python3Target46.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup48 = python3Target46.templates;
        org.antlr.v4.tool.Grammar grammar49 = null;
        int[] intArray50 = new int[] {};
        java.lang.String[] strArray51 = python3Target46.getTokenTypesAsTargetLabels(grammar49, intArray50);
        java.lang.String[] strArray52 = python3Target32.getTokenTypesAsTargetLabels(grammar45, intArray50);
        java.lang.String[] strArray53 = python3Target20.getTokenTypesAsTargetLabels(grammar31, intArray50);
        java.lang.String[] strArray54 = python3Target9.getTokenTypesAsTargetLabels(grammar19, intArray50);
        java.lang.String[] strArray55 = python3Target0.getTokenTypesAsTargetLabels(grammar8, intArray50);
        java.util.Set<java.lang.String> strSet56 = python3Target0.getBadWords();
        python3Target0.language = "\"\"\"\"1\"\"\"\"";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"\"\"" + "'", str11, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\0" + "'", str14, "\\0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\"" + "'", str25, "\"\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"i\"" + "'", str29, "\"i\"");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 29 + "'", int30 == 29);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 64 + "'", int47 == 64);
        org.junit.Assert.assertNull(sTGroup48);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[]");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strSet56);
    }

    @Test
    public void test17090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17090");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        java.lang.String str8 = python3Target0.language;
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
    }

    @Test
    public void test17091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17091");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        python3Target0.addBadWords();
        java.lang.String str6 = python3Target0.language;
        java.lang.String str7 = python3Target0.getVersion();
        boolean boolean8 = python3Target0.wantsBaseListener();
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
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test17092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17092");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\"i\"\"", true);
        boolean boolean9 = python3Target0.wantsBaseVisitor();
        boolean boolean10 = python3Target0.wantsBaseListener();
        java.lang.String str11 = python3Target0.language;
        java.util.Set<java.lang.String> strSet12 = python3Target0.badWords;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\1" + "'", str4, "\\1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"i\\\"\"" + "'", str8, "\"\\\"i\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test17093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17093");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        java.lang.String str10 = python3Target0.encodeIntAsCharEscape(10);
        java.util.Set<java.lang.String> strSet11 = python3Target0.getBadWords();
        python3Target0.language = "\\12";
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target0.templates;
        boolean boolean16 = python3Target0.templatesExist();
        java.lang.String str17 = python3Target0.language;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\12" + "'", str10, "\\12");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\12" + "'", str17, "\\12");
    }

    @Test
    public void test17094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17094");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.getCodeGenerator();
        python3Target0.language = "\"\"\"\"\"\"\"\"\\\"\\\"\"\"\"\"\"\"\"\"";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test17095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17095");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        int int7 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target0.getLanguage();
        java.lang.String str9 = python3Target0.getLanguage();
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.gen;
        int int12 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar13, sT14, "\\\"\\\"hi!\\\"\\\"");
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test17096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17096");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target12.language;
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target12.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target12.gen;
        java.lang.String str17 = python3Target12.getVersion();
        java.lang.String str18 = python3Target12.getLanguage();
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target20 = new org.antlr.v4.codegen.target.Python3Target();
        int int21 = python3Target20.getInlineTestSetWordSize();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "" };
        python3Target20.targetCharValueEscape = strArray24;
        java.util.Set<java.lang.String> strSet26 = python3Target20.badWords;
        org.stringtemplate.v4.STGroup sTGroup27 = python3Target20.templates;
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target();
        int int30 = python3Target29.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup31 = python3Target29.templates;
        org.antlr.v4.tool.Grammar grammar32 = null;
        int[] intArray33 = new int[] {};
        java.lang.String[] strArray34 = python3Target29.getTokenTypesAsTargetLabels(grammar32, intArray33);
        java.lang.String[] strArray35 = python3Target20.getTokenTypesAsTargetLabels(grammar28, intArray33);
        java.lang.String[] strArray36 = python3Target12.getTokenTypesAsTargetLabels(grammar19, intArray33);
        java.lang.String[] strArray37 = python3Target0.getTokenTypesAsTargetLabels(grammar11, intArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup38 = python3Target0.loadTemplates();
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
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(sTGroup15);
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(sTGroup27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertNull(sTGroup31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
    }

    @Test
    public void test17097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17097");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python3Target0.gen;
        org.stringtemplate.v4.STGroup sTGroup22 = python3Target0.templates;
        java.lang.String str24 = python3Target0.encodeIntAsCharEscape((int) ' ');
        int int25 = python3Target0.getSerializedATNSegmentLimit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertNull(sTGroup22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " " + "'", str24, " ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 29 + "'", int25 == 29);
    }

    @Test
    public void test17098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17098");
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
        java.lang.String str38 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str41 = python3Target0.getTargetStringLiteralFromString("\"\"\"\\1\"\"\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        python3Target0.gen = codeGenerator42;
        java.lang.String str44 = python3Target0.getLanguage();
        boolean boolean45 = python3Target0.templatesExist();
        python3Target0.addBadWords();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\"\"\"" + "'", str38, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"\"\"\"\\1\"\"\"\"" + "'", str41, "\"\"\"\"\\1\"\"\"\"");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test17099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17099");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        boolean boolean9 = python3Target0.templatesExist();
        python3Target0.addBadWords();
        java.lang.String str12 = python3Target0.encodeIntAsCharEscape((int) ' ');
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        python3Target0.genRecognizerHeaderFile(grammar13, sT14, "\\64");
        org.stringtemplate.v4.STGroup sTGroup17 = null;
        python3Target0.templates = sTGroup17;
        org.stringtemplate.v4.STGroup sTGroup19 = null;
        python3Target0.templates = sTGroup19;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target0.getElementListName("");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
    }

    @Test
    public void test17100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17100");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target0.gen;
        boolean boolean13 = python3Target0.wantsBaseListener();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getRuleFunctionContextStructName(ruleFunction14);
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
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17101");
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
        boolean boolean22 = python3Target0.templatesExist();
        java.lang.String str23 = python3Target0.language;
        python3Target0.language = "\"\"\"\"\"4.5.2.1\"\"\"\"\"";
        java.lang.String str27 = python3Target0.encodeIntAsCharEscape(1);
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.stringtemplate.v4.ST sT29 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar28, sT29);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\\1" + "'", str27, "\\1");
    }

    @Test
    public void test17102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17102");
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
        java.lang.String str15 = python3Target0.getLanguage();
        python3Target0.language = "\"\"\\\"\\\"\\\"64\\\"\\\"\\\"\"\"";
        java.lang.Class<?> wildcardClass18 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test17103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17103");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) (short) 100);
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.templates;
        org.stringtemplate.v4.STGroup sTGroup10 = null;
        python3Target0.templates = sTGroup10;
        java.lang.String str12 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "\"\\\"\\\"\\\"\\\"\"", true);
        int int17 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup19 = null;
        python3Target18.templates = sTGroup19;
        java.util.Set<java.lang.String> strSet21 = null;
        python3Target18.badWords = strSet21;
        boolean boolean23 = python3Target18.templatesExist();
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target();
        int int25 = python3Target24.getInlineTestSetWordSize();
        java.lang.String str26 = python3Target24.language;
        java.lang.String str27 = python3Target24.getLanguage();
        java.lang.String str29 = python3Target24.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        java.lang.String str33 = python3Target24.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator30, "hi!", true);
        int int34 = python3Target24.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        java.lang.String str38 = python3Target24.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator35, "4.5.2.1", true);
        java.lang.String[] strArray39 = python3Target24.targetCharValueEscape;
        java.lang.String str40 = python3Target24.getVersion();
        java.lang.String str41 = python3Target24.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target42 = new org.antlr.v4.codegen.target.Python3Target();
        int int43 = python3Target42.getInlineTestSetWordSize();
        java.lang.String str44 = python3Target42.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = python3Target42.getCodeGenerator();
        java.util.Set<java.lang.String> strSet46 = python3Target42.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target47 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        python3Target47.badWords = strSet50;
        python3Target42.badWords = strSet50;
        java.lang.String str54 = python3Target42.getVersion();
        java.lang.String str56 = python3Target42.encodeIntAsCharEscape(29);
        java.lang.String str59 = python3Target42.getTargetStringLiteralFromString("", true);
        org.antlr.v4.codegen.target.Python3Target python3Target60 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup61 = null;
        python3Target60.templates = sTGroup61;
        java.util.Set<java.lang.String> strSet63 = null;
        python3Target60.badWords = strSet63;
        boolean boolean65 = python3Target60.supportsOverloadedMethods();
        int int66 = python3Target60.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python3Target python3Target67 = new org.antlr.v4.codegen.target.Python3Target();
        int int68 = python3Target67.getInlineTestSetWordSize();
        boolean boolean69 = python3Target67.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator70 = python3Target67.gen;
        boolean boolean71 = python3Target67.wantsBaseVisitor();
        boolean boolean72 = python3Target67.supportsOverloadedMethods();
        java.lang.String str75 = python3Target67.getTargetStringLiteralFromString("\\0", false);
        boolean boolean76 = python3Target67.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator77 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target78 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator77);
        java.lang.String str80 = python3Target78.encodeIntAsCharEscape((int) (short) 1);
        org.stringtemplate.v4.STGroup sTGroup81 = python3Target78.loadTemplates();
        python3Target67.templates = sTGroup81;
        python3Target60.templates = sTGroup81;
        python3Target42.templates = sTGroup81;
        python3Target24.templates = sTGroup81;
        python3Target18.templates = sTGroup81;
        java.lang.String str87 = python3Target18.getLanguage();
        java.lang.String str89 = python3Target18.getListLabel("\\\"\\\"\\\"\\\"64\\\"\\\"\\\"\\\"");
        org.stringtemplate.v4.STGroup sTGroup90 = python3Target18.getTemplates();
        python3Target0.templates = sTGroup90;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"\\\"\\\"\\\"\"" + "'", str16, "\"\\\"\\\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"" + "'", str29, "\"\"");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"i\"" + "'", str33, "\"i\"");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 29 + "'", int34 == 29);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\".5.2.\"" + "'", str38, "\".5.2.\"");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "4.5.2.1" + "'", str40, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "4.5.2.1" + "'", str41, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 64 + "'", int43 == 64);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(codeGenerator45);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "4.5.2.1" + "'", str54, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\\35" + "'", str56, "\\35");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\"\"" + "'", str59, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 64 + "'", int66 == 64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 64 + "'", int68 == 64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(codeGenerator70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "\\0" + "'", str75, "\\0");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\\1" + "'", str80, "\\1");
        org.junit.Assert.assertNotNull(sTGroup81);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "\\\"\\\"\\\"\\\"64\\\"\\\"\\\"\\\"" + "'", str89, "\\\"\\\"\\\"\\\"64\\\"\\\"\\\"\\\"");
        org.junit.Assert.assertNotNull(sTGroup90);
    }

    @Test
    public void test17104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17104");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.util.Set<java.lang.String> strSet3 = null;
        python3Target0.badWords = strSet3;
        boolean boolean5 = python3Target0.wantsBaseListener();
        java.lang.String str6 = python3Target0.getVersion();
        boolean boolean7 = python3Target0.wantsBaseListener();
        java.lang.String str8 = python3Target0.language;
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.lang.String str10 = python3Target0.language;
        boolean boolean11 = python3Target0.wantsBaseListener();
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target12.language;
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target12.templates;
        java.lang.String str17 = python3Target12.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str19 = python3Target12.getTargetStringLiteralFromString("");
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target21 = new org.antlr.v4.codegen.target.Python3Target();
        int int22 = python3Target21.getInlineTestSetWordSize();
        boolean boolean23 = python3Target21.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python3Target21.gen;
        boolean boolean25 = python3Target21.wantsBaseVisitor();
        boolean boolean26 = python3Target21.supportsOverloadedMethods();
        java.lang.String str29 = python3Target21.getTargetStringLiteralFromString("\\0", false);
        boolean boolean30 = python3Target21.templatesExist();
        python3Target21.addBadWords();
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target();
        int int34 = python3Target33.getInlineTestSetWordSize();
        java.lang.String str35 = python3Target33.language;
        java.lang.String str36 = python3Target33.getVersion();
        int int37 = python3Target33.getInlineTestSetWordSize();
        java.lang.String str38 = python3Target33.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = python3Target33.gen;
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target41 = new org.antlr.v4.codegen.target.Python3Target();
        int int42 = python3Target41.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup43 = python3Target41.templates;
        org.antlr.v4.tool.Grammar grammar44 = null;
        int[] intArray45 = new int[] {};
        java.lang.String[] strArray46 = python3Target41.getTokenTypesAsTargetLabels(grammar44, intArray45);
        java.lang.String[] strArray47 = python3Target33.getTokenTypesAsTargetLabels(grammar40, intArray45);
        java.lang.String[] strArray48 = python3Target21.getTokenTypesAsTargetLabels(grammar32, intArray45);
        java.lang.String[] strArray49 = python3Target12.getTokenTypesAsTargetLabels(grammar20, intArray45);
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray49;
        python3Target0.targetCharValueEscape = strArray49;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"hi!\"\"" + "'", str17, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(codeGenerator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\\0" + "'", str29, "\\0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 64 + "'", int34 == 64);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "4.5.2.1" + "'", str36, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 64 + "'", int37 == 64);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(codeGenerator39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 64 + "'", int42 == 64);
        org.junit.Assert.assertNull(sTGroup43);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[]");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
    }

    @Test
    public void test17105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17105");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.gen;
        java.lang.String str8 = python3Target0.getLanguage();
        java.lang.String str9 = python3Target0.language;
        boolean boolean10 = python3Target0.templatesExist();
        python3Target0.addBadWords();
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("\"12\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"i\"", true);
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target0.templates;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"12\"\"" + "'", str13, "\"\"12\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"i\"" + "'", str17, "\"i\"");
        org.junit.Assert.assertNull(sTGroup18);
    }

    @Test
    public void test17106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17106");
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
        java.lang.String str15 = python3Target14.language;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup17 = null;
        python3Target16.templates = sTGroup17;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        python3Target16.badWords = strSet23;
        python3Target14.badWords = strSet23;
        org.stringtemplate.v4.STGroup sTGroup27 = python3Target14.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target28 = new org.antlr.v4.codegen.target.Python3Target();
        int int29 = python3Target28.getInlineTestSetWordSize();
        boolean boolean30 = python3Target28.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python3Target28.gen;
        boolean boolean32 = python3Target28.supportsOverloadedMethods();
        java.lang.String[] strArray33 = python3Target28.targetCharValueEscape;
        python3Target14.targetCharValueEscape = strArray33;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        python3Target14.gen = codeGenerator35;
        java.lang.String[] strArray37 = python3Target14.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray37;
        python3Target0.targetCharValueEscape = strArray37;
        java.lang.String str41 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        python3Target0.gen = codeGenerator42;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(sTGroup13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(sTGroup27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(codeGenerator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\\12" + "'", str41, "\\12");
    }

    @Test
    public void test17107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17107");
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
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup27 = null;
        python3Target26.templates = sTGroup27;
        java.lang.String[] strArray32 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        python3Target26.badWords = strSet33;
        python3Target26.language = "\\0";
        python3Target26.addBadWords();
        python3Target26.addBadWords();
        java.lang.String[] strArray40 = python3Target26.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target42 = new org.antlr.v4.codegen.target.Python3Target();
        int int43 = python3Target42.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup44 = python3Target42.templates;
        org.antlr.v4.tool.Grammar grammar45 = null;
        int[] intArray46 = new int[] {};
        java.lang.String[] strArray47 = python3Target42.getTokenTypesAsTargetLabels(grammar45, intArray46);
        java.lang.String[] strArray48 = python3Target26.getTokenTypesAsTargetLabels(grammar41, intArray46);
        java.lang.String[] strArray49 = python3Target0.getTokenTypesAsTargetLabels(grammar25, intArray46);
        int int50 = python3Target0.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = python3Target0.getImplicitRuleLabel("\"d\"");
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
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 64 + "'", int43 == 64);
        org.junit.Assert.assertNull(sTGroup44);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[]");
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 29 + "'", int50 == 29);
    }

    @Test
    public void test17108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17108");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target();
        int int3 = python3Target2.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target2.language;
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target2.templates;
        java.lang.String str7 = python3Target2.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str9 = python3Target2.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        int int11 = python3Target10.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target10.language;
        java.lang.String str13 = python3Target10.getLanguage();
        java.lang.String str15 = python3Target10.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python3Target10.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "hi!", true);
        int int20 = python3Target10.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str23 = python3Target22.language;
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup25 = null;
        python3Target24.templates = sTGroup25;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        python3Target24.badWords = strSet31;
        python3Target22.badWords = strSet31;
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target();
        int int37 = python3Target36.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup38 = python3Target36.templates;
        org.antlr.v4.tool.Grammar grammar39 = null;
        int[] intArray40 = new int[] {};
        java.lang.String[] strArray41 = python3Target36.getTokenTypesAsTargetLabels(grammar39, intArray40);
        java.lang.String[] strArray42 = python3Target22.getTokenTypesAsTargetLabels(grammar35, intArray40);
        java.lang.String[] strArray43 = python3Target10.getTokenTypesAsTargetLabels(grammar21, intArray40);
        java.util.Set<java.lang.String> strSet44 = python3Target10.badWords;
        python3Target2.badWords = strSet44;
        python3Target1.badWords = strSet44;
        java.lang.String str48 = python3Target1.getListLabel("\"\"\"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = null;
        java.lang.String str52 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator49, "\"\"\"\"\\0\"\"\"\"", true);
        boolean boolean53 = python3Target1.wantsBaseVisitor();
        java.lang.String str54 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"hi!\"\"" + "'", str7, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\"" + "'", str15, "\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"i\"" + "'", str19, "\"i\"");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29 + "'", int20 == 29);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 64 + "'", int37 == 64);
        org.junit.Assert.assertNull(sTGroup38);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[]");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\"\"\"\"\"\"" + "'", str48, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\"\\\"\\\"\\\"0\\\"\\\"\\\"\"" + "'", str52, "\"\\\"\\\"\\\"0\\\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Python3" + "'", str54, "Python3");
    }

    @Test
    public void test17109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17109");
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
            boolean boolean12 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test17110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17110");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"hi!\"", false);
        org.stringtemplate.v4.STGroup sTGroup10 = null;
        python3Target0.templates = sTGroup10;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator12);
        java.util.Set<java.lang.String> strSet14 = python3Target13.badWords;
        python3Target0.badWords = strSet14;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str17 = python3Target16.language;
        java.lang.String[] strArray18 = python3Target16.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray18;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray18;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray18;
        python3Target0.targetCharValueEscape = strArray18;
        java.lang.String[] strArray23 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray23;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test17111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17111");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        python3Target0.gen = codeGenerator4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python3Target0.gen = codeGenerator6;
        int int8 = python3Target0.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.templates;
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test17112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17112");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        python3Target0.gen = codeGenerator9;
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        java.lang.String str37 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator34, "\"\\\"\\\"0\\\"\\\"\"", false);
        boolean boolean38 = python3Target0.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8, "\"4.5.2.1\"");
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\\\"\\\"0\\\"\\\"" + "'", str37, "\\\"\\\"0\\\"\\\"");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test17113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17113");
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
        java.lang.String str22 = python3Target0.getTargetStringLiteralFromString("\"4.5.2.1\"");
        java.lang.String str23 = python3Target0.getLanguage();
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target();
        int int25 = python3Target24.getInlineTestSetWordSize();
        java.lang.String str26 = python3Target24.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        java.lang.String str30 = python3Target24.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator27, "", true);
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.stringtemplate.v4.ST sT32 = null;
        python3Target24.genRecognizerHeaderFile(grammar31, sT32, "");
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.stringtemplate.v4.ST sT36 = null;
        python3Target24.genRecognizerHeaderFile(grammar35, sT36, "\"i\"");
        boolean boolean39 = python3Target24.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = python3Target24.getCodeGenerator();
        int int41 = python3Target24.getSerializedATNSegmentLimit();
        python3Target24.addBadWords();
        java.lang.String[] strArray43 = python3Target24.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray43;
        boolean boolean45 = python3Target0.supportsOverloadedMethods();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\"4.5.2.1\"\"" + "'", str22, "\"\"4.5.2.1\"\"");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"\"" + "'", str30, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(codeGenerator40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 29 + "'", int41 == 29);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test17114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17114");
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
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target();
        int int18 = python3Target17.getInlineTestSetWordSize();
        java.lang.String str19 = python3Target17.language;
        java.lang.String str20 = python3Target17.getLanguage();
        java.lang.String str22 = python3Target17.getTargetStringLiteralFromString("");
        java.lang.String str23 = python3Target17.getVersion();
        java.util.Set<java.lang.String> strSet24 = python3Target17.badWords;
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target();
        int int26 = python3Target25.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup27 = python3Target25.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target28 = new org.antlr.v4.codegen.target.Python3Target();
        int int29 = python3Target28.getInlineTestSetWordSize();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "" };
        python3Target28.targetCharValueEscape = strArray32;
        python3Target25.targetCharValueEscape = strArray32;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray32;
        python3Target17.targetCharValueEscape = strArray32;
        org.antlr.v4.codegen.target.Python3Target python3Target37 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str39 = python3Target37.getTargetStringLiteralFromString("\"\"");
        java.lang.String[] strArray40 = python3Target37.targetCharValueEscape;
        python3Target17.targetCharValueEscape = strArray40;
        python3Target0.targetCharValueEscape = strArray40;
        org.antlr.v4.tool.Grammar grammar43 = null;
        org.stringtemplate.v4.ST sT44 = null;
        python3Target0.genRecognizerHeaderFile(grammar43, sT44, "\"\\\"\\\"\\\"1\\\"\\\"\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = python3Target0.getImplicitSetLabel("\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\"");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\"" + "'", str22, "\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4.5.2.1" + "'", str23, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertNull(sTGroup27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"\"\"\"" + "'", str39, "\"\"\"\"");
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test17115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17115");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "", false);
        java.lang.String[] strArray18 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python3Target0.gen;
        org.antlr.v4.codegen.target.Python3Target python3Target20 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup21 = null;
        python3Target20.templates = sTGroup21;
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        python3Target20.badWords = strSet27;
        boolean boolean30 = python3Target20.templatesExist();
        java.lang.String str32 = python3Target20.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target();
        int int34 = python3Target33.getInlineTestSetWordSize();
        boolean boolean35 = python3Target33.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = python3Target33.gen;
        java.lang.String str37 = python3Target33.getVersion();
        java.lang.String[] strArray38 = python3Target33.targetCharValueEscape;
        python3Target20.targetCharValueEscape = strArray38;
        java.lang.String str40 = python3Target20.getVersion();
        boolean boolean41 = python3Target20.templatesExist();
        org.antlr.v4.codegen.target.Python3Target python3Target42 = new org.antlr.v4.codegen.target.Python3Target();
        int int43 = python3Target42.getInlineTestSetWordSize();
        boolean boolean44 = python3Target42.wantsBaseVisitor();
        java.lang.String str45 = python3Target42.getLanguage();
        java.lang.String str48 = python3Target42.getTargetStringLiteralFromString("\"\".5.2.\"\"", false);
        java.lang.String str51 = python3Target42.getTargetStringLiteralFromString("\"\"\"\"\"4.5.2.1\"\"\"\"\"", true);
        java.util.Set<java.lang.String> strSet52 = python3Target42.getBadWords();
        python3Target20.badWords = strSet52;
        python3Target0.badWords = strSet52;
        boolean boolean55 = python3Target0.templatesExist();
        boolean boolean56 = python3Target0.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"i\"" + "'", str9, "\"i\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNull(codeGenerator19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "@" + "'", str32, "@");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 64 + "'", int34 == 64);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(codeGenerator36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "4.5.2.1" + "'", str37, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "4.5.2.1" + "'", str40, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 64 + "'", int43 == 64);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\"\".5.2.\"\"" + "'", str48, "\"\".5.2.\"\"");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"" + "'", str51, "\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test17116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17116");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.util.Set<java.lang.String> strSet7 = python3Target0.badWords;
        java.lang.String str8 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python3Target0.templates = sTGroup9;
        boolean boolean11 = python3Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target0.gen;
        int int13 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target0.getLanguage();
        java.lang.String[] strArray15 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test17117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17117");
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
        boolean boolean21 = python3Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup22 = null;
        python3Target0.templates = sTGroup22;
        org.stringtemplate.v4.STGroup sTGroup24 = null;
        python3Target0.templates = sTGroup24;
        java.lang.String str27 = python3Target0.encodeIntAsCharEscape(64);
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.stringtemplate.v4.ST sT29 = null;
        python3Target0.genRecognizerHeaderFile(grammar28, sT29, "\"\"\"\"\"\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"\"\"\"\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST32);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "@" + "'", str27, "@");
    }

    @Test
    public void test17118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17118");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean5 = python3Target0.wantsBaseVisitor();
        boolean boolean6 = python3Target0.templatesExist();
        java.util.Set<java.lang.String> strSet7 = python3Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\"", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\12" + "'", str4, "\\12");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"" + "'", str11, "\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test17119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17119");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        boolean boolean5 = python3Target0.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target0.genRecognizerHeaderFile(grammar6, sT7, "\"\"\\\"\\\"\\\"\\\"\"\"");
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test17120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17120");
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
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target0.genRecognizerHeaderFile(grammar19, sT20, "12");
        org.antlr.v4.codegen.target.Python3Target python3Target23 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str24 = python3Target23.language;
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup26 = null;
        python3Target25.templates = sTGroup26;
        java.lang.String[] strArray31 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        python3Target25.badWords = strSet32;
        python3Target23.badWords = strSet32;
        python3Target23.language = "\"\"i\"\"";
        java.lang.String str38 = python3Target23.language;
        java.lang.String str40 = python3Target23.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.target.Python3Target python3Target41 = new org.antlr.v4.codegen.target.Python3Target();
        int int42 = python3Target41.getInlineTestSetWordSize();
        java.lang.String str43 = python3Target41.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        java.lang.String str47 = python3Target41.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator44, "", true);
        java.util.Set<java.lang.String> strSet48 = python3Target41.getBadWords();
        java.lang.String str50 = python3Target41.encodeIntAsCharEscape(29);
        java.util.Set<java.lang.String> strSet51 = python3Target41.getBadWords();
        python3Target23.badWords = strSet51;
        python3Target0.badWords = strSet51;
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = python3Target0.gen;
        java.lang.String str55 = python3Target0.language;
        org.antlr.v4.tool.Grammar grammar56 = null;
        org.stringtemplate.v4.ST sT57 = null;
        python3Target0.genRecognizerHeaderFile(grammar56, sT57, "\"\"\"\".5.2.\"\"\"\"");
        java.util.Set<java.lang.String> strSet60 = python3Target0.badWords;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"\"\"\"4.5.2.1\"\"\"\"\"" + "'", str17, "\"\"\"\"\"4.5.2.1\"\"\"\"\"");
        org.junit.Assert.assertNull(sTGroup18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\"i\"\"" + "'", str38, "\"\"i\"\"");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"\"" + "'", str40, "\"\"");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 64 + "'", int42 == 64);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"\"" + "'", str47, "\"\"");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\\35" + "'", str50, "\\35");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNull(codeGenerator54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(strSet60);
    }

    @Test
    public void test17121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17121");
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
        python3Target0.language = "\"\"\\\"\\\"\\\"\\\"64\\\"\\\"\\\"\\\"\"\"";
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar14, sT15);
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
    public void test17122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17122");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.util.Set<java.lang.String> strSet7 = python3Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python3Target0.gen = codeGenerator8;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\"\\\"\\\"4.5.2.1\\\"\\\"\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup14 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\"4.5.2.1\\\"\\\"\"" + "'", str12, "\"\\\"\\\"4.5.2.1\\\"\\\"\"");
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test17123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17123");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python3Target0.getCodeGenerator();
        java.lang.String str19 = python3Target0.getLanguage();
        boolean boolean20 = python3Target0.wantsBaseVisitor();
        java.lang.String str22 = python3Target0.encodeIntAsCharEscape((int) (byte) 1);
        boolean boolean23 = python3Target0.templatesExist();
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target();
        int int25 = python3Target24.getInlineTestSetWordSize();
        java.lang.String str26 = python3Target24.language;
        org.stringtemplate.v4.STGroup sTGroup27 = python3Target24.templates;
        boolean boolean28 = python3Target24.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        java.lang.String str32 = python3Target24.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator29, "", false);
        int int33 = python3Target24.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python3Target python3Target34 = new org.antlr.v4.codegen.target.Python3Target();
        int int35 = python3Target34.getInlineTestSetWordSize();
        java.lang.String str36 = python3Target34.language;
        java.lang.String str37 = python3Target34.getVersion();
        int int38 = python3Target34.getInlineTestSetWordSize();
        java.lang.String str39 = python3Target34.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = python3Target34.gen;
        python3Target34.addBadWords();
        python3Target34.language = "\\0";
        boolean boolean44 = python3Target34.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = python3Target34.getCodeGenerator();
        java.util.Set<java.lang.String> strSet46 = python3Target34.badWords;
        python3Target24.badWords = strSet46;
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target49 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator48);
        java.util.Set<java.lang.String> strSet50 = python3Target49.badWords;
        java.lang.String str51 = python3Target49.getLanguage();
        java.lang.String str53 = python3Target49.getImplicitRuleLabel("\\\"1\\\"");
        org.stringtemplate.v4.STGroup sTGroup54 = python3Target49.loadTemplates();
        python3Target24.templates = sTGroup54;
        python3Target0.templates = sTGroup54;
        java.lang.String str58 = python3Target0.encodeIntAsCharEscape(10);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction59 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = python3Target0.getRuleFunctionContextStructName(ruleFunction59);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\\1" + "'", str22, "\\1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(sTGroup27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 64 + "'", int33 == 64);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 64 + "'", int35 == 64);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "4.5.2.1" + "'", str37, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 64 + "'", int38 == 64);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(codeGenerator40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(codeGenerator45);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Python3" + "'", str51, "Python3");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "_\\\"1\\\"" + "'", str53, "_\\\"1\\\"");
        org.junit.Assert.assertNotNull(sTGroup54);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\\12" + "'", str58, "\\12");
    }

    @Test
    public void test17124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17124");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup5 = null;
        python3Target0.templates = sTGroup5;
        boolean boolean7 = python3Target0.templatesExist();
        java.lang.String str8 = python3Target0.getVersion();
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python3Target0.templates = sTGroup9;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
    }

    @Test
    public void test17125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17125");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        int int4 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "6", true);
        python3Target0.addBadWords();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"" + "'", str8, "\"\"");
    }

    @Test
    public void test17126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17126");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        python3Target0.targetCharValueEscape = strArray8;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        int int11 = python3Target10.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target10.language;
        java.lang.String str13 = python3Target10.getVersion();
        int int14 = python3Target10.getInlineTestSetWordSize();
        java.lang.String str15 = python3Target10.getLanguage();
        java.lang.String str18 = python3Target10.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet19 = python3Target10.badWords;
        python3Target0.badWords = strSet19;
        java.util.Set<java.lang.String> strSet21 = python3Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        python3Target0.gen = codeGenerator22;
        java.lang.String str24 = python3Target0.getVersion();
        java.lang.String str25 = python3Target0.getLanguage();
        java.lang.String str26 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python3Target0.gen = codeGenerator27;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"4.5.2.1\"" + "'", str18, "\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4.5.2.1" + "'", str24, "4.5.2.1");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4.5.2.1" + "'", str26, "4.5.2.1");
    }

    @Test
    public void test17127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17127");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\\1", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getImplicitSetLabel("\"\"\\1\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test17128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17128");
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
        java.lang.String str14 = python3Target0.language;
        int int15 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str17 = python3Target0.encodeIntAsCharEscape(10);
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target();
        int int19 = python3Target18.getInlineTestSetWordSize();
        java.lang.String str20 = python3Target18.language;
        org.stringtemplate.v4.STGroup sTGroup21 = python3Target18.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python3Target18.gen;
        java.util.Set<java.lang.String> strSet23 = python3Target18.badWords;
        org.stringtemplate.v4.STGroup sTGroup24 = null;
        python3Target18.templates = sTGroup24;
        java.util.Set<java.lang.String> strSet26 = python3Target18.badWords;
        python3Target0.badWords = strSet26;
        java.lang.String str29 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"Context\"\"");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"hi!\"" + "'", str14, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\12" + "'", str17, "\\12");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(sTGroup21);
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"Context\"\"\"" + "'", str29, "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"Context\"\"\"");
    }

    @Test
    public void test17129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17129");
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
        java.lang.String str22 = python3Target0.getTargetStringLiteralFromString("\"4.5.2.1\"");
        java.lang.String str23 = python3Target0.getLanguage();
        java.util.Set<java.lang.String> strSet24 = python3Target0.badWords;
        boolean boolean25 = python3Target0.wantsBaseVisitor();
        java.lang.String str27 = python3Target0.encodeIntAsCharEscape((int) (short) 100);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\"4.5.2.1\"\"" + "'", str22, "\"\"4.5.2.1\"\"");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "d" + "'", str27, "d");
    }

    @Test
    public void test17130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17130");
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
        java.lang.String[] strArray14 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.stringtemplate.v4.ST sT16 = null;
        python3Target0.genRecognizerHeaderFile(grammar15, sT16, "\\\"4.5.2.1\\\"");
        boolean boolean19 = python3Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet20 = python3Target0.getBadWords();
        java.util.Set<java.lang.String> strSet21 = python3Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python3Target0.getLoopLabel(grammarAST23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(codeGenerator22);
    }

    @Test
    public void test17131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17131");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = python3Target0.getCodeGenerator();
        python3Target0.addBadWords();
        boolean boolean44 = python3Target0.supportsOverloadedMethods();
        int int45 = python3Target0.getInlineTestSetWordSize();
        boolean boolean46 = python3Target0.templatesExist();
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
        org.junit.Assert.assertNull(codeGenerator42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 64 + "'", int45 == 64);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test17132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17132");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        int int7 = python3Target6.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target6.language;
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target6.templates;
        java.lang.String str11 = python3Target6.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str13 = python3Target6.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        int int15 = python3Target14.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target14.language;
        java.lang.String str17 = python3Target14.getLanguage();
        java.lang.String str19 = python3Target14.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        java.lang.String str23 = python3Target14.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator20, "hi!", true);
        int int24 = python3Target14.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str27 = python3Target26.language;
        org.antlr.v4.codegen.target.Python3Target python3Target28 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup29 = null;
        python3Target28.templates = sTGroup29;
        java.lang.String[] strArray34 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        python3Target28.badWords = strSet35;
        python3Target26.badWords = strSet35;
        org.antlr.v4.tool.Grammar grammar39 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target40 = new org.antlr.v4.codegen.target.Python3Target();
        int int41 = python3Target40.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup42 = python3Target40.templates;
        org.antlr.v4.tool.Grammar grammar43 = null;
        int[] intArray44 = new int[] {};
        java.lang.String[] strArray45 = python3Target40.getTokenTypesAsTargetLabels(grammar43, intArray44);
        java.lang.String[] strArray46 = python3Target26.getTokenTypesAsTargetLabels(grammar39, intArray44);
        java.lang.String[] strArray47 = python3Target14.getTokenTypesAsTargetLabels(grammar25, intArray44);
        java.util.Set<java.lang.String> strSet48 = python3Target14.badWords;
        python3Target6.badWords = strSet48;
        python3Target5.badWords = strSet48;
        java.lang.String str52 = python3Target5.getListLabel("\"\"\"\"\"\"");
        boolean boolean53 = python3Target5.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup54 = python3Target5.templates;
        python3Target0.templates = sTGroup54;
        java.util.Set<java.lang.String> strSet56 = python3Target0.badWords;
        java.lang.String str58 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.tool.Grammar grammar59 = null;
        org.stringtemplate.v4.ST sT60 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar59, sT60, "\"\"\\\".5.2.\\\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"hi!\"\"" + "'", str11, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"" + "'", str13, "\"\"");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"i\"" + "'", str23, "\"i\"");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29 + "'", int24 == 29);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 64 + "'", int41 == 64);
        org.junit.Assert.assertNull(sTGroup42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\"\"\"\"\"\"" + "'", str52, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(sTGroup54);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\"\"" + "'", str58, "\"\"");
    }

    @Test
    public void test17133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17133");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        boolean boolean9 = python3Target0.templatesExist();
        python3Target0.addBadWords();
        java.lang.String str12 = python3Target0.encodeIntAsCharEscape((int) ' ');
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str15 = python3Target13.getTargetStringLiteralFromString("\"\"");
        java.lang.String[] strArray16 = python3Target13.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target13.gen;
        org.stringtemplate.v4.STGroup sTGroup18 = null;
        python3Target13.templates = sTGroup18;
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        python3Target13.genRecognizerHeaderFile(grammar20, sT21, "\\\"4.5.2.1\\\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator24);
        int int26 = python3Target25.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup27 = python3Target25.loadTemplates();
        python3Target13.templates = sTGroup27;
        python3Target0.templates = sTGroup27;
        java.lang.String str31 = python3Target0.getAltLabelContextStructName("\"\\\"\\\"\\\"\\\"12\\\"\\\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\"\"\"" + "'", str15, "\"\"\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertNotNull(sTGroup27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\\\"\\\"\\\"\\\"12\\\"\\\"\\\"\\\"\"Context" + "'", str31, "\"\\\"\\\"\\\"\\\"12\\\"\\\"\\\"\\\"\"Context");
    }

    @Test
    public void test17134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17134");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\"", false);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.getCodeGenerator();
        java.lang.String[] strArray12 = python3Target0.targetCharValueEscape;
        java.lang.String[] strArray13 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray13;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray13;
        python3Target0.targetCharValueEscape = strArray13;
        python3Target0.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target0.getListLabel("\"\"\"\"\\1\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test17135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17135");
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
        boolean boolean15 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target();
        int int17 = python3Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "" };
        python3Target16.targetCharValueEscape = strArray20;
        java.lang.String[] strArray22 = python3Target16.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray22;
        python3Target0.targetCharValueEscape = strArray22;
        java.lang.String str25 = python3Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python3Target0.getImplicitRuleLabel("tset\\\"\\\".5.2.\\\"");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test17136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17136");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "d", locale3);
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) "\"\"i\"\"", "\\12", locale7);
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        int int10 = python3Target9.getInlineTestSetWordSize();
        java.lang.String str11 = python3Target9.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target9.getCodeGenerator();
        java.util.Set<java.lang.String> strSet13 = python3Target9.getBadWords();
        java.lang.String[] strArray14 = python3Target9.targetCharValueEscape;
        boolean boolean15 = python3Target9.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target9.templates;
        boolean boolean17 = python3Target9.templatesExist();
        python3Target9.language = "\\\"\\\"\\\"1\\\"\\\"\\\"";
        java.lang.String str21 = python3Target9.encodeIntAsCharEscape((int) '4');
        int int22 = python3Target9.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        python3Target9.gen = codeGenerator23;
        java.util.Locale locale26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = pythonStringRenderer0.toString((java.lang.Object) python3Target9, "\"\"\"\\\"4.5.2.1\\\"\"\"\"", locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\12" + "'", str8, "\\12");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(sTGroup16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\64" + "'", str21, "\\64");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
    }

    @Test
    public void test17137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17137");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "\"\"", true);
        java.lang.String str17 = python3Target0.getLanguage();
        java.lang.String str20 = python3Target0.getTargetStringLiteralFromString("\"\"\"i\"\"\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python3Target0.getTokenTypeAsTargetLabel(grammar22, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"\"\"i\"\"\"\"" + "'", str20, "\"\"\"\"i\"\"\"\"");
        org.junit.Assert.assertNull(codeGenerator21);
    }

    @Test
    public void test17138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17138");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\"", false);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.getCodeGenerator();
        python3Target0.language = "\"\"\"\"hi!\"\"\"\"";
        boolean boolean14 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target();
        int int17 = python3Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "" };
        python3Target16.targetCharValueEscape = strArray20;
        java.util.Set<java.lang.String> strSet22 = python3Target16.badWords;
        org.stringtemplate.v4.STGroup sTGroup23 = python3Target16.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python3Target16.gen;
        java.util.Set<java.lang.String> strSet25 = python3Target16.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup26 = python3Target16.templates;
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target28 = new org.antlr.v4.codegen.target.Python3Target();
        int int29 = python3Target28.getInlineTestSetWordSize();
        boolean boolean30 = python3Target28.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python3Target28.gen;
        java.lang.String str32 = python3Target28.getVersion();
        org.stringtemplate.v4.STGroup sTGroup33 = null;
        python3Target28.templates = sTGroup33;
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target();
        int int37 = python3Target36.getInlineTestSetWordSize();
        java.lang.String str38 = python3Target36.language;
        java.lang.String str39 = python3Target36.getVersion();
        python3Target36.language = "@";
        org.antlr.v4.tool.Grammar grammar42 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target43 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str45 = python3Target43.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar46 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target47 = new org.antlr.v4.codegen.target.Python3Target();
        int int48 = python3Target47.getInlineTestSetWordSize();
        java.lang.String str49 = python3Target47.language;
        java.lang.String str50 = python3Target47.getVersion();
        int int51 = python3Target47.getInlineTestSetWordSize();
        java.lang.String str52 = python3Target47.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator53 = python3Target47.gen;
        org.antlr.v4.tool.Grammar grammar54 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target55 = new org.antlr.v4.codegen.target.Python3Target();
        int int56 = python3Target55.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup57 = python3Target55.templates;
        org.antlr.v4.tool.Grammar grammar58 = null;
        int[] intArray59 = new int[] {};
        java.lang.String[] strArray60 = python3Target55.getTokenTypesAsTargetLabels(grammar58, intArray59);
        java.lang.String[] strArray61 = python3Target47.getTokenTypesAsTargetLabels(grammar54, intArray59);
        java.lang.String[] strArray62 = python3Target43.getTokenTypesAsTargetLabels(grammar46, intArray59);
        java.lang.String[] strArray63 = python3Target36.getTokenTypesAsTargetLabels(grammar42, intArray59);
        java.lang.String[] strArray64 = python3Target28.getTokenTypesAsTargetLabels(grammar35, intArray59);
        java.lang.String[] strArray65 = python3Target16.getTokenTypesAsTargetLabels(grammar27, intArray59);
        java.lang.String[] strArray66 = python3Target0.getTokenTypesAsTargetLabels(grammar15, intArray59);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(sTGroup23);
        org.junit.Assert.assertNull(codeGenerator24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(sTGroup26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(codeGenerator31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "4.5.2.1" + "'", str32, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 64 + "'", int37 == 64);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "4.5.2.1" + "'", str39, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "d" + "'", str45, "d");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 64 + "'", int48 == 64);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "4.5.2.1" + "'", str50, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 64 + "'", int51 == 64);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(codeGenerator53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 64 + "'", int56 == 64);
        org.junit.Assert.assertNull(sTGroup57);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[]");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
    }

    @Test
    public void test17139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17139");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target8.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "", true);
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.stringtemplate.v4.ST sT16 = null;
        python3Target8.genRecognizerHeaderFile(grammar15, sT16, "");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target8.genRecognizerHeaderFile(grammar19, sT20, "\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python3Target8.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        python3Target8.gen = codeGenerator24;
        java.lang.String str27 = python3Target8.encodeIntAsCharEscape(1);
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str31 = python3Target29.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target();
        int int34 = python3Target33.getInlineTestSetWordSize();
        java.lang.String str35 = python3Target33.language;
        java.lang.String str36 = python3Target33.getVersion();
        int int37 = python3Target33.getInlineTestSetWordSize();
        java.lang.String str38 = python3Target33.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = python3Target33.gen;
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target41 = new org.antlr.v4.codegen.target.Python3Target();
        int int42 = python3Target41.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup43 = python3Target41.templates;
        org.antlr.v4.tool.Grammar grammar44 = null;
        int[] intArray45 = new int[] {};
        java.lang.String[] strArray46 = python3Target41.getTokenTypesAsTargetLabels(grammar44, intArray45);
        java.lang.String[] strArray47 = python3Target33.getTokenTypesAsTargetLabels(grammar40, intArray45);
        java.lang.String[] strArray48 = python3Target29.getTokenTypesAsTargetLabels(grammar32, intArray45);
        java.lang.String[] strArray49 = python3Target8.getTokenTypesAsTargetLabels(grammar28, intArray45);
        python3Target0.targetCharValueEscape = strArray49;
        org.antlr.v4.codegen.target.Python3Target python3Target51 = new org.antlr.v4.codegen.target.Python3Target();
        java.util.Set<java.lang.String> strSet52 = python3Target51.badWords;
        python3Target0.badWords = strSet52;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = python3Target0.getListLabel("\"5.2\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\\1" + "'", str27, "\\1");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "d" + "'", str31, "d");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 64 + "'", int34 == 64);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "4.5.2.1" + "'", str36, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 64 + "'", int37 == 64);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(codeGenerator39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 64 + "'", int42 == 64);
        org.junit.Assert.assertNull(sTGroup43);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[]");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strSet52);
    }

    @Test
    public void test17140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17140");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        boolean boolean9 = python3Target0.wantsBaseListener();
        python3Target0.addBadWords();
        java.util.Set<java.lang.String> strSet11 = python3Target0.badWords;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test17141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17141");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        java.lang.String str7 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\"5.2\"\"");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"\"5.2\"\"\"" + "'", str9, "\"\"\"5.2\"\"\"");
    }

    @Test
    public void test17142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17142");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        java.lang.String str10 = python3Target0.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup11 = null;
        python3Target0.templates = sTGroup11;
        int int13 = python3Target0.getSerializedATNSegmentLimit();
        int int14 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST15);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\12" + "'", str10, "\\12");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
    }

    @Test
    public void test17143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17143");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("i");
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python3Target0.genRecognizerHeaderFile(grammar5, sT6, "");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python3Target0.genRecognizerHeaderFile(grammar9, sT10, "\"\"\"\\\"hi!\\\"\"\"\"");
        java.lang.String str13 = python3Target0.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getLoopLabel(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"i\"" + "'", str4, "\"i\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
    }

    @Test
    public void test17144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17144");
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
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target0.genRecognizerHeaderFile(grammar19, sT20, "12");
        org.antlr.v4.codegen.target.Python3Target python3Target23 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str24 = python3Target23.language;
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup26 = null;
        python3Target25.templates = sTGroup26;
        java.lang.String[] strArray31 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        python3Target25.badWords = strSet32;
        python3Target23.badWords = strSet32;
        python3Target23.language = "\"\"i\"\"";
        java.lang.String str38 = python3Target23.language;
        java.lang.String str40 = python3Target23.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.target.Python3Target python3Target41 = new org.antlr.v4.codegen.target.Python3Target();
        int int42 = python3Target41.getInlineTestSetWordSize();
        java.lang.String str43 = python3Target41.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        java.lang.String str47 = python3Target41.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator44, "", true);
        java.util.Set<java.lang.String> strSet48 = python3Target41.getBadWords();
        java.lang.String str50 = python3Target41.encodeIntAsCharEscape(29);
        java.util.Set<java.lang.String> strSet51 = python3Target41.getBadWords();
        python3Target23.badWords = strSet51;
        python3Target0.badWords = strSet51;
        org.antlr.v4.codegen.target.Python3Target python3Target54 = new org.antlr.v4.codegen.target.Python3Target();
        int int55 = python3Target54.getInlineTestSetWordSize();
        java.lang.String str56 = python3Target54.language;
        java.lang.String str57 = python3Target54.getVersion();
        int int58 = python3Target54.getInlineTestSetWordSize();
        java.lang.String str59 = python3Target54.getLanguage();
        java.lang.String str62 = python3Target54.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean63 = python3Target54.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet64 = python3Target54.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator65 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target66 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator65);
        java.lang.String str68 = python3Target66.encodeIntAsCharEscape((int) (short) 1);
        org.stringtemplate.v4.STGroup sTGroup69 = python3Target66.loadTemplates();
        python3Target54.templates = sTGroup69;
        python3Target0.templates = sTGroup69;
        org.antlr.v4.codegen.CodeGenerator codeGenerator72 = null;
        java.lang.String str75 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator72, "\"\\\"\\\"\\\"\\\"\\\"\\\"0\\\"\\\"\\\"\\\"\\\"\\\"\"", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"\"\"\"4.5.2.1\"\"\"\"\"" + "'", str17, "\"\"\"\"\"4.5.2.1\"\"\"\"\"");
        org.junit.Assert.assertNull(sTGroup18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\"i\"\"" + "'", str38, "\"\"i\"\"");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"\"" + "'", str40, "\"\"");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 64 + "'", int42 == 64);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"\"" + "'", str47, "\"\"");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\\35" + "'", str50, "\\35");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 64 + "'", int55 == 64);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "4.5.2.1" + "'", str57, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 64 + "'", int58 == 64);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\"4.5.2.1\"" + "'", str62, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\\1" + "'", str68, "\\1");
        org.junit.Assert.assertNotNull(sTGroup69);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "\"\\\"\\\"\\\"\\\"\\\"\\\"0\\\"\\\"\\\"\\\"\\\"\\\"\"" + "'", str75, "\"\\\"\\\"\\\"\\\"\\\"\\\"0\\\"\\\"\\\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test17145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17145");
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
        java.lang.String str18 = python3Target0.language;
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup20 = null;
        python3Target19.templates = sTGroup20;
        java.util.Set<java.lang.String> strSet22 = null;
        python3Target19.badWords = strSet22;
        boolean boolean24 = python3Target19.wantsBaseListener();
        java.lang.String[] strArray25 = python3Target19.targetCharValueEscape;
        java.lang.String str27 = python3Target19.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = python3Target19.getCodeGenerator();
        int int29 = python3Target19.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python3Target python3Target30 = new org.antlr.v4.codegen.target.Python3Target();
        int int31 = python3Target30.getInlineTestSetWordSize();
        java.lang.String str32 = python3Target30.language;
        org.stringtemplate.v4.STGroup sTGroup33 = python3Target30.templates;
        java.lang.String str35 = python3Target30.getTargetStringLiteralFromString("\"hi!\"");
        java.util.Set<java.lang.String> strSet36 = python3Target30.badWords;
        python3Target19.badWords = strSet36;
        python3Target0.badWords = strSet36;
        int int39 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = python3Target0.gen;
        boolean boolean41 = python3Target0.supportsOverloadedMethods();
        java.lang.String str43 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str44 = python3Target0.language;
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\"\\\"hi!\\\"\"\"" + "'", str27, "\"\"\\\"hi!\\\"\"\"");
        org.junit.Assert.assertNull(codeGenerator28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 64 + "'", int31 == 64);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(sTGroup33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"hi!\"\"" + "'", str35, "\"\"hi!\"\"");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertNull(codeGenerator40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "d" + "'", str43, "d");
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test17146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17146");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target0.genRecognizerHeaderFile(grammar4, sT5, "\"\"\"\"\"4.5.2.1\"\"\"\"\"");
        java.lang.String str9 = python3Target0.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str10 = python3Target0.language;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target0.genRecognizerHeaderFile(grammar11, sT12, "\\64");
        boolean boolean15 = python3Target0.wantsBaseListener();
        int int16 = python3Target0.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\1" + "'", str9, "\\1");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
    }

    @Test
    public void test17147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17147");
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
        boolean boolean16 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.stringtemplate.v4.ST sT18 = null;
        python3Target0.genRecognizerHeaderFile(grammar17, sT18, "\"\"\"hi!\"\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target0.getAltLabelContextStructName("1");
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
    public void test17148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17148");
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
        java.lang.String str22 = python3Target19.getVersion();
        int int23 = python3Target19.getInlineTestSetWordSize();
        java.lang.String str24 = python3Target19.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python3Target19.gen;
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target27 = new org.antlr.v4.codegen.target.Python3Target();
        int int28 = python3Target27.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup29 = python3Target27.templates;
        org.antlr.v4.tool.Grammar grammar30 = null;
        int[] intArray31 = new int[] {};
        java.lang.String[] strArray32 = python3Target27.getTokenTypesAsTargetLabels(grammar30, intArray31);
        java.lang.String[] strArray33 = python3Target19.getTokenTypesAsTargetLabels(grammar26, intArray31);
        java.lang.String str36 = python3Target19.getTargetStringLiteralFromString("", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        java.lang.String str40 = python3Target19.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator37, "\"i\"", true);
        boolean boolean41 = python3Target19.templatesExist();
        java.lang.String str42 = python3Target19.language;
        java.util.Locale locale44 = null;
        java.lang.String str45 = pythonStringRenderer0.toString((java.lang.Object) str42, "\"\\\"\\\"0\\\"\\\"\"", locale44);
        org.antlr.v4.codegen.target.Python3Target python3Target46 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup47 = null;
        python3Target46.templates = sTGroup47;
        java.util.Set<java.lang.String> strSet49 = null;
        python3Target46.badWords = strSet49;
        boolean boolean51 = python3Target46.supportsOverloadedMethods();
        java.lang.String str52 = python3Target46.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator53 = python3Target46.getCodeGenerator();
        boolean boolean54 = python3Target46.wantsBaseListener();
        python3Target46.language = "\"\"\"\\\"hi!\\\"\"\"\"";
        org.stringtemplate.v4.STGroup sTGroup57 = null;
        python3Target46.templates = sTGroup57;
        java.util.Locale locale60 = null;
        java.lang.String str61 = pythonStringRenderer0.toString((java.lang.Object) sTGroup57, "\"\\\"\\\"\\\"\\\"\\\"\\\"\"", locale60);
        org.antlr.v4.codegen.target.Python3Target python3Target62 = new org.antlr.v4.codegen.target.Python3Target();
        int int63 = python3Target62.getInlineTestSetWordSize();
        java.lang.String str64 = python3Target62.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator65 = null;
        java.lang.String str68 = python3Target62.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator65, "", true);
        org.antlr.v4.tool.Grammar grammar69 = null;
        org.stringtemplate.v4.ST sT70 = null;
        python3Target62.genRecognizerHeaderFile(grammar69, sT70, "");
        org.antlr.v4.tool.Grammar grammar73 = null;
        org.stringtemplate.v4.ST sT74 = null;
        python3Target62.genRecognizerHeaderFile(grammar73, sT74, "\"i\"");
        int int77 = python3Target62.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet78 = python3Target62.getBadWords();
        boolean boolean79 = python3Target62.wantsBaseListener();
        boolean boolean80 = python3Target62.wantsBaseListener();
        java.util.Set<java.lang.String> strSet81 = python3Target62.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target82 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str83 = python3Target82.language;
        java.lang.String[] strArray84 = python3Target82.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray84;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray84;
        python3Target62.targetCharValueEscape = strArray84;
        java.util.Locale locale89 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str90 = pythonStringRenderer0.toString((java.lang.Object) strArray84, "\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"", locale89);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.String; cannot be cast to java.lang.String");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 64 + "'", int28 == 64);
        org.junit.Assert.assertNull(sTGroup29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"i\"" + "'", str40, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"\\\"\\\"0\\\"\\\"\"" + "'", str45, "\"\\\"\\\"0\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "4.5.2.1" + "'", str52, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\"\\\"\\\"\\\"\\\"\\\"\\\"\"" + "'", str61, "\"\\\"\\\"\\\"\\\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 64 + "'", int63 == 64);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\"\"" + "'", str68, "\"\"");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 29 + "'", int77 == 29);
        org.junit.Assert.assertNotNull(strSet78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(strArray84);
    }

    @Test
    public void test17149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17149");
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
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "" };
        python3Target12.targetCharValueEscape = strArray16;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python3Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "\"\"", false);
        int int22 = python3Target12.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python3Target12.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python3Target12.getCodeGenerator();
        boolean boolean25 = python3Target12.supportsOverloadedMethods();
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target();
        int int27 = python3Target26.getInlineTestSetWordSize();
        java.lang.String str28 = python3Target26.language;
        java.lang.String str29 = python3Target26.getVersion();
        int int30 = python3Target26.getInlineTestSetWordSize();
        java.lang.String str31 = python3Target26.getLanguage();
        java.lang.String str34 = python3Target26.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet35 = python3Target26.getBadWords();
        python3Target12.badWords = strSet35;
        python3Target0.badWords = strSet35;
        int int38 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = null;
        java.lang.String str42 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator39, "\"\"\\\"4.5.2.1\\\"\"\"", false);
        org.antlr.v4.tool.Grammar grammar43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = python3Target0.getTokenTypeAsTargetLabel(grammar43, 0);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertNull(codeGenerator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4.5.2.1" + "'", str29, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"4.5.2.1\"" + "'", str34, "\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 64 + "'", int38 == 64);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\\\"\\\"4.5.2.1\\\"\\\"" + "'", str42, "\\\"\\\"4.5.2.1\\\"\\\"");
    }

    @Test
    public void test17150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17150");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "", false);
        int int9 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        int int11 = python3Target10.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target10.language;
        java.lang.String str13 = python3Target10.getVersion();
        int int14 = python3Target10.getInlineTestSetWordSize();
        java.lang.String str15 = python3Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target10.gen;
        python3Target10.addBadWords();
        python3Target10.language = "\\0";
        boolean boolean20 = python3Target10.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python3Target10.getCodeGenerator();
        java.util.Set<java.lang.String> strSet22 = python3Target10.badWords;
        python3Target0.badWords = strSet22;
        org.stringtemplate.v4.STGroup sTGroup24 = python3Target0.templates;
        boolean boolean25 = python3Target0.wantsBaseListener();
        python3Target0.language = "\"\"\"4.5.2.1\"\"\"";
        org.stringtemplate.v4.STGroup sTGroup28 = python3Target0.templates;
        java.lang.String[] strArray29 = python3Target0.targetCharValueEscape;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(sTGroup24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(sTGroup28);
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test17151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17151");
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
        org.stringtemplate.v4.STGroup sTGroup15 = null;
        python3Target0.templates = sTGroup15;
        java.lang.String str18 = python3Target0.encodeIntAsCharEscape((int) (short) 100);
        org.antlr.v4.tool.Grammar grammar19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target0.getTokenTypeAsTargetLabel(grammar19, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d" + "'", str18, "d");
    }

    @Test
    public void test17152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17152");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"\"", false);
        boolean boolean18 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str20 = python3Target19.language;
        int int21 = python3Target19.getSerializedATNSegmentLimit();
        java.lang.String str23 = python3Target19.getTargetStringLiteralFromString("i");
        int int24 = python3Target19.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target();
        int int26 = python3Target25.getInlineTestSetWordSize();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        python3Target25.targetCharValueEscape = strArray29;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        java.lang.String str34 = python3Target25.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator31, "\"\"", false);
        java.lang.String[] strArray35 = python3Target25.targetCharValueEscape;
        python3Target19.targetCharValueEscape = strArray35;
        python3Target0.targetCharValueEscape = strArray35;
        java.util.Set<java.lang.String> strSet38 = python3Target0.getBadWords();
        boolean boolean39 = python3Target0.templatesExist();
        java.lang.String str41 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        java.lang.String str45 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator42, "\"\"\"\"4.5.2.1\"\"\"\"", false);
        boolean boolean46 = python3Target0.wantsBaseListener();
        org.antlr.v4.codegen.target.Python3Target python3Target47 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str48 = python3Target47.language;
        org.antlr.v4.codegen.target.Python3Target python3Target49 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup50 = null;
        python3Target49.templates = sTGroup50;
        java.lang.String[] strArray55 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        python3Target49.badWords = strSet56;
        python3Target47.badWords = strSet56;
        org.stringtemplate.v4.STGroup sTGroup60 = python3Target47.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target61 = new org.antlr.v4.codegen.target.Python3Target();
        int int62 = python3Target61.getInlineTestSetWordSize();
        boolean boolean63 = python3Target61.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator64 = python3Target61.gen;
        boolean boolean65 = python3Target61.supportsOverloadedMethods();
        java.lang.String[] strArray66 = python3Target61.targetCharValueEscape;
        python3Target47.targetCharValueEscape = strArray66;
        java.lang.String str68 = python3Target47.getLanguage();
        org.antlr.v4.codegen.target.Python3Target python3Target69 = new org.antlr.v4.codegen.target.Python3Target();
        int int70 = python3Target69.getInlineTestSetWordSize();
        java.lang.String str71 = python3Target69.language;
        java.lang.String str72 = python3Target69.getVersion();
        int int73 = python3Target69.getInlineTestSetWordSize();
        java.lang.String str74 = python3Target69.getLanguage();
        java.lang.String str77 = python3Target69.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean78 = python3Target69.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet79 = python3Target69.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator80 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target81 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator80);
        java.lang.String str83 = python3Target81.encodeIntAsCharEscape((int) (short) 1);
        org.stringtemplate.v4.STGroup sTGroup84 = python3Target81.loadTemplates();
        python3Target69.templates = sTGroup84;
        python3Target47.templates = sTGroup84;
        python3Target0.templates = sTGroup84;
        org.antlr.v4.tool.Grammar grammar88 = null;
        org.stringtemplate.v4.ST sT89 = null;
        python3Target0.genRecognizerHeaderFile(grammar88, sT89, "\"\"\\35\"\"");
        java.lang.String[] strArray92 = python3Target0.targetCharValueEscape;
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29 + "'", int21 == 29);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"i\"" + "'", str23, "\"i\"");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29 + "'", int24 == 29);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"\"\"\"\"\"\"\"" + "'", str41, "\"\"\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"" + "'", str45, "\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(sTGroup60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 64 + "'", int62 == 64);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(codeGenerator64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 64 + "'", int70 == 64);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "4.5.2.1" + "'", str72, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 64 + "'", int73 == 64);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\"4.5.2.1\"" + "'", str77, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "\\1" + "'", str83, "\\1");
        org.junit.Assert.assertNotNull(sTGroup84);
        org.junit.Assert.assertNotNull(strArray92);
    }

    @Test
    public void test17153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17153");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "", false);
        java.util.Set<java.lang.String> strSet9 = null;
        python3Target0.badWords = strSet9;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str12 = python3Target11.language;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup14 = null;
        python3Target13.templates = sTGroup14;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target13.badWords = strSet20;
        python3Target11.badWords = strSet20;
        python3Target11.language = "\"\"i\"\"";
        java.lang.String str26 = python3Target11.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python3Target11.gen = codeGenerator27;
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target();
        int int30 = python3Target29.getInlineTestSetWordSize();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "" };
        python3Target29.targetCharValueEscape = strArray33;
        java.lang.String[] strArray35 = python3Target29.targetCharValueEscape;
        boolean boolean36 = python3Target29.supportsOverloadedMethods();
        java.lang.String[] strArray37 = new java.lang.String[] {};
        python3Target29.targetCharValueEscape = strArray37;
        org.antlr.v4.codegen.target.Python3Target python3Target39 = new org.antlr.v4.codegen.target.Python3Target();
        int int40 = python3Target39.getInlineTestSetWordSize();
        java.lang.String str41 = python3Target39.language;
        java.lang.String str42 = python3Target39.getVersion();
        int int43 = python3Target39.getInlineTestSetWordSize();
        java.lang.String str44 = python3Target39.getLanguage();
        java.lang.String str47 = python3Target39.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet48 = python3Target39.badWords;
        python3Target29.badWords = strSet48;
        python3Target11.badWords = strSet48;
        python3Target0.badWords = strSet48;
        int int52 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup53 = python3Target0.templates;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4.5.2.1" + "'", str26, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 64 + "'", int40 == 64);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "4.5.2.1" + "'", str42, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 64 + "'", int43 == 64);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"4.5.2.1\"" + "'", str47, "\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 64 + "'", int52 == 64);
        org.junit.Assert.assertNull(sTGroup53);
    }

    @Test
    public void test17154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17154");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "\"\"", true);
        java.lang.String str17 = python3Target0.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target0.templates;
        python3Target0.language = "\"\"\\\"\\\"\"\"";
        java.lang.String str21 = python3Target0.getLanguage();
        java.util.Set<java.lang.String> strSet22 = python3Target0.badWords;
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.stringtemplate.v4.ST sT24 = null;
        python3Target0.genRecognizerHeaderFile(grammar23, sT24, "5.2Context");
        org.antlr.v4.tool.Rule rule27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python3Target0.getRuleFunctionContextStructName(rule27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(sTGroup18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\"\\\"\\\"\"\"" + "'", str21, "\"\"\\\"\\\"\"\"");
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test17155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17155");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        int int8 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\12", false);
        java.lang.String str13 = python3Target0.getLanguage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test17156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17156");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("@");
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        int int8 = python3Target7.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target7.language;
        java.lang.String str10 = python3Target7.getVersion();
        int int11 = python3Target7.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target7.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target7.gen;
        python3Target7.addBadWords();
        python3Target7.language = "\\0";
        java.lang.String[] strArray17 = python3Target7.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray17;
        python3Target0.language = "\\\"hi!\\\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "\\\"12\\\"", false);
        int int25 = python3Target0.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup26 = python3Target0.templates;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"@\"" + "'", str6, "\"@\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\\"12\\\"" + "'", str24, "\\\"12\\\"");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 29 + "'", int25 == 29);
        org.junit.Assert.assertNull(sTGroup26);
    }

    @Test
    public void test17157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17157");
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
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target();
        int int19 = python3Target18.getInlineTestSetWordSize();
        java.lang.String str20 = python3Target18.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python3Target18.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "", true);
        java.util.Set<java.lang.String> strSet25 = python3Target18.getBadWords();
        java.lang.String str27 = python3Target18.encodeIntAsCharEscape(29);
        java.util.Set<java.lang.String> strSet28 = python3Target18.getBadWords();
        python3Target0.badWords = strSet28;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python3Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup32 = python3Target0.templates;
        boolean boolean33 = python3Target0.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup34 = python3Target0.templates;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\"i\"\"" + "'", str15, "\"\"i\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\\35" + "'", str27, "\\35");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(codeGenerator30);
        org.junit.Assert.assertNull(codeGenerator31);
        org.junit.Assert.assertNull(sTGroup32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sTGroup34);
    }

    @Test
    public void test17158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17158");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        python3Target0.genRecognizerHeaderFile(grammar20, sT21, "\"\\12\"");
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target();
        int int25 = python3Target24.getInlineTestSetWordSize();
        java.lang.String str26 = python3Target24.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = python3Target24.getCodeGenerator();
        java.util.Set<java.lang.String> strSet28 = python3Target24.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        python3Target29.badWords = strSet32;
        python3Target24.badWords = strSet32;
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = python3Target24.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = python3Target24.gen;
        org.antlr.v4.codegen.target.Python3Target python3Target38 = new org.antlr.v4.codegen.target.Python3Target();
        int int39 = python3Target38.getInlineTestSetWordSize();
        java.lang.String str40 = python3Target38.language;
        java.lang.String str41 = python3Target38.getVersion();
        org.antlr.v4.tool.Grammar grammar42 = null;
        org.stringtemplate.v4.ST sT43 = null;
        python3Target38.genRecognizerHeaderFile(grammar42, sT43, "\"\"\"\"");
        java.lang.String str46 = python3Target38.getVersion();
        java.lang.String str48 = python3Target38.getTargetStringLiteralFromString("\"\"\\0\"\"");
        java.util.Set<java.lang.String> strSet49 = python3Target38.getBadWords();
        python3Target24.badWords = strSet49;
        python3Target0.badWords = strSet49;
        boolean boolean52 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = python3Target0.getLoopCounter(grammarAST53);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertNull(codeGenerator19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(codeGenerator27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(codeGenerator36);
        org.junit.Assert.assertNull(codeGenerator37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "4.5.2.1" + "'", str41, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "4.5.2.1" + "'", str46, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\"\"\"\\0\"\"\"" + "'", str48, "\"\"\"\\0\"\"\"");
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test17159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17159");
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
        boolean boolean21 = python3Target0.wantsBaseListener();
        java.lang.String[] strArray22 = python3Target0.targetCharValueEscape;
        int int23 = python3Target0.getInlineTestSetWordSize();
        python3Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python3Target0.getCodeGenerator();
        java.lang.String str28 = python3Target0.getTargetStringLiteralFromString("\"\"\\\"\\\"64\\\"\\\"\"\"", false);
        java.lang.String str29 = python3Target0.getLanguage();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\"\\\"\\\"64\\\"\\\"\"\"" + "'", str28, "\"\"\\\"\\\"64\\\"\\\"\"\"");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test17160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17160");
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
        org.antlr.v4.codegen.target.Python3Target python3Target32 = new org.antlr.v4.codegen.target.Python3Target();
        int int33 = python3Target32.getInlineTestSetWordSize();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "" };
        python3Target32.targetCharValueEscape = strArray36;
        java.lang.String[] strArray38 = python3Target32.targetCharValueEscape;
        boolean boolean39 = python3Target32.supportsOverloadedMethods();
        java.lang.String[] strArray40 = new java.lang.String[] {};
        python3Target32.targetCharValueEscape = strArray40;
        python3Target0.targetCharValueEscape = strArray40;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray40;
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 64 + "'", int33 == 64);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test17161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17161");
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
        java.lang.String str13 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        python3Target0.genRecognizerHeaderFile(grammar14, sT15, "\\\"1\\\"");
        python3Target0.addBadWords();
        java.lang.String[] strArray19 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray19;
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test17162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17162");
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
        java.lang.String str13 = python3Target0.language;
        boolean boolean14 = python3Target0.supportsOverloadedMethods();
        boolean boolean15 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup17 = null;
        python3Target16.templates = sTGroup17;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        python3Target16.badWords = strSet23;
        python3Target16.language = "\\0";
        python3Target16.addBadWords();
        python3Target16.addBadWords();
        java.lang.String[] strArray30 = python3Target16.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.stringtemplate.v4.ST sT32 = null;
        python3Target16.genRecognizerHeaderFile(grammar31, sT32, "\\\"4.5.2.1\\\"");
        java.util.Set<java.lang.String> strSet35 = python3Target16.getBadWords();
        python3Target0.badWords = strSet35;
        org.antlr.v4.codegen.target.Python3Target python3Target37 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup38 = null;
        python3Target37.templates = sTGroup38;
        java.lang.String[] strArray43 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        python3Target37.badWords = strSet44;
        python3Target37.language = "1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = python3Target37.getCodeGenerator();
        org.antlr.v4.codegen.target.Python3Target python3Target50 = new org.antlr.v4.codegen.target.Python3Target();
        int int51 = python3Target50.getInlineTestSetWordSize();
        boolean boolean52 = python3Target50.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator53 = python3Target50.gen;
        java.lang.String str54 = python3Target50.getVersion();
        java.lang.String[] strArray55 = python3Target50.targetCharValueEscape;
        boolean boolean56 = python3Target50.supportsOverloadedMethods();
        int int57 = python3Target50.getInlineTestSetWordSize();
        java.lang.String str58 = python3Target50.getLanguage();
        java.lang.String str59 = python3Target50.getLanguage();
        boolean boolean60 = python3Target50.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python3Target python3Target61 = new org.antlr.v4.codegen.target.Python3Target();
        int int62 = python3Target61.getInlineTestSetWordSize();
        boolean boolean63 = python3Target61.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator64 = python3Target61.gen;
        boolean boolean65 = python3Target61.wantsBaseVisitor();
        boolean boolean66 = python3Target61.supportsOverloadedMethods();
        java.lang.String str69 = python3Target61.getTargetStringLiteralFromString("\\0", false);
        boolean boolean70 = python3Target61.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator71 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target72 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator71);
        java.lang.String str74 = python3Target72.encodeIntAsCharEscape((int) (short) 1);
        org.stringtemplate.v4.STGroup sTGroup75 = python3Target72.loadTemplates();
        python3Target61.templates = sTGroup75;
        python3Target50.templates = sTGroup75;
        python3Target37.templates = sTGroup75;
        org.stringtemplate.v4.STGroup sTGroup79 = python3Target37.getTemplates();
        python3Target0.templates = sTGroup79;
        org.antlr.v4.codegen.CodeGenerator codeGenerator81 = null;
        java.lang.String str84 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator81, "\"_\"\"\"\"12\"\"\"\"\"", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(codeGenerator49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 64 + "'", int51 == 64);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(codeGenerator53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "4.5.2.1" + "'", str54, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 64 + "'", int57 == 64);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 64 + "'", int62 == 64);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(codeGenerator64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\\0" + "'", str69, "\\0");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\\1" + "'", str74, "\\1");
        org.junit.Assert.assertNotNull(sTGroup75);
        org.junit.Assert.assertNotNull(sTGroup79);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\"_\\\"\\\"\\\"\\\"12\\\"\\\"\\\"\\\"\"" + "'", str84, "\"_\\\"\\\"\\\"\\\"12\\\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test17163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17163");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        python3Target0.addBadWords();
        java.lang.String str7 = python3Target0.encodeIntAsCharEscape(29);
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str10 = python3Target9.language;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup12 = null;
        python3Target11.templates = sTGroup12;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        python3Target11.badWords = strSet18;
        python3Target9.badWords = strSet18;
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target23 = new org.antlr.v4.codegen.target.Python3Target();
        int int24 = python3Target23.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup25 = python3Target23.templates;
        org.antlr.v4.tool.Grammar grammar26 = null;
        int[] intArray27 = new int[] {};
        java.lang.String[] strArray28 = python3Target23.getTokenTypesAsTargetLabels(grammar26, intArray27);
        java.lang.String[] strArray29 = python3Target9.getTokenTypesAsTargetLabels(grammar22, intArray27);
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target31 = new org.antlr.v4.codegen.target.Python3Target();
        int int32 = python3Target31.getInlineTestSetWordSize();
        java.lang.String str33 = python3Target31.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        java.lang.String str37 = python3Target31.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator34, "", true);
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.stringtemplate.v4.ST sT39 = null;
        python3Target31.genRecognizerHeaderFile(grammar38, sT39, "");
        org.antlr.v4.tool.Grammar grammar42 = null;
        org.stringtemplate.v4.ST sT43 = null;
        python3Target31.genRecognizerHeaderFile(grammar42, sT43, "\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = python3Target31.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator47 = null;
        python3Target31.gen = codeGenerator47;
        java.lang.String str50 = python3Target31.encodeIntAsCharEscape(1);
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target52 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str54 = python3Target52.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar55 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target56 = new org.antlr.v4.codegen.target.Python3Target();
        int int57 = python3Target56.getInlineTestSetWordSize();
        java.lang.String str58 = python3Target56.language;
        java.lang.String str59 = python3Target56.getVersion();
        int int60 = python3Target56.getInlineTestSetWordSize();
        java.lang.String str61 = python3Target56.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator62 = python3Target56.gen;
        org.antlr.v4.tool.Grammar grammar63 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target64 = new org.antlr.v4.codegen.target.Python3Target();
        int int65 = python3Target64.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup66 = python3Target64.templates;
        org.antlr.v4.tool.Grammar grammar67 = null;
        int[] intArray68 = new int[] {};
        java.lang.String[] strArray69 = python3Target64.getTokenTypesAsTargetLabels(grammar67, intArray68);
        java.lang.String[] strArray70 = python3Target56.getTokenTypesAsTargetLabels(grammar63, intArray68);
        java.lang.String[] strArray71 = python3Target52.getTokenTypesAsTargetLabels(grammar55, intArray68);
        java.lang.String[] strArray72 = python3Target31.getTokenTypesAsTargetLabels(grammar51, intArray68);
        java.lang.String[] strArray73 = python3Target9.getTokenTypesAsTargetLabels(grammar30, intArray68);
        java.lang.String[] strArray74 = python3Target0.getTokenTypesAsTargetLabels(grammar8, intArray68);
        java.lang.String str76 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator77 = null;
        java.lang.String str80 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator77, "", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\35" + "'", str7, "\\35");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 64 + "'", int24 == 64);
        org.junit.Assert.assertNull(sTGroup25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 64 + "'", int32 == 64);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"\"" + "'", str37, "\"\"");
        org.junit.Assert.assertNull(codeGenerator46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\\1" + "'", str50, "\\1");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "d" + "'", str54, "d");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 64 + "'", int57 == 64);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "4.5.2.1" + "'", str59, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 64 + "'", int60 == 64);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(codeGenerator62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 64 + "'", int65 == 64);
        org.junit.Assert.assertNull(sTGroup66);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[]");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "d" + "'", str76, "d");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\"\"" + "'", str80, "\"\"");
    }

    @Test
    public void test17164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17164");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup6 = null;
        python3Target0.templates = sTGroup6;
        java.util.Set<java.lang.String> strSet8 = python3Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        java.lang.String str11 = python3Target0.encodeIntAsCharEscape(0);
        boolean boolean12 = python3Target0.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\0" + "'", str11, "\\0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test17165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17165");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\"", false);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup11 = null;
        python3Target0.templates = sTGroup11;
        java.lang.String[] strArray13 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet14 = python3Target0.getBadWords();
        int int15 = python3Target0.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
    }

    @Test
    public void test17166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17166");
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
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target0.genRecognizerHeaderFile(grammar19, sT20, "12");
        int int23 = python3Target0.getInlineTestSetWordSize();
        int int24 = python3Target0.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python3Target0.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"\"\"\"4.5.2.1\"\"\"\"\"" + "'", str17, "\"\"\"\"\"4.5.2.1\"\"\"\"\"");
        org.junit.Assert.assertNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 64 + "'", int24 == 64);
    }

    @Test
    public void test17167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17167");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.getCodeGenerator();
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"\"\"\"\"\"\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.gen;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target12.language;
        java.lang.String str15 = python3Target12.getVersion();
        int int16 = python3Target12.getInlineTestSetWordSize();
        java.lang.String str17 = python3Target12.getLanguage();
        int int18 = python3Target12.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup19 = null;
        python3Target12.templates = sTGroup19;
        python3Target12.addBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target();
        int int23 = python3Target22.getInlineTestSetWordSize();
        boolean boolean24 = python3Target22.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python3Target22.gen;
        java.lang.String str26 = python3Target22.getVersion();
        org.stringtemplate.v4.STGroup sTGroup27 = null;
        python3Target22.templates = sTGroup27;
        org.antlr.v4.tool.Grammar grammar29 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target30 = new org.antlr.v4.codegen.target.Python3Target();
        int int31 = python3Target30.getInlineTestSetWordSize();
        java.lang.String str32 = python3Target30.language;
        java.lang.String str33 = python3Target30.getVersion();
        python3Target30.language = "@";
        org.antlr.v4.tool.Grammar grammar36 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target37 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str39 = python3Target37.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target41 = new org.antlr.v4.codegen.target.Python3Target();
        int int42 = python3Target41.getInlineTestSetWordSize();
        java.lang.String str43 = python3Target41.language;
        java.lang.String str44 = python3Target41.getVersion();
        int int45 = python3Target41.getInlineTestSetWordSize();
        java.lang.String str46 = python3Target41.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator47 = python3Target41.gen;
        org.antlr.v4.tool.Grammar grammar48 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target49 = new org.antlr.v4.codegen.target.Python3Target();
        int int50 = python3Target49.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup51 = python3Target49.templates;
        org.antlr.v4.tool.Grammar grammar52 = null;
        int[] intArray53 = new int[] {};
        java.lang.String[] strArray54 = python3Target49.getTokenTypesAsTargetLabels(grammar52, intArray53);
        java.lang.String[] strArray55 = python3Target41.getTokenTypesAsTargetLabels(grammar48, intArray53);
        java.lang.String[] strArray56 = python3Target37.getTokenTypesAsTargetLabels(grammar40, intArray53);
        java.lang.String[] strArray57 = python3Target30.getTokenTypesAsTargetLabels(grammar36, intArray53);
        java.lang.String[] strArray58 = python3Target22.getTokenTypesAsTargetLabels(grammar29, intArray53);
        boolean boolean59 = python3Target22.wantsBaseListener();
        org.antlr.v4.codegen.target.Python3Target python3Target60 = new org.antlr.v4.codegen.target.Python3Target();
        int int61 = python3Target60.getInlineTestSetWordSize();
        java.lang.String str62 = python3Target60.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator63 = null;
        java.lang.String str66 = python3Target60.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator63, "", true);
        org.antlr.v4.tool.Grammar grammar67 = null;
        org.stringtemplate.v4.ST sT68 = null;
        python3Target60.genRecognizerHeaderFile(grammar67, sT68, "\"\"\"\"");
        org.stringtemplate.v4.STGroup sTGroup71 = null;
        python3Target60.templates = sTGroup71;
        java.lang.String str73 = python3Target60.language;
        boolean boolean74 = python3Target60.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator75 = python3Target60.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator76 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target77 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator76);
        int int78 = python3Target77.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup79 = python3Target77.loadTemplates();
        python3Target60.templates = sTGroup79;
        python3Target22.templates = sTGroup79;
        python3Target12.templates = sTGroup79;
        python3Target0.templates = sTGroup79;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str85 = python3Target0.getElementListName("\"\\\"\\\"\\\"\\\"d\\\"\\\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"" + "'", str10, "\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4.5.2.1" + "'", str26, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 64 + "'", int31 == 64);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4.5.2.1" + "'", str33, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "d" + "'", str39, "d");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 64 + "'", int42 == 64);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "4.5.2.1" + "'", str44, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 64 + "'", int45 == 64);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(codeGenerator47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 64 + "'", int50 == 64);
        org.junit.Assert.assertNull(sTGroup51);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[]");
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 64 + "'", int61 == 64);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\"\"" + "'", str66, "\"\"");
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(codeGenerator75);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 64 + "'", int78 == 64);
        org.junit.Assert.assertNotNull(sTGroup79);
    }

    @Test
    public void test17168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17168");
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
        boolean boolean18 = python3Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python3Target0.getCodeGenerator();
        java.lang.String str20 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        python3Target0.gen = codeGenerator21;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python3Target0.getTokenTypeAsTargetLabel(grammar24, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(codeGenerator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator23);
    }

    @Test
    public void test17169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17169");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("", true);
        java.lang.String str13 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target();
        int int16 = python3Target15.getInlineTestSetWordSize();
        java.lang.String str17 = python3Target15.language;
        java.lang.String str18 = python3Target15.getVersion();
        int int19 = python3Target15.getInlineTestSetWordSize();
        java.lang.String str20 = python3Target15.getLanguage();
        java.lang.String str21 = python3Target15.getLanguage();
        java.lang.String str23 = python3Target15.getTargetStringLiteralFromString("\"i\"");
        java.lang.String str24 = python3Target15.getLanguage();
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target();
        int int27 = python3Target26.getInlineTestSetWordSize();
        java.lang.String str28 = python3Target26.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        java.lang.String str32 = python3Target26.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator29, "", true);
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.stringtemplate.v4.ST sT34 = null;
        python3Target26.genRecognizerHeaderFile(grammar33, sT34, "\"\"\"\"");
        python3Target26.language = "\"\"\"4.5.2.1\"\"\"";
        org.antlr.v4.tool.Grammar grammar39 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target40 = new org.antlr.v4.codegen.target.Python3Target();
        int int41 = python3Target40.getInlineTestSetWordSize();
        java.lang.String str42 = python3Target40.language;
        java.lang.String str43 = python3Target40.getVersion();
        python3Target40.language = "@";
        org.antlr.v4.tool.Grammar grammar46 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target47 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str49 = python3Target47.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar50 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target51 = new org.antlr.v4.codegen.target.Python3Target();
        int int52 = python3Target51.getInlineTestSetWordSize();
        java.lang.String str53 = python3Target51.language;
        java.lang.String str54 = python3Target51.getVersion();
        int int55 = python3Target51.getInlineTestSetWordSize();
        java.lang.String str56 = python3Target51.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator57 = python3Target51.gen;
        org.antlr.v4.tool.Grammar grammar58 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target59 = new org.antlr.v4.codegen.target.Python3Target();
        int int60 = python3Target59.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup61 = python3Target59.templates;
        org.antlr.v4.tool.Grammar grammar62 = null;
        int[] intArray63 = new int[] {};
        java.lang.String[] strArray64 = python3Target59.getTokenTypesAsTargetLabels(grammar62, intArray63);
        java.lang.String[] strArray65 = python3Target51.getTokenTypesAsTargetLabels(grammar58, intArray63);
        java.lang.String[] strArray66 = python3Target47.getTokenTypesAsTargetLabels(grammar50, intArray63);
        java.lang.String[] strArray67 = python3Target40.getTokenTypesAsTargetLabels(grammar46, intArray63);
        java.lang.String[] strArray68 = python3Target26.getTokenTypesAsTargetLabels(grammar39, intArray63);
        java.lang.String[] strArray69 = python3Target15.getTokenTypesAsTargetLabels(grammar25, intArray63);
        java.lang.String[] strArray70 = python3Target0.getTokenTypesAsTargetLabels(grammar14, intArray63);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8, "\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\"i\"\"" + "'", str23, "\"\"i\"\"");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"" + "'", str32, "\"\"");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 64 + "'", int41 == 64);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "4.5.2.1" + "'", str43, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "d" + "'", str49, "d");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 64 + "'", int52 == 64);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "4.5.2.1" + "'", str54, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 64 + "'", int55 == 64);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(codeGenerator57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 64 + "'", int60 == 64);
        org.junit.Assert.assertNull(sTGroup61);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[]");
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
    }

    @Test
    public void test17170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17170");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String[] strArray3 = python3Target0.targetCharValueEscape;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("1", true);
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\\\"4.5.2.1\\\"", false);
        java.lang.String str10 = python3Target0.getLanguage();
        java.lang.String str11 = python3Target0.getVersion();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"1\"" + "'", str6, "\"1\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\\"4.5.2.1\\\"" + "'", str9, "\\\"4.5.2.1\\\"");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
    }

    @Test
    public void test17171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17171");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        python3Target0.gen = codeGenerator2;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target0.genRecognizerHeaderFile(grammar6, sT7, "\" \"");
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str11 = python3Target0.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test17172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17172");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        boolean boolean6 = python3Target0.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        java.util.Set<java.lang.String> strSet8 = python3Target0.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str10 = python3Target9.language;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup12 = null;
        python3Target11.templates = sTGroup12;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        python3Target11.badWords = strSet18;
        python3Target9.badWords = strSet18;
        python3Target9.language = "\"\"i\"\"";
        java.lang.String str24 = python3Target9.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        python3Target9.gen = codeGenerator25;
        java.lang.String str27 = python3Target9.language;
        boolean boolean28 = python3Target9.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target30 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator29);
        java.lang.String str32 = python3Target30.encodeIntAsCharEscape((int) (short) 1);
        org.stringtemplate.v4.STGroup sTGroup33 = python3Target30.loadTemplates();
        python3Target9.templates = sTGroup33;
        python3Target0.templates = sTGroup33;
        java.lang.String str37 = python3Target0.getTargetStringLiteralFromString("\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"");
        boolean boolean38 = python3Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = null;
        python3Target0.gen = codeGenerator39;
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = python3Target0.gen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4.5.2.1" + "'", str24, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\"i\"\"" + "'", str27, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\\1" + "'", str32, "\\1");
        org.junit.Assert.assertNotNull(sTGroup33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\"" + "'", str37, "\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(codeGenerator41);
    }

    @Test
    public void test17173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17173");
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
        int int37 = python3Target0.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet38 = python3Target0.getBadWords();
        boolean boolean39 = python3Target0.templatesExist();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 29 + "'", int37 == 29);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test17174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17174");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("hi!", false);
        python3Target0.language = "\"\"i\"\"";
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\"4.5.2.1\"");
        org.stringtemplate.v4.STGroup sTGroup13 = null;
        python3Target0.templates = sTGroup13;
        python3Target0.addBadWords();
        int int16 = python3Target0.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"4.5.2.1\"\"" + "'", str12, "\"\"4.5.2.1\"\"");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
    }

    @Test
    public void test17175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17175");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        python3Target0.targetCharValueEscape = strArray8;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        int int11 = python3Target10.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target10.language;
        java.lang.String str13 = python3Target10.getVersion();
        int int14 = python3Target10.getInlineTestSetWordSize();
        java.lang.String str15 = python3Target10.getLanguage();
        java.lang.String str18 = python3Target10.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet19 = python3Target10.badWords;
        python3Target0.badWords = strSet19;
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.stringtemplate.v4.ST sT22 = null;
        python3Target0.genRecognizerHeaderFile(grammar21, sT22, "\"\"\"64\"\"\"");
        java.lang.String str27 = python3Target0.getTargetStringLiteralFromString("\"\"\"\\\"\\\"\"\"\"", false);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup28 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"4.5.2.1\"" + "'", str18, "\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\"\"\\\"\\\"\"\"\"" + "'", str27, "\"\"\"\\\"\\\"\"\"\"");
    }

    @Test
    public void test17176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17176");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        int int4 = python3Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        python3Target3.targetCharValueEscape = strArray7;
        python3Target0.targetCharValueEscape = strArray7;
        java.lang.String str11 = python3Target0.encodeIntAsCharEscape((int) (short) 100);
        boolean boolean12 = python3Target0.supportsOverloadedMethods();
        java.lang.String str13 = python3Target0.getVersion();
        boolean boolean14 = python3Target0.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test17177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17177");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        java.lang.String str7 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        int int11 = python3Target10.getInlineTestSetWordSize();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "" };
        python3Target10.targetCharValueEscape = strArray14;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python3Target10.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "\"\"", false);
        int int20 = python3Target10.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python3Target10.getCodeGenerator();
        java.lang.String[] strArray22 = python3Target10.targetCharValueEscape;
        java.lang.String[] strArray23 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray23;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray23;
        python3Target10.targetCharValueEscape = strArray23;
        java.util.Set<java.lang.String> strSet27 = python3Target10.badWords;
        python3Target0.badWords = strSet27;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\0" + "'", str9, "\\0");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29 + "'", int20 == 29);
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test17178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17178");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getLanguage();
        boolean boolean6 = python3Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet7 = python3Target0.badWords;
        python3Target0.language = "hi!";
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        python3Target0.addBadWords();
        java.util.Set<java.lang.String> strSet12 = python3Target0.getBadWords();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test17179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17179");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        java.util.Set<java.lang.String> strSet10 = python3Target0.badWords;
        java.util.Set<java.lang.String> strSet11 = python3Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "Python3", false);
        boolean boolean16 = python3Target0.wantsBaseListener();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ython" + "'", str15, "ython");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }
}

