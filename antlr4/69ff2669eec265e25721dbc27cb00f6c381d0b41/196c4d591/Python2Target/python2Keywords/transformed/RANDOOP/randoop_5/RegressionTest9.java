import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str8 = python2Target6.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        python2Target6.language = "";
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str21 = python2Target19.getTargetStringLiteralFromString("hi!");
        python2Target19.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        java.lang.String str27 = python2Target19.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator24, "hi!", false);
        int int28 = python2Target19.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target29 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str31 = python2Target29.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target32 = new org.antlr.v4.codegen.target.Python2Target();
        int int33 = python2Target32.getInlineTestSetWordSize();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        python2Target32.badWords = strSet38;
        python2Target29.badWords = strSet38;
        python2Target19.badWords = strSet38;
        python2Target19.addBadWords();
        java.lang.String str45 = python2Target19.getTargetStringLiteralFromString("\"i\"");
        boolean boolean46 = python2Target19.wantsBaseListener();
        java.lang.String[] strArray47 = null;
        python2Target19.targetCharValueEscape = strArray47;
        java.util.Set<java.lang.String> strSet49 = python2Target19.badWords;
        python2Target6.badWords = strSet49;
        python2Target0.badWords = strSet49;
        org.antlr.v4.codegen.target.Python2Target python2Target52 = new org.antlr.v4.codegen.target.Python2Target();
        int int53 = python2Target52.getInlineTestSetWordSize();
        java.lang.String[] strArray57 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        python2Target52.badWords = strSet58;
        org.antlr.v4.codegen.target.Python2Target python2Target61 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str63 = python2Target61.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target64 = new org.antlr.v4.codegen.target.Python2Target();
        int int65 = python2Target64.getInlineTestSetWordSize();
        java.lang.String[] strArray69 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        python2Target64.badWords = strSet70;
        python2Target61.badWords = strSet70;
        python2Target52.badWords = strSet70;
        python2Target0.badWords = strSet70;
        org.antlr.v4.codegen.CodeGenerator codeGenerator76 = null;
        java.lang.String str79 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator76, "\"\"\\\\\\\"\\\\\\\"#\\\\\\\"\\\\\\\"\"\"", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"hi!\"" + "'", str8, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"hi!\"" + "'", str21, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "i" + "'", str27, "i");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 64 + "'", int28 == 64);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\\0" + "'", str31, "\\0");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 64 + "'", int33 == 64);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"\"i\"\"" + "'", str45, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 64 + "'", int53 == 64);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\\0" + "'", str63, "\\0");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 64 + "'", int65 == 64);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\"#\\\\\\\"\\\\\\\"\\\"\"" + "'", str79, "\"\\\"\\\\\\\"\\\\\\\"#\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\" \"");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target1.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\" \"Context" + "'", str10, "\" \"Context");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertNull(codeGenerator16);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str3 = python2Target0.getLanguage();
        java.lang.String[] strArray4 = python2Target0.targetCharValueEscape;
        boolean boolean5 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python2Target0.genRecognizerHeaderFile(grammar7, sT8, "_tsetPython2Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target0.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getLanguage();
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target1.genRecognizerHeaderFile(grammar6, sT7, "\"\"0\"Context\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python2Target1.gen = codeGenerator10;
        java.lang.String str13 = python2Target1.getListLabel("\"\\\"\\\"0\\\"Context\\\"Context\"");
        java.lang.String[] strArray14 = python2Target1.targetCharValueEscape;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"\\\"0\\\"Context\\\"Context\"" + "'", str13, "\"\\\"\\\"0\\\"Context\\\"Context\"");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python2Target0.gen = codeGenerator16;
        int int18 = python2Target0.getSerializedATNSegmentLimit();
        python2Target0.language = "\"_\"i\"\"";
        org.antlr.v4.tool.ast.GrammarAST grammarAST21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python2Target0.getLoopCounter(grammarAST21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.templates;
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.lang.String str12 = python2Target10.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str14 = python2Target10.getImplicitRuleLabel("\"i\"");
        java.lang.String str15 = python2Target10.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python2Target10.gen = codeGenerator16;
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target10.templates;
        python2Target1.templates = sTGroup18;
        python2Target1.language = "\"\"\\12\"\"Context";
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python2Target1.getTokenTypeAsTargetLabel(grammar23, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"hi!\"\"Context" + "'", str12, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_\"i\"" + "'", str14, "_\"i\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertNull(codeGenerator22);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.getLanguage();
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"d\"", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
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
        java.util.Set<java.lang.String> strSet28 = python2Target0.badWords;
        java.lang.Class<?> wildcardClass29 = strSet28.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python2Target1.badWords = strSet7;
        python2Target0.badWords = strSet7;
        java.util.Set<java.lang.String> strSet11 = python2Target0.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target();
        int int13 = python2Target12.getInlineTestSetWordSize();
        python2Target12.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target16.loadTemplates();
        python2Target12.templates = sTGroup17;
        python2Target0.templates = sTGroup17;
        java.lang.String str21 = python2Target0.getImplicitRuleLabel("_\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str24 = python2Target22.getTargetStringLiteralFromString("hi!");
        python2Target22.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        java.lang.String str30 = python2Target22.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator27, "hi!", false);
        int int31 = python2Target22.getInlineTestSetWordSize();
        boolean boolean32 = python2Target22.templatesExist();
        boolean boolean33 = python2Target22.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        java.lang.String str37 = python2Target22.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator34, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target();
        int int39 = python2Target38.getInlineTestSetWordSize();
        java.lang.String[] strArray43 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        python2Target38.badWords = strSet44;
        org.stringtemplate.v4.STGroup sTGroup47 = null;
        python2Target38.templates = sTGroup47;
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = null;
        python2Target38.gen = codeGenerator49;
        java.util.Set<java.lang.String> strSet51 = python2Target38.getBadWords();
        python2Target22.badWords = strSet51;
        python2Target22.addBadWords();
        org.antlr.v4.codegen.target.Python2Target python2Target54 = new org.antlr.v4.codegen.target.Python2Target();
        int int55 = python2Target54.getInlineTestSetWordSize();
        java.lang.String[] strArray59 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        python2Target54.badWords = strSet60;
        org.antlr.v4.codegen.CodeGenerator codeGenerator63 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target64 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator63);
        org.stringtemplate.v4.STGroup sTGroup65 = python2Target64.loadTemplates();
        python2Target54.templates = sTGroup65;
        python2Target22.templates = sTGroup65;
        python2Target0.templates = sTGroup65;
        java.lang.String str69 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator70 = python2Target0.gen;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "__\"\\\"\\\\\\\"i\\\\\\\"\\\"\"" + "'", str21, "__\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"hi!\"" + "'", str24, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "i" + "'", str30, "i");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 64 + "'", int31 == 64);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 64 + "'", int55 == 64);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(sTGroup65);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "4.5.2.1" + "'", str69, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator70);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        java.lang.String[] strArray3 = python2Target1.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target python2Target4 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str6 = python2Target4.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target4.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target4.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target16.loadTemplates();
        python2Target4.templates = sTGroup17;
        java.lang.String str19 = python2Target4.language;
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target4.templates;
        python2Target1.templates = sTGroup20;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        python2Target1.gen = codeGenerator22;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        python2Target1.gen = codeGenerator24;
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"" + "'", str6, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(sTGroup20);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.templates;
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.lang.String str12 = python2Target10.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str14 = python2Target10.getImplicitRuleLabel("\"i\"");
        java.lang.String str15 = python2Target10.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python2Target10.gen = codeGenerator16;
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target10.templates;
        python2Target1.templates = sTGroup18;
        java.lang.String str22 = python2Target1.getTargetStringLiteralFromString("\"i\"", true);
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.stringtemplate.v4.ST sT24 = null;
        python2Target1.genRecognizerHeaderFile(grammar23, sT24, "1");
        org.stringtemplate.v4.STGroup sTGroup27 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target29 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator28);
        java.lang.String str31 = python2Target29.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean32 = python2Target29.templatesExist();
        java.lang.String[] strArray33 = python2Target29.targetCharValueEscape;
        java.lang.String str35 = python2Target29.getAltLabelContextStructName("\"0\"");
        org.stringtemplate.v4.STGroup sTGroup36 = python2Target29.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup37 = python2Target29.loadTemplates();
        python2Target1.templates = sTGroup37;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"hi!\"\"Context" + "'", str12, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_\"i\"" + "'", str14, "_\"i\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\"i\\\"\"" + "'", str22, "\"\\\"i\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\"hi!\"\"Context" + "'", str31, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"0\"Context" + "'", str35, "\"0\"Context");
        org.junit.Assert.assertNotNull(sTGroup36);
        org.junit.Assert.assertNotNull(sTGroup37);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
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
        java.lang.String str33 = python2Target0.language;
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = python2Target0.getCodeGenerator();
        java.lang.String str36 = python2Target0.language;
        int int37 = python2Target0.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = python2Target0.getElementListName("Python2ContextContext");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(codeGenerator35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
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
        java.lang.String str88 = python2Target1.getTargetStringLiteralFromString("hi!");
        int int89 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str91 = python2Target1.encodeIntAsCharEscape(64);
        boolean boolean92 = python2Target1.wantsBaseListener();
        python2Target1.language = "_\"\"\\\"\\\"\\\\12Context\\\"\\\"\"\"";
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
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "\"hi!\"" + "'", str88, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 64 + "'", int89 == 64);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "@" + "'", str91, "@");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "_tset_\"\"\"hi!\"\"Context\"", true);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"tset_\\\"\\\"\\\"hi!\\\"\\\"Context\"" + "'", str13, "\"tset_\\\"\\\"\\\"hi!\\\"\\\"Context\"");
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
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
        python2Target0.language = "\"\"hi!\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        python2Target0.gen = codeGenerator21;
        python2Target0.language = "\"\"\"\"_\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"\"\"\"";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
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
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
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
        org.stringtemplate.v4.STGroup sTGroup24 = python2Target1.loadTemplates();
        java.lang.String str25 = python2Target1.getVersion();
        java.lang.String str27 = python2Target1.getImplicitRuleLabel("\"\"\"\\\"_\\\"\\\\\\\"\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\"\\\\\\\"\\\"\\\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\\"i" + "'", str13, "\\\"i");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4.5.2.1" + "'", str23, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "_\"\"\"\\\"_\\\"\\\\\\\"\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\"\\\\\\\"\\\"\\\"\"\"\"" + "'", str27, "_\"\"\"\\\"_\\\"\\\\\\\"\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\"\\\\\\\"\\\"\\\"\"\"\"");
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        java.lang.String str9 = python2Target0.getTargetStringLiteralFromString("#");
        java.lang.String str10 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        java.lang.String str14 = python2Target12.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str15 = python2Target12.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        int int18 = python2Target16.getInlineTestSetWordSize();
        boolean boolean19 = python2Target16.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python2Target16.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python2Target16.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "_\"i\"", false);
        java.lang.String[] strArray30 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray30;
        python2Target16.targetCharValueEscape = strArray30;
        python2Target12.targetCharValueEscape = strArray30;
        python2Target0.targetCharValueEscape = strArray30;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"#\"" + "'", str9, "\"#\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"hi!\"\"Context" + "'", str14, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\\"i" + "'", str24, "\\\"i");
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
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
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        java.lang.String str33 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator30, "1", false);
        int int34 = python2Target0.getInlineTestSetWordSize();
        boolean boolean35 = python2Target0.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26, "\"\"i\"\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1" + "'", str29, "1");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 64 + "'", int34 == 64);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        java.lang.String str3 = python2Target1.getVersion();
        int int4 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
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
        int int30 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.stringtemplate.v4.ST sT32 = null;
        python2Target0.genRecognizerHeaderFile(grammar31, sT32, "\"\"\"hi!\"\"\"");
        java.lang.String[] strArray35 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray35;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\12\"" + "'", str29, "\"\\12\"");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
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
        java.lang.String str26 = python2Target0.getLanguage();
        python2Target0.addBadWords();
        int int28 = python2Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup29 = python2Target0.templates;
        boolean boolean30 = python2Target0.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(codeGenerator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 64 + "'", int28 == 64);
        org.junit.Assert.assertNull(sTGroup29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
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
        java.lang.String str44 = python2Target0.getVersion();
        boolean boolean45 = python2Target0.wantsBaseVisitor();
        int int46 = python2Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator47 = null;
        python2Target0.gen = codeGenerator47;
        org.stringtemplate.v4.STGroup sTGroup49 = python2Target0.templates;
        java.lang.String str51 = python2Target0.encodeIntAsCharEscape(64);
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "4.5.2.1" + "'", str44, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "@" + "'", str51, "@");
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python2Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        python2Target0.gen = codeGenerator20;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python2Target0.getImplicitTokenLabel("\\\"hi!\\\"\\\"ContexContext");
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
        org.junit.Assert.assertNull(codeGenerator19);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.templates;
        int int10 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
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
        java.lang.String str29 = python2Target0.encodeIntAsCharEscape((int) '#');
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.stringtemplate.v4.ST sT31 = null;
        python2Target0.genRecognizerHeaderFile(grammar30, sT31, "_tset4.5.2.1\\\"Contex");
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        python2Target0.gen = codeGenerator34;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#" + "'", str29, "#");
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"\\\"\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\"\\\"\"", true);
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target();
        int int13 = python2Target12.getInlineTestSetWordSize();
        java.lang.String str16 = python2Target12.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str17 = python2Target12.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str20 = python2Target18.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python2Target18.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        java.lang.String str28 = python2Target18.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator25, "", true);
        python2Target18.language = "";
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str33 = python2Target31.getTargetStringLiteralFromString("hi!");
        python2Target31.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        java.lang.String str39 = python2Target31.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator36, "hi!", false);
        int int40 = python2Target31.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target41 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str43 = python2Target41.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target44 = new org.antlr.v4.codegen.target.Python2Target();
        int int45 = python2Target44.getInlineTestSetWordSize();
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        python2Target44.badWords = strSet50;
        python2Target41.badWords = strSet50;
        python2Target31.badWords = strSet50;
        python2Target31.addBadWords();
        java.lang.String str57 = python2Target31.getTargetStringLiteralFromString("\"i\"");
        boolean boolean58 = python2Target31.wantsBaseListener();
        java.lang.String[] strArray59 = null;
        python2Target31.targetCharValueEscape = strArray59;
        java.util.Set<java.lang.String> strSet61 = python2Target31.badWords;
        python2Target18.badWords = strSet61;
        python2Target12.badWords = strSet61;
        python2Target1.badWords = strSet61;
        java.lang.String str66 = python2Target1.getListLabel("\"12\\\"Contex\"");
        org.antlr.v4.tool.Grammar grammar67 = null;
        org.stringtemplate.v4.ST sT68 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar67, sT68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\"\\\"\"" + "'", str11, "\"\\\"\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"hi!\"\"" + "'", str16, "\"\"hi!\"\"");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"hi!\"" + "'", str20, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\"" + "'", str28, "\"\"");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"hi!\"" + "'", str33, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "i" + "'", str39, "i");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 64 + "'", int40 == 64);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\\0" + "'", str43, "\\0");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 64 + "'", int45 == 64);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\"\"i\"\"" + "'", str57, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\"12\\\"Contex\"" + "'", str66, "\"12\\\"Contex\"");
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target1.genRecognizerHeaderFile(grammar6, sT7, "\"\\\"hi!\\\"\\\"Contex\"");
        java.lang.String str10 = python2Target1.getVersion();
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        java.lang.String[] strArray4 = python2Target0.targetCharValueEscape;
        boolean boolean5 = python2Target0.templatesExist();
        java.util.Set<java.lang.String> strSet6 = python2Target0.getBadWords();
        boolean boolean7 = python2Target0.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
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
        python2Target0.language = "\"\"0\"Context\"";
        boolean boolean29 = python2Target0.templatesExist();
        python2Target0.addBadWords();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
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
        java.lang.String str35 = python2Target0.getLanguage();
        java.lang.String str36 = python2Target0.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST37 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST37);
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        python2Target1.language = "\"\"\\\"hi!\\\"\\\"Contex\"\"";
        org.junit.Assert.assertNotNull(sTGroup2);
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        python2Target1.gen = codeGenerator4;
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target1.genRecognizerHeaderFile(grammar6, sT7, "i");
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        python2Target1.addBadWords();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar12, sT13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target7.loadTemplates();
        python2Target0.templates = sTGroup8;
        java.lang.String str11 = python2Target0.getListLabel("#");
        java.lang.String str12 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target0.gen;
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar14, sT15, "_\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#" + "'", str11, "#");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        python2Target0.gen = codeGenerator28;
        org.antlr.v4.codegen.target.Python2Target python2Target30 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str32 = python2Target30.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        java.lang.String str36 = python2Target30.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator33, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        java.lang.String str40 = python2Target30.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator37, "", true);
        python2Target30.language = "";
        org.antlr.v4.codegen.target.Python2Target python2Target43 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str45 = python2Target43.getTargetStringLiteralFromString("hi!");
        python2Target43.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = null;
        java.lang.String str51 = python2Target43.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator48, "hi!", false);
        int int52 = python2Target43.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target53 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str55 = python2Target53.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target56 = new org.antlr.v4.codegen.target.Python2Target();
        int int57 = python2Target56.getInlineTestSetWordSize();
        java.lang.String[] strArray61 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        python2Target56.badWords = strSet62;
        python2Target53.badWords = strSet62;
        python2Target43.badWords = strSet62;
        python2Target43.addBadWords();
        java.lang.String str69 = python2Target43.getTargetStringLiteralFromString("\"i\"");
        boolean boolean70 = python2Target43.wantsBaseListener();
        java.lang.String[] strArray71 = null;
        python2Target43.targetCharValueEscape = strArray71;
        java.util.Set<java.lang.String> strSet73 = python2Target43.badWords;
        python2Target30.badWords = strSet73;
        org.antlr.v4.codegen.target.Python2Target python2Target75 = new org.antlr.v4.codegen.target.Python2Target();
        int int76 = python2Target75.getInlineTestSetWordSize();
        java.lang.String str79 = python2Target75.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str80 = python2Target75.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target81 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str83 = python2Target81.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator84 = null;
        java.lang.String str87 = python2Target81.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator84, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator88 = null;
        java.lang.String str91 = python2Target81.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator88, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator92 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target93 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator92);
        org.stringtemplate.v4.STGroup sTGroup94 = python2Target93.loadTemplates();
        python2Target81.templates = sTGroup94;
        python2Target75.templates = sTGroup94;
        python2Target30.templates = sTGroup94;
        python2Target0.templates = sTGroup94;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup99 = python2Target0.loadTemplates();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"hi!\"" + "'", str32, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"\"" + "'", str36, "\"\"");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"\"" + "'", str40, "\"\"");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"hi!\"" + "'", str45, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "i" + "'", str51, "i");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 64 + "'", int52 == 64);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\\0" + "'", str55, "\\0");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 64 + "'", int57 == 64);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\"\"i\"\"" + "'", str69, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 64 + "'", int76 == 64);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\"\"hi!\"\"" + "'", str79, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "4.5.2.1" + "'", str80, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "\"hi!\"" + "'", str83, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "\"\"" + "'", str87, "\"\"");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "\"\"" + "'", str91, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup94);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
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
        java.lang.String str16 = python2Target0.encodeIntAsCharEscape((int) (short) 100);
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target();
        int int18 = python2Target17.getInlineTestSetWordSize();
        int int19 = python2Target17.getInlineTestSetWordSize();
        boolean boolean20 = python2Target17.wantsBaseVisitor();
        int int21 = python2Target17.getInlineTestSetWordSize();
        java.lang.String str23 = python2Target17.encodeIntAsCharEscape((int) ' ');
        java.lang.String[] strArray24 = python2Target17.targetCharValueEscape;
        python2Target0.targetCharValueEscape = strArray24;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup26 = python2Target0.getTemplates();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "d" + "'", str16, "d");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " " + "'", str23, " ");
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.getLanguage();
        python2Target0.language = "\\\"\\\"#\\\"\\\"";
        java.util.Set<java.lang.String> strSet7 = python2Target0.getBadWords();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.util.Set<java.lang.String> strSet11 = python2Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target0.templates;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target();
        int int15 = python2Target14.getInlineTestSetWordSize();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python2Target14.badWords = strSet20;
        java.lang.String str24 = python2Target14.getTargetStringLiteralFromString("\\\"i");
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str27 = python2Target25.getTargetStringLiteralFromString("hi!");
        python2Target25.language = "hi!";
        java.util.Set<java.lang.String> strSet30 = python2Target25.badWords;
        python2Target14.badWords = strSet30;
        python2Target0.badWords = strSet30;
        java.lang.String str35 = python2Target0.getTargetStringLiteralFromString("", true);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = python2Target0.getRuleFunctionContextStructName(ruleFunction36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\\\"i\"" + "'", str24, "\"\\\"i\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"hi!\"" + "'", str27, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"" + "'", str35, "\"\"");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python2Target1.badWords = strSet7;
        python2Target0.badWords = strSet7;
        java.util.Set<java.lang.String> strSet11 = python2Target0.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target();
        int int13 = python2Target12.getInlineTestSetWordSize();
        python2Target12.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target16.loadTemplates();
        python2Target12.templates = sTGroup17;
        python2Target0.templates = sTGroup17;
        java.lang.String str21 = python2Target0.getImplicitRuleLabel("_\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
        org.stringtemplate.v4.STGroup sTGroup22 = python2Target0.getTemplates();
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.stringtemplate.v4.ST sT24 = null;
        python2Target0.genRecognizerHeaderFile(grammar23, sT24, "\\\\\\\"i");
        java.lang.String str28 = python2Target0.getTargetStringLiteralFromString("\"\\\"\\\"\\\\\\\"#\\\\\\\"\\\"\\\"\"");
        python2Target0.addBadWords();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "__\"\\\"\\\\\\\"i\\\\\\\"\\\"\"" + "'", str21, "__\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\"\\\"\\\"\\\\\\\"#\\\\\\\"\\\"\\\"\"\"" + "'", str28, "\"\"\\\"\\\"\\\\\\\"#\\\\\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
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
        java.lang.String str25 = python2Target0.getImplicitSetLabel("\"\\\\\\\"i\"");
        boolean boolean26 = python2Target0.supportsOverloadedMethods();
        java.lang.String str28 = python2Target0.getListLabel(" \\\"Contex");
        org.stringtemplate.v4.STGroup sTGroup29 = python2Target0.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup30 = python2Target0.loadTemplates();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "_tset\"\\\\\\\"i\"" + "'", str25, "_tset\"\\\\\\\"i\"");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " \\\"Contex" + "'", str28, " \\\"Contex");
        org.junit.Assert.assertNotNull(sTGroup29);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python2Target0.genRecognizerHeaderFile(grammar9, sT10, "Python2");
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target0.getLoopLabel(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"64Context\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"64Context\"" + "'", str1, "\"64Context\"");
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python2Target0.gen;
        int int21 = python2Target0.getSerializedATNSegmentLimit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\" \"" + "'", str16, "\" \"");
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
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
        java.lang.String str88 = python2Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str90 = python2Target1.getListLabel("\"\\\"iContextContext\"");
        org.antlr.v4.tool.Grammar grammar91 = null;
        org.stringtemplate.v4.ST sT92 = null;
        python2Target1.genRecognizerHeaderFile(grammar91, sT92, "_\\\"_\\\"i\\\"");
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
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "\"hi!\"" + "'", str88, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "\"\\\"iContextContext\"" + "'", str90, "\"\\\"iContextContext\"");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
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
        boolean boolean12 = python2Target0.templatesExist();
        java.lang.String str13 = python2Target0.getVersion();
        boolean boolean14 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target0.getRuleFunctionContextStructName(ruleFunction15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\12Context\"" + "'", str11, "\"\\12Context\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        java.lang.String[] strArray7 = python2Target1.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("_\"\\12\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.gen;
        java.lang.String str5 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str9 = python2Target7.getTargetStringLiteralFromString("hi!");
        python2Target7.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target7.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "hi!", false);
        int int16 = python2Target7.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str19 = python2Target17.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target();
        int int21 = python2Target20.getInlineTestSetWordSize();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        python2Target20.badWords = strSet26;
        python2Target17.badWords = strSet26;
        python2Target7.badWords = strSet26;
        python2Target7.addBadWords();
        java.lang.String str33 = python2Target7.getTargetStringLiteralFromString("\"i\"");
        boolean boolean34 = python2Target7.wantsBaseListener();
        java.lang.String[] strArray35 = null;
        python2Target7.targetCharValueEscape = strArray35;
        org.antlr.v4.tool.Grammar grammar37 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str40 = python2Target38.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        python2Target38.gen = codeGenerator41;
        java.lang.String str44 = python2Target38.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar45 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target46 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str48 = python2Target46.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = null;
        python2Target46.gen = codeGenerator49;
        java.lang.String str52 = python2Target46.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar53 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target54 = new org.antlr.v4.codegen.target.Python2Target();
        int int55 = python2Target54.getInlineTestSetWordSize();
        java.lang.String[] strArray59 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        python2Target54.badWords = strSet60;
        org.stringtemplate.v4.STGroup sTGroup63 = null;
        python2Target54.templates = sTGroup63;
        org.antlr.v4.codegen.CodeGenerator codeGenerator65 = null;
        python2Target54.gen = codeGenerator65;
        java.util.Set<java.lang.String> strSet67 = python2Target54.getBadWords();
        java.lang.String str68 = python2Target54.getVersion();
        org.antlr.v4.tool.Grammar grammar69 = null;
        int[] intArray70 = new int[] {};
        java.lang.String[] strArray71 = python2Target54.getTokenTypesAsTargetLabels(grammar69, intArray70);
        java.lang.String[] strArray72 = python2Target46.getTokenTypesAsTargetLabels(grammar53, intArray70);
        java.lang.String[] strArray73 = python2Target38.getTokenTypesAsTargetLabels(grammar45, intArray70);
        java.lang.String[] strArray74 = python2Target7.getTokenTypesAsTargetLabels(grammar37, intArray70);
        java.lang.String[] strArray75 = python2Target1.getTokenTypesAsTargetLabels(grammar6, intArray70);
        org.antlr.v4.codegen.CodeGenerator codeGenerator76 = null;
        java.lang.String str79 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator76, "Python2Context", false);
        python2Target1.language = "\"_tset\"\"\"";
        java.util.Set<java.lang.String> strSet82 = python2Target1.getBadWords();
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "i" + "'", str15, "i");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\0" + "'", str19, "\\0");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\"i\"\"" + "'", str33, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\\0" + "'", str40, "\\0");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\\12" + "'", str44, "\\12");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\\0" + "'", str48, "\\0");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\\12" + "'", str52, "\\12");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 64 + "'", int55 == 64);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "4.5.2.1" + "'", str68, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[]");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ython2Contex" + "'", str79, "ython2Contex");
        org.junit.Assert.assertNotNull(strSet82);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        java.lang.String str9 = python2Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "1", false);
        java.lang.String str14 = python2Target0.getVersion();
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromString("\"\\\"#\\\"\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.gen;
        java.lang.String str19 = python2Target0.language;
        java.lang.String str20 = python2Target0.getLanguage();
        python2Target0.addBadWords();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\"i\"\"" + "'", str8, "\"_\"i\"\"");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"\\\"#\\\"\"\"" + "'", str17, "\"\"\\\"#\\\"\"\"");
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\"_\"\\\"\\\\\\\"i\\\\\\\"\\\"\"\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target0.getImplicitRuleLabel("\"\"\\\"\\\"\\\"hi!\\\"\\\"\\\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\\\"\\\"\\\\\\\"i\\\\\\\"\\\"\\\"" + "'", str10, "_\\\"\\\"\\\\\\\"i\\\\\\\"\\\"\\\"");
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
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
        org.stringtemplate.v4.STGroup sTGroup24 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python2Target1.getCodeGenerator();
        boolean boolean26 = python2Target1.wantsBaseListener();
        int int27 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\\"i" + "'", str13, "\\\"i");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4.5.2.1" + "'", str23, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup24);
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
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
        java.lang.String str27 = python2Target0.language;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str30 = python2Target28.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        int int32 = python2Target31.getInlineTestSetWordSize();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        python2Target31.badWords = strSet37;
        python2Target28.badWords = strSet37;
        java.lang.String[] strArray41 = python2Target28.targetCharValueEscape;
        python2Target0.targetCharValueEscape = strArray41;
        int int43 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.stringtemplate.v4.ST sT45 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar44, sT45, "\"\\\"_tset\\\"_\\\"i\\\"\\\"\"");
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
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\\0" + "'", str30, "\\0");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 64 + "'", int32 == 64);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 64 + "'", int43 == 64);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        int int10 = python2Target0.getInlineTestSetWordSize();
        int int11 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet13 = python2Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python2Target0.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target1.genRecognizerHeaderFile(grammar6, sT7, "\"\\\"hi!\\\"\\\"Contex\"");
        boolean boolean10 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        java.lang.String str14 = python2Target12.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str15 = python2Target12.getVersion();
        java.lang.String str17 = python2Target12.getTargetStringLiteralFromString("\\\"i");
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str20 = python2Target18.getTargetStringLiteralFromString("hi!");
        python2Target18.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python2Target18.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "hi!", false);
        int int27 = python2Target18.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str30 = python2Target28.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        int int32 = python2Target31.getInlineTestSetWordSize();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        python2Target31.badWords = strSet37;
        python2Target28.badWords = strSet37;
        python2Target18.badWords = strSet37;
        python2Target18.addBadWords();
        java.lang.String str44 = python2Target18.getTargetStringLiteralFromString("\"i\"");
        boolean boolean45 = python2Target18.wantsBaseListener();
        java.lang.String str48 = python2Target18.getTargetStringLiteralFromString("\"\\12Context\"", true);
        java.lang.String[] strArray49 = python2Target18.targetCharValueEscape;
        python2Target12.targetCharValueEscape = strArray49;
        python2Target1.targetCharValueEscape = strArray49;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"hi!\"\"Context" + "'", str14, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\\\\\"i\"" + "'", str17, "\"\\\\\\\"i\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"hi!\"" + "'", str20, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "i" + "'", str26, "i");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\\0" + "'", str30, "\\0");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 64 + "'", int32 == 64);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\"\"i\"\"" + "'", str44, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\"\"\\12Context\"\"" + "'", str48, "\"\"\\12Context\"\"");
        org.junit.Assert.assertNotNull(strArray49);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
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
        python2Target0.genRecognizerHeaderFile(grammar54, sT55, "_tsetd");
        java.lang.String str59 = python2Target0.encodeIntAsCharEscape((int) (byte) 0);
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
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\\0" + "'", str59, "\\0");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
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
        python2Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.target.Python2Target python2Target23 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str25 = python2Target23.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        python2Target23.gen = codeGenerator26;
        java.lang.String[] strArray33 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray33;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray33;
        python2Target23.targetCharValueEscape = strArray33;
        python2Target0.targetCharValueEscape = strArray33;
        java.lang.String str40 = python2Target0.getTargetStringLiteralFromString("\"\\\"_tset_\\\"\\\"\\\"hi!\\\"\\\"Context\\\"\\\"\"", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\0" + "'", str25, "\\0");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"\\\"_tset_\\\"\\\"\\\"hi!\\\"\\\"Context\\\"\\\"\"" + "'", str40, "\"\\\"_tset_\\\"\\\"\\\"hi!\\\"\\\"Context\\\"\\\"\"");
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet7 = python2Target0.badWords;
        java.lang.String str9 = python2Target0.getTargetStringLiteralFromString("\"\"\\12Context\"Context\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python2Target0.gen = codeGenerator10;
        boolean boolean12 = python2Target0.wantsBaseListener();
        boolean boolean13 = python2Target0.templatesExist();
        java.lang.String str14 = python2Target0.getVersion();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"\"\\12Context\"Context\"\"" + "'", str9, "\"\"\"\\12Context\"Context\"\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.lang.String str12 = python2Target10.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str13 = python2Target10.getVersion();
        java.lang.String str15 = python2Target10.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target10.templates;
        int int17 = python2Target10.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator18);
        java.lang.String str21 = python2Target19.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str23 = python2Target19.getImplicitRuleLabel("\"i\"");
        java.lang.String str24 = python2Target19.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        python2Target19.gen = codeGenerator25;
        org.stringtemplate.v4.STGroup sTGroup27 = python2Target19.templates;
        python2Target10.templates = sTGroup27;
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        python2Target10.gen = codeGenerator29;
        java.lang.String str31 = python2Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target33 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator32);
        java.lang.String str35 = python2Target33.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str36 = python2Target33.getVersion();
        java.lang.String str38 = python2Target33.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup39 = python2Target33.templates;
        python2Target10.templates = sTGroup39;
        python2Target0.templates = sTGroup39;
        java.lang.String str43 = python2Target0.getImplicitRuleLabel("\"_\"\\\\\\\"\\\\\\\"#\\\\\\\"\\\\\\\"\"Context\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"hi!\"\"Context" + "'", str12, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\\\\\"i\"" + "'", str15, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\"hi!\"\"Context" + "'", str21, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_\"i\"" + "'", str23, "_\"i\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(sTGroup27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Python2" + "'", str31, "Python2");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"hi!\"\"Context" + "'", str35, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "4.5.2.1" + "'", str36, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\\\\\\\"i\"" + "'", str38, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(sTGroup39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "_\"_\"\\\\\\\"\\\\\\\"#\\\\\\\"\\\\\\\"\"Context\"" + "'", str43, "_\"_\"\\\\\\\"\\\\\\\"#\\\\\\\"\\\\\\\"\"Context\"");
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
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
        java.lang.String str33 = python2Target0.language;
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        java.lang.String str38 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator35, "\"\"\"hi!\"\"Context\"", true);
        java.lang.String str41 = python2Target0.getTargetStringLiteralFromString("\"\\\"\\\"\\\"hi!\\\"\\\"\\\"\"", false);
        int int42 = python2Target0.getSerializedATNSegmentLimit();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\\\"\\\"hi!\\\"\\\"Context\"" + "'", str38, "\"\\\"\\\"hi!\\\"\\\"Context\"");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"\\\"\\\"\\\"hi!\\\"\\\"\\\"\"" + "'", str41, "\"\\\"\\\"\\\"hi!\\\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
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
        java.lang.String str27 = python2Target0.getVersion();
        python2Target0.addBadWords();
        org.antlr.v4.codegen.target.Python2Target python2Target29 = new org.antlr.v4.codegen.target.Python2Target();
        int int30 = python2Target29.getInlineTestSetWordSize();
        python2Target29.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target33 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator32);
        org.stringtemplate.v4.STGroup sTGroup34 = python2Target33.templates;
        java.util.Set<java.lang.String> strSet35 = python2Target33.badWords;
        python2Target29.badWords = strSet35;
        python2Target0.badWords = strSet35;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = python2Target0.getRuleFunctionContextStructName(ruleFunction38);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "4.5.2.1" + "'", str27, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertNull(sTGroup34);
        org.junit.Assert.assertNotNull(strSet35);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
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
        org.stringtemplate.v4.STGroup sTGroup21 = python2Target0.templates;
        python2Target0.language = "";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(sTGroup21);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\" \"");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target1.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        java.lang.String str17 = python2Target1.getListLabel("\"\"\\\"0\\\"Context\"Context\"");
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str21 = python2Target19.getTargetStringLiteralFromString("hi!");
        python2Target19.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        java.lang.String str27 = python2Target19.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator24, "hi!", false);
        int int28 = python2Target19.getInlineTestSetWordSize();
        boolean boolean29 = python2Target19.templatesExist();
        boolean boolean30 = python2Target19.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        java.lang.String str34 = python2Target19.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator31, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target();
        int int36 = python2Target35.getInlineTestSetWordSize();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        python2Target35.badWords = strSet41;
        org.stringtemplate.v4.STGroup sTGroup44 = null;
        python2Target35.templates = sTGroup44;
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = null;
        python2Target35.gen = codeGenerator46;
        java.util.Set<java.lang.String> strSet48 = python2Target35.getBadWords();
        python2Target19.badWords = strSet48;
        boolean boolean50 = python2Target19.templatesExist();
        boolean boolean51 = python2Target19.templatesExist();
        java.lang.String str52 = python2Target19.language;
        org.antlr.v4.tool.Grammar grammar53 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target54 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str56 = python2Target54.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator57 = null;
        python2Target54.gen = codeGenerator57;
        java.lang.String str60 = python2Target54.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar61 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target62 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str64 = python2Target62.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator65 = null;
        python2Target62.gen = codeGenerator65;
        java.lang.String str68 = python2Target62.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar69 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target70 = new org.antlr.v4.codegen.target.Python2Target();
        int int71 = python2Target70.getInlineTestSetWordSize();
        java.lang.String[] strArray75 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet76 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet76, strArray75);
        python2Target70.badWords = strSet76;
        org.stringtemplate.v4.STGroup sTGroup79 = null;
        python2Target70.templates = sTGroup79;
        org.antlr.v4.codegen.CodeGenerator codeGenerator81 = null;
        python2Target70.gen = codeGenerator81;
        java.util.Set<java.lang.String> strSet83 = python2Target70.getBadWords();
        java.lang.String str84 = python2Target70.getVersion();
        org.antlr.v4.tool.Grammar grammar85 = null;
        int[] intArray86 = new int[] {};
        java.lang.String[] strArray87 = python2Target70.getTokenTypesAsTargetLabels(grammar85, intArray86);
        java.lang.String[] strArray88 = python2Target62.getTokenTypesAsTargetLabels(grammar69, intArray86);
        java.lang.String[] strArray89 = python2Target54.getTokenTypesAsTargetLabels(grammar61, intArray86);
        java.lang.String[] strArray90 = python2Target19.getTokenTypesAsTargetLabels(grammar53, intArray86);
        java.lang.String[] strArray91 = python2Target1.getTokenTypesAsTargetLabels(grammar18, intArray86);
        java.lang.String str93 = python2Target1.getListLabel("\"\\\"\\\\\\\"i\\\"\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\" \"Context" + "'", str10, "\" \"Context");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"\\\"0\\\"Context\"Context\"" + "'", str17, "\"\"\\\"0\\\"Context\"Context\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"hi!\"" + "'", str21, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "i" + "'", str27, "i");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 64 + "'", int28 == 64);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 64 + "'", int36 == 64);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\\0" + "'", str56, "\\0");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\\12" + "'", str60, "\\12");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\\0" + "'", str64, "\\0");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\\12" + "'", str68, "\\12");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 64 + "'", int71 == 64);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(strSet83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "4.5.2.1" + "'", str84, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[]");
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "\"\\\"\\\\\\\"i\\\"\"" + "'", str93, "\"\\\"\\\\\\\"i\\\"\"");
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\\\"\\\"\\\"hi!\\\"\\\"\\\"", false);
        boolean boolean11 = python2Target0.supportsOverloadedMethods();
        python2Target0.addBadWords();
        java.lang.String[] strArray13 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        python2Target0.gen = codeGenerator14;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str10, "\\\"\\\"\\\"hi!\\\"\\\"\\\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tset\"_\\\"i\"Context");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tset\"_\\\"i\"Context" + "'", str1, "_tset\"_\\\"i\"Context");
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.templates;
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.lang.String str12 = python2Target10.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str14 = python2Target10.getImplicitRuleLabel("\"i\"");
        java.lang.String str15 = python2Target10.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python2Target10.gen = codeGenerator16;
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target10.templates;
        python2Target1.templates = sTGroup18;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        python2Target1.gen = codeGenerator20;
        java.lang.String str22 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String str26 = python2Target24.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str27 = python2Target24.getVersion();
        java.lang.String str29 = python2Target24.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup30 = python2Target24.templates;
        python2Target1.templates = sTGroup30;
        java.lang.Class<?> wildcardClass32 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"hi!\"\"Context" + "'", str12, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_\"i\"" + "'", str14, "_\"i\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Python2" + "'", str22, "Python2");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"hi!\"\"Context" + "'", str26, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "4.5.2.1" + "'", str27, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\\\\\\"i\"" + "'", str29, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(sTGroup30);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet8 = python2Target0.badWords;
        java.lang.String str9 = python2Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target0.getImplicitRuleLabel("\"_\"\"\"hi!\"\"Context\"\"ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\" \"");
        java.util.Set<java.lang.String> strSet11 = python2Target1.badWords;
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.templates;
        python2Target1.addBadWords();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\" \"Context" + "'", str10, "\" \"Context");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(sTGroup12);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "\"\"i\"\"");
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str10 = python2Target1.getImplicitSetLabel("_tset\" \"");
        java.lang.String[] strArray11 = python2Target1.targetCharValueEscape;
        boolean boolean12 = python2Target1.supportsOverloadedMethods();
        java.lang.String str13 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset_tset\" \"" + "'", str10, "_tset_tset\" \"");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.getCodeGenerator();
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target();
        int int7 = python2Target6.getInlineTestSetWordSize();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        python2Target6.badWords = strSet12;
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target16.loadTemplates();
        python2Target6.templates = sTGroup17;
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target();
        int int20 = python2Target19.getInlineTestSetWordSize();
        int int21 = python2Target19.getInlineTestSetWordSize();
        boolean boolean22 = python2Target19.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python2Target19.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        java.lang.String str27 = python2Target19.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator24, "_\"i\"", false);
        java.lang.String[] strArray33 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray33;
        python2Target19.targetCharValueEscape = strArray33;
        java.lang.String[] strArray36 = python2Target19.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target python2Target37 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str39 = python2Target37.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target40 = new org.antlr.v4.codegen.target.Python2Target();
        int int41 = python2Target40.getInlineTestSetWordSize();
        java.lang.String[] strArray45 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        python2Target40.badWords = strSet46;
        python2Target37.badWords = strSet46;
        org.antlr.v4.codegen.target.Python2Target python2Target50 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str52 = python2Target50.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator53 = null;
        python2Target50.gen = codeGenerator53;
        java.lang.String[] strArray60 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray60;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray60;
        python2Target50.targetCharValueEscape = strArray60;
        python2Target37.targetCharValueEscape = strArray60;
        java.lang.String[] strArray65 = python2Target37.targetCharValueEscape;
        python2Target19.targetCharValueEscape = strArray65;
        python2Target6.targetCharValueEscape = strArray65;
        python2Target0.targetCharValueEscape = strArray65;
        python2Target0.language = "\\\"\\\"\\\"hi!\\\"\\\"Contex\\\"\\\"";
        int int71 = python2Target0.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str73 = python2Target0.getImplicitTokenLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\\\"i" + "'", str27, "\\\"i");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\\0" + "'", str39, "\\0");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 64 + "'", int41 == 64);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\\0" + "'", str52, "\\0");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2147483647 + "'", int71 == 2147483647);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        boolean boolean4 = python2Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.templates;
        boolean boolean6 = python2Target0.templatesExist();
        java.lang.String str8 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String[] strArray9 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "_tset\"_tset\"_\\\"i\"\"", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\12" + "'", str8, "\\12");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"tset\\\"_tset\\\"_\\\"i\\\"\"" + "'", str13, "\"tset\\\"_tset\\\"_\\\"i\\\"\"");
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
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
        int int48 = python2Target0.getInlineTestSetWordSize();
        boolean boolean49 = python2Target0.wantsBaseListener();
        java.lang.String str50 = python2Target0.getVersion();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 64 + "'", int48 == 64);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "4.5.2.1" + "'", str50, "4.5.2.1");
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.getLanguage();
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target0.genRecognizerHeaderFile(grammar6, sT7, "\"\"\\12\"\"");
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target10.gen = codeGenerator11;
        java.util.Set<java.lang.String> strSet13 = python2Target10.getBadWords();
        java.util.Set<java.lang.String> strSet14 = python2Target10.getBadWords();
        python2Target0.badWords = strSet14;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        int int17 = python2Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        python2Target16.badWords = strSet22;
        java.lang.String str26 = python2Target16.getTargetStringLiteralFromString("\\\"i");
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str29 = python2Target27.getTargetStringLiteralFromString("hi!");
        python2Target27.language = "hi!";
        java.util.Set<java.lang.String> strSet32 = python2Target27.badWords;
        python2Target16.badWords = strSet32;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        java.lang.String str37 = python2Target16.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator34, "hi!", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        java.lang.String str41 = python2Target16.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator38, "\"#\"", false);
        java.util.Set<java.lang.String> strSet42 = python2Target16.getBadWords();
        python2Target0.badWords = strSet42;
        boolean boolean44 = python2Target0.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\\\"i\"" + "'", str26, "\"\\\"i\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"hi!\"" + "'", str29, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"i\"" + "'", str37, "\"i\"");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#" + "'", str41, "#");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target3 = new org.antlr.v4.codegen.target.Python2Target();
        int int4 = python2Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python2Target3.badWords = strSet9;
        python2Target0.badWords = strSet9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target0.getCodeGenerator();
        java.lang.String str14 = python2Target0.getLanguage();
        boolean boolean15 = python2Target0.templatesExist();
        boolean boolean16 = python2Target0.templatesExist();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        python2Target0.gen = codeGenerator27;
        org.antlr.v4.tool.Grammar grammar29 = null;
        org.stringtemplate.v4.ST sT30 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar29, sT30);
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
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
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
        python2Target0.language = "";
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator25);
        java.lang.String str28 = python2Target26.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str30 = python2Target26.getImplicitRuleLabel("\"i\"");
        boolean boolean31 = python2Target26.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet32 = python2Target26.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target33 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str35 = python2Target33.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        java.lang.String str39 = python2Target33.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator36, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        java.lang.String str43 = python2Target33.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator40, "", true);
        java.util.Set<java.lang.String> strSet44 = python2Target33.getBadWords();
        python2Target26.badWords = strSet44;
        java.lang.String str47 = python2Target26.getAltLabelContextStructName("\"\\12\"");
        boolean boolean48 = python2Target26.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet49 = python2Target26.badWords;
        python2Target0.badWords = strSet49;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = python2Target0.getImplicitSetLabel("__\"i\"Context");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\"hi!\"\"Context" + "'", str28, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "_\"i\"" + "'", str30, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"hi!\"" + "'", str35, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"\"" + "'", str39, "\"\"");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"\"" + "'", str43, "\"\"");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"\\12\"Context" + "'", str47, "\"\\12\"Context");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strSet49);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        boolean boolean8 = python2Target0.templatesExist();
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"Contex\\\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"Contex\\\"\"" + "'", str10, "\"\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"Contex\\\"\"");
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target();
        int int9 = python2Target8.getInlineTestSetWordSize();
        java.lang.String str12 = python2Target8.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str13 = python2Target8.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str16 = python2Target14.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python2Target14.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python2Target14.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator25);
        org.stringtemplate.v4.STGroup sTGroup27 = python2Target26.loadTemplates();
        python2Target14.templates = sTGroup27;
        python2Target8.templates = sTGroup27;
        java.lang.String[] strArray30 = python2Target8.targetCharValueEscape;
        java.lang.String str32 = python2Target8.getImplicitSetLabel("d");
        org.antlr.v4.codegen.target.Python2Target python2Target33 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str35 = python2Target33.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray36 = python2Target33.targetCharValueEscape;
        boolean boolean37 = python2Target33.supportsOverloadedMethods();
        java.lang.String str40 = python2Target33.getTargetStringLiteralFromString("\"\\12\"", true);
        java.util.Set<java.lang.String> strSet41 = python2Target33.badWords;
        python2Target8.badWords = strSet41;
        python2Target0.badWords = strSet41;
        int int44 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = python2Target0.getLoopLabel(grammarAST45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"hi!\"\"" + "'", str12, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"hi!\"" + "'", str16, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"" + "'", str20, "\"\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "_tsetd" + "'", str32, "_tsetd");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"hi!\"" + "'", str35, "\"hi!\"");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"\"\\12\"\"" + "'", str40, "\"\"\\12\"\"");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 64 + "'", int44 == 64);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
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
        java.lang.String str22 = python2Target1.getAltLabelContextStructName("\"\\12\"");
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target1.templates;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\12\"Context" + "'", str22, "\"\\12\"Context");
        org.junit.Assert.assertNotNull(sTGroup23);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
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
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str26 = python2Target24.getTargetStringLiteralFromString("hi!");
        python2Target24.language = "hi!";
        java.lang.String str30 = python2Target24.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean31 = python2Target24.wantsBaseListener();
        java.lang.String str33 = python2Target24.getTargetStringLiteralFromString("\\\"i");
        java.util.Set<java.lang.String> strSet34 = python2Target24.getBadWords();
        python2Target0.badWords = strSet34;
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        java.lang.String str39 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator36, "_\"\\\"hi!\\\"\\\"Contex\"", true);
        java.lang.String str40 = python2Target0.getLanguage();
        java.lang.String str42 = python2Target0.getTargetStringLiteralFromString("_\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
        java.lang.String str45 = python2Target0.getTargetStringLiteralFromString("_tset", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\0" + "'", str11, "\\0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"hi!\"" + "'", str26, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\\12" + "'", str30, "\\12");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\\\"i\"" + "'", str33, "\"\\\"i\"");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"\\\"\\\"hi!\\\"\\\"Contex\"" + "'", str39, "\"\\\"\\\"hi!\\\"\\\"Contex\"");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\"_\"\\\"\\\\\\\"i\\\\\\\"\\\"\"\"" + "'", str42, "\"_\"\\\"\\\\\\\"i\\\\\\\"\\\"\"\"");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "_tset" + "'", str45, "_tset");
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("\"0\"");
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str11 = python2Target9.getTargetStringLiteralFromString("hi!");
        python2Target9.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target9.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "hi!", false);
        int int18 = python2Target9.getInlineTestSetWordSize();
        boolean boolean19 = python2Target9.templatesExist();
        boolean boolean20 = python2Target9.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python2Target9.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target();
        int int26 = python2Target25.getInlineTestSetWordSize();
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        python2Target25.badWords = strSet31;
        org.stringtemplate.v4.STGroup sTGroup34 = null;
        python2Target25.templates = sTGroup34;
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        python2Target25.gen = codeGenerator36;
        java.util.Set<java.lang.String> strSet38 = python2Target25.getBadWords();
        python2Target9.badWords = strSet38;
        java.lang.String str41 = python2Target9.getTargetStringLiteralFromString("\"\\12\"");
        org.antlr.v4.tool.Grammar grammar42 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target43 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str45 = python2Target43.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = null;
        python2Target43.gen = codeGenerator46;
        java.lang.String str49 = python2Target43.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar50 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target51 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str53 = python2Target51.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = null;
        python2Target51.gen = codeGenerator54;
        java.lang.String str57 = python2Target51.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar58 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target59 = new org.antlr.v4.codegen.target.Python2Target();
        int int60 = python2Target59.getInlineTestSetWordSize();
        java.lang.String[] strArray64 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        python2Target59.badWords = strSet65;
        org.stringtemplate.v4.STGroup sTGroup68 = null;
        python2Target59.templates = sTGroup68;
        org.antlr.v4.codegen.CodeGenerator codeGenerator70 = null;
        python2Target59.gen = codeGenerator70;
        java.util.Set<java.lang.String> strSet72 = python2Target59.getBadWords();
        java.lang.String str73 = python2Target59.getVersion();
        org.antlr.v4.tool.Grammar grammar74 = null;
        int[] intArray75 = new int[] {};
        java.lang.String[] strArray76 = python2Target59.getTokenTypesAsTargetLabels(grammar74, intArray75);
        java.lang.String[] strArray77 = python2Target51.getTokenTypesAsTargetLabels(grammar58, intArray75);
        java.lang.String[] strArray78 = python2Target43.getTokenTypesAsTargetLabels(grammar50, intArray75);
        java.lang.String[] strArray79 = python2Target9.getTokenTypesAsTargetLabels(grammar42, intArray75);
        java.lang.String[] strArray80 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray75);
        python2Target1.addBadWords();
        java.lang.String str82 = python2Target1.getLanguage();
        java.lang.String str83 = python2Target1.language;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"0\"Context" + "'", str7, "\"0\"Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"" + "'", str11, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "i" + "'", str17, "i");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"\"\\12\"\"" + "'", str41, "\"\"\\12\"\"");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\\0" + "'", str45, "\\0");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\\12" + "'", str49, "\\12");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\\0" + "'", str53, "\\0");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\\12" + "'", str57, "\\12");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 64 + "'", int60 == 64);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "4.5.2.1" + "'", str73, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[]");
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Python2" + "'", str82, "Python2");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Python2" + "'", str83, "Python2");
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
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
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target0.templates;
        java.util.Set<java.lang.String> strSet19 = python2Target0.badWords;
        java.lang.String[] strArray20 = python2Target0.targetCharValueEscape;
        boolean boolean21 = python2Target0.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"i" + "'", str8, "\\\"i");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sTGroup18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
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
        org.stringtemplate.v4.STGroup sTGroup53 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.target.Python2Target python2Target54 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str56 = python2Target54.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator57 = null;
        python2Target54.gen = codeGenerator57;
        python2Target54.addBadWords();
        java.lang.String[] strArray60 = python2Target54.targetCharValueEscape;
        python2Target1.targetCharValueEscape = strArray60;
        python2Target1.addBadWords();
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
        org.junit.Assert.assertNotNull(sTGroup53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\\0" + "'", str56, "\\0");
        org.junit.Assert.assertNotNull(strArray60);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
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
        java.lang.String str24 = python2Target1.getTargetStringLiteralFromString("\"\"\"\"i\"\"\"\"", false);
        boolean boolean25 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"\"\"i\"\"\"\"" + "'", str24, "\"\"\"\"i\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
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
        python2Target0.language = "_\\1";
        java.lang.String str36 = python2Target0.getVersion();
        int int37 = python2Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = python2Target0.getTokenTypeAsTargetLabel(grammar38, (int) (byte) 10);
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "4.5.2.1" + "'", str36, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        int int4 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"\"hi!\"\"\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        python2Target1.language = "\"\\12\"Context";
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str7, "\\\"\\\"\\\"hi!\\\"\\\"\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape(1);
        java.lang.String[] strArray5 = python2Target0.targetCharValueEscape;
        int int6 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String[] strArray7 = python2Target0.targetCharValueEscape;
        boolean boolean8 = python2Target0.templatesExist();
        boolean boolean9 = python2Target0.templatesExist();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\1" + "'", str4, "\\1");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
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
        int int29 = python2Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.target.Python2Target python2Target30 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        int int32 = python2Target31.getInlineTestSetWordSize();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        python2Target31.badWords = strSet37;
        python2Target30.badWords = strSet37;
        java.util.Set<java.lang.String> strSet41 = python2Target30.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target();
        int int43 = python2Target42.getInlineTestSetWordSize();
        python2Target42.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target46 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator45);
        org.stringtemplate.v4.STGroup sTGroup47 = python2Target46.loadTemplates();
        python2Target42.templates = sTGroup47;
        python2Target30.templates = sTGroup47;
        java.lang.String str51 = python2Target30.getImplicitRuleLabel("_\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
        org.stringtemplate.v4.STGroup sTGroup52 = python2Target30.getTemplates();
        python2Target0.templates = sTGroup52;
        java.lang.String str55 = python2Target0.getAltLabelContextStructName("Python2");
        org.antlr.v4.tool.Grammar grammar56 = null;
        org.stringtemplate.v4.ST sT57 = null;
        python2Target0.genRecognizerHeaderFile(grammar56, sT57, "_tset\\\"\\\\\\\\\\\\\\\"i\\\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = python2Target0.getElementListName("\"\" \"\"");
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 64 + "'", int32 == 64);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 64 + "'", int43 == 64);
        org.junit.Assert.assertNotNull(sTGroup47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "__\"\\\"\\\\\\\"i\\\\\\\"\\\"\"" + "'", str51, "__\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Python2Context" + "'", str55, "Python2Context");
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
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
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target0.templates;
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target0.templates;
        java.lang.String[] strArray17 = python2Target0.targetCharValueEscape;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\12Context\"" + "'", str11, "\"\\12Context\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        python2Target0.addBadWords();
        java.lang.String[] strArray6 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\" \"", true);
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("\"\\\"i\"");
        java.lang.String str13 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python2Target0.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\" \"" + "'", str10, "\" \"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"\\\"i\"\"" + "'", str12, "\"\"\\\"i\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
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
        boolean boolean44 = python2Target0.wantsBaseListener();
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("_\"i\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        python2Target0.gen = codeGenerator13;
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target0.gen;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str18 = python2Target16.getTargetStringLiteralFromString("hi!");
        python2Target16.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python2Target16.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "hi!", false);
        int int25 = python2Target16.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str28 = python2Target26.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target29 = new org.antlr.v4.codegen.target.Python2Target();
        int int30 = python2Target29.getInlineTestSetWordSize();
        java.lang.String[] strArray34 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        python2Target29.badWords = strSet35;
        python2Target26.badWords = strSet35;
        python2Target16.badWords = strSet35;
        python2Target16.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup41 = null;
        python2Target16.templates = sTGroup41;
        java.lang.String str45 = python2Target16.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str47 = python2Target16.getTargetStringLiteralFromString("\"i\"");
        java.lang.String str49 = python2Target16.getTargetStringLiteralFromString("\"\"i\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = python2Target16.gen;
        java.util.Set<java.lang.String> strSet51 = python2Target16.getBadWords();
        python2Target0.badWords = strSet51;
        org.antlr.v4.tool.ast.GrammarAST grammarAST53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = python2Target0.getLoopLabel(grammarAST53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"i\"" + "'", str12, "_\"i\"");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"hi!\"" + "'", str18, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "i" + "'", str24, "i");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\\0" + "'", str28, "\\0");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"\\12\"" + "'", str45, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"\"i\"\"" + "'", str47, "\"\"i\"\"");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"\"\"i\"\"\"" + "'", str49, "\"\"\"i\"\"\"");
        org.junit.Assert.assertNull(codeGenerator50);
        org.junit.Assert.assertNotNull(strSet51);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
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
        java.lang.String str34 = python2Target0.language;
        java.lang.String str36 = python2Target0.getTargetStringLiteralFromString("\"\"Python2\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        python2Target0.gen = codeGenerator37;
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"\"\"Python2\"\"\"" + "'", str36, "\"\"\"Python2\"\"\"");
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
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
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target();
        int int27 = python2Target26.getInlineTestSetWordSize();
        java.lang.String[] strArray31 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        python2Target26.badWords = strSet32;
        python2Target25.badWords = strSet32;
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        java.lang.String str39 = python2Target25.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator36, "\\12", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = python2Target25.gen;
        org.antlr.v4.codegen.target.Python2Target python2Target41 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str43 = python2Target41.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target44 = new org.antlr.v4.codegen.target.Python2Target();
        int int45 = python2Target44.getInlineTestSetWordSize();
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        python2Target44.badWords = strSet50;
        python2Target41.badWords = strSet50;
        java.lang.String[] strArray54 = python2Target41.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator55 = null;
        java.lang.String str58 = python2Target41.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator55, "\\0", true);
        java.lang.String str61 = python2Target41.getTargetStringLiteralFromString("\"\"hi!\"\"", true);
        boolean boolean62 = python2Target41.templatesExist();
        org.antlr.v4.codegen.target.Python2Target python2Target63 = new org.antlr.v4.codegen.target.Python2Target();
        int int64 = python2Target63.getInlineTestSetWordSize();
        java.lang.String str67 = python2Target63.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str68 = python2Target63.getVersion();
        java.lang.String str69 = python2Target63.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target70 = new org.antlr.v4.codegen.target.Python2Target();
        int int71 = python2Target70.getInlineTestSetWordSize();
        java.lang.String str74 = python2Target70.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str75 = python2Target70.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target76 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str78 = python2Target76.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator79 = null;
        java.lang.String str82 = python2Target76.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator79, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator83 = null;
        java.lang.String str86 = python2Target76.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator83, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator87 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target88 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator87);
        org.stringtemplate.v4.STGroup sTGroup89 = python2Target88.loadTemplates();
        python2Target76.templates = sTGroup89;
        python2Target70.templates = sTGroup89;
        python2Target63.templates = sTGroup89;
        python2Target41.templates = sTGroup89;
        python2Target25.templates = sTGroup89;
        python2Target0.templates = sTGroup89;
        java.lang.String str97 = python2Target0.getListLabel("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"hi!\"" + "'", str8, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_\"\\\\\\\"i\"" + "'", str24, "_\"\\\\\\\"i\"");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1" + "'", str39, "1");
        org.junit.Assert.assertNull(codeGenerator40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\\0" + "'", str43, "\\0");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 64 + "'", int45 == 64);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\"\"" + "'", str58, "\"\"");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str61, "\"\"\"hi!\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 64 + "'", int64 == 64);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\"\"hi!\"\"" + "'", str67, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "4.5.2.1" + "'", str68, "4.5.2.1");
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 64 + "'", int71 == 64);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\"\"hi!\"\"" + "'", str74, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "4.5.2.1" + "'", str75, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\"hi!\"" + "'", str78, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\"\"" + "'", str82, "\"\"");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "\"\"" + "'", str86, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup89);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
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
        java.lang.String str29 = python2Target0.getTargetStringLiteralFromString("1", false);
        int int30 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        python2Target0.gen = codeGenerator31;
        int int33 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str36 = python2Target0.getTargetStringLiteralFromString("\"_\\\"i\\\"\\\"Contex\"", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"i\"\"" + "'", str26, "\"\"i\"\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1" + "'", str29, "1");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 64 + "'", int33 == 64);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"_\\\"i\\\"\\\"Contex\"" + "'", str36, "\"_\\\"i\\\"\\\"Contex\"");
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        java.lang.String[] strArray3 = python2Target1.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"\\\\\"", true);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\\\"" + "'", str7, "\"\\\\\"");
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
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
        org.antlr.v4.tool.Rule rule17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target0.getRuleFunctionContextStructName(rule17);
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
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
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
        int int21 = python2Target0.getInlineTestSetWordSize();
        int int22 = python2Target0.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet23 = python2Target0.getBadWords();
        python2Target0.addBadWords();
        java.lang.String[] strArray25 = python2Target0.targetCharValueEscape;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
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
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str24 = python2Target22.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target();
        int int26 = python2Target25.getInlineTestSetWordSize();
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        python2Target25.badWords = strSet31;
        python2Target22.badWords = strSet31;
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str37 = python2Target35.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        python2Target35.gen = codeGenerator38;
        java.lang.String[] strArray45 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray45;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray45;
        python2Target35.targetCharValueEscape = strArray45;
        python2Target22.targetCharValueEscape = strArray45;
        java.lang.String[] strArray50 = python2Target22.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet51 = null;
        python2Target22.badWords = strSet51;
        org.antlr.v4.codegen.CodeGenerator codeGenerator53 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target54 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator53);
        java.lang.String str56 = python2Target54.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str57 = python2Target54.getVersion();
        java.lang.String str60 = python2Target54.getTargetStringLiteralFromString("", true);
        java.lang.String str61 = python2Target54.getLanguage();
        java.lang.String str63 = python2Target54.getAltLabelContextStructName("\" \"");
        java.lang.String str65 = python2Target54.getAltLabelContextStructName("\\64");
        java.util.Set<java.lang.String> strSet66 = python2Target54.getBadWords();
        java.lang.String str67 = python2Target54.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target68 = new org.antlr.v4.codegen.target.Python2Target();
        java.util.Set<java.lang.String> strSet69 = python2Target68.getBadWords();
        python2Target54.badWords = strSet69;
        python2Target22.badWords = strSet69;
        python2Target1.badWords = strSet69;
        org.antlr.v4.tool.Grammar grammar73 = null;
        org.stringtemplate.v4.ST sT74 = null;
        python2Target1.genRecognizerHeaderFile(grammar73, sT74, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str78 = python2Target1.getImplicitTokenLabel("_\"\"\\\"\\\"\\\\12Context\\\"\\\"\"\"");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\0" + "'", str24, "\\0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\\0" + "'", str37, "\\0");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\"\"hi!\"\"Context" + "'", str56, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "4.5.2.1" + "'", str57, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\"\"" + "'", str60, "\"\"");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Python2" + "'", str61, "Python2");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\" \"Context" + "'", str63, "\" \"Context");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\\64Context" + "'", str65, "\\64Context");
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Python2" + "'", str67, "Python2");
        org.junit.Assert.assertNotNull(strSet69);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\" \"");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target1.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        java.lang.String str17 = python2Target1.getListLabel("\"\"\\\"0\\\"Context\"Context\"");
        boolean boolean18 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python2Target1.getTokenTypeAsTargetLabel(grammar19, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\" \"Context" + "'", str10, "\" \"Context");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"\\\"0\\\"Context\"Context\"" + "'", str17, "\"\"\\\"0\\\"Context\"Context\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.templatesExist();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("\"\"\"hi!\"\"\"");
        java.util.Set<java.lang.String> strSet11 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        python2Target1.gen = codeGenerator12;
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target1.templates;
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.stringtemplate.v4.ST sT16 = null;
        python2Target1.genRecognizerHeaderFile(grammar15, sT16, "\"\\\"\\\"\\\"0\\\"Context\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\"\"\"hi!\"\"\"" + "'", str10, "_\"\"\"hi!\"\"\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(sTGroup14);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
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
        boolean boolean17 = python2Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.gen;
        java.lang.String str19 = python2Target0.language;
        boolean boolean20 = python2Target0.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset\"\"" + "'", str16, "_tset\"\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.gen;
        java.util.Set<java.lang.String> strSet5 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        boolean boolean7 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
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
        java.lang.String str23 = python2Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator24);
        org.stringtemplate.v4.STGroup sTGroup26 = python2Target25.templates;
        java.util.Set<java.lang.String> strSet27 = python2Target25.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str30 = python2Target28.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        int int32 = python2Target31.getInlineTestSetWordSize();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        python2Target31.badWords = strSet37;
        python2Target28.badWords = strSet37;
        java.lang.String[] strArray41 = python2Target28.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray41;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray41;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray41;
        python2Target25.targetCharValueEscape = strArray41;
        python2Target0.targetCharValueEscape = strArray41;
        python2Target0.language = "#";
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = null;
        java.lang.String str52 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator49, "\"\\\"\"", true);
        python2Target0.addBadWords();
        java.lang.String str55 = python2Target0.getAltLabelContextStructName("tset");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"hi!\"" + "'", str8, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(sTGroup26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\\0" + "'", str30, "\\0");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 64 + "'", int32 == 64);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\"\\\"\"" + "'", str52, "\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "TsetContext" + "'", str55, "TsetContext");
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\"i\"\"", false);
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
        org.stringtemplate.v4.STGroup sTGroup36 = python2Target14.getTemplates();
        org.antlr.v4.codegen.target.Python2Target python2Target37 = new org.antlr.v4.codegen.target.Python2Target();
        int int38 = python2Target37.getInlineTestSetWordSize();
        java.lang.String[] strArray42 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        python2Target37.badWords = strSet43;
        org.stringtemplate.v4.STGroup sTGroup46 = null;
        python2Target37.templates = sTGroup46;
        python2Target37.language = "\\1";
        java.lang.String str50 = python2Target37.language;
        boolean boolean51 = python2Target37.supportsOverloadedMethods();
        java.lang.String[] strArray52 = python2Target37.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet53 = python2Target37.getBadWords();
        python2Target14.badWords = strSet53;
        python2Target0.badWords = strSet53;
        org.antlr.v4.tool.Grammar grammar56 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str58 = python2Target0.getTokenTypeAsTargetLabel(grammar56, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\"i\\\"" + "'", str12, "\\\"i\\\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"hi!\"\"Context" + "'", str16, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\\\"i" + "'", str26, "\\\"i");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(sTGroup36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 64 + "'", int38 == 64);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\\1" + "'", str50, "\\1");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strSet53);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        int int4 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"\"hi!\"\"\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        int int11 = python2Target10.getInlineTestSetWordSize();
        java.lang.String str14 = python2Target10.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str15 = python2Target10.getVersion();
        java.lang.String str16 = python2Target10.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python2Target10.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "\\\"\\\"\\\"hi!\\\"\\\"\\\"", false);
        boolean boolean21 = python2Target10.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet22 = python2Target10.getBadWords();
        python2Target1.badWords = strSet22;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator24);
        java.lang.String str27 = python2Target25.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str28 = python2Target25.getVersion();
        java.lang.String str30 = python2Target25.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup31 = python2Target25.templates;
        int int32 = python2Target25.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator33);
        java.lang.String str36 = python2Target34.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str38 = python2Target34.getImplicitRuleLabel("\"i\"");
        java.lang.String str39 = python2Target34.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        python2Target34.gen = codeGenerator40;
        org.stringtemplate.v4.STGroup sTGroup42 = python2Target34.templates;
        python2Target25.templates = sTGroup42;
        java.lang.String str46 = python2Target25.getTargetStringLiteralFromString("\"i\"", true);
        org.antlr.v4.tool.Grammar grammar47 = null;
        org.stringtemplate.v4.ST sT48 = null;
        python2Target25.genRecognizerHeaderFile(grammar47, sT48, "1");
        org.stringtemplate.v4.STGroup sTGroup51 = python2Target25.getTemplates();
        java.lang.String str53 = python2Target25.getTargetStringLiteralFromString("_\"\\12\"Context");
        org.antlr.v4.codegen.target.Python2Target python2Target54 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str56 = python2Target54.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target57 = new org.antlr.v4.codegen.target.Python2Target();
        int int58 = python2Target57.getInlineTestSetWordSize();
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet63 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet63, strArray62);
        python2Target57.badWords = strSet63;
        python2Target54.badWords = strSet63;
        java.lang.String[] strArray67 = python2Target54.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator68 = python2Target54.getCodeGenerator();
        java.util.Set<java.lang.String> strSet69 = python2Target54.badWords;
        python2Target25.badWords = strSet69;
        python2Target1.badWords = strSet69;
        java.util.Set<java.lang.String> strSet72 = python2Target1.getBadWords();
        java.lang.String str74 = python2Target1.getImplicitSetLabel("\"\\\"\\\"\\\" \\\"Context\\\"\\\"\"");
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str7, "\\\"\\\"\\\"hi!\\\"\\\"\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"hi!\"\"" + "'", str14, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str20, "\\\"\\\"\\\"hi!\\\"\\\"\\\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\"hi!\"\"Context" + "'", str27, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "4.5.2.1" + "'", str28, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"\\\\\\\"i\"" + "'", str30, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(sTGroup31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"\"hi!\"\"Context" + "'", str36, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "_\"i\"" + "'", str38, "_\"i\"");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Python2" + "'", str39, "Python2");
        org.junit.Assert.assertNotNull(sTGroup42);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\"\\\"i\\\"\"" + "'", str46, "\"\\\"i\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\"_\\\"\\\\12\\\"Context\"" + "'", str53, "\"_\\\"\\\\12\\\"Context\"");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\\0" + "'", str56, "\\0");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 64 + "'", int58 == 64);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNull(codeGenerator68);
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "_tset\"\\\"\\\"\\\" \\\"Context\\\"\\\"\"" + "'", str74, "_tset\"\\\"\\\"\\\" \\\"Context\\\"\\\"\"");
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        java.util.Set<java.lang.String> strSet3 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.gen;
        java.lang.String str5 = python2Target1.getVersion();
        java.util.Set<java.lang.String> strSet6 = python2Target1.badWords;
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.getCodeGenerator();
        boolean boolean19 = python2Target0.templatesExist();
        boolean boolean20 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target();
        int int22 = python2Target21.getInlineTestSetWordSize();
        java.lang.String str25 = python2Target21.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str26 = python2Target21.getVersion();
        boolean boolean27 = python2Target21.wantsBaseVisitor();
        boolean boolean28 = python2Target21.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet29 = python2Target21.getBadWords();
        python2Target0.badWords = strSet29;
        boolean boolean31 = python2Target0.templatesExist();
        java.util.Set<java.lang.String> strSet32 = python2Target0.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup33 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\" \"" + "'", str16, "\" \"");
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\"hi!\"\"" + "'", str25, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4.5.2.1" + "'", str26, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strSet32);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
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
        int int21 = python2Target0.getInlineTestSetWordSize();
        boolean boolean22 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.stringtemplate.v4.ST sT24 = null;
        python2Target0.genRecognizerHeaderFile(grammar23, sT24, "_\"\"\"\\12\"\"Context\"");
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target();
        int int29 = python2Target28.getInlineTestSetWordSize();
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        python2Target28.badWords = strSet34;
        python2Target27.badWords = strSet34;
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        java.lang.String str41 = python2Target27.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator38, "\\12", false);
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target();
        int int43 = python2Target42.getInlineTestSetWordSize();
        int int44 = python2Target42.getInlineTestSetWordSize();
        java.lang.String str47 = python2Target42.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str50 = python2Target42.getTargetStringLiteralFromString("_\"i\"", true);
        java.lang.String str51 = python2Target42.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        java.lang.String str55 = python2Target42.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator52, "\"\\\"i\"", true);
        java.lang.String[] strArray56 = python2Target42.targetCharValueEscape;
        python2Target27.targetCharValueEscape = strArray56;
        python2Target0.targetCharValueEscape = strArray56;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1" + "'", str41, "1");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 64 + "'", int43 == 64);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 64 + "'", int44 == 64);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\"_\"i\"\"" + "'", str50, "\"_\"i\"\"");
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\"\\\"i\"" + "'", str55, "\"\\\"i\"");
        org.junit.Assert.assertNotNull(strArray56);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
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
        java.lang.String str35 = python2Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = python2Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup37 = python2Target0.templates;
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"" + "'", str35, "\"\"");
        org.junit.Assert.assertNull(codeGenerator36);
        org.junit.Assert.assertNull(sTGroup37);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        java.lang.String str47 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator44, "\"\\12\"Context", true);
        boolean boolean48 = python2Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = null;
        java.lang.String str52 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator49, "\" \"Context", true);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup53 = python2Target0.loadTemplates();
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"12\\\"Contex\"" + "'", str47, "\"12\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\" \\\"Contex\"" + "'", str52, "\" \\\"Contex\"");
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
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
        org.stringtemplate.v4.STGroup sTGroup30 = python2Target0.templates;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        int int32 = python2Target31.getInlineTestSetWordSize();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        python2Target31.badWords = strSet37;
        org.stringtemplate.v4.STGroup sTGroup40 = null;
        python2Target31.templates = sTGroup40;
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        python2Target31.gen = codeGenerator42;
        java.util.Set<java.lang.String> strSet44 = python2Target31.getBadWords();
        python2Target0.badWords = strSet44;
        java.util.Set<java.lang.String> strSet46 = python2Target0.getBadWords();
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
        org.junit.Assert.assertNull(sTGroup30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 64 + "'", int32 == 64);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(strSet46);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python2Target1.badWords = strSet7;
        python2Target0.badWords = strSet7;
        java.util.Set<java.lang.String> strSet11 = python2Target0.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target();
        int int13 = python2Target12.getInlineTestSetWordSize();
        python2Target12.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target16.loadTemplates();
        python2Target12.templates = sTGroup17;
        python2Target0.templates = sTGroup17;
        java.lang.String str21 = python2Target0.getImplicitRuleLabel("_\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
        org.stringtemplate.v4.STGroup sTGroup22 = python2Target0.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String str26 = python2Target24.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str28 = python2Target24.getImplicitRuleLabel("\"i\"");
        java.lang.String str29 = python2Target24.language;
        boolean boolean30 = python2Target24.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python2Target24.getCodeGenerator();
        java.util.Set<java.lang.String> strSet32 = python2Target24.badWords;
        python2Target0.badWords = strSet32;
        python2Target0.language = "\\\"hi!\\\"\\\"Contex";
        boolean boolean36 = python2Target0.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = python2Target0.getElementName("\"64Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "__\"\\\"\\\\\\\"i\\\\\\\"\\\"\"" + "'", str21, "__\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"hi!\"\"Context" + "'", str26, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "_\"i\"" + "'", str28, "_\"i\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Python2" + "'", str29, "Python2");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(codeGenerator31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        java.lang.String str6 = python2Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "\"\\\"\\\\64Context\\\"\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String str18 = python2Target16.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str19 = python2Target16.getVersion();
        java.lang.String str21 = python2Target16.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup22 = python2Target16.templates;
        int int23 = python2Target16.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator24);
        java.lang.String str27 = python2Target25.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str29 = python2Target25.getImplicitRuleLabel("\"i\"");
        java.lang.String str30 = python2Target25.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        python2Target25.gen = codeGenerator31;
        org.stringtemplate.v4.STGroup sTGroup33 = python2Target25.templates;
        python2Target16.templates = sTGroup33;
        python2Target0.templates = sTGroup33;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\1" + "'", str4, "\\1");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\\64Context\\\"\"" + "'", str14, "\"\\\"\\\\64Context\\\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"hi!\"\"Context" + "'", str18, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4.5.2.1" + "'", str19, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\\\\\\\"i\"" + "'", str21, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(sTGroup22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\"hi!\"\"Context" + "'", str27, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "_\"i\"" + "'", str29, "_\"i\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Python2" + "'", str30, "Python2");
        org.junit.Assert.assertNotNull(sTGroup33);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\\"\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\"\\\"\"");
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
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
        boolean boolean16 = python2Target0.templatesExist();
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target();
        int int18 = python2Target17.getInlineTestSetWordSize();
        int int19 = python2Target17.getInlineTestSetWordSize();
        java.lang.String str22 = python2Target17.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str25 = python2Target17.getTargetStringLiteralFromString("_\"i\"", true);
        java.lang.String str26 = python2Target17.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str29 = python2Target27.getTargetStringLiteralFromString("hi!");
        python2Target27.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        java.lang.String str35 = python2Target27.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator32, "hi!", false);
        int int36 = python2Target27.getInlineTestSetWordSize();
        boolean boolean37 = python2Target27.templatesExist();
        boolean boolean38 = python2Target27.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = null;
        java.lang.String str42 = python2Target27.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator39, "\"hi!\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target43 = new org.antlr.v4.codegen.target.Python2Target();
        int int44 = python2Target43.getInlineTestSetWordSize();
        java.lang.String[] strArray48 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        python2Target43.badWords = strSet49;
        org.stringtemplate.v4.STGroup sTGroup52 = null;
        python2Target43.templates = sTGroup52;
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = null;
        python2Target43.gen = codeGenerator54;
        java.util.Set<java.lang.String> strSet56 = python2Target43.getBadWords();
        python2Target27.badWords = strSet56;
        java.lang.String str59 = python2Target27.getTargetStringLiteralFromString("\"\\12\"");
        org.antlr.v4.tool.Grammar grammar60 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target61 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str63 = python2Target61.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator64 = null;
        python2Target61.gen = codeGenerator64;
        java.lang.String str67 = python2Target61.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar68 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target69 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str71 = python2Target69.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator72 = null;
        python2Target69.gen = codeGenerator72;
        java.lang.String str75 = python2Target69.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar76 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target77 = new org.antlr.v4.codegen.target.Python2Target();
        int int78 = python2Target77.getInlineTestSetWordSize();
        java.lang.String[] strArray82 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet83 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet83, strArray82);
        python2Target77.badWords = strSet83;
        org.stringtemplate.v4.STGroup sTGroup86 = null;
        python2Target77.templates = sTGroup86;
        org.antlr.v4.codegen.CodeGenerator codeGenerator88 = null;
        python2Target77.gen = codeGenerator88;
        java.util.Set<java.lang.String> strSet90 = python2Target77.getBadWords();
        java.lang.String str91 = python2Target77.getVersion();
        org.antlr.v4.tool.Grammar grammar92 = null;
        int[] intArray93 = new int[] {};
        java.lang.String[] strArray94 = python2Target77.getTokenTypesAsTargetLabels(grammar92, intArray93);
        java.lang.String[] strArray95 = python2Target69.getTokenTypesAsTargetLabels(grammar76, intArray93);
        java.lang.String[] strArray96 = python2Target61.getTokenTypesAsTargetLabels(grammar68, intArray93);
        java.lang.String[] strArray97 = python2Target27.getTokenTypesAsTargetLabels(grammar60, intArray93);
        python2Target17.targetCharValueEscape = strArray97;
        python2Target0.targetCharValueEscape = strArray97;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"_\"i\"\"" + "'", str25, "\"_\"i\"\"");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"hi!\"" + "'", str29, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "i" + "'", str35, "i");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 64 + "'", int36 == 64);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 64 + "'", int44 == 64);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\"\"\\12\"\"" + "'", str59, "\"\"\\12\"\"");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\\0" + "'", str63, "\\0");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\\12" + "'", str67, "\\12");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "\\0" + "'", str71, "\\0");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "\\12" + "'", str75, "\\12");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 64 + "'", int78 == 64);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(strSet90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "4.5.2.1" + "'", str91, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[]");
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertNotNull(strArray96);
        org.junit.Assert.assertNotNull(strArray97);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) "4.5.2.1", "\\0", locale3);
        org.antlr.v4.codegen.target.Python2Target python2Target5 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str7 = python2Target5.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target();
        int int9 = python2Target8.getInlineTestSetWordSize();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        python2Target8.badWords = strSet14;
        python2Target5.badWords = strSet14;
        java.lang.String[] strArray18 = python2Target5.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python2Target5.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "\\0", true);
        java.lang.String str25 = python2Target5.getTargetStringLiteralFromString("\"\"hi!\"\"", true);
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str28 = python2Target26.getTargetStringLiteralFromString("hi!");
        python2Target26.language = "hi!";
        java.lang.String str32 = python2Target26.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet33 = python2Target26.badWords;
        python2Target5.badWords = strSet33;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        java.lang.String str38 = python2Target5.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator35, "\\\"i", true);
        java.util.Locale locale40 = null;
        java.lang.String str41 = pythonStringRenderer0.toString((java.lang.Object) "\\\"i", "\\64Context", locale40);
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str44 = python2Target42.getTargetStringLiteralFromString("hi!");
        python2Target42.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator47 = null;
        java.lang.String str50 = python2Target42.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator47, "hi!", false);
        int int51 = python2Target42.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target52 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str54 = python2Target52.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target55 = new org.antlr.v4.codegen.target.Python2Target();
        int int56 = python2Target55.getInlineTestSetWordSize();
        java.lang.String[] strArray60 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        python2Target55.badWords = strSet61;
        python2Target52.badWords = strSet61;
        python2Target42.badWords = strSet61;
        python2Target42.addBadWords();
        java.lang.String str68 = python2Target42.getTargetStringLiteralFromString("\"i\"");
        boolean boolean69 = python2Target42.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup70 = python2Target42.templates;
        java.lang.String[] strArray71 = python2Target42.targetCharValueEscape;
        java.util.Locale locale73 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str74 = pythonStringRenderer0.toString((java.lang.Object) python2Target42, "\"\\\"12\\\"\\\"Contex\"", locale73);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\0" + "'", str4, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\0" + "'", str7, "\\0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\"" + "'", str22, "\"\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str25, "\"\"\"hi!\"\"\"");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"hi!\"" + "'", str28, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\\12" + "'", str32, "\\12");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\\\"\"" + "'", str38, "\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\\64Context" + "'", str41, "\\64Context");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\"hi!\"" + "'", str44, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "i" + "'", str50, "i");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 64 + "'", int51 == 64);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\\0" + "'", str54, "\\0");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 64 + "'", int56 == 64);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\"\"i\"\"" + "'", str68, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(sTGroup70);
        org.junit.Assert.assertNotNull(strArray71);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.lang.String str10 = python2Target1.getLanguage();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\"12\\\"\"");
        boolean boolean13 = python2Target1.wantsBaseVisitor();
        java.lang.String str14 = python2Target1.language;
        boolean boolean15 = python2Target1.wantsBaseListener();
        boolean boolean16 = python2Target1.supportsOverloadedMethods();
        int int17 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        python2Target1.gen = codeGenerator19;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\\\\\"12\\\\\\\"\\\"\"" + "'", str12, "\"\\\"\\\\\\\"12\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator18);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"__tset\\\"\\\\\\\\\\\\\\\"i\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"__tset\\\"\\\\\\\\\\\\\\\"i\\\"\"" + "'", str1, "\"__tset\\\"\\\\\\\\\\\\\\\"i\\\"\"");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
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
        python2Target0.language = "\"_\"i\"\"";
        boolean boolean18 = python2Target0.templatesExist();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target0.getRuleFunctionContextStructName(ruleFunction19);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.getCodeGenerator();
        java.lang.String str21 = python2Target0.getTargetStringLiteralFromString("\"\\\" \\\"\"", false);
        int int22 = python2Target0.getSerializedATNSegmentLimit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\" \"" + "'", str16, "\" \"");
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\\\" \\\"\"" + "'", str21, "\"\\\" \\\"\"");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
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
        java.lang.String str34 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target36 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator35);
        org.stringtemplate.v4.STGroup sTGroup37 = python2Target36.templates;
        java.util.Set<java.lang.String> strSet38 = python2Target36.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str41 = python2Target39.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target();
        int int43 = python2Target42.getInlineTestSetWordSize();
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        python2Target42.badWords = strSet48;
        python2Target39.badWords = strSet48;
        java.lang.String[] strArray52 = python2Target39.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray52;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray52;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray52;
        python2Target36.targetCharValueEscape = strArray52;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray52;
        python2Target0.targetCharValueEscape = strArray52;
        org.antlr.v4.tool.Grammar grammar59 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = python2Target0.getTokenTypeAsTargetLabel(grammar59, (int) (byte) 10);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "4.5.2.1" + "'", str34, "4.5.2.1");
        org.junit.Assert.assertNull(sTGroup37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\\0" + "'", str41, "\\0");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 64 + "'", int43 == 64);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strArray52);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
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
        python2Target0.genRecognizerHeaderFile(grammar11, sT12, "");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target0.getCodeGenerator();
        int int16 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        java.lang.String[] strArray3 = python2Target1.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target python2Target4 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str6 = python2Target4.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target4.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target4.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target16.loadTemplates();
        python2Target4.templates = sTGroup17;
        java.lang.String str19 = python2Target4.language;
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target4.templates;
        python2Target1.templates = sTGroup20;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python2Target1.gen;
        boolean boolean23 = python2Target1.templatesExist();
        java.lang.String str25 = python2Target1.getTargetStringLiteralFromString("\"_\\\"\\\\\\\"0\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"" + "'", str6, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\\\"_\\\\\\\"\\\\\\\\\\\\\\\"0\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"" + "'", str25, "\"\\\"_\\\\\\\"\\\\\\\\\\\\\\\"0\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"");
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        java.lang.String str27 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator24, "\"_\\\\0\"", false);
        int int28 = python2Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator29, "_\\\\0", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = python2Target0.getImplicitRuleLabel("\\\"\\\\\\\"i\\\\\\\"\\\"");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "_\\\\0" + "'", str27, "_\\\\0");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\\\"" + "'", str32, "\"\\\\\"");
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        boolean boolean9 = python2Target0.wantsBaseVisitor();
        boolean boolean10 = python2Target0.supportsOverloadedMethods();
        boolean boolean11 = python2Target0.supportsOverloadedMethods();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
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
        org.stringtemplate.v4.STGroup sTGroup24 = python2Target1.loadTemplates();
        java.lang.String str25 = python2Target1.getVersion();
        java.lang.String str27 = python2Target1.encodeIntAsCharEscape((int) 'a');
        int int28 = python2Target1.getSerializedATNSegmentLimit();
        python2Target1.addBadWords();
        java.lang.String str30 = python2Target1.language;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\\"i" + "'", str13, "\\\"i");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4.5.2.1" + "'", str23, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "a" + "'", str27, "a");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Python2" + "'", str30, "Python2");
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.getCodeGenerator();
        boolean boolean19 = python2Target0.templatesExist();
        boolean boolean20 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target();
        int int22 = python2Target21.getInlineTestSetWordSize();
        java.lang.String str25 = python2Target21.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str26 = python2Target21.getVersion();
        boolean boolean27 = python2Target21.wantsBaseVisitor();
        boolean boolean28 = python2Target21.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet29 = python2Target21.getBadWords();
        python2Target0.badWords = strSet29;
        boolean boolean31 = python2Target0.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python2Target0.getImplicitSetLabel("\"\\\"\\\"\\\"\\\\\\\"#\\\\\\\"\\\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\" \"" + "'", str16, "\" \"");
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\"hi!\"\"" + "'", str25, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4.5.2.1" + "'", str26, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target23 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator22);
        java.lang.String str25 = python2Target23.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str26 = python2Target23.getVersion();
        java.lang.String str29 = python2Target23.getTargetStringLiteralFromString("", true);
        python2Target23.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup31 = python2Target23.getTemplates();
        python2Target0.templates = sTGroup31;
        java.lang.String[] strArray33 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        python2Target0.gen = codeGenerator34;
        java.lang.String str36 = python2Target0.language;
        java.lang.String[] strArray37 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target();
        int int39 = python2Target38.getInlineTestSetWordSize();
        python2Target38.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator41);
        org.stringtemplate.v4.STGroup sTGroup43 = python2Target42.loadTemplates();
        python2Target38.templates = sTGroup43;
        python2Target0.templates = sTGroup43;
        org.antlr.v4.tool.Rule rule46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = python2Target0.getRuleFunctionContextStructName(rule46);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\"hi!\"\"Context" + "'", str25, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4.5.2.1" + "'", str26, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"" + "'", str29, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertNotNull(sTGroup43);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
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
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target0.templates;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup16 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\12Context\"" + "'", str11, "\"\\12Context\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
        org.junit.Assert.assertNotNull(sTGroup15);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\" \"");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target1.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str18 = python2Target16.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        python2Target16.gen = codeGenerator19;
        java.lang.String str22 = python2Target16.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target();
        int int25 = python2Target24.getInlineTestSetWordSize();
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        python2Target24.badWords = strSet30;
        org.stringtemplate.v4.STGroup sTGroup33 = null;
        python2Target24.templates = sTGroup33;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        python2Target24.gen = codeGenerator35;
        java.util.Set<java.lang.String> strSet37 = python2Target24.getBadWords();
        java.lang.String str38 = python2Target24.getVersion();
        org.antlr.v4.tool.Grammar grammar39 = null;
        int[] intArray40 = new int[] {};
        java.lang.String[] strArray41 = python2Target24.getTokenTypesAsTargetLabels(grammar39, intArray40);
        java.lang.String[] strArray42 = python2Target16.getTokenTypesAsTargetLabels(grammar23, intArray40);
        python2Target1.targetCharValueEscape = strArray42;
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.stringtemplate.v4.ST sT45 = null;
        python2Target1.genRecognizerHeaderFile(grammar44, sT45, "\\\"\\\"\\\\12Context\\\"\\\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = null;
        python2Target1.gen = codeGenerator48;
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = null;
        java.lang.String str53 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator50, "\"\\12Context\"Context", false);
        org.antlr.v4.tool.Grammar grammar54 = null;
        org.stringtemplate.v4.ST sT55 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar54, sT55, "\"\\\"\\\\\\\"\\\\\\\"#\\\\\\\"\\\\\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\" \"Context" + "'", str10, "\" \"Context");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\0" + "'", str18, "\\0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\\12" + "'", str22, "\\12");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "4.5.2.1" + "'", str38, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[]");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "12Context\\\"Contex" + "'", str53, "12Context\\\"Contex");
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
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
        java.lang.String str26 = python2Target0.getLanguage();
        java.lang.String str28 = python2Target0.getTargetStringLiteralFromString("\"\\\\\\\"i\\\\\\\"\"Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST29);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\"\\\\\\\"i\\\\\\\"\"Context\"" + "'", str28, "\"\"\\\\\\\"i\\\\\\\"\"Context\"");
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("\"\"\\12\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        python2Target1.gen = codeGenerator9;
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        python2Target1.gen = codeGenerator12;
        java.lang.String str14 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.templates;
        python2Target1.language = " ";
        boolean boolean18 = python2Target1.wantsBaseListener();
        boolean boolean19 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\\12\"\"Context" + "'", str8, "\"\"\\12\"\"Context");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.gen;
        java.lang.String str5 = python2Target0.getVersion();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target0.templates;
        boolean boolean7 = python2Target0.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("_\"i\"", false);
        int int13 = python2Target0.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet14 = python2Target0.getBadWords();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"i\"" + "'", str12, "_\"i\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
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
        int int21 = python2Target0.getInlineTestSetWordSize();
        int int22 = python2Target0.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet23 = python2Target0.getBadWords();
        boolean boolean24 = python2Target0.templatesExist();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet10 = python2Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target0.gen = codeGenerator11;
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
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray26;
        python2Target0.targetCharValueEscape = strArray26;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray26;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\0" + "'", str15, "\\0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        python2Target0.gen = codeGenerator18;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        python2Target20.gen = codeGenerator21;
        java.util.Set<java.lang.String> strSet23 = python2Target20.getBadWords();
        java.util.Set<java.lang.String> strSet24 = python2Target20.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        java.lang.String str28 = python2Target20.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator25, "\\\"\\\"\\\\12Context\\\"\\\"", true);
        java.lang.String[] strArray29 = python2Target20.targetCharValueEscape;
        python2Target0.targetCharValueEscape = strArray29;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray29;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"i" + "'", str8, "\\\"i");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\\\"\\\"\\\\12Context\\\"\\\"\"" + "'", str28, "\"\\\"\\\"\\\\12Context\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python2Target0.gen;
        python2Target0.language = "\"\\\"iContextContext\"";
        java.lang.String[] strArray23 = python2Target0.targetCharValueEscape;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\" \"" + "'", str16, "\" \"");
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
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
        python2Target0.language = "_tset\\12";
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        python2Target0.gen = codeGenerator24;
        java.lang.String str26 = python2Target0.getLanguage();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str20, "\"\"\"hi!\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_tset\\12" + "'", str26, "_tset\\12");
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.badWords;
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("_\"i\"");
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "__\"i\"" + "'", str7, "__\"i\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target1.gen = codeGenerator6;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target();
        int int10 = python2Target9.getInlineTestSetWordSize();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        python2Target9.badWords = strSet15;
        python2Target8.badWords = strSet15;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python2Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "\\12", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python2Target8.gen;
        java.util.Set<java.lang.String> strSet24 = python2Target8.getBadWords();
        python2Target1.badWords = strSet24;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator26);
        java.lang.String str29 = python2Target27.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean30 = python2Target27.templatesExist();
        boolean boolean31 = python2Target27.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = python2Target27.getCodeGenerator();
        java.util.Set<java.lang.String> strSet33 = python2Target27.badWords;
        java.lang.String str35 = python2Target27.getImplicitSetLabel("\\0");
        java.util.Set<java.lang.String> strSet36 = python2Target27.getBadWords();
        org.antlr.v4.codegen.target.Python2Target python2Target37 = new org.antlr.v4.codegen.target.Python2Target();
        int int38 = python2Target37.getInlineTestSetWordSize();
        int int39 = python2Target37.getInlineTestSetWordSize();
        python2Target37.language = "";
        java.lang.String[] strArray42 = python2Target37.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray42;
        python2Target27.targetCharValueEscape = strArray42;
        python2Target1.targetCharValueEscape = strArray42;
        org.stringtemplate.v4.STGroup sTGroup46 = python2Target1.templates;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"hi!\"\"Context" + "'", str29, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(codeGenerator32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "_tset\\0" + "'", str35, "_tset\\0");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 64 + "'", int38 == 64);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(sTGroup46);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python2Target1.badWords = strSet7;
        python2Target0.badWords = strSet7;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str13 = python2Target11.getTargetStringLiteralFromString("hi!");
        python2Target11.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python2Target11.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "hi!", false);
        int int20 = python2Target11.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str23 = python2Target21.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target();
        int int25 = python2Target24.getInlineTestSetWordSize();
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        python2Target24.badWords = strSet30;
        python2Target21.badWords = strSet30;
        python2Target11.badWords = strSet30;
        python2Target11.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup36 = null;
        python2Target11.templates = sTGroup36;
        java.lang.String str40 = python2Target11.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str43 = python2Target11.getTargetStringLiteralFromString("\"\\\\\\\"i\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target45 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator44);
        java.lang.String str47 = python2Target45.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str48 = python2Target45.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target49 = new org.antlr.v4.codegen.target.Python2Target();
        int int50 = python2Target49.getInlineTestSetWordSize();
        int int51 = python2Target49.getInlineTestSetWordSize();
        boolean boolean52 = python2Target49.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator53 = python2Target49.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = null;
        java.lang.String str57 = python2Target49.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator54, "_\"i\"", false);
        java.lang.String[] strArray63 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray63;
        python2Target49.targetCharValueEscape = strArray63;
        python2Target45.targetCharValueEscape = strArray63;
        python2Target11.targetCharValueEscape = strArray63;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray63;
        python2Target0.targetCharValueEscape = strArray63;
        boolean boolean70 = python2Target0.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str72 = python2Target0.getImplicitTokenLabel("\\\"\\\"\\\"hi!\\\"\\\"Conte");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"hi!\"" + "'", str13, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "i" + "'", str19, "i");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\\0" + "'", str23, "\\0");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"\\12\"" + "'", str40, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"\\\\\\\"i\"" + "'", str43, "\"\\\\\\\"i\"");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"\"hi!\"\"Context" + "'", str47, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Python2" + "'", str48, "Python2");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 64 + "'", int50 == 64);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 64 + "'", int51 == 64);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(codeGenerator53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\\\"i" + "'", str57, "\\\"i");
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target0.templates;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(sTGroup6);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        python2Target1.addBadWords();
        python2Target1.language = "\"\"hi!\"\"";
        java.lang.String[] strArray11 = python2Target1.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray11;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray11;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray11;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        int int10 = python2Target0.getInlineTestSetWordSize();
        int int11 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target0.getCodeGenerator();
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = python2Target13.getCodeGenerator();
        java.util.Set<java.lang.String> strSet28 = python2Target13.badWords;
        python2Target0.badWords = strSet28;
        boolean boolean30 = python2Target0.wantsBaseVisitor();
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"_\\\"i\"");
        java.lang.String str34 = python2Target0.getTargetStringLiteralFromString("\"\"\"\\12\"\"Context\"");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\0" + "'", str15, "\\0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNull(codeGenerator27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"_\\\"i\"\"" + "'", str32, "\"\"_\\\"i\"\"");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\"\"\"\\12\"\"Context\"\"" + "'", str34, "\"\"\"\"\\12\"\"Context\"\"");
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
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
        java.lang.String str26 = python2Target0.getLanguage();
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
        org.junit.Assert.assertNull(codeGenerator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        int int4 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"\"hi!\"\"\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        java.lang.String str10 = python2Target1.getLanguage();
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str7, "\\\"\\\"\\\"hi!\\\"\\\"\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        python2Target0.language = "";
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
        java.lang.String str39 = python2Target13.getTargetStringLiteralFromString("\"i\"");
        boolean boolean40 = python2Target13.wantsBaseListener();
        java.lang.String[] strArray41 = null;
        python2Target13.targetCharValueEscape = strArray41;
        java.util.Set<java.lang.String> strSet43 = python2Target13.badWords;
        python2Target0.badWords = strSet43;
        org.antlr.v4.codegen.target.Python2Target python2Target45 = new org.antlr.v4.codegen.target.Python2Target();
        int int46 = python2Target45.getInlineTestSetWordSize();
        python2Target45.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target49 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator48);
        org.stringtemplate.v4.STGroup sTGroup50 = python2Target49.loadTemplates();
        python2Target45.templates = sTGroup50;
        python2Target0.templates = sTGroup50;
        org.stringtemplate.v4.STGroup sTGroup53 = python2Target0.getTemplates();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"hi!\"" + "'", str15, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "i" + "'", str21, "i");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\0" + "'", str25, "\\0");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"\"i\"\"" + "'", str39, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 64 + "'", int46 == 64);
        org.junit.Assert.assertNotNull(sTGroup50);
        org.junit.Assert.assertNotNull(sTGroup53);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
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
        python2Target0.language = "\\\"\\\"\\\"hi!\\\"\\\"\\\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "Python2", false);
        java.lang.String[] strArray25 = null;
        python2Target0.targetCharValueEscape = strArray25;
        int int27 = python2Target0.getInlineTestSetWordSize();
        int int28 = python2Target0.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"i" + "'", str8, "\\\"i");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ython" + "'", str24, "ython");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 64 + "'", int28 == 64);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target();
        int int9 = python2Target8.getInlineTestSetWordSize();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        python2Target8.badWords = strSet14;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target8.templates = sTGroup19;
        python2Target1.templates = sTGroup19;
        java.lang.String str22 = python2Target1.getLanguage();
        python2Target1.language = "\"12\\\"Contex\"";
        java.lang.String str26 = python2Target1.getAltLabelContextStructName("\"_\"i\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        java.lang.String str30 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator27, "\"\"\\\"\\\"\\\"hi!\\\"\\\"\\\"\"\"", true);
        python2Target1.language = "\"_\"\\\\\\\"i\"\"";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Python2" + "'", str22, "Python2");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"_\"i\"\"Context" + "'", str26, "\"_\"i\"\"Context");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"\\\"\\\"\\\"\\\"hi!\\\"\\\"\\\"\\\"\"" + "'", str30, "\"\\\"\\\"\\\"\\\"hi!\\\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"\\\"\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\"\\\"\"", true);
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target();
        int int13 = python2Target12.getInlineTestSetWordSize();
        java.lang.String str16 = python2Target12.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str17 = python2Target12.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str20 = python2Target18.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python2Target18.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        java.lang.String str28 = python2Target18.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator25, "", true);
        python2Target18.language = "";
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str33 = python2Target31.getTargetStringLiteralFromString("hi!");
        python2Target31.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        java.lang.String str39 = python2Target31.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator36, "hi!", false);
        int int40 = python2Target31.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target41 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str43 = python2Target41.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target44 = new org.antlr.v4.codegen.target.Python2Target();
        int int45 = python2Target44.getInlineTestSetWordSize();
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        python2Target44.badWords = strSet50;
        python2Target41.badWords = strSet50;
        python2Target31.badWords = strSet50;
        python2Target31.addBadWords();
        java.lang.String str57 = python2Target31.getTargetStringLiteralFromString("\"i\"");
        boolean boolean58 = python2Target31.wantsBaseListener();
        java.lang.String[] strArray59 = null;
        python2Target31.targetCharValueEscape = strArray59;
        java.util.Set<java.lang.String> strSet61 = python2Target31.badWords;
        python2Target18.badWords = strSet61;
        python2Target12.badWords = strSet61;
        python2Target1.badWords = strSet61;
        java.lang.String[] strArray65 = python2Target1.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator66 = null;
        java.lang.String str69 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator66, "_tset_tset_tset\" \"Context", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\"\\\"\"" + "'", str11, "\"\\\"\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"hi!\"\"" + "'", str16, "\"\"hi!\"\"");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"hi!\"" + "'", str20, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\"" + "'", str28, "\"\"");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"hi!\"" + "'", str33, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "i" + "'", str39, "i");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 64 + "'", int40 == 64);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\\0" + "'", str43, "\\0");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 64 + "'", int45 == 64);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\"\"i\"\"" + "'", str57, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "tset_tset_tset\\\" \\\"Contex" + "'", str69, "tset_tset_tset\\\" \\\"Contex");
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        java.lang.String str4 = python2Target0.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        java.lang.String str6 = python2Target0.getLanguage();
        int int7 = python2Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet9 = python2Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python2Target0.gen = codeGenerator10;
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        python2Target0.genRecognizerHeaderFile(grammar12, sT13, "\"#\"");
        java.lang.String str16 = python2Target0.getVersion();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\1" + "'", str4, "\\1");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target0.getCodeGenerator();
        java.lang.String str5 = python2Target0.language;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("\"\\\"#\\\"\"", true);
        boolean boolean9 = python2Target0.supportsOverloadedMethods();
        int int10 = python2Target0.getSerializedATNSegmentLimit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\\\"#\\\"\"\"" + "'", str8, "\"\"\\\"#\\\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.wantsBaseListener();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        python2Target0.language = "";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        python2Target1.addBadWords();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\12Context\"");
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) (byte) 0);
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.getTemplates();
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str16 = python2Target14.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target();
        int int18 = python2Target17.getInlineTestSetWordSize();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        python2Target17.badWords = strSet23;
        python2Target14.badWords = strSet23;
        java.lang.String[] strArray27 = python2Target14.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray27;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray27;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray27;
        python2Target1.targetCharValueEscape = strArray27;
        java.lang.String str32 = python2Target1.getVersion();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\12Context\"Context" + "'", str10, "\"\\12Context\"Context");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\0" + "'", str16, "\\0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "4.5.2.1" + "'", str32, "4.5.2.1");
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
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
        java.lang.String str44 = python2Target0.getVersion();
        boolean boolean45 = python2Target0.wantsBaseVisitor();
        int int46 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str49 = python2Target0.getTargetStringLiteralFromString("\"\"tset\\\"\\\\\\\"i\"\"", false);
        boolean boolean50 = python2Target0.templatesExist();
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "4.5.2.1" + "'", str44, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"\"tset\\\"\\\\\\\"i\"\"" + "'", str49, "\"\"tset\\\"\\\\\\\"i\"\"");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
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
        java.lang.String str15 = python2Target0.encodeIntAsCharEscape((int) '#');
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python2Target0.gen = codeGenerator16;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target0.getListLabel("\"_\"\"\"hi!\"\"Context\"\"ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#" + "'", str15, "#");
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        java.lang.String str6 = python2Target1.language;
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        boolean boolean8 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String str13 = python2Target11.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str15 = python2Target11.getImplicitRuleLabel("\"i\"");
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target11.getTemplates();
        java.lang.String str18 = python2Target11.getImplicitRuleLabel("_\"i\"");
        java.lang.String str20 = python2Target11.getTargetStringLiteralFromString("\" \"");
        int int21 = python2Target11.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet22 = python2Target11.getBadWords();
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target();
        int int25 = python2Target24.getInlineTestSetWordSize();
        java.lang.String str28 = python2Target24.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str29 = python2Target24.getVersion();
        java.lang.String str30 = python2Target24.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        java.lang.String str34 = python2Target24.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator31, "\\\"\\\"\\\"hi!\\\"\\\"\\\"", false);
        boolean boolean35 = python2Target24.supportsOverloadedMethods();
        python2Target24.language = "tset\\\"\\\\\\\"i";
        java.lang.String str38 = python2Target24.getLanguage();
        org.antlr.v4.tool.Grammar grammar39 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target40 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str42 = python2Target40.getTargetStringLiteralFromString("hi!");
        python2Target40.language = "hi!";
        java.lang.String str46 = python2Target40.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator47 = python2Target40.gen;
        java.lang.String str48 = python2Target40.getLanguage();
        boolean boolean49 = python2Target40.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = python2Target40.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target52 = new org.antlr.v4.codegen.target.Python2Target();
        int int53 = python2Target52.getInlineTestSetWordSize();
        java.lang.String[] strArray57 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        python2Target52.badWords = strSet58;
        org.stringtemplate.v4.STGroup sTGroup61 = null;
        python2Target52.templates = sTGroup61;
        org.antlr.v4.codegen.CodeGenerator codeGenerator63 = null;
        python2Target52.gen = codeGenerator63;
        java.util.Set<java.lang.String> strSet65 = python2Target52.getBadWords();
        java.lang.String str66 = python2Target52.getVersion();
        org.antlr.v4.tool.Grammar grammar67 = null;
        int[] intArray68 = new int[] {};
        java.lang.String[] strArray69 = python2Target52.getTokenTypesAsTargetLabels(grammar67, intArray68);
        java.lang.String[] strArray70 = python2Target40.getTokenTypesAsTargetLabels(grammar51, intArray68);
        java.lang.String[] strArray71 = python2Target24.getTokenTypesAsTargetLabels(grammar39, intArray68);
        java.lang.String[] strArray72 = python2Target11.getTokenTypesAsTargetLabels(grammar23, intArray68);
        java.lang.String[] strArray73 = python2Target1.getTokenTypesAsTargetLabels(grammar9, intArray68);
        java.lang.String str76 = python2Target1.getTargetStringLiteralFromString("_tset\"\\\" \\\"\"", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"hi!\"\"Context" + "'", str13, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_\"i\"" + "'", str15, "_\"i\"");
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "__\"i\"" + "'", str18, "__\"i\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\\\" \\\"\"" + "'", str20, "\"\\\" \\\"\"");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\"hi!\"\"" + "'", str28, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4.5.2.1" + "'", str29, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "4.5.2.1" + "'", str30, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str34, "\\\"\\\"\\\"hi!\\\"\\\"\\\"");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "tset\\\"\\\\\\\"i" + "'", str38, "tset\\\"\\\\\\\"i");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\"hi!\"" + "'", str42, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\\12" + "'", str46, "\\12");
        org.junit.Assert.assertNull(codeGenerator47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(codeGenerator50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 64 + "'", int53 == 64);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "4.5.2.1" + "'", str66, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[]");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "_tset\\\"\\\\\\\" \\\\\\\"\\\"" + "'", str76, "_tset\\\"\\\\\\\" \\\\\\\"\\\"");
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", false);
        boolean boolean8 = python2Target0.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target0.getCodeGenerator();
        boolean boolean10 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target();
        int int12 = python2Target11.getInlineTestSetWordSize();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python2Target11.badWords = strSet17;
        org.stringtemplate.v4.STGroup sTGroup20 = null;
        python2Target11.templates = sTGroup20;
        python2Target11.language = "\\1";
        java.lang.String str24 = python2Target11.language;
        java.lang.String[] strArray30 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray30;
        python2Target11.targetCharValueEscape = strArray30;
        python2Target0.targetCharValueEscape = strArray30;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = python2Target0.getListLabel("\"\\\\\\\"\\\\\\\"#\\\\\\\"\\\\\\\"\"ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\1" + "'", str24, "\\1");
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        python2Target0.gen = codeGenerator15;
        boolean boolean17 = python2Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet18 = python2Target0.badWords;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
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
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str18 = python2Target16.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target();
        int int20 = python2Target19.getInlineTestSetWordSize();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        python2Target19.badWords = strSet25;
        python2Target16.badWords = strSet25;
        java.lang.String[] strArray29 = python2Target16.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        java.lang.String str33 = python2Target16.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator30, "\\0", true);
        java.lang.String str36 = python2Target16.getTargetStringLiteralFromString("\"\"hi!\"\"", true);
        boolean boolean37 = python2Target16.templatesExist();
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target();
        int int39 = python2Target38.getInlineTestSetWordSize();
        java.lang.String str42 = python2Target38.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str43 = python2Target38.getVersion();
        java.lang.String str44 = python2Target38.getLanguage();
        org.antlr.v4.codegen.target.Python2Target python2Target45 = new org.antlr.v4.codegen.target.Python2Target();
        int int46 = python2Target45.getInlineTestSetWordSize();
        java.lang.String str49 = python2Target45.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str50 = python2Target45.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target51 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str53 = python2Target51.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = null;
        java.lang.String str57 = python2Target51.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator54, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        java.lang.String str61 = python2Target51.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator58, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator62 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target63 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator62);
        org.stringtemplate.v4.STGroup sTGroup64 = python2Target63.loadTemplates();
        python2Target51.templates = sTGroup64;
        python2Target45.templates = sTGroup64;
        python2Target38.templates = sTGroup64;
        python2Target16.templates = sTGroup64;
        python2Target0.templates = sTGroup64;
        org.antlr.v4.codegen.CodeGenerator codeGenerator70 = null;
        java.lang.String str73 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator70, "\"\\\"\\\"\\\\\\\"#\\\\\\\"\\\"\\\"\"", true);
        java.lang.String str74 = python2Target0.getVersion();
        java.lang.String str76 = python2Target0.getTargetStringLiteralFromString("\"_tsethi!\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\0" + "'", str18, "\\0");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\"" + "'", str33, "\"\"");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str36, "\"\"\"hi!\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\"\"hi!\"\"" + "'", str42, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "4.5.2.1" + "'", str43, "4.5.2.1");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 64 + "'", int46 == 64);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"\"hi!\"\"" + "'", str49, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "4.5.2.1" + "'", str50, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\"hi!\"" + "'", str53, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\"\"" + "'", str57, "\"\"");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\"\"" + "'", str61, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup64);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\"\\\"\\\"\\\\\\\"#\\\\\\\"\\\"\\\"\"" + "'", str73, "\"\\\"\\\"\\\\\\\"#\\\\\\\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "4.5.2.1" + "'", str74, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\"\"_tsethi!\"\"" + "'", str76, "\"\"_tsethi!\"\"");
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
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
        java.lang.String str37 = python2Target1.getVersion();
        java.lang.String str39 = python2Target1.getImplicitRuleLabel("_tset\\\"\\\\\\\\\\\\\\\"i\\\"");
        int int40 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet41 = python2Target1.getBadWords();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "4.5.2.1" + "'", str37, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "__tset\\\"\\\\\\\\\\\\\\\"i\\\"" + "'", str39, "__tset\\\"\\\\\\\\\\\\\\\"i\\\"");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 64 + "'", int40 == 64);
        org.junit.Assert.assertNotNull(strSet41);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String[] strArray10 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        python2Target0.targetCharValueEscape = strArray10;
        boolean boolean14 = python2Target0.templatesExist();
        java.lang.String str15 = python2Target0.language;
        org.antlr.v4.tool.Rule rule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target0.getRuleFunctionContextStructName(rule16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getVersion();
        java.lang.String str6 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\\\"\\\"\\\"hi!\\\"\\\"\\\"", false);
        java.lang.String str11 = python2Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target0.getCodeGenerator();
        java.lang.String str14 = python2Target0.getTargetStringLiteralFromString("\"_\\\"\\\\\\\"0\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str10, "\\\"\\\"\\\"hi!\\\"\\\"\\\"");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"_\\\"\\\\\\\"0\\\\\\\"Context\\\"\"\"" + "'", str14, "\"\"_\\\"\\\\\\\"0\\\\\\\"Context\\\"\"\"");
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
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
        int int21 = python2Target0.getInlineTestSetWordSize();
        int int22 = python2Target0.getSerializedATNSegmentLimit();
        python2Target0.language = "\"\\12Context\"Context";
        boolean boolean25 = python2Target0.templatesExist();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
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
        java.lang.String str35 = python2Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        python2Target0.gen = codeGenerator36;
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        python2Target0.gen = codeGenerator38;
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = python2Target0.gen;
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"" + "'", str35, "\"\"");
        org.junit.Assert.assertNull(codeGenerator40);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet8 = python2Target0.badWords;
        java.lang.String str9 = python2Target0.getLanguage();
        java.lang.String str10 = python2Target0.getVersion();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        java.lang.String str28 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator25, "\" \"Context", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = python2Target0.getImplicitTokenLabel("_\"\\\"#\\\"\"");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " \\\"Contex" + "'", str28, " \\\"Contex");
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        int int4 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"\"hi!\"\"\"", false);
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target();
        int int9 = python2Target8.getInlineTestSetWordSize();
        java.lang.String str12 = python2Target8.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str13 = python2Target8.getLanguage();
        boolean boolean14 = python2Target8.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target();
        int int16 = python2Target15.getInlineTestSetWordSize();
        int int17 = python2Target15.getInlineTestSetWordSize();
        boolean boolean18 = python2Target15.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python2Target15.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        java.lang.String str23 = python2Target15.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator20, "_\"i\"", false);
        java.lang.String[] strArray29 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray29;
        python2Target15.targetCharValueEscape = strArray29;
        python2Target8.targetCharValueEscape = strArray29;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray29;
        python2Target1.targetCharValueEscape = strArray29;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        java.lang.String str38 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator35, "\" \"", false);
        java.lang.String str39 = python2Target1.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        python2Target1.gen = codeGenerator40;
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str44 = python2Target42.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        python2Target42.gen = codeGenerator45;
        java.lang.String[] strArray52 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray52;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray52;
        python2Target42.targetCharValueEscape = strArray52;
        java.lang.String str58 = python2Target42.getTargetStringLiteralFromString(" ", true);
        java.lang.String str59 = python2Target42.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target60 = new org.antlr.v4.codegen.target.Python2Target();
        int int61 = python2Target60.getInlineTestSetWordSize();
        java.lang.String str64 = python2Target60.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str65 = python2Target60.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target66 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str68 = python2Target66.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator69 = null;
        java.lang.String str72 = python2Target66.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator69, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator73 = null;
        java.lang.String str76 = python2Target66.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator73, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator77 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target78 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator77);
        org.stringtemplate.v4.STGroup sTGroup79 = python2Target78.loadTemplates();
        python2Target66.templates = sTGroup79;
        python2Target60.templates = sTGroup79;
        python2Target42.templates = sTGroup79;
        python2Target1.templates = sTGroup79;
        org.stringtemplate.v4.STGroup sTGroup84 = python2Target1.getTemplates();
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str7, "\\\"\\\"\\\"hi!\\\"\\\"\\\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"hi!\"\"" + "'", str12, "\"\"hi!\"\"");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(codeGenerator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\\\"i" + "'", str23, "\\\"i");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + " " + "'", str38, " ");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Python2" + "'", str39, "Python2");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\\0" + "'", str44, "\\0");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\" \"" + "'", str58, "\" \"");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "4.5.2.1" + "'", str59, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 64 + "'", int61 == 64);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\"\"hi!\"\"" + "'", str64, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "4.5.2.1" + "'", str65, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\"hi!\"" + "'", str68, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "\"\"" + "'", str72, "\"\"");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\"\"" + "'", str76, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup79);
        org.junit.Assert.assertNotNull(sTGroup84);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
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
        org.stringtemplate.v4.STGroup sTGroup24 = python2Target1.loadTemplates();
        java.lang.String str25 = python2Target1.getVersion();
        java.lang.String str27 = python2Target1.encodeIntAsCharEscape((int) 'a');
        java.lang.Class<?> wildcardClass28 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\\"i" + "'", str13, "\\\"i");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4.5.2.1" + "'", str23, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "a" + "'", str27, "a");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.getLanguage();
        java.lang.String str5 = python2Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target0.genRecognizerHeaderFile(grammar6, sT7, "\"\"\\12\"\"");
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target10.gen = codeGenerator11;
        java.util.Set<java.lang.String> strSet13 = python2Target10.getBadWords();
        java.util.Set<java.lang.String> strSet14 = python2Target10.getBadWords();
        python2Target0.badWords = strSet14;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        python2Target0.gen = codeGenerator17;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(codeGenerator16);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
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
        boolean boolean16 = python2Target0.templatesExist();
        boolean boolean17 = python2Target0.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target0.getListLabel("_\\\"\\\\\\\\\\\\\\\"i\\\"Contex");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
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
        java.util.Set<java.lang.String> strSet31 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup32 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = python2Target1.getCodeGenerator();
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
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(sTGroup32);
        org.junit.Assert.assertNull(codeGenerator33);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python2Target1.genRecognizerHeaderFile(grammar7, sT8, "\\\"hi!\\\"\\\"Contex");
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("\"@\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        int int14 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str15 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"@\"" + "'", str12, "_\"@\"");
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        java.lang.Class<?> wildcardClass8 = python2Target0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
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
        java.lang.String str27 = python2Target0.language;
        java.util.Set<java.lang.String> strSet28 = python2Target0.getBadWords();
        int int29 = python2Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = python2Target0.getTokenTypeAsTargetLabel(grammar30, (int) '4');
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
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python2Target1.genRecognizerHeaderFile(grammar4, sT5, "\"\"i\"\"");
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str11 = python2Target9.getTargetStringLiteralFromString("hi!");
        python2Target9.language = "hi!";
        java.lang.String str15 = python2Target9.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean16 = python2Target9.wantsBaseListener();
        java.util.Set<java.lang.String> strSet17 = python2Target9.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python2Target9.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "\"\"i\"\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python2Target9.gen;
        java.lang.String str25 = python2Target9.getTargetStringLiteralFromString("\"\"0\"Context\"", true);
        boolean boolean26 = python2Target9.wantsBaseListener();
        java.util.Set<java.lang.String> strSet27 = python2Target9.getBadWords();
        python2Target1.badWords = strSet27;
        boolean boolean29 = python2Target1.templatesExist();
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"" + "'", str11, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\12" + "'", str15, "\\12");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\\"i\\\"" + "'", str21, "\\\"i\\\"");
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\"\"0\"Context\"\"" + "'", str25, "\"\"\"0\"Context\"\"");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
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
        boolean boolean25 = python2Target0.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup26 = python2Target0.templates;
        python2Target0.language = "_tset\"\"";
        java.lang.String str30 = python2Target0.getListLabel("a");
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.stringtemplate.v4.ST sT32 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar31, sT32, "4.5.2.1");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(sTGroup26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "a" + "'", str30, "a");
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.loadTemplates();
        java.lang.String str4 = python2Target1.getImplicitRuleLabel("\\0");
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("\\1");
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.lang.String str12 = python2Target10.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str14 = python2Target10.getImplicitRuleLabel("\"i\"");
        java.lang.String str15 = python2Target10.language;
        boolean boolean16 = python2Target10.wantsBaseVisitor();
        boolean boolean17 = python2Target10.templatesExist();
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        java.lang.String str22 = python2Target20.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str24 = python2Target20.getImplicitRuleLabel("\"i\"");
        org.stringtemplate.v4.STGroup sTGroup25 = python2Target20.getTemplates();
        java.lang.String str27 = python2Target20.getImplicitRuleLabel("_\"i\"");
        java.lang.String str29 = python2Target20.getTargetStringLiteralFromString("\" \"");
        int int30 = python2Target20.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet31 = python2Target20.getBadWords();
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target33 = new org.antlr.v4.codegen.target.Python2Target();
        int int34 = python2Target33.getInlineTestSetWordSize();
        java.lang.String str37 = python2Target33.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str38 = python2Target33.getVersion();
        java.lang.String str39 = python2Target33.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        java.lang.String str43 = python2Target33.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator40, "\\\"\\\"\\\"hi!\\\"\\\"\\\"", false);
        boolean boolean44 = python2Target33.supportsOverloadedMethods();
        python2Target33.language = "tset\\\"\\\\\\\"i";
        java.lang.String str47 = python2Target33.getLanguage();
        org.antlr.v4.tool.Grammar grammar48 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target49 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str51 = python2Target49.getTargetStringLiteralFromString("hi!");
        python2Target49.language = "hi!";
        java.lang.String str55 = python2Target49.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator56 = python2Target49.gen;
        java.lang.String str57 = python2Target49.getLanguage();
        boolean boolean58 = python2Target49.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator59 = python2Target49.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar60 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target61 = new org.antlr.v4.codegen.target.Python2Target();
        int int62 = python2Target61.getInlineTestSetWordSize();
        java.lang.String[] strArray66 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet67 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet67, strArray66);
        python2Target61.badWords = strSet67;
        org.stringtemplate.v4.STGroup sTGroup70 = null;
        python2Target61.templates = sTGroup70;
        org.antlr.v4.codegen.CodeGenerator codeGenerator72 = null;
        python2Target61.gen = codeGenerator72;
        java.util.Set<java.lang.String> strSet74 = python2Target61.getBadWords();
        java.lang.String str75 = python2Target61.getVersion();
        org.antlr.v4.tool.Grammar grammar76 = null;
        int[] intArray77 = new int[] {};
        java.lang.String[] strArray78 = python2Target61.getTokenTypesAsTargetLabels(grammar76, intArray77);
        java.lang.String[] strArray79 = python2Target49.getTokenTypesAsTargetLabels(grammar60, intArray77);
        java.lang.String[] strArray80 = python2Target33.getTokenTypesAsTargetLabels(grammar48, intArray77);
        java.lang.String[] strArray81 = python2Target20.getTokenTypesAsTargetLabels(grammar32, intArray77);
        java.lang.String[] strArray82 = python2Target10.getTokenTypesAsTargetLabels(grammar18, intArray77);
        java.lang.String[] strArray83 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray77);
        org.junit.Assert.assertNotNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_\\0" + "'", str4, "_\\0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\\1" + "'", str6, "_\\1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"hi!\"\"Context" + "'", str12, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_\"i\"" + "'", str14, "_\"i\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\"hi!\"\"Context" + "'", str22, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_\"i\"" + "'", str24, "_\"i\"");
        org.junit.Assert.assertNotNull(sTGroup25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "__\"i\"" + "'", str27, "__\"i\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\\" \\\"\"" + "'", str29, "\"\\\" \\\"\"");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 64 + "'", int34 == 64);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"\"hi!\"\"" + "'", str37, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "4.5.2.1" + "'", str38, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "4.5.2.1" + "'", str39, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str43, "\\\"\\\"\\\"hi!\\\"\\\"\\\"");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "tset\\\"\\\\\\\"i" + "'", str47, "tset\\\"\\\\\\\"i");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\"hi!\"" + "'", str51, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\\12" + "'", str55, "\\12");
        org.junit.Assert.assertNull(codeGenerator56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(codeGenerator59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 64 + "'", int62 == 64);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "4.5.2.1" + "'", str75, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[]");
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(strArray83);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target0.genRecognizerHeaderFile(grammar11, sT12, "hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target0.getCodeGenerator();
        java.lang.String str16 = python2Target0.getLanguage();
        int int17 = python2Target0.getSerializedATNSegmentLimit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
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
        java.util.Set<java.lang.String> strSet33 = python2Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup34 = python2Target0.templates;
        python2Target0.addBadWords();
        boolean boolean36 = python2Target0.wantsBaseListener();
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
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNull(sTGroup34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.language;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target();
        int int8 = python2Target7.getInlineTestSetWordSize();
        int int9 = python2Target7.getSerializedATNSegmentLimit();
        java.lang.String str11 = python2Target7.encodeIntAsCharEscape(1);
        java.lang.String[] strArray12 = python2Target7.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        java.lang.String str16 = python2Target14.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean17 = python2Target14.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target14.getCodeGenerator();
        java.lang.String[] strArray19 = python2Target14.targetCharValueEscape;
        python2Target7.targetCharValueEscape = strArray19;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray19;
        python2Target1.targetCharValueEscape = strArray19;
        java.lang.String str24 = python2Target1.getTargetStringLiteralFromString("\"\"\"0\"Context\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python2Target1.gen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python2Target1.getImplicitTokenLabel("\"\\\"\\\"\\\"hi!\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\1" + "'", str11, "\\1");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"hi!\"\"Context" + "'", str16, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\\\"\\\"\\\"0\\\"Context\\\"\\\"\"" + "'", str24, "\"\\\"\\\"\\\"0\\\"Context\\\"\\\"\"");
        org.junit.Assert.assertNull(codeGenerator25);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        python2Target0.addBadWords();
        java.lang.String[] strArray4 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.getCodeGenerator();
        java.lang.String str6 = python2Target0.language;
        java.util.Set<java.lang.String> strSet7 = python2Target0.getBadWords();
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        java.lang.Class<?> wildcardClass9 = strSet8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\"i\"\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target0.gen;
        java.lang.String str16 = python2Target0.getTargetStringLiteralFromString("\"\"0\"Context\"", true);
        boolean boolean17 = python2Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet18 = python2Target0.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target0.getLoopLabel(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\"i\\\"" + "'", str12, "\\\"i\\\"");
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"\"0\"Context\"\"" + "'", str16, "\"\"\"0\"Context\"\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python2Target0.genRecognizerHeaderFile(grammar5, sT6, "\\1");
        java.lang.String str9 = python2Target0.language;
        java.lang.String str11 = python2Target0.getTargetStringLiteralFromString("_tset\"_\\\"i\"");
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str14 = python2Target12.getTargetStringLiteralFromString("hi!");
        python2Target12.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python2Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "hi!", false);
        int int21 = python2Target12.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str24 = python2Target22.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target();
        int int26 = python2Target25.getInlineTestSetWordSize();
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        python2Target25.badWords = strSet31;
        python2Target22.badWords = strSet31;
        python2Target12.badWords = strSet31;
        boolean boolean36 = python2Target12.templatesExist();
        boolean boolean37 = python2Target12.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str40 = python2Target38.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        python2Target38.gen = codeGenerator41;
        python2Target38.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target45 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator44);
        org.stringtemplate.v4.STGroup sTGroup46 = python2Target45.loadTemplates();
        python2Target38.templates = sTGroup46;
        java.lang.String str49 = python2Target38.getTargetStringLiteralFromString("\\12Context");
        boolean boolean50 = python2Target38.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python2Target python2Target51 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str53 = python2Target51.getTargetStringLiteralFromString("hi!");
        python2Target51.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator56 = null;
        java.lang.String str59 = python2Target51.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator56, "hi!", false);
        int int60 = python2Target51.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet61 = python2Target51.getBadWords();
        python2Target38.badWords = strSet61;
        python2Target12.badWords = strSet61;
        python2Target0.badWords = strSet61;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = python2Target0.getImplicitRuleLabel("\"\"\"i\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tset\"_\\\"i\"\"" + "'", str11, "\"_tset\"_\\\"i\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"hi!\"" + "'", str14, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "i" + "'", str20, "i");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\0" + "'", str24, "\\0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\\0" + "'", str40, "\\0");
        org.junit.Assert.assertNotNull(sTGroup46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"\\12Context\"" + "'", str49, "\"\\12Context\"");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\"hi!\"" + "'", str53, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "i" + "'", str59, "i");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 64 + "'", int60 == 64);
        org.junit.Assert.assertNotNull(strSet61);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        python2Target1.language = "\"_\"i\"\"";
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\\64Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset\\64Context" + "'", str8, "_tset\\64Context");
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target37 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator36);
        java.lang.String str39 = python2Target37.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean40 = python2Target37.templatesExist();
        boolean boolean41 = python2Target37.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = python2Target37.getCodeGenerator();
        java.util.Set<java.lang.String> strSet43 = python2Target37.badWords;
        python2Target0.badWords = strSet43;
        python2Target0.language = "\"\"\"\\\"#\\\"\"\"\"";
        org.antlr.v4.tool.ast.GrammarAST grammarAST47 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST47);
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"\"hi!\"\"Context" + "'", str39, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(codeGenerator42);
        org.junit.Assert.assertNotNull(strSet43);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python2Target0.genRecognizerHeaderFile(grammar5, sT6, "\\1");
        java.lang.String[] strArray9 = python2Target0.targetCharValueEscape;
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("\"\\\"0\\\"Context\"", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"\\\"0\\\"Context\"\"" + "'", str12, "\"\"\\\"0\\\"Context\"\"");
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        python2Target0.addBadWords();
        java.lang.String str9 = python2Target0.getTargetStringLiteralFromString("_tset\\0");
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target0.templates;
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("\"\"\"hi!\"\"Context\"Context");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_tset\\0\"" + "'", str9, "\"_tset\\0\"");
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"\"\"hi!\"\"Context\"Context\"" + "'", str12, "\"\"\"\"hi!\"\"Context\"Context\"");
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
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
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target0.templates;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str26 = python2Target24.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        java.lang.String str30 = python2Target24.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator27, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        java.lang.String str34 = python2Target24.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator31, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target36 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator35);
        org.stringtemplate.v4.STGroup sTGroup37 = python2Target36.loadTemplates();
        python2Target24.templates = sTGroup37;
        java.lang.String str39 = python2Target24.language;
        org.stringtemplate.v4.STGroup sTGroup40 = python2Target24.templates;
        python2Target0.templates = sTGroup40;
        boolean boolean42 = python2Target0.wantsBaseVisitor();
        java.lang.String str43 = python2Target0.language;
        java.lang.String str44 = python2Target0.getLanguage();
        org.antlr.v4.tool.Grammar grammar45 = null;
        org.stringtemplate.v4.ST sT46 = null;
        python2Target0.genRecognizerHeaderFile(grammar45, sT46, "__\"\\\"hi!\\\"\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\0" + "'", str11, "\\0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(sTGroup23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"hi!\"" + "'", str26, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"\"" + "'", str30, "\"\"");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\"" + "'", str34, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(sTGroup40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean7 = python2Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\"i\"\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target0.gen;
        java.lang.String str16 = python2Target0.getTargetStringLiteralFromString("\"\"0\"Context\"", true);
        boolean boolean17 = python2Target0.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        python2Target0.gen = codeGenerator18;
        org.antlr.v4.tool.Rule rule20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python2Target0.getRuleFunctionContextStructName(rule20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\"i\\\"" + "'", str12, "\\\"i\\\"");
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"\"0\"Context\"\"" + "'", str16, "\"\"\"0\"Context\"\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        boolean boolean5 = python2Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        java.util.Set<java.lang.String> strSet8 = python2Target0.getBadWords();
        java.lang.String str9 = python2Target0.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup10 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet3 = python2Target0.badWords;
        python2Target0.language = "4.5.2.1";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        java.lang.String str9 = python2Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "1", false);
        java.lang.String str14 = python2Target0.getVersion();
        java.lang.String str17 = python2Target0.getTargetStringLiteralFromString("\"\\\"#\\\"\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.gen;
        java.lang.String str19 = python2Target0.language;
        int int20 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String[] strArray21 = python2Target0.targetCharValueEscape;
        int int22 = python2Target0.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\"i\"\"" + "'", str8, "\"_\"i\"\"");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"\\\"#\\\"\"\"" + "'", str17, "\"\"\\\"#\\\"\"\"");
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.getCodeGenerator();
        boolean boolean19 = python2Target0.templatesExist();
        boolean boolean20 = python2Target0.wantsBaseVisitor();
        int int21 = python2Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str24 = python2Target22.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        python2Target22.gen = codeGenerator25;
        java.lang.String[] strArray32 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray32;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray32;
        python2Target22.targetCharValueEscape = strArray32;
        java.lang.String str38 = python2Target22.getTargetStringLiteralFromString(" ", true);
        java.lang.String str39 = python2Target22.getVersion();
        boolean boolean40 = python2Target22.wantsBaseVisitor();
        java.lang.String[] strArray41 = python2Target22.targetCharValueEscape;
        python2Target0.targetCharValueEscape = strArray41;
        java.lang.String str44 = python2Target0.encodeIntAsCharEscape((int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\" \"" + "'", str16, "\" \"");
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\0" + "'", str24, "\\0");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\" \"" + "'", str38, "\" \"");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "4.5.2.1" + "'", str39, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\\64" + "'", str44, "\\64");
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        java.lang.String str9 = python2Target1.getListLabel("\"\\12Context\"Context");
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target();
        int int12 = python2Target11.getInlineTestSetWordSize();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python2Target11.badWords = strSet17;
        org.stringtemplate.v4.STGroup sTGroup20 = null;
        python2Target11.templates = sTGroup20;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        python2Target11.gen = codeGenerator22;
        java.util.Set<java.lang.String> strSet24 = python2Target11.getBadWords();
        java.lang.String str25 = python2Target11.getVersion();
        org.antlr.v4.tool.Grammar grammar26 = null;
        int[] intArray27 = new int[] {};
        java.lang.String[] strArray28 = python2Target11.getTokenTypesAsTargetLabels(grammar26, intArray27);
        java.lang.String[] strArray29 = python2Target1.getTokenTypesAsTargetLabels(grammar10, intArray27);
        org.antlr.v4.codegen.target.Python2Target python2Target30 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        python2Target30.gen = codeGenerator31;
        java.util.Set<java.lang.String> strSet33 = python2Target30.getBadWords();
        python2Target1.badWords = strSet33;
        java.lang.String str37 = python2Target1.getTargetStringLiteralFromString("\"\"\\12\"Context\"", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\12Context\"Context" + "'", str9, "\"\\12Context\"Context");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\\\"\\\"\\\\12\\\"Context\\\"" + "'", str37, "\\\"\\\"\\\\12\\\"Context\\\"");
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.util.Set<java.lang.String> strSet13 = python2Target0.getBadWords();
        python2Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "\"_\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"", true);
        java.lang.String str21 = python2Target0.getTargetStringLiteralFromString("_\\\"_\\\"i\\\"", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"_\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"" + "'", str18, "\"_\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_\\\"_\\\"i\\\"" + "'", str21, "_\\\"_\\\"i\\\"");
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
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
        boolean boolean29 = python2Target0.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = python2Target0.getTokenTypeAsTargetLabel(grammar30, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
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
        java.util.Set<java.lang.String> strSet16 = python2Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "\"0\\\"ContextContextContex\"", false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0\\\"ContextContextContex" + "'", str20, "0\\\"ContextContextContex");
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
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
        java.lang.String[] strArray24 = python2Target0.targetCharValueEscape;
        java.lang.String str25 = python2Target0.getVersion();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_\\0", true);
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("\"tset\"");
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getImplicitTokenLabel("\\\"hi!\\\"\\\"ContexContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(sTGroup2);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_\\\\0\"" + "'", str6, "\"_\\\\0\"");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"tset\"" + "'", str9, "_\"tset\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", true);
        java.lang.String str9 = python2Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\"\\\"i\"", true);
        boolean boolean14 = python2Target0.templatesExist();
        boolean boolean15 = python2Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        python2Target0.genRecognizerHeaderFile(grammar16, sT17, "\\\"\\\\\\\\\\\\\\\"i\\\"");
        java.lang.String str20 = python2Target0.getLanguage();
        java.lang.String[] strArray21 = python2Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet22 = python2Target0.badWords;
        java.lang.String str24 = python2Target0.encodeIntAsCharEscape((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\"i\"\"" + "'", str8, "\"_\"i\"\"");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"i\"" + "'", str13, "\"\\\"i\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\0" + "'", str24, "\\0");
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "\"\"\\12\"\"", true);
        org.antlr.v4.tool.Grammar grammar23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python2Target0.getTokenTypeAsTargetLabel(grammar23, 64);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\"12\\\"\"" + "'", str22, "\"\\\"12\\\"\"");
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target0.gen;
        java.util.Set<java.lang.String> strSet12 = python2Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target0.gen;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.getCodeGenerator();
        java.lang.String str19 = python2Target0.getVersion();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\" \"" + "'", str16, "\" \"");
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4.5.2.1" + "'", str19, "4.5.2.1");
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
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
        int int21 = python2Target0.getInlineTestSetWordSize();
        int int22 = python2Target0.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet23 = python2Target0.getBadWords();
        python2Target0.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST25);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target0.gen = codeGenerator6;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target0.getCodeGenerator();
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target0.getListLabel("tset_tset_tset\\\" \\\"Contex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        boolean boolean4 = python2Target0.supportsOverloadedMethods();
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromString("\"\\12\"", true);
        java.util.Set<java.lang.String> strSet8 = python2Target0.badWords;
        boolean boolean9 = python2Target0.supportsOverloadedMethods();
        java.lang.String str11 = python2Target0.getTargetStringLiteralFromString("\\\"\\\\\\\"i\\\\\\\"\\\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"\\12\"\"" + "'", str7, "\"\"\\12\"\"");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\\\\\"i\\\\\\\"\\\"\"" + "'", str11, "\"\\\"\\\\\\\"i\\\\\\\"\\\"\"");
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("\"\"\\12\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        python2Target1.gen = codeGenerator9;
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"0\"ContextContextContext", true);
        java.lang.String str18 = python2Target1.getTargetStringLiteralFromString("\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"Contex\\\"", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\\12\"\"Context" + "'", str8, "\"\"\\12\"\"Context");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"0\\\"ContextContextContex\"" + "'", str15, "\"0\\\"ContextContextContex\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Contex\\\\\\\"" + "'", str18, "\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Contex\\\\\\\"");
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
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
        int int23 = python2Target0.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet24 = python2Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator25);
        java.lang.String str28 = python2Target26.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str30 = python2Target26.getImplicitRuleLabel("\"i\"");
        boolean boolean31 = python2Target26.wantsBaseVisitor();
        boolean boolean32 = python2Target26.supportsOverloadedMethods();
        java.lang.String str34 = python2Target26.getImplicitRuleLabel(" \\\"Contex");
        org.stringtemplate.v4.STGroup sTGroup35 = python2Target26.templates;
        python2Target0.templates = sTGroup35;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup37 = python2Target0.loadTemplates();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\"hi!\"\"Context" + "'", str28, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "_\"i\"" + "'", str30, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "_ \\\"Contex" + "'", str34, "_ \\\"Contex");
        org.junit.Assert.assertNotNull(sTGroup35);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
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
        boolean boolean35 = python2Target0.wantsBaseVisitor();
        int int36 = python2Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST37 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST37);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        int int10 = python2Target0.getInlineTestSetWordSize();
        int int11 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target0.getCodeGenerator();
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = python2Target13.getCodeGenerator();
        java.util.Set<java.lang.String> strSet28 = python2Target13.badWords;
        python2Target0.badWords = strSet28;
        boolean boolean30 = python2Target0.wantsBaseVisitor();
        java.lang.String str32 = python2Target0.getTargetStringLiteralFromString("\"_\\\"i\"");
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.stringtemplate.v4.ST sT34 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar33, sT34, "\"\"Python2\"\"");
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
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\0" + "'", str15, "\\0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNull(codeGenerator27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"_\\\"i\"\"" + "'", str32, "\"\"_\\\"i\"\"");
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.lang.String str10 = python2Target1.getLanguage();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\"12\\\"\"");
        boolean boolean13 = python2Target1.wantsBaseVisitor();
        java.lang.String str14 = python2Target1.language;
        boolean boolean15 = python2Target1.wantsBaseListener();
        java.lang.String str17 = python2Target1.getListLabel("\"\\\"\\\\\\\"\\\\\\\"#\\\\\\\"\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\\\\\"12\\\\\\\"\\\"\"" + "'", str12, "\"\\\"\\\\\\\"12\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\"#\\\\\\\"\\\\\\\"\\\"\"" + "'", str17, "\"\\\"\\\\\\\"\\\\\\\"#\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
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
        java.lang.String str18 = python2Target0.getTargetStringLiteralFromString("\"\\\"_\\\\\\\"\\\\\\\\\\\\\\\"0\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"_\\\\\\\"\\\\\\\\\\\\\\\"0\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"" + "'", str18, "\"\\\"_\\\\\\\"\\\\\\\\\\\\\\\"0\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"");
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
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
        java.lang.String str44 = python2Target0.getVersion();
        boolean boolean45 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar46 = null;
        org.stringtemplate.v4.ST sT47 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genListenerFile(grammar46, sT47);
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "4.5.2.1" + "'", str44, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromString("i", true);
        python2Target0.language = "_\\1";
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target();
        int int12 = python2Target11.getInlineTestSetWordSize();
        java.lang.String str15 = python2Target11.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str16 = python2Target11.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str19 = python2Target17.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        java.lang.String str23 = python2Target17.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator20, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        java.lang.String str27 = python2Target17.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator24, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target29 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator28);
        org.stringtemplate.v4.STGroup sTGroup30 = python2Target29.loadTemplates();
        python2Target17.templates = sTGroup30;
        python2Target11.templates = sTGroup30;
        java.lang.String[] strArray33 = python2Target11.targetCharValueEscape;
        int int34 = python2Target11.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        python2Target11.gen = codeGenerator35;
        org.antlr.v4.tool.Grammar grammar37 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target();
        int int39 = python2Target38.getInlineTestSetWordSize();
        boolean boolean40 = python2Target38.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = python2Target38.gen;
        java.lang.String str42 = python2Target38.language;
        org.antlr.v4.tool.Grammar grammar43 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target44 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str46 = python2Target44.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator47 = null;
        python2Target44.gen = codeGenerator47;
        java.lang.String str50 = python2Target44.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target52 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str54 = python2Target52.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator55 = null;
        python2Target52.gen = codeGenerator55;
        java.lang.String str58 = python2Target52.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar59 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target60 = new org.antlr.v4.codegen.target.Python2Target();
        int int61 = python2Target60.getInlineTestSetWordSize();
        java.lang.String[] strArray65 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet66, strArray65);
        python2Target60.badWords = strSet66;
        org.stringtemplate.v4.STGroup sTGroup69 = null;
        python2Target60.templates = sTGroup69;
        org.antlr.v4.codegen.CodeGenerator codeGenerator71 = null;
        python2Target60.gen = codeGenerator71;
        java.util.Set<java.lang.String> strSet73 = python2Target60.getBadWords();
        java.lang.String str74 = python2Target60.getVersion();
        org.antlr.v4.tool.Grammar grammar75 = null;
        int[] intArray76 = new int[] {};
        java.lang.String[] strArray77 = python2Target60.getTokenTypesAsTargetLabels(grammar75, intArray76);
        java.lang.String[] strArray78 = python2Target52.getTokenTypesAsTargetLabels(grammar59, intArray76);
        java.lang.String[] strArray79 = python2Target44.getTokenTypesAsTargetLabels(grammar51, intArray76);
        java.lang.String[] strArray80 = python2Target38.getTokenTypesAsTargetLabels(grammar43, intArray76);
        java.lang.String[] strArray81 = python2Target11.getTokenTypesAsTargetLabels(grammar37, intArray76);
        java.lang.String[] strArray82 = python2Target0.getTokenTypesAsTargetLabels(grammar10, intArray76);
        org.antlr.v4.codegen.CodeGenerator codeGenerator83 = python2Target0.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"i\"" + "'", str7, "\"i\"");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\"hi!\"\"" + "'", str15, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"hi!\"" + "'", str19, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\"" + "'", str23, "\"\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\"" + "'", str27, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(codeGenerator41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\\0" + "'", str46, "\\0");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\\12" + "'", str50, "\\12");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\\0" + "'", str54, "\\0");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\\12" + "'", str58, "\\12");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 64 + "'", int61 == 64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "4.5.2.1" + "'", str74, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[]");
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNull(codeGenerator83);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
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
        java.lang.String str29 = python2Target0.encodeIntAsCharEscape((int) '#');
        int int30 = python2Target0.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet31 = python2Target0.getBadWords();
        java.lang.String str33 = python2Target0.encodeIntAsCharEscape(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#" + "'", str29, "#");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\\0" + "'", str33, "\\0");
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        int int4 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"\"hi!\"\"\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\"\\\"12\\\"\"ContextContext", true);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str7, "\\\"\\\"\\\"hi!\\\"\\\"\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"12\\\"\\\"ContextContex\"" + "'", str13, "\"\\\"12\\\"\\\"ContextContex\"");
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
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
        java.lang.String[] strArray16 = python2Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target0.templates;
        python2Target0.addBadWords();
        java.lang.String[] strArray19 = python2Target0.targetCharValueEscape;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNull(sTGroup17);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\" \"");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target1.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        java.lang.String str17 = python2Target1.getListLabel("\"\"\\\"0\\\"Context\"Context\"");
        boolean boolean18 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python2Target1.getCodeGenerator();
        boolean boolean20 = python2Target1.templatesExist();
        boolean boolean21 = python2Target1.templatesExist();
        java.lang.String str23 = python2Target1.getImplicitRuleLabel("\"_\"\\\\\\\"i\"\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\" \"Context" + "'", str10, "\" \"Context");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"\\\"0\\\"Context\"Context\"" + "'", str17, "\"\"\\\"0\\\"Context\"Context\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(codeGenerator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_\"_\"\\\\\\\"i\"\"" + "'", str23, "_\"_\"\\\\\\\"i\"\"");
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str3 = python2Target0.getLanguage();
        java.lang.String[] strArray4 = python2Target0.targetCharValueEscape;
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromString("\"\\\"12\\\"\"Context", false);
        java.lang.String str8 = python2Target0.getLanguage();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"12\\\"\"Context" + "'", str7, "\"\\\"12\\\"\"Context");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
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
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String str26 = python2Target24.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str28 = python2Target24.getImplicitRuleLabel("\"i\"");
        java.lang.String str29 = python2Target24.language;
        boolean boolean30 = python2Target24.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target32 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str34 = python2Target32.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        python2Target32.gen = codeGenerator35;
        java.lang.String str38 = python2Target32.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar39 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target40 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str42 = python2Target40.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = null;
        python2Target40.gen = codeGenerator43;
        java.lang.String str46 = python2Target40.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar47 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target48 = new org.antlr.v4.codegen.target.Python2Target();
        int int49 = python2Target48.getInlineTestSetWordSize();
        java.lang.String[] strArray53 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        python2Target48.badWords = strSet54;
        org.stringtemplate.v4.STGroup sTGroup57 = null;
        python2Target48.templates = sTGroup57;
        org.antlr.v4.codegen.CodeGenerator codeGenerator59 = null;
        python2Target48.gen = codeGenerator59;
        java.util.Set<java.lang.String> strSet61 = python2Target48.getBadWords();
        java.lang.String str62 = python2Target48.getVersion();
        org.antlr.v4.tool.Grammar grammar63 = null;
        int[] intArray64 = new int[] {};
        java.lang.String[] strArray65 = python2Target48.getTokenTypesAsTargetLabels(grammar63, intArray64);
        java.lang.String[] strArray66 = python2Target40.getTokenTypesAsTargetLabels(grammar47, intArray64);
        java.lang.String[] strArray67 = python2Target32.getTokenTypesAsTargetLabels(grammar39, intArray64);
        java.lang.String[] strArray68 = python2Target24.getTokenTypesAsTargetLabels(grammar31, intArray64);
        java.lang.String[] strArray69 = python2Target0.getTokenTypesAsTargetLabels(grammar22, intArray64);
        java.lang.Class<?> wildcardClass70 = python2Target0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str20, "\"\"\"hi!\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"hi!\"\"Context" + "'", str26, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "_\"i\"" + "'", str28, "_\"i\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Python2" + "'", str29, "Python2");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\\0" + "'", str34, "\\0");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\12" + "'", str38, "\\12");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\\0" + "'", str42, "\\0");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\\12" + "'", str46, "\\12");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 64 + "'", int49 == 64);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "4.5.2.1" + "'", str62, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[]");
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python2Target0.genRecognizerHeaderFile(grammar5, sT6, " \\\"Contex");
        boolean boolean9 = python2Target0.wantsBaseListener();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        int int11 = python2Target10.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target10.getCodeGenerator();
        java.util.Set<java.lang.String> strSet13 = python2Target10.badWords;
        python2Target0.badWords = strSet13;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        int int9 = python2Target0.getInlineTestSetWordSize();
        boolean boolean10 = python2Target0.templatesExist();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.util.Set<java.lang.String> strSet13 = python2Target0.badWords;
        java.lang.String str14 = python2Target0.language;
        java.lang.String str16 = python2Target0.getTargetStringLiteralFromString("\\12Context");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\12Context\"" + "'", str16, "\"\\12Context\"");
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getLanguage();
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target1.genRecognizerHeaderFile(grammar6, sT7, "\"\"0\"Context\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python2Target1.gen = codeGenerator10;
        python2Target1.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.templates;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Contex\\\\\\\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Contex\\\\\\\"" + "'", str1, "\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Contex\\\\\\\"");
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
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
        boolean boolean15 = python2Target0.templatesExist();
        python2Target0.addBadWords();
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str19 = python2Target17.getTargetStringLiteralFromString("hi!");
        python2Target17.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        java.lang.String str25 = python2Target17.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator22, "hi!", false);
        int int26 = python2Target17.getInlineTestSetWordSize();
        boolean boolean27 = python2Target17.templatesExist();
        java.lang.String str29 = python2Target17.getTargetStringLiteralFromString("hi!");
        java.util.Set<java.lang.String> strSet30 = python2Target17.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python2Target17.gen;
        java.util.Set<java.lang.String> strSet32 = python2Target17.badWords;
        java.lang.String[] strArray33 = python2Target17.targetCharValueEscape;
        python2Target0.targetCharValueEscape = strArray33;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"hi!\"" + "'", str19, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "i" + "'", str25, "i");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"hi!\"" + "'", str29, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNull(codeGenerator31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromString("i", true);
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python2Target0.genRecognizerHeaderFile(grammar8, sT9, "_\"\\\\\\\"i\"");
        java.lang.String str12 = python2Target0.getVersion();
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target0.templates;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target0.getElementListName("_tset\" \\\"Conte\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"i\"" + "'", str7, "\"i\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertNull(sTGroup13);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        java.lang.String[] strArray5 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target1.genRecognizerHeaderFile(grammar6, sT7, "\"\\\"hi!\\\"\\\"Contex\"");
        java.lang.String str10 = python2Target1.getVersion();
        boolean boolean11 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getTokenTypeAsTargetLabel(grammar12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        int int2 = python2Target0.getInlineTestSetWordSize();
        boolean boolean3 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", false);
        boolean boolean8 = python2Target0.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target0.getCodeGenerator();
        boolean boolean10 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
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
        java.lang.String str38 = python2Target0.getTargetStringLiteralFromString("\"\\\"\\\\\\\\\\\\\\\"i\\\"Context\"", false);
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\\\"\\\\\\\\\\\\\\\"i\\\"Context\"" + "'", str38, "\"\\\"\\\\\\\\\\\\\\\"i\\\"Context\"");
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
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
        org.antlr.v4.tool.Grammar grammar39 = null;
        org.stringtemplate.v4.ST sT40 = null;
        python2Target1.genRecognizerHeaderFile(grammar39, sT40, "\\0");
        boolean boolean43 = python2Target1.wantsBaseListener();
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\" \"");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target1.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        java.lang.String str17 = python2Target1.getListLabel("\"\"\\\"0\\\"Context\"Context\"");
        python2Target1.language = "\"\\\"_tset_\\\"\\\"\\\"hi!\\\"\\\"Context\\\"\\\"\"";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\" \"Context" + "'", str10, "\" \"Context");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"\\\"0\\\"Context\"Context\"" + "'", str17, "\"\"\\\"0\\\"Context\"Context\"");
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        int int4 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"\"hi!\"\"\"", false);
        java.lang.String[] strArray13 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray13;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray13;
        python2Target1.targetCharValueEscape = strArray13;
        java.lang.String str18 = python2Target1.getListLabel("\\\\12");
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str21 = python2Target19.getTargetStringLiteralFromString("hi!");
        python2Target19.language = "hi!";
        java.lang.String str25 = python2Target19.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean26 = python2Target19.wantsBaseListener();
        java.util.Set<java.lang.String> strSet27 = python2Target19.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        java.lang.String str31 = python2Target19.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator28, "\"\"i\"\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = python2Target19.gen;
        java.lang.String str35 = python2Target19.getTargetStringLiteralFromString("\"\"0\"Context\"", true);
        boolean boolean36 = python2Target19.wantsBaseListener();
        java.lang.String[] strArray37 = python2Target19.targetCharValueEscape;
        java.lang.String[] strArray38 = python2Target19.targetCharValueEscape;
        python2Target1.targetCharValueEscape = strArray38;
        boolean boolean40 = python2Target1.supportsOverloadedMethods();
        java.lang.String str42 = python2Target1.getAltLabelContextStructName("\"_tset_tset\"\\\"\\\"\\\"hi!\\\"\\\"\\\"\"\"");
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\\"\\\"\\\"hi!\\\"\\\"\\\"" + "'", str7, "\\\"\\\"\\\"hi!\\\"\\\"\\\"");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\\\12" + "'", str18, "\\\\12");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"hi!\"" + "'", str21, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\12" + "'", str25, "\\12");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\\\"i\\\"" + "'", str31, "\\\"i\\\"");
        org.junit.Assert.assertNull(codeGenerator32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"\"0\"Context\"\"" + "'", str35, "\"\"\"0\"Context\"\"");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\"_tset_tset\"\\\"\\\"\\\"hi!\\\"\\\"\\\"\"\"Context" + "'", str42, "\"_tset_tset\"\\\"\\\"\\\"hi!\\\"\\\"\\\"\"\"Context");
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__\"i\"", true);
        java.lang.String str9 = python2Target0.getLanguage();
        java.util.Set<java.lang.String> strSet10 = python2Target0.badWords;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target0.getElementListName("__\"\\\"hi!\\\"\\\"Contex\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\\\"i\"" + "'", str8, "\"_\\\"i\"");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__\"i\"", true);
        java.lang.String str9 = python2Target0.getLanguage();
        java.lang.String str11 = python2Target0.getTargetStringLiteralFromString("#");
        java.lang.String str12 = python2Target0.language;
        boolean boolean13 = python2Target0.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\\\"i\"" + "'", str8, "\"_\\\"i\"");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"#\"" + "'", str11, "\"#\"");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str6 = python2Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet7 = python2Target0.badWords;
        java.lang.String str9 = python2Target0.getTargetStringLiteralFromString("\"\"\\12Context\"Context\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python2Target0.gen = codeGenerator10;
        java.util.Set<java.lang.String> strSet12 = python2Target0.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup13 = python2Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"\"\\12Context\"Context\"\"" + "'", str9, "\"\"\"\\12Context\"Context\"\"");
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python2Target0.gen = codeGenerator3;
        python2Target0.addBadWords();
        java.lang.String[] strArray6 = python2Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator7);
        java.lang.String str10 = python2Target8.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str11 = python2Target8.getVersion();
        java.lang.String str14 = python2Target8.getTargetStringLiteralFromString("", true);
        java.util.Set<java.lang.String> strSet15 = python2Target8.getBadWords();
        python2Target0.badWords = strSet15;
        boolean boolean17 = python2Target0.templatesExist();
        boolean boolean18 = python2Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet19 = python2Target0.badWords;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"hi!\"\"Context" + "'", str10, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        java.lang.String[] strArray7 = python2Target1.targetCharValueEscape;
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\"_\\\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python2Target1.gen = codeGenerator10;
        org.antlr.v4.tool.Grammar grammar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getTokenTypeAsTargetLabel(grammar12, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\"_\\\"i\"" + "'", str9, "_tset\"_\\\"i\"");
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("\"i\"");
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python2Target1.gen = codeGenerator8;
        java.lang.String str11 = python2Target1.getListLabel("\"\"\\12\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target1.getCodeGenerator();
        boolean boolean13 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String str17 = python2Target15.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str18 = python2Target15.getVersion();
        java.lang.String str20 = python2Target15.getTargetStringLiteralFromString("\\\"i");
        java.lang.String str22 = python2Target15.getAltLabelContextStructName("\\12");
        boolean boolean23 = python2Target15.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup24 = python2Target15.templates;
        python2Target1.templates = sTGroup24;
        java.lang.String str27 = python2Target1.getTargetStringLiteralFromString("\"_tset_tset_tset\" \"\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"i\"" + "'", str5, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"\\12\"\"" + "'", str11, "\"\"\\12\"\"");
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"hi!\"\"Context" + "'", str17, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\\\\\\\"i\"" + "'", str20, "\"\\\\\\\"i\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\\12Context" + "'", str22, "\\12Context");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(sTGroup24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\\\"_tset_tset_tset\\\" \\\"\\\"\"" + "'", str27, "\"\\\"_tset_tset_tset\\\" \\\"\\\"\"");
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        python2Target1.addBadWords();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\12Context\"");
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) (byte) 0);
        python2Target1.language = "d";
        java.lang.String str16 = python2Target1.getListLabel("\"\\0\"");
        java.lang.String str18 = python2Target1.getImplicitRuleLabel("tset");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\12Context\"Context" + "'", str10, "\"\\12Context\"Context");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\0\"" + "'", str16, "\"\\0\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset" + "'", str18, "_tset");
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_tset\"\\\\\\\"i\"", true);
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python2Target1.genRecognizerHeaderFile(grammar9, sT10, "\"\"\\12\"\"");
        java.lang.String str14 = python2Target1.getListLabel("@");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "_ython2Contex", false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"tset\\\"\\\\\\\"i\"" + "'", str8, "\"tset\\\"\\\\\\\"i\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ython2Conte" + "'", str18, "ython2Conte");
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
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
        java.lang.String str29 = python2Target0.encodeIntAsCharEscape((int) '#');
        int int30 = python2Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.stringtemplate.v4.ST sT32 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target0.genFile(grammar31, sT32, "\"\"\\\"0\\\"Context\"Context\"");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#" + "'", str29, "#");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target0.gen;
        java.lang.String str4 = python2Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.getCodeGenerator();
        java.lang.String str8 = python2Target0.getTargetStringLiteralFromString("_\"i\"", false);
        boolean boolean9 = python2Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str13 = python2Target11.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        python2Target11.gen = codeGenerator14;
        python2Target11.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target18.loadTemplates();
        python2Target11.templates = sTGroup19;
        java.lang.String str22 = python2Target11.getTargetStringLiteralFromString("\\12Context");
        boolean boolean23 = python2Target11.wantsBaseVisitor();
        java.lang.String str25 = python2Target11.encodeIntAsCharEscape(100);
        java.lang.String[] strArray26 = python2Target11.targetCharValueEscape;
        int int27 = python2Target11.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target29 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str31 = python2Target29.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray32 = python2Target29.targetCharValueEscape;
        java.lang.String[] strArray33 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target29.targetCharValueEscape = strArray33;
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target36 = new org.antlr.v4.codegen.target.Python2Target();
        int int37 = python2Target36.getInlineTestSetWordSize();
        java.lang.String[] strArray41 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        python2Target36.badWords = strSet42;
        org.stringtemplate.v4.STGroup sTGroup45 = null;
        python2Target36.templates = sTGroup45;
        org.antlr.v4.codegen.CodeGenerator codeGenerator47 = null;
        python2Target36.gen = codeGenerator47;
        java.util.Set<java.lang.String> strSet49 = python2Target36.getBadWords();
        java.lang.String str50 = python2Target36.getVersion();
        org.antlr.v4.tool.Grammar grammar51 = null;
        int[] intArray52 = new int[] {};
        java.lang.String[] strArray53 = python2Target36.getTokenTypesAsTargetLabels(grammar51, intArray52);
        java.lang.String[] strArray54 = python2Target29.getTokenTypesAsTargetLabels(grammar35, intArray52);
        java.lang.String[] strArray55 = python2Target11.getTokenTypesAsTargetLabels(grammar28, intArray52);
        java.lang.String[] strArray56 = python2Target0.getTokenTypesAsTargetLabels(grammar10, intArray52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"i\"" + "'", str8, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\0" + "'", str13, "\\0");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\12Context\"" + "'", str22, "\"\\12Context\"");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"hi!\"" + "'", str31, "\"hi!\"");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 64 + "'", int37 == 64);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "4.5.2.1" + "'", str50, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[]");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray56);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
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
        python2Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        java.lang.String str25 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator22, "\"\"0\"Context\"", true);
        int int26 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python2Target1.getRuleFunctionContextStructName(ruleFunction27);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\\\"0\\\"Context\"" + "'", str25, "\"\\\"0\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        java.lang.String[] strArray3 = python2Target1.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target python2Target4 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str6 = python2Target4.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target4.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target4.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target16.loadTemplates();
        python2Target4.templates = sTGroup17;
        java.lang.String str19 = python2Target4.language;
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target4.templates;
        python2Target1.templates = sTGroup20;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python2Target1.gen;
        java.util.Set<java.lang.String> strSet23 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python2Target1.getCodeGenerator();
        java.lang.String str26 = python2Target1.getListLabel("\"_tset_tset_tset\" \"\"");
        org.stringtemplate.v4.STGroup sTGroup27 = python2Target1.templates;
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"" + "'", str6, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(codeGenerator24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"_tset_tset_tset\" \"\"" + "'", str26, "\"_tset_tset_tset\" \"\"");
        org.junit.Assert.assertNotNull(sTGroup27);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
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
        java.lang.String[] strArray15 = python2Target0.targetCharValueEscape;
        boolean boolean16 = python2Target0.templatesExist();
        java.lang.String str17 = python2Target0.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target0.getElementName("setyth");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\12Context\"" + "'", str11, "\"\\12Context\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target0.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str5 = python2Target0.getLanguage();
        boolean boolean6 = python2Target0.wantsBaseVisitor();
        python2Target0.addBadWords();
        python2Target0.addBadWords();
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str11 = python2Target9.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        python2Target9.gen = codeGenerator12;
        python2Target9.addBadWords();
        java.lang.String[] strArray15 = python2Target9.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.lang.String str19 = python2Target17.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str20 = python2Target17.getVersion();
        java.lang.String str23 = python2Target17.getTargetStringLiteralFromString("", true);
        java.util.Set<java.lang.String> strSet24 = python2Target17.getBadWords();
        python2Target9.badWords = strSet24;
        java.util.Set<java.lang.String> strSet26 = python2Target9.getBadWords();
        python2Target0.badWords = strSet26;
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = python2Target0.getCodeGenerator();
        java.lang.String str29 = python2Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator30);
        java.lang.String str33 = python2Target31.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str35 = python2Target31.getImplicitRuleLabel("\"i\"");
        boolean boolean36 = python2Target31.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet37 = python2Target31.badWords;
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str40 = python2Target38.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        java.lang.String str44 = python2Target38.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator41, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        java.lang.String str48 = python2Target38.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator45, "", true);
        java.util.Set<java.lang.String> strSet49 = python2Target38.getBadWords();
        python2Target31.badWords = strSet49;
        org.antlr.v4.codegen.target.Python2Target python2Target51 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str53 = python2Target51.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target54 = new org.antlr.v4.codegen.target.Python2Target();
        int int55 = python2Target54.getInlineTestSetWordSize();
        java.lang.String[] strArray59 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        python2Target54.badWords = strSet60;
        python2Target51.badWords = strSet60;
        python2Target31.badWords = strSet60;
        java.lang.String str65 = python2Target31.language;
        org.antlr.v4.tool.Grammar grammar66 = null;
        org.stringtemplate.v4.ST sT67 = null;
        python2Target31.genRecognizerHeaderFile(grammar66, sT67, "@");
        org.antlr.v4.codegen.target.Python2Target python2Target70 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str72 = python2Target70.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator73 = null;
        java.lang.String str76 = python2Target70.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator73, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator77 = null;
        java.lang.String str80 = python2Target70.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator77, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator81 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target82 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator81);
        org.stringtemplate.v4.STGroup sTGroup83 = python2Target82.loadTemplates();
        python2Target70.templates = sTGroup83;
        java.lang.String str85 = python2Target70.language;
        org.stringtemplate.v4.STGroup sTGroup86 = python2Target70.templates;
        python2Target31.templates = sTGroup86;
        python2Target0.templates = sTGroup86;
        org.antlr.v4.tool.Rule rule89 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str90 = python2Target0.getRuleFunctionContextStructName(rule89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"hi!\"\"" + "'", str4, "\"\"hi!\"\"");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\0" + "'", str11, "\\0");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"hi!\"\"Context" + "'", str19, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\"" + "'", str23, "\"\"");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(codeGenerator28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\"hi!\"\"Context" + "'", str33, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "_\"i\"" + "'", str35, "_\"i\"");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"hi!\"" + "'", str40, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\"\"" + "'", str44, "\"\"");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\"\"" + "'", str48, "\"\"");
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\\0" + "'", str53, "\\0");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 64 + "'", int55 == 64);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Python2" + "'", str65, "Python2");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "\"hi!\"" + "'", str72, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\"\"" + "'", str76, "\"\"");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\"\"" + "'", str80, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup83);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNotNull(sTGroup86);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
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
        java.lang.String str25 = python2Target1.getTargetStringLiteralFromString("");
        int int26 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str28 = python2Target1.getImplicitSetLabel("\"\\\"iContextContext\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\\"i" + "'", str13, "\\\"i");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4.5.2.1" + "'", str23, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\"" + "'", str25, "\"\"");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "_tset\"\\\"iContextContext\"" + "'", str28, "_tset\"\\\"iContextContext\"");
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        python2Target0.gen = codeGenerator12;
        java.lang.String str15 = python2Target0.encodeIntAsCharEscape(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target0.getImplicitSetLabel("\"\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"Contex\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\1" + "'", str15, "\\1");
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        python2Target1.language = "\"\"hi!\"\"Context";
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"_\\\\0\"", true);
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        python2Target1.genRecognizerHeaderFile(grammar13, sT14, "_tset\\\"\\\\\\\\\\\\\\\"i\\\"");
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target();
        int int18 = python2Target17.getInlineTestSetWordSize();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        python2Target17.badWords = strSet23;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str28 = python2Target26.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target29 = new org.antlr.v4.codegen.target.Python2Target();
        int int30 = python2Target29.getInlineTestSetWordSize();
        java.lang.String[] strArray34 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        python2Target29.badWords = strSet35;
        python2Target26.badWords = strSet35;
        python2Target17.badWords = strSet35;
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = python2Target17.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator41);
        java.lang.String str44 = python2Target42.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str45 = python2Target42.getVersion();
        java.lang.String str47 = python2Target42.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup48 = python2Target42.templates;
        python2Target17.templates = sTGroup48;
        python2Target1.templates = sTGroup48;
        org.antlr.v4.codegen.CodeGenerator codeGenerator51 = null;
        python2Target1.gen = codeGenerator51;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"_\\\\\\\\0\\\"\"" + "'", str12, "\"\\\"_\\\\\\\\0\\\"\"");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\\0" + "'", str28, "\\0");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(codeGenerator40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\"\"hi!\"\"Context" + "'", str44, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "4.5.2.1" + "'", str45, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"\\\\\\\"i\"" + "'", str47, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(sTGroup48);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("\\12");
        python2Target1.addBadWords();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6, "\"\\\\\\\"i\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\12Context" + "'", str8, "\\12Context");
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target0.getCodeGenerator();
        boolean boolean19 = python2Target0.templatesExist();
        boolean boolean20 = python2Target0.wantsBaseVisitor();
        int int21 = python2Target0.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet22 = python2Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python2Target0.gen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python2Target0.getImplicitRuleLabel("\"\"\\\"\\\"hi!\\\"\\\"Context\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\" \"" + "'", str16, "\" \"");
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(sTGroup23);
        org.junit.Assert.assertNull(codeGenerator24);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        python2Target0.language = "";
        java.lang.String str13 = python2Target0.getVersion();
        python2Target0.language = "\"\"\\\"#\\\"\"\"";
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str18 = python2Target16.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target();
        int int20 = python2Target19.getInlineTestSetWordSize();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        python2Target19.badWords = strSet25;
        python2Target16.badWords = strSet25;
        org.antlr.v4.codegen.target.Python2Target python2Target29 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str31 = python2Target29.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        python2Target29.gen = codeGenerator32;
        java.lang.String[] strArray39 = new java.lang.String[] { "\\\"i", "\"\"hi!\"\"Context", "\\12", "\\\"i", "4.5.2.1" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray39;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray39;
        python2Target29.targetCharValueEscape = strArray39;
        python2Target16.targetCharValueEscape = strArray39;
        java.lang.String[] strArray44 = python2Target16.targetCharValueEscape;
        python2Target0.targetCharValueEscape = strArray44;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = python2Target0.getImplicitSetLabel("tsetytho");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\0" + "'", str18, "\\0");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\\0" + "'", str31, "\\0");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray44);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
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
        java.lang.String str37 = python2Target1.getTargetStringLiteralFromString("\"\"i\"\"");
        java.lang.String str39 = python2Target1.getTargetStringLiteralFromString("\"_tset\"\\\"\\\"\\\"hi!\\\"\\\"\\\"\"\"");
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"\\\"\\\"i\\\"\\\"\"" + "'", str37, "\"\\\"\\\"i\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"\\\"_tset\\\"\\\\\\\"\\\\\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"\\\\\\\"\\\"\\\"\"" + "'", str39, "\"\\\"_tset\\\"\\\\\\\"\\\\\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"\\\\\\\"\\\"\\\"\"");
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        java.lang.String str10 = python2Target0.getTargetStringLiteralFromString("\\\"i");
        java.lang.String str11 = python2Target0.getLanguage();
        java.lang.String str12 = python2Target0.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str15 = python2Target13.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python2Target13.gen = codeGenerator16;
        java.lang.String str19 = python2Target13.getTargetStringLiteralFromString("\\\"i\\\"");
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target();
        int int21 = python2Target20.getInlineTestSetWordSize();
        java.lang.String str24 = python2Target20.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str25 = python2Target20.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str28 = python2Target26.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        java.lang.String str32 = python2Target26.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator29, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        java.lang.String str36 = python2Target26.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator33, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator37);
        org.stringtemplate.v4.STGroup sTGroup39 = python2Target38.loadTemplates();
        python2Target26.templates = sTGroup39;
        python2Target20.templates = sTGroup39;
        java.util.Set<java.lang.String> strSet42 = python2Target20.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = python2Target20.getCodeGenerator();
        java.util.Set<java.lang.String> strSet44 = python2Target20.badWords;
        python2Target13.badWords = strSet44;
        python2Target0.badWords = strSet44;
        org.antlr.v4.tool.Rule rule47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = python2Target0.getRuleFunctionContextStructName(rule47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"i\"" + "'", str10, "\"\\\"i\"");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\0" + "'", str15, "\\0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\\\"i\\\"\"" + "'", str19, "\"\\\"i\\\"\"");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"hi!\"\"" + "'", str24, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"hi!\"" + "'", str28, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"" + "'", str32, "\"\"");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"\"" + "'", str36, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup39);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNull(codeGenerator43);
        org.junit.Assert.assertNotNull(strSet44);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_\\1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_\\1" + "'", str1, "_\\1");
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        int int1 = python2Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        python2Target0.badWords = strSet6;
        int int9 = python2Target0.getSerializedATNSegmentLimit();
        java.lang.String str12 = python2Target0.getTargetStringLiteralFromString("_\"i\"", false);
        int int13 = python2Target0.getSerializedATNSegmentLimit();
        python2Target0.language = "tset";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"i\"" + "'", str12, "_\"i\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        python2Target0.language = "hi!";
        java.lang.String str7 = python2Target0.getTargetStringLiteralFromString("i", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python2Target0.gen = codeGenerator8;
        boolean boolean10 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "\"\\12\"Context", true);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target0.getRuleFunctionContextStructName(ruleFunction17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"i\"" + "'", str7, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertNull(sTGroup12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"12\\\"Contex\"" + "'", str16, "\"12\\\"Contex\"");
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.templates;
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.lang.String str12 = python2Target10.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str14 = python2Target10.getImplicitRuleLabel("\"i\"");
        java.lang.String str15 = python2Target10.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python2Target10.gen = codeGenerator16;
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target10.templates;
        python2Target1.templates = sTGroup18;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        python2Target1.gen = codeGenerator20;
        java.lang.String str22 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String str26 = python2Target24.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str27 = python2Target24.getVersion();
        java.lang.String str29 = python2Target24.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup30 = python2Target24.templates;
        python2Target1.templates = sTGroup30;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = python2Target1.getCodeGenerator();
        java.lang.String str33 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup34 = python2Target1.loadTemplates();
        python2Target1.addBadWords();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"hi!\"\"Context" + "'", str12, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_\"i\"" + "'", str14, "_\"i\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Python2" + "'", str22, "Python2");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"hi!\"\"Context" + "'", str26, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "4.5.2.1" + "'", str27, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\\\\\\"i\"" + "'", str29, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(sTGroup30);
        org.junit.Assert.assertNull(codeGenerator32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4.5.2.1" + "'", str33, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup34);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        java.lang.String[] strArray3 = python2Target0.targetCharValueEscape;
        boolean boolean4 = python2Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target0.templates;
        boolean boolean6 = python2Target0.templatesExist();
        boolean boolean7 = python2Target0.wantsBaseVisitor();
        java.lang.String str8 = python2Target0.getVersion();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target0.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
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
        python2Target0.addBadWords();
        int int16 = python2Target0.getInlineTestSetWordSize();
        boolean boolean17 = python2Target0.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0" + "'", str2, "\\0");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\12Context\"" + "'", str11, "\"\\12Context\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python2Target0.gen = codeGenerator16;
        java.util.Set<java.lang.String> strSet18 = python2Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        python2Target0.gen = codeGenerator19;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\\"i");
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.templates;
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.lang.String str12 = python2Target10.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str14 = python2Target10.getImplicitRuleLabel("\"i\"");
        java.lang.String str15 = python2Target10.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python2Target10.gen = codeGenerator16;
        org.stringtemplate.v4.STGroup sTGroup18 = python2Target10.templates;
        python2Target1.templates = sTGroup18;
        python2Target1.language = "\"\"\\12\"\"Context";
        int int22 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\\\\"i\"" + "'", str6, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"hi!\"\"Context" + "'", str12, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_\"i\"" + "'", str14, "_\"i\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        org.junit.Assert.assertNotNull(sTGroup23);
        org.junit.Assert.assertNull(codeGenerator24);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        java.lang.String[] strArray3 = python2Target1.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target python2Target4 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str6 = python2Target4.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target4.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python2Target4.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target16.loadTemplates();
        python2Target4.templates = sTGroup17;
        java.lang.String str19 = python2Target4.language;
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target4.templates;
        python2Target1.templates = sTGroup20;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python2Target1.gen;
        boolean boolean23 = python2Target1.templatesExist();
        java.lang.String str24 = python2Target1.language;
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"" + "'", str6, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", true);
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.lang.String str10 = python2Target1.getLanguage();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\"12\\\"\"");
        boolean boolean13 = python2Target1.wantsBaseVisitor();
        java.lang.String str14 = python2Target1.language;
        java.lang.String str16 = python2Target1.getAltLabelContextStructName("\"\"\\\"\\\"0\\\"Context\\\"Context\"\"");
        boolean boolean17 = python2Target1.templatesExist();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"hi!\"\"Context" + "'", str3, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\\\\\"12\\\\\\\"\\\"\"" + "'", str12, "\"\\\"\\\\\\\"12\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"\\\"\\\"0\\\"Context\\\"Context\"\"Context" + "'", str16, "\"\"\\\"\\\"0\\\"Context\\\"Context\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python2Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target();
        int int2 = python2Target1.getInlineTestSetWordSize();
        int int3 = python2Target1.getInlineTestSetWordSize();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.gen;
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator5, "\"\"i\"\"", locale7);
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target();
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target();
        int int11 = python2Target10.getInlineTestSetWordSize();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        python2Target10.badWords = strSet16;
        python2Target9.badWords = strSet16;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        java.lang.String str23 = python2Target9.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator20, "\\12", false);
        java.util.Locale locale25 = null;
        java.lang.String str26 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator20, "\"_\\\\0\"", locale25);
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target();
        int int28 = python2Target27.getInlineTestSetWordSize();
        java.lang.String str31 = python2Target27.getTargetStringLiteralFromString("\"hi!\"", true);
        java.lang.String str32 = python2Target27.getVersion();
        org.antlr.v4.codegen.target.Python2Target python2Target33 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str35 = python2Target33.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        java.lang.String str39 = python2Target33.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator36, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        java.lang.String str43 = python2Target33.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator40, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target45 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator44);
        org.stringtemplate.v4.STGroup sTGroup46 = python2Target45.loadTemplates();
        python2Target33.templates = sTGroup46;
        python2Target27.templates = sTGroup46;
        int int49 = python2Target27.getInlineTestSetWordSize();
        java.lang.String str51 = python2Target27.getImplicitRuleLabel("\"\\\\\\\"i\"");
        java.lang.String str53 = python2Target27.getListLabel("\"\\\"0\\\"Context\"Context");
        python2Target27.language = "\"\"0\"Context\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator56 = python2Target27.gen;
        java.util.Locale locale58 = null;
        java.lang.String str59 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator56, "\"_\"\\\"\\\\\\\"i\\\"\"\"", locale58);
        org.antlr.v4.codegen.CodeGenerator codeGenerator60 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target61 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator60);
        java.lang.String str63 = python2Target61.getAltLabelContextStructName("\"\"hi!\"\"");
        java.lang.String str64 = python2Target61.getVersion();
        java.lang.String str66 = python2Target61.getTargetStringLiteralFromString("\\\"i");
        java.lang.String[] strArray67 = python2Target61.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target python2Target68 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str70 = python2Target68.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.target.Python2Target python2Target71 = new org.antlr.v4.codegen.target.Python2Target();
        int int72 = python2Target71.getInlineTestSetWordSize();
        java.lang.String[] strArray76 = new java.lang.String[] { "", "", "\"\"hi!\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet77 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet77, strArray76);
        python2Target71.badWords = strSet77;
        python2Target68.badWords = strSet77;
        java.lang.String[] strArray81 = python2Target68.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator82 = null;
        java.lang.String str85 = python2Target68.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator82, "\\0", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator86 = null;
        python2Target68.gen = codeGenerator86;
        java.lang.String str88 = python2Target68.getLanguage();
        java.util.Set<java.lang.String> strSet89 = python2Target68.badWords;
        python2Target61.badWords = strSet89;
        java.util.Locale locale92 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str93 = pythonStringRenderer0.toString((java.lang.Object) python2Target61, "_tset_\\1", locale92);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"i\"\"" + "'", str8, "\"\"i\"\"");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1" + "'", str23, "1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"_\\\\0\"" + "'", str26, "\"_\\\\0\"");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 64 + "'", int28 == 64);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\"hi!\"\"" + "'", str31, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "4.5.2.1" + "'", str32, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"hi!\"" + "'", str35, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"\"" + "'", str39, "\"\"");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"\"" + "'", str43, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 64 + "'", int49 == 64);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "_\"\\\\\\\"i\"" + "'", str51, "_\"\\\\\\\"i\"");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\"\\\"0\\\"Context\"Context" + "'", str53, "\"\\\"0\\\"Context\"Context");
        org.junit.Assert.assertNull(codeGenerator56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\"_\"\\\"\\\\\\\"i\\\"\"\"" + "'", str59, "\"_\"\\\"\\\\\\\"i\\\"\"\"");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\"\"hi!\"\"Context" + "'", str63, "\"\"hi!\"\"Context");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "4.5.2.1" + "'", str64, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\"\\\\\\\"i\"" + "'", str66, "\"\\\\\\\"i\"");
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\\0" + "'", str70, "\\0");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 64 + "'", int72 == 64);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "\"\"" + "'", str85, "\"\"");
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertNotNull(strSet89);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray4;
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray4;
        org.junit.Assert.assertNotNull(strArray4);
    }
}

