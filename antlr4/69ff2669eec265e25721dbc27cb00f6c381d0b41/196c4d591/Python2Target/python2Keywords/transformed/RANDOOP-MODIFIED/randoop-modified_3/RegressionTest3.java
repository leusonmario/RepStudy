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
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        java.lang.String[] strArray4 = python2Target1.targetCharValueEscape;
        boolean boolean5 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator20);
        java.lang.String str23 = python2Target21.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.stringtemplate.v4.ST sT25 = null;
        python2Target21.genRecognizerHeaderFile(grammar24, sT25, "_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target29 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator28);
        java.util.Set<java.lang.String> strSet30 = python2Target29.badWords;
        java.lang.String str32 = python2Target29.encodeIntAsCharEscape(64);
        java.lang.String str33 = python2Target29.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator34);
        java.lang.String[] strArray36 = python2Target35.targetCharValueEscape;
        java.lang.String str37 = python2Target35.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup38 = python2Target35.getTemplates();
        python2Target29.templates = sTGroup38;
        python2Target21.templates = sTGroup38;
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.stringtemplate.v4.ST sT42 = null;
        python2Target21.genRecognizerHeaderFile(grammar41, sT42, "\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        python2Target21.gen = codeGenerator45;
        java.lang.String[] strArray73 = new java.lang.String[] { "_tset\\\\1", "tsetContex", "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"", "\"\\\"hi!\\\"\"", "__tsetContext", "_\"\\\"hi!\\\"\"", "\"Hi!Context\"", "_\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"", "\"tsetContex\"", "\"\\\"\\\"\"", "_tset\\\\1", "4.5.2.1", "\"tsetContex\"", "_tset", "_tsetContext", "\"_tsethi!\"", "4.5.2.1", "\"hi!\"", "d", "_tsetContext", "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"", "@", "\"\\\"\\\"\"", "\"\\\"\\\"\"", "_tsetContext", "_@" };
        java.util.LinkedHashSet<java.lang.String> strSet74 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet74, strArray73);
        python2Target21.badWords = strSet74;
        org.antlr.v4.codegen.CodeGenerator codeGenerator77 = null;
        java.lang.String str80 = python2Target21.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator77, "\"\\\"\\\"\"", false);
        java.util.Set<java.lang.String> strSet81 = python2Target21.badWords;
        org.stringtemplate.v4.STGroup sTGroup82 = python2Target21.loadTemplates();
        python2Target1.templates = sTGroup82;
        org.antlr.v4.codegen.CodeGenerator codeGenerator84 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target85 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator84);
        java.util.Set<java.lang.String> strSet86 = python2Target85.badWords;
        java.lang.String str88 = python2Target85.encodeIntAsCharEscape(64);
        java.lang.String str89 = python2Target85.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator90 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target91 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator90);
        java.lang.String[] strArray92 = python2Target91.targetCharValueEscape;
        java.lang.String str93 = python2Target91.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup94 = python2Target91.getTemplates();
        python2Target85.templates = sTGroup94;
        org.stringtemplate.v4.STGroup sTGroup96 = python2Target85.templates;
        java.util.Set<java.lang.String> strSet97 = python2Target85.badWords;
        java.util.Set<java.lang.String> strSet98 = python2Target85.getBadWords();
        python2Target1.badWords = strSet98;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertNull(codeGenerator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_tset" + "'", str23, "_tset");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "@" + "'", str32, "@");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Python2" + "'", str33, "Python2");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Python2" + "'", str37, "Python2");
        org.junit.Assert.assertNotNull(sTGroup38);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\\\"\\\"" + "'", str80, "\\\"\\\"");
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNotNull(sTGroup82);
        org.junit.Assert.assertNotNull(strSet86);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "@" + "'", str88, "@");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Python2" + "'", str89, "Python2");
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Python2" + "'", str93, "Python2");
        org.junit.Assert.assertNotNull(sTGroup94);
        org.junit.Assert.assertNotNull(sTGroup96);
        org.junit.Assert.assertNotNull(strSet97);
        org.junit.Assert.assertNotNull(strSet98);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("_tset\\1", false);
        java.util.Set<java.lang.String> strSet6 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.gen;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tset\\\\1" + "'", str5, "_tset\\\\1");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"tset_tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str10, "\"tset_tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        python2Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
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
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        boolean boolean17 = python2Target1.templatesExist();
        boolean boolean18 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar19, sT20, "\"setConte\"");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        java.util.Set<java.lang.String> strSet14 = python2Target13.badWords;
        java.lang.String str16 = python2Target13.encodeIntAsCharEscape(64);
        java.lang.String str18 = python2Target13.getAltLabelContextStructName("Python2");
        boolean boolean19 = python2Target13.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator21);
        java.lang.String[] strArray23 = python2Target22.targetCharValueEscape;
        java.lang.String str24 = python2Target22.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup25 = python2Target22.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator26);
        java.util.Set<java.lang.String> strSet28 = python2Target27.badWords;
        python2Target22.badWords = strSet28;
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target32 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator31);
        java.util.Set<java.lang.String> strSet33 = python2Target32.badWords;
        java.lang.String str35 = python2Target32.encodeIntAsCharEscape(64);
        java.lang.String str36 = python2Target32.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator37);
        java.lang.String[] strArray39 = python2Target38.targetCharValueEscape;
        java.lang.String str40 = python2Target38.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup41 = python2Target38.getTemplates();
        python2Target32.templates = sTGroup41;
        org.stringtemplate.v4.STGroup sTGroup43 = python2Target32.templates;
        java.util.Set<java.lang.String> strSet44 = python2Target32.badWords;
        java.util.Set<java.lang.String> strSet45 = python2Target32.getBadWords();
        boolean boolean46 = python2Target32.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet47 = python2Target32.getBadWords();
        org.antlr.v4.tool.Grammar grammar48 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target50 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator49);
        java.lang.String[] strArray51 = python2Target50.targetCharValueEscape;
        java.lang.String str54 = python2Target50.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar55 = null;
        int[] intArray56 = new int[] {};
        java.lang.String[] strArray57 = python2Target50.getTokenTypesAsTargetLabels(grammar55, intArray56);
        java.lang.String[] strArray58 = python2Target32.getTokenTypesAsTargetLabels(grammar48, intArray56);
        java.lang.String[] strArray59 = python2Target22.getTokenTypesAsTargetLabels(grammar30, intArray56);
        java.lang.String[] strArray60 = python2Target13.getTokenTypesAsTargetLabels(grammar20, intArray56);
        org.antlr.v4.tool.Grammar grammar61 = null;
        org.stringtemplate.v4.ST sT62 = null;
        python2Target13.genRecognizerHeaderFile(grammar61, sT62, "\"tset_tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.util.Locale locale66 = null;
        java.lang.String str67 = pythonStringRenderer0.toString((java.lang.Object) sT62, "__\"_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"Context", locale66);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"4.5.2.1\"" + "'", str11, "\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "@" + "'", str16, "@");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2Context" + "'", str18, "Python2Context");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(sTGroup25);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "@" + "'", str35, "@");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Python2" + "'", str36, "Python2");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Python2" + "'", str40, "Python2");
        org.junit.Assert.assertNotNull(sTGroup41);
        org.junit.Assert.assertNotNull(sTGroup43);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "_tset\\\\1" + "'", str54, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[]");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "__\"_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"Context" + "'", str67, "__\"_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"Context");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        boolean boolean17 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet18 = python2Target1.getBadWords();
        java.lang.String str19 = python2Target1.language;
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target1.loadTemplates();
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.stringtemplate.v4.ST sT22 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar21, sT22, "\"\\\"_tset_tset_tsetContext\\\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Python2" + "'", str16, "Python2");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
        org.junit.Assert.assertNotNull(sTGroup20);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target1.genRecognizerHeaderFile(grammar6, sT7, "_\"#\"");
        java.lang.String str10 = python2Target1.language;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("Python2");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        boolean boolean11 = python2Target9.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target9.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target9.getTemplates();
        python2Target1.templates = sTGroup13;
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromString("\\12", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getElementListName("\"__tsetContextContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2Context" + "'", str6, "Python2Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\\12\"" + "'", str17, "\"\\\\12\"");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        java.lang.String[] strArray19 = python2Target18.targetCharValueEscape;
        java.lang.String str20 = python2Target18.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup21 = python2Target18.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target23 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator22);
        java.util.Set<java.lang.String> strSet24 = python2Target23.badWords;
        python2Target18.badWords = strSet24;
        java.lang.String[] strArray31 = new java.lang.String[] { "@", "\"_tset\"", "\"hi!\"", "_tset\\1", "_tset\\\\1" };
        python2Target18.targetCharValueEscape = strArray31;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray31;
        python2Target1.targetCharValueEscape = strArray31;
        org.antlr.v4.tool.Rule rule35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = python2Target1.getRuleFunctionContextStructName(rule35);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str16, "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Python2" + "'", str20, "Python2");
        org.junit.Assert.assertNotNull(sTGroup21);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST15);
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
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python2Target1.genRecognizerHeaderFile(grammar6, sT7, "_\"#\"");
        java.lang.String str10 = python2Target1.language;
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.loadTemplates();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("_tset\\\\1");
        java.lang.String str10 = python2Target1.getListLabel("\"tset_tsetContex\"");
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.loadTemplates();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset\\\\1" + "'", str8, "_tset_tset\\\\1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"tset_tsetContex\"" + "'", str10, "\"tset_tsetContex\"");
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        java.lang.String str9 = python2Target6.encodeIntAsCharEscape(64);
        java.lang.String str10 = python2Target6.getLanguage();
        int int11 = python2Target6.getInlineTestSetWordSize();
        java.lang.String str13 = python2Target6.getImplicitSetLabel("_tset\\\\1");
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str20 = python2Target16.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar21 = null;
        int[] intArray22 = new int[] {};
        java.lang.String[] strArray23 = python2Target16.getTokenTypesAsTargetLabels(grammar21, intArray22);
        java.lang.String[] strArray24 = python2Target6.getTokenTypesAsTargetLabels(grammar14, intArray22);
        java.lang.String[] strArray25 = python2Target1.getTokenTypesAsTargetLabels(grammar4, intArray22);
        python2Target1.addBadWords();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "@" + "'", str9, "@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_tset\\\\1" + "'", str13, "_tset_tset\\\\1");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_tset\\\\1" + "'", str20, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str14 = python2Target1.getImplicitSetLabel("\\1");
        java.util.Set<java.lang.String> strSet15 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target1.templates;
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target1.templates;
        int int18 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset\\1" + "'", str14, "_tset\\1");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        org.stringtemplate.v4.STGroup sTGroup21 = python2Target1.getTemplates();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset\"Hi!Context\"" + "'", str16, "_tset\"Hi!Context\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str19, "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNotNull(sTGroup21);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator21);
        java.lang.String[] strArray23 = python2Target22.targetCharValueEscape;
        java.lang.String str24 = python2Target22.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup25 = python2Target22.loadTemplates();
        int int26 = python2Target22.getInlineTestSetWordSize();
        java.lang.String str27 = python2Target22.language;
        java.util.Set<java.lang.String> strSet28 = python2Target22.badWords;
        python2Target1.badWords = strSet28;
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.stringtemplate.v4.ST sT31 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar30, sT31);
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
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(sTGroup25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Python2" + "'", str27, "Python2");
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        java.lang.String str24 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator26);
        java.util.Set<java.lang.String> strSet28 = python2Target27.badWords;
        java.lang.String str30 = python2Target27.encodeIntAsCharEscape(64);
        java.lang.String str31 = python2Target27.getLanguage();
        int int32 = python2Target27.getInlineTestSetWordSize();
        java.lang.String str34 = python2Target27.getImplicitSetLabel("_tset\\\\1");
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target37 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator36);
        java.lang.String[] strArray38 = python2Target37.targetCharValueEscape;
        java.lang.String str41 = python2Target37.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar42 = null;
        int[] intArray43 = new int[] {};
        java.lang.String[] strArray44 = python2Target37.getTokenTypesAsTargetLabels(grammar42, intArray43);
        java.lang.String[] strArray45 = python2Target27.getTokenTypesAsTargetLabels(grammar35, intArray43);
        java.lang.String[] strArray46 = python2Target1.getTokenTypesAsTargetLabels(grammar25, intArray43);
        java.util.Set<java.lang.String> strSet47 = python2Target1.badWords;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = python2Target1.getElementListName("_tset\\\"tset_tsetContex");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\0" + "'", str24, "\\0");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "@" + "'", str30, "@");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Python2" + "'", str31, "Python2");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 64 + "'", int32 == 64);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "_tset_tset\\\\1" + "'", str34, "_tset_tset\\\\1");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "_tset\\\\1" + "'", str41, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[]");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strSet47);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        boolean boolean12 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        java.lang.String[] strArray14 = python2Target13.targetCharValueEscape;
        java.lang.String str15 = python2Target13.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target13.getTemplates();
        java.lang.String str18 = python2Target13.getTargetStringLiteralFromString("_tset");
        java.lang.String str19 = python2Target13.getVersion();
        int int20 = python2Target13.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python2Target13.getCodeGenerator();
        python2Target13.addBadWords();
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.stringtemplate.v4.ST sT24 = null;
        python2Target13.genRecognizerHeaderFile(grammar23, sT24, "\"__tset\"");
        java.util.Set<java.lang.String> strSet27 = python2Target13.getBadWords();
        int int28 = python2Target13.getSerializedATNSegmentLimit();
        java.util.Locale locale30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = pythonStringRenderer0.toString((java.lang.Object) python2Target13, "\"d\"", locale30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"4.5.2.1\"" + "'", str11, "\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"_tset\"" + "'", str18, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4.5.2.1" + "'", str19, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset");
        java.lang.String str7 = python2Target1.getVersion();
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        python2Target1.gen = codeGenerator14;
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar16, sT17);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\\"\\\\\\\"hi!\\\\\\\"\\\"" + "'", str13, "\\\"\\\\\\\"hi!\\\\\\\"\\\"");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String[] strArray6 = python2Target1.targetCharValueEscape;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        boolean boolean16 = python2Target1.wantsBaseVisitor();
        java.lang.String str18 = python2Target1.encodeIntAsCharEscape((int) (byte) 0);
        java.util.Set<java.lang.String> strSet19 = python2Target1.badWords;
        java.lang.String str21 = python2Target1.getImplicitSetLabel("\"_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\0" + "'", str18, "\\0");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_tset\"_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"" + "'", str21, "_tset\"_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"");
        org.junit.Assert.assertNull(codeGenerator22);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str6 = python2Target1.getLanguage();
        python2Target1.addBadWords();
        java.lang.String str8 = python2Target1.language;
        python2Target1.language = "";
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
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target12.templates;
        java.util.Set<java.lang.String> strSet24 = python2Target12.badWords;
        java.util.Set<java.lang.String> strSet25 = python2Target12.getBadWords();
        boolean boolean26 = python2Target12.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet27 = python2Target12.getBadWords();
        python2Target1.badWords = strSet27;
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target30 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator29);
        java.util.Set<java.lang.String> strSet31 = python2Target30.badWords;
        java.lang.String str33 = python2Target30.encodeIntAsCharEscape(64);
        org.stringtemplate.v4.STGroup sTGroup34 = python2Target30.loadTemplates();
        java.lang.String str35 = python2Target30.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = python2Target30.getCodeGenerator();
        java.lang.String str38 = python2Target30.getListLabel("__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String[] strArray39 = python2Target30.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet40 = python2Target30.getBadWords();
        python2Target1.badWords = strSet40;
        java.util.Set<java.lang.String> strSet42 = python2Target1.badWords;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup43 = python2Target1.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "@" + "'", str15, "@");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Python2" + "'", str16, "Python2");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Python2" + "'", str20, "Python2");
        org.junit.Assert.assertNotNull(sTGroup21);
        org.junit.Assert.assertNotNull(sTGroup23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "@" + "'", str33, "@");
        org.junit.Assert.assertNotNull(sTGroup34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Python2" + "'", str35, "Python2");
        org.junit.Assert.assertNull(codeGenerator36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str38, "__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(strSet42);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean6 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.lang.String[] strArray11 = python2Target10.targetCharValueEscape;
        java.lang.String str14 = python2Target10.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str15 = python2Target10.getVersion();
        java.lang.String str17 = python2Target10.encodeIntAsCharEscape((int) (short) 1);
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
        java.util.Set<java.lang.String> strSet30 = python2Target19.getBadWords();
        python2Target10.badWords = strSet30;
        java.lang.String str33 = python2Target10.getAltLabelContextStructName("hi!");
        java.lang.String str34 = python2Target10.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target36 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator35);
        java.lang.String[] strArray37 = python2Target36.targetCharValueEscape;
        java.lang.String str38 = python2Target36.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup39 = python2Target36.getTemplates();
        python2Target10.templates = sTGroup39;
        python2Target1.templates = sTGroup39;
        org.antlr.v4.tool.ast.GrammarAST grammarAST42 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"4.5.2.1\"" + "'", str5, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\1" + "'", str17, "\\1");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "@" + "'", str22, "@");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Python2" + "'", str23, "Python2");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Python2" + "'", str27, "Python2");
        org.junit.Assert.assertNotNull(sTGroup28);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Hi!Context" + "'", str33, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "4.5.2.1" + "'", str34, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Python2" + "'", str38, "Python2");
        org.junit.Assert.assertNotNull(sTGroup39);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        java.lang.String str6 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getListLabel("__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet12 = python2Target1.badWords;
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        int int15 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str9, "__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\0" + "'", str14, "\\0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("d");
        java.lang.String[] strArray13 = new java.lang.String[] { "_tset\\1", "i", "__tset", "\"\\\"d\\\"\"", "_tsetContextContext" };
        python2Target1.targetCharValueEscape = strArray13;
        java.lang.String str15 = python2Target1.getVersion();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"d\"" + "'", str7, "\"d\"");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        java.lang.String str12 = python2Target1.language;
        java.lang.String str13 = python2Target1.language;
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.util.Set<java.lang.String> strSet17 = python2Target16.badWords;
        java.lang.String str20 = python2Target16.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str22 = python2Target16.getImplicitRuleLabel("@");
        python2Target16.language = "hi!";
        boolean boolean25 = python2Target16.supportsOverloadedMethods();
        boolean boolean26 = python2Target16.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator27);
        java.util.Set<java.lang.String> strSet29 = python2Target28.badWords;
        boolean boolean30 = python2Target28.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup31 = python2Target28.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup32 = python2Target28.getTemplates();
        java.util.Set<java.lang.String> strSet33 = python2Target28.badWords;
        python2Target16.badWords = strSet33;
        org.stringtemplate.v4.STGroup sTGroup35 = python2Target16.getTemplates();
        org.antlr.v4.tool.Grammar grammar36 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator37);
        java.util.Set<java.lang.String> strSet39 = python2Target38.badWords;
        java.lang.String str41 = python2Target38.encodeIntAsCharEscape(64);
        java.lang.String str42 = python2Target38.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target44 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator43);
        java.lang.String[] strArray45 = python2Target44.targetCharValueEscape;
        java.lang.String str46 = python2Target44.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup47 = python2Target44.getTemplates();
        python2Target38.templates = sTGroup47;
        org.stringtemplate.v4.STGroup sTGroup49 = python2Target38.templates;
        java.util.Set<java.lang.String> strSet50 = python2Target38.badWords;
        java.util.Set<java.lang.String> strSet51 = python2Target38.getBadWords();
        org.antlr.v4.tool.Grammar grammar52 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator53 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target54 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator53);
        java.util.Set<java.lang.String> strSet55 = python2Target54.badWords;
        java.lang.String str57 = python2Target54.encodeIntAsCharEscape(64);
        java.lang.String str58 = python2Target54.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator59 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target60 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator59);
        java.lang.String[] strArray61 = python2Target60.targetCharValueEscape;
        java.lang.String str62 = python2Target60.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup63 = python2Target60.getTemplates();
        python2Target54.templates = sTGroup63;
        org.stringtemplate.v4.STGroup sTGroup65 = python2Target54.templates;
        java.util.Set<java.lang.String> strSet66 = python2Target54.badWords;
        java.util.Set<java.lang.String> strSet67 = python2Target54.getBadWords();
        boolean boolean68 = python2Target54.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet69 = python2Target54.getBadWords();
        org.antlr.v4.tool.Grammar grammar70 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator71 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target72 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator71);
        java.lang.String[] strArray73 = python2Target72.targetCharValueEscape;
        java.lang.String str76 = python2Target72.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar77 = null;
        int[] intArray78 = new int[] {};
        java.lang.String[] strArray79 = python2Target72.getTokenTypesAsTargetLabels(grammar77, intArray78);
        java.lang.String[] strArray80 = python2Target54.getTokenTypesAsTargetLabels(grammar70, intArray78);
        java.lang.String[] strArray81 = python2Target38.getTokenTypesAsTargetLabels(grammar52, intArray78);
        java.lang.String[] strArray82 = python2Target16.getTokenTypesAsTargetLabels(grammar36, intArray78);
        java.lang.String[] strArray83 = python2Target1.getTokenTypesAsTargetLabels(grammar14, intArray78);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python2" + "'", str12, "Python2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "_@" + "'", str22, "_@");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(sTGroup31);
        org.junit.Assert.assertNotNull(sTGroup32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(sTGroup35);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "@" + "'", str41, "@");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Python2" + "'", str42, "Python2");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Python2" + "'", str46, "Python2");
        org.junit.Assert.assertNotNull(sTGroup47);
        org.junit.Assert.assertNotNull(sTGroup49);
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "@" + "'", str57, "@");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Python2" + "'", str58, "Python2");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Python2" + "'", str62, "Python2");
        org.junit.Assert.assertNotNull(sTGroup63);
        org.junit.Assert.assertNotNull(sTGroup65);
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "_tset\\\\1" + "'", str76, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[]");
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(strArray83);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        java.util.Set<java.lang.String> strSet26 = python2Target1.badWords;
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
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\" \"Context");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" \"Context" + "'", str1, "\" \"Context");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getLanguage();
        python2Target1.addBadWords();
        java.util.Set<java.lang.String> strSet10 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        java.util.Set<java.lang.String> strSet13 = python2Target12.badWords;
        java.lang.String str15 = python2Target12.encodeIntAsCharEscape(64);
        java.lang.String str17 = python2Target12.getTargetStringLiteralFromString("hi!");
        java.util.Set<java.lang.String> strSet18 = python2Target12.getBadWords();
        python2Target1.badWords = strSet18;
        boolean boolean20 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "@" + "'", str15, "@");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"hi!\"" + "'", str17, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        java.lang.String str20 = python2Target1.getImplicitRuleLabel("__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.stringtemplate.v4.ST sT22 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar21, sT22, "_tsethi!");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "___tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context" + "'", str20, "___tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        boolean boolean58 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar59 = null;
        org.stringtemplate.v4.ST sT60 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar59, sT60, "_tset#");
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "\"\\\"\\\\\\\"d\\\\\\\"\\\"\"", true);
        java.lang.String str22 = python2Target1.getTargetStringLiteralFromString("\"\"#\"\"Context");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#" + "'", str16, "#");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\\\"\\\\\\\"d\\\\\\\"\\\"\"" + "'", str20, "\"\\\"\\\\\\\"d\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\"\\\"#\\\"\\\"Context\"" + "'", str22, "\"\\\"\\\"#\\\"\\\"Context\"");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        java.lang.String str19 = python2Target1.language;
        boolean boolean20 = python2Target1.wantsBaseListener();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_@", true);
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("\"\\\"hi!\\\"\"");
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar13, sT14, "_\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"\\\"hi!\\\"\"" + "'", str8, "_\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"4.5.2.1\"" + "'", str12, "\"4.5.2.1\"");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        python2Target1.gen = codeGenerator26;
        org.antlr.v4.tool.ast.GrammarAST grammarAST28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST28);
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
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("\"_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
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
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("_tset\\1", false);
        java.util.Set<java.lang.String> strSet6 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator7);
        java.lang.String[] strArray9 = python2Target8.targetCharValueEscape;
        java.lang.String str10 = python2Target8.getLanguage();
        java.lang.String str13 = python2Target8.getTargetStringLiteralFromString("_tset", true);
        java.lang.String str15 = python2Target8.getTargetStringLiteralFromString("\"4.5.2.1\"");
        java.lang.String[] strArray16 = python2Target8.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray16;
        python2Target1.targetCharValueEscape = strArray16;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "\"_tset\\\\n\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target1.getElementName("___tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tset\\\\1" + "'", str5, "_tset\\\\1");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_tset\"" + "'", str13, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"4.5.2.1\\\"\"" + "'", str15, "\"\\\"4.5.2.1\\\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"_tset\\\\n\"" + "'", str22, "\"_tset\\\\n\"");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"hi!\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python2Target1.gen = codeGenerator8;
        int int10 = python2Target1.getSerializedATNSegmentLimit();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        python2Target1.gen = codeGenerator26;
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = python2Target1.getCodeGenerator();
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
        org.junit.Assert.assertNull(codeGenerator28);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        java.lang.String[] strArray30 = null;
        python2Target1.targetCharValueEscape = strArray30;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python2Target1.getRuleFunctionContextStructName(ruleFunction32);
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
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("_tset\\1", false);
        java.util.Set<java.lang.String> strSet6 = python2Target1.badWords;
        java.lang.String str8 = python2Target1.getImplicitSetLabel("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tset\\\\1" + "'", str5, "_tset\\\\1");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context" + "'", str8, "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("Python2");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        boolean boolean11 = python2Target9.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target9.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target9.getTemplates();
        python2Target1.templates = sTGroup13;
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromString("\\12", true);
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2Context" + "'", str6, "Python2Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\\12\"" + "'", str17, "\"\\\\12\"");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray10;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.lang.String str7 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python2Target1.gen = codeGenerator8;
        java.lang.String str11 = python2Target1.getListLabel("\"_tset_tset_tsetContext\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tset_tset_tsetContext\"" + "'", str11, "\"_tset_tset_tsetContext\"");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset");
        java.lang.String str7 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str12 = python2Target9.encodeIntAsCharEscape(64);
        java.lang.String str13 = python2Target9.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target9.getTemplates();
        java.lang.String str15 = python2Target9.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.lang.String[] strArray18 = python2Target17.targetCharValueEscape;
        java.lang.String str19 = python2Target17.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target17.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator21);
        java.util.Set<java.lang.String> strSet23 = python2Target22.badWords;
        python2Target17.badWords = strSet23;
        java.lang.String[] strArray30 = new java.lang.String[] { "@", "\"_tset\"", "\"hi!\"", "_tset\\1", "_tset\\\\1" };
        python2Target17.targetCharValueEscape = strArray30;
        java.lang.String str32 = python2Target17.getLanguage();
        boolean boolean33 = python2Target17.templatesExist();
        java.util.Set<java.lang.String> strSet34 = python2Target17.getBadWords();
        python2Target9.badWords = strSet34;
        python2Target1.badWords = strSet34;
        java.lang.String str38 = python2Target1.encodeIntAsCharEscape((int) '#');
        org.stringtemplate.v4.STGroup sTGroup39 = python2Target1.templates;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Python2" + "'", str32, "Python2");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#" + "'", str38, "#");
        org.junit.Assert.assertNotNull(sTGroup39);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        int int49 = python2Target1.getSerializedATNSegmentLimit();
        python2Target1.language = "_tset\"Hi!Context\"";
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset\"Hi!Context\"" + "'", str8, "_tset\"Hi!Context\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        java.lang.String str23 = python2Target1.getAltLabelContextStructName("\"\\\"\\\\\\\"d\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\\"\\\\\\\"d\\\\\\\"\\\"\"Context" + "'", str23, "\"\\\"\\\\\\\"d\\\\\\\"\\\"\"Context");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        java.lang.String str6 = python2Target1.getListLabel("\\n");
        java.lang.String[] strArray7 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python2Target1.genRecognizerHeaderFile(grammar8, sT9, "\"d\"");
        java.lang.String str13 = python2Target1.getListLabel("\"\\\"4.5.2.1\\\"\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"4.5.2.1\\\"\"" + "'", str13, "\"\\\"4.5.2.1\\\"\"");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python2Target1.genRecognizerHeaderFile(grammar3, sT4, "hi!");
        python2Target1.language = "_\"_tset\"";
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.util.Set<java.lang.String> strSet12 = python2Target11.badWords;
        java.lang.String str14 = python2Target11.encodeIntAsCharEscape(64);
        java.lang.String str16 = python2Target11.getTargetStringLiteralFromString("hi!");
        java.util.Set<java.lang.String> strSet17 = python2Target11.getBadWords();
        python2Target1.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        java.util.Set<java.lang.String> strSet21 = python2Target20.badWords;
        java.lang.String str24 = python2Target20.getTargetStringLiteralFromString("hi!", false);
        int int25 = python2Target20.getInlineTestSetWordSize();
        java.lang.String str27 = python2Target20.getTargetStringLiteralFromString("Hi!Context");
        java.util.Set<java.lang.String> strSet28 = python2Target20.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        java.lang.String str32 = python2Target20.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator29, "hi!", false);
        java.util.Set<java.lang.String> strSet33 = python2Target20.badWords;
        java.util.Set<java.lang.String> strSet34 = python2Target20.getBadWords();
        java.util.Set<java.lang.String> strSet35 = python2Target20.badWords;
        python2Target1.badWords = strSet35;
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        python2Target1.gen = codeGenerator37;
        org.antlr.v4.tool.Rule rule39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = python2Target1.getRuleFunctionContextStructName(rule39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"_tset\"" + "'", str9, "_\"_tset\"");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"hi!\"" + "'", str16, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"Hi!Context\"" + "'", str27, "\"Hi!Context\"");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "i" + "'", str32, "i");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strSet35);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar3, sT4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass6 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        java.lang.String str6 = python2Target1.getListLabel("\\n");
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python2Target1.genRecognizerHeaderFile(grammar7, sT8, "\"4.5.2.1\"");
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target();
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
        org.stringtemplate.v4.STGroup sTGroup24 = python2Target13.templates;
        java.util.Set<java.lang.String> strSet25 = python2Target13.badWords;
        java.util.Set<java.lang.String> strSet26 = python2Target13.getBadWords();
        boolean boolean27 = python2Target13.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet28 = python2Target13.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup29 = python2Target13.getTemplates();
        python2Target11.templates = sTGroup29;
        python2Target1.templates = sTGroup29;
        java.util.Set<java.lang.String> strSet32 = python2Target1.getBadWords();
        boolean boolean33 = python2Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup34 = python2Target1.templates;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "@" + "'", str16, "@");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Python2" + "'", str21, "Python2");
        org.junit.Assert.assertNotNull(sTGroup22);
        org.junit.Assert.assertNotNull(sTGroup24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(sTGroup34);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target1.getTemplates();
        boolean boolean24 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.stringtemplate.v4.ST sT26 = null;
        python2Target1.genRecognizerHeaderFile(grammar25, sT26, "_\"_tset\"Context");
        int int29 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Python2" + "'", str22, "Python2");
        org.junit.Assert.assertNotNull(sTGroup23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup3 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        python2Target1.gen = codeGenerator4;
        python2Target1.language = "\"_Contex\"";
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(sTGroup3);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target1.gen = codeGenerator6;
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"Contex");
        java.lang.String str11 = python2Target1.getListLabel("_tset#");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"Contex" + "'", str9, "_tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"Contex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset#" + "'", str11, "_tset#");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar6 = null;
        int[] intArray7 = new int[] {};
        java.lang.String[] strArray8 = python2Target1.getTokenTypesAsTargetLabels(grammar6, intArray7);
        java.lang.String str9 = python2Target1.getVersion();
        java.lang.String str11 = python2Target1.getListLabel("_");
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar12, sT13, "\".5.2.\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tset\\\\1" + "'", str5, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_" + "'", str11, "_");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        java.lang.String str9 = python2Target1.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_\"_tset\"");
        boolean boolean13 = python2Target1.templatesExist();
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target();
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
        org.stringtemplate.v4.STGroup sTGroup27 = python2Target16.templates;
        java.util.Set<java.lang.String> strSet28 = python2Target16.badWords;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        boolean boolean30 = python2Target16.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet31 = python2Target16.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup32 = python2Target16.getTemplates();
        python2Target14.templates = sTGroup32;
        python2Target1.templates = sTGroup32;
        boolean boolean35 = python2Target1.supportsOverloadedMethods();
        java.lang.String[] strArray36 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST37 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"_tset\"Context" + "'", str12, "_\"_tset\"Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "@" + "'", str19, "@");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Python2" + "'", str20, "Python2");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(sTGroup25);
        org.junit.Assert.assertNotNull(sTGroup27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(sTGroup32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray36);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        java.lang.String str17 = python2Target1.getImplicitSetLabel("_tset");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset\"Context" + "'", str12, "\"_tset\"Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset_tset" + "'", str17, "_tset_tset");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        int int23 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator24);
        java.lang.String[] strArray26 = python2Target25.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup27 = python2Target25.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        java.lang.String str31 = python2Target25.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator28, "", false);
        boolean boolean32 = python2Target25.supportsOverloadedMethods();
        python2Target25.addBadWords();
        int int34 = python2Target25.getInlineTestSetWordSize();
        boolean boolean35 = python2Target25.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target37 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator36);
        java.util.Set<java.lang.String> strSet38 = python2Target37.badWords;
        java.lang.String str40 = python2Target37.encodeIntAsCharEscape(64);
        java.lang.String str41 = python2Target37.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target43 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator42);
        java.lang.String[] strArray44 = python2Target43.targetCharValueEscape;
        java.lang.String str45 = python2Target43.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup46 = python2Target43.getTemplates();
        python2Target37.templates = sTGroup46;
        java.util.Set<java.lang.String> strSet48 = python2Target37.getBadWords();
        java.lang.String str50 = python2Target37.getListLabel("_tset\\1");
        java.lang.String str51 = python2Target37.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target53 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator52);
        java.util.Set<java.lang.String> strSet54 = python2Target53.badWords;
        java.lang.String str57 = python2Target53.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str59 = python2Target53.getImplicitRuleLabel("@");
        python2Target53.language = "hi!";
        java.util.Set<java.lang.String> strSet62 = python2Target53.getBadWords();
        python2Target37.badWords = strSet62;
        python2Target25.badWords = strSet62;
        python2Target1.badWords = strSet62;
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(sTGroup27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 64 + "'", int34 == 64);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "@" + "'", str40, "@");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Python2" + "'", str41, "Python2");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Python2" + "'", str45, "Python2");
        org.junit.Assert.assertNotNull(sTGroup46);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "_tset\\1" + "'", str50, "_tset\\1");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Python2" + "'", str51, "Python2");
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "_@" + "'", str59, "_@");
        org.junit.Assert.assertNotNull(strSet62);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        python2Target1.addBadWords();
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.stringtemplate.v4.ST sT19 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar18, sT19, "\"_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"");
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
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getLanguage();
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        boolean boolean10 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target1.gen;
        org.antlr.v4.tool.Grammar grammar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getTokenTypeAsTargetLabel(grammar13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(sTGroup11);
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        boolean boolean15 = python2Target1.templatesExist();
        java.lang.String[] strArray16 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Rule rule17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getRuleFunctionContextStructName(rule17);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        int int14 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\1" + "'", str13, "\\1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python2Target1.gen = codeGenerator7;
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.util.Set<java.lang.String> strSet12 = python2Target11.badWords;
        java.lang.String str15 = python2Target11.getTargetStringLiteralFromString("hi!", false);
        int int16 = python2Target11.getInlineTestSetWordSize();
        boolean boolean17 = python2Target11.wantsBaseVisitor();
        java.lang.String str18 = python2Target11.getLanguage();
        python2Target11.addBadWords();
        java.util.Set<java.lang.String> strSet20 = python2Target11.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator21);
        java.util.Set<java.lang.String> strSet23 = python2Target22.badWords;
        java.lang.String str25 = python2Target22.encodeIntAsCharEscape(64);
        java.lang.String str27 = python2Target22.getTargetStringLiteralFromString("hi!");
        java.util.Set<java.lang.String> strSet28 = python2Target22.getBadWords();
        python2Target11.badWords = strSet28;
        java.lang.String str31 = python2Target11.getListLabel("_\"_tset\"Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target33 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator32);
        java.util.Set<java.lang.String> strSet34 = python2Target33.badWords;
        java.lang.String str36 = python2Target33.encodeIntAsCharEscape(64);
        java.lang.String str37 = python2Target33.getLanguage();
        java.lang.String str38 = python2Target33.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup39 = python2Target33.getTemplates();
        python2Target11.templates = sTGroup39;
        python2Target1.templates = sTGroup39;
        int int42 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"4.5.2.1\"" + "'", str6, "\"4.5.2.1\"");
        org.junit.Assert.assertNull(sTGroup9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "@" + "'", str25, "@");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"hi!\"" + "'", str27, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "_\"_tset\"Context" + "'", str31, "_\"_tset\"Context");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "@" + "'", str36, "@");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Python2" + "'", str37, "Python2");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Python2" + "'", str38, "Python2");
        org.junit.Assert.assertNotNull(sTGroup39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        boolean boolean15 = python2Target1.templatesExist();
        java.lang.String[] strArray16 = python2Target1.targetCharValueEscape;
        int int17 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        java.util.Set<java.lang.String> strSet13 = python2Target12.badWords;
        java.lang.String str15 = python2Target12.encodeIntAsCharEscape(64);
        java.lang.String str17 = python2Target12.getListLabel("_\"_tset\"");
        java.util.Locale locale19 = null;
        java.lang.String str20 = pythonStringRenderer0.toString((java.lang.Object) str17, "", locale19);
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator21);
        java.util.Set<java.lang.String> strSet23 = python2Target22.badWords;
        java.lang.String str25 = python2Target22.encodeIntAsCharEscape(64);
        java.lang.String str26 = python2Target22.getLanguage();
        java.lang.String str29 = python2Target22.getTargetStringLiteralFromString("_@", false);
        java.lang.String str30 = python2Target22.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python2Target22.getCodeGenerator();
        java.lang.String str33 = python2Target22.getAltLabelContextStructName("_\"_tset\"");
        java.util.Locale locale35 = null;
        java.lang.String str36 = pythonStringRenderer0.toString((java.lang.Object) "_\"_tset\"", "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context", locale35);
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator37);
        java.util.Set<java.lang.String> strSet39 = python2Target38.badWords;
        java.lang.String str42 = python2Target38.getTargetStringLiteralFromString("hi!", false);
        int int43 = python2Target38.getInlineTestSetWordSize();
        java.lang.String str45 = python2Target38.getTargetStringLiteralFromString("Hi!Context");
        java.util.Set<java.lang.String> strSet46 = python2Target38.badWords;
        java.lang.String str49 = python2Target38.getTargetStringLiteralFromString("_\"\\\"hi!\\\"\"", true);
        org.stringtemplate.v4.STGroup sTGroup50 = python2Target38.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup51 = python2Target38.getTemplates();
        java.util.Locale locale53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = pythonStringRenderer0.toString((java.lang.Object) python2Target38, "_tset4.5.2.1", locale53);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python2Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2Context" + "'", str7, "Python2Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "@" + "'", str15, "@");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_\"_tset\"" + "'", str17, "_\"_tset\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "@" + "'", str25, "@");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Python2" + "'", str26, "Python2");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "_@" + "'", str29, "_@");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Python2" + "'", str30, "Python2");
        org.junit.Assert.assertNull(codeGenerator31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "_\"_tset\"Context" + "'", str33, "_\"_tset\"Context");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context" + "'", str36, "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 64 + "'", int43 == 64);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"Hi!Context\"" + "'", str45, "\"Hi!Context\"");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"_\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str49, "\"_\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup50);
        org.junit.Assert.assertNotNull(sTGroup51);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean6 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.templates;
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.templates;
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"4.5.2.1\"" + "'", str5, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        java.lang.String str19 = python2Target1.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target50 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator49);
        java.lang.String[] strArray51 = python2Target50.targetCharValueEscape;
        java.lang.String str52 = python2Target50.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup53 = python2Target50.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target55 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator54);
        java.util.Set<java.lang.String> strSet56 = python2Target55.badWords;
        python2Target50.badWords = strSet56;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = python2Target50.gen;
        java.lang.String str59 = python2Target50.getLanguage();
        java.lang.String str60 = python2Target50.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator61 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target62 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator61);
        java.util.Set<java.lang.String> strSet63 = python2Target62.badWords;
        java.lang.String str66 = python2Target62.getTargetStringLiteralFromString("hi!", false);
        int int67 = python2Target62.getInlineTestSetWordSize();
        boolean boolean68 = python2Target62.wantsBaseVisitor();
        java.lang.String str69 = python2Target62.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup70 = python2Target62.loadTemplates();
        python2Target50.templates = sTGroup70;
        java.lang.String str73 = python2Target50.getAltLabelContextStructName("\"_tsethi!\"");
        java.util.Set<java.lang.String> strSet74 = python2Target50.getBadWords();
        python2Target1.badWords = strSet74;
        org.stringtemplate.v4.STGroup sTGroup76 = python2Target1.loadTemplates();
        java.lang.String[] strArray77 = python2Target1.targetCharValueEscape;
        boolean boolean78 = python2Target1.supportsOverloadedMethods();
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
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Python2" + "'", str52, "Python2");
        org.junit.Assert.assertNotNull(sTGroup53);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNull(codeGenerator58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Python2" + "'", str59, "Python2");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "4.5.2.1" + "'", str60, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 64 + "'", int67 == 64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Python2" + "'", str69, "Python2");
        org.junit.Assert.assertNotNull(sTGroup70);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\"_tsethi!\"Context" + "'", str73, "\"_tsethi!\"Context");
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(sTGroup76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        python2Target1.genRecognizerHeaderFile(grammar13, sT14, "___tset");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getElementListName("_\"tsetContex\"");
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
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        boolean boolean4 = python2Target1.wantsBaseListener();
        python2Target1.language = "\\64";
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\"\\\\64\"", true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\64\"" + "'", str10, "\"\\\\64\"");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        java.lang.String str19 = python2Target1.getTargetStringLiteralFromString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator21);
        java.util.Set<java.lang.String> strSet23 = python2Target22.badWords;
        java.lang.String str25 = python2Target22.encodeIntAsCharEscape(64);
        java.lang.String str27 = python2Target22.getListLabel("_\"_tset\"");
        java.lang.String str29 = python2Target22.getListLabel("_4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        python2Target22.gen = codeGenerator30;
        boolean boolean32 = python2Target22.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator33);
        java.lang.String[] strArray35 = python2Target34.targetCharValueEscape;
        java.lang.String str36 = python2Target34.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup37 = python2Target34.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator38);
        java.util.Set<java.lang.String> strSet40 = python2Target39.badWords;
        python2Target34.badWords = strSet40;
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target43 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator42);
        java.util.Set<java.lang.String> strSet44 = python2Target43.badWords;
        java.lang.String str47 = python2Target43.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str49 = python2Target43.getImplicitRuleLabel("@");
        python2Target43.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target53 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator52);
        java.util.Set<java.lang.String> strSet54 = python2Target53.badWords;
        java.lang.String str56 = python2Target53.encodeIntAsCharEscape(64);
        java.lang.String str57 = python2Target53.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target59 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator58);
        java.lang.String[] strArray60 = python2Target59.targetCharValueEscape;
        java.lang.String str61 = python2Target59.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup62 = python2Target59.getTemplates();
        python2Target53.templates = sTGroup62;
        org.antlr.v4.codegen.CodeGenerator codeGenerator64 = python2Target53.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup65 = python2Target53.loadTemplates();
        python2Target43.templates = sTGroup65;
        python2Target34.templates = sTGroup65;
        org.antlr.v4.codegen.CodeGenerator codeGenerator68 = null;
        java.lang.String str71 = python2Target34.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator68, "@", false);
        python2Target34.language = "\"4.5.2.1\"";
        org.antlr.v4.tool.Grammar grammar74 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator75 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target76 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator75);
        java.lang.String[] strArray77 = python2Target76.targetCharValueEscape;
        java.lang.String str80 = python2Target76.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar81 = null;
        int[] intArray82 = new int[] {};
        java.lang.String[] strArray83 = python2Target76.getTokenTypesAsTargetLabels(grammar81, intArray82);
        java.lang.String[] strArray84 = python2Target34.getTokenTypesAsTargetLabels(grammar74, intArray82);
        org.antlr.v4.codegen.CodeGenerator codeGenerator85 = null;
        python2Target34.gen = codeGenerator85;
        java.util.Set<java.lang.String> strSet87 = python2Target34.badWords;
        java.lang.String[] strArray88 = python2Target34.targetCharValueEscape;
        python2Target22.targetCharValueEscape = strArray88;
        python2Target1.targetCharValueEscape = strArray88;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str19, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "@" + "'", str25, "@");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "_\"_tset\"" + "'", str27, "_\"_tset\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "_4.5.2.1" + "'", str29, "_4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Python2" + "'", str36, "Python2");
        org.junit.Assert.assertNotNull(sTGroup37);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "_@" + "'", str49, "_@");
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "@" + "'", str56, "@");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Python2" + "'", str57, "Python2");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Python2" + "'", str61, "Python2");
        org.junit.Assert.assertNotNull(sTGroup62);
        org.junit.Assert.assertNull(codeGenerator64);
        org.junit.Assert.assertNotNull(sTGroup65);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "_tset\\\\1" + "'", str80, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[]");
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(strSet87);
        org.junit.Assert.assertNotNull(strArray88);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        java.lang.String str17 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST18);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\0" + "'", str17, "\\0");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        java.lang.String str5 = python2Target1.getImplicitSetLabel("_\"#\"");
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("_tset_tset\"Hi!Context\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tset_\"#\"" + "'", str5, "_tset_\"#\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_tset\"Hi!Context\"Context" + "'", str7, "_tset_tset\"Hi!Context\"Context");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        java.lang.String str6 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) '#');
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("\"_tset_tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#" + "'", str9, "#");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tset_tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context" + "'", str11, "\"_tset_tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python2Target1.genRecognizerHeaderFile(grammar3, sT4, "hi!");
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python2Target1.getLoopCounter(grammarAST26);
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
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        java.lang.String[] strArray30 = null;
        python2Target1.targetCharValueEscape = strArray30;
        java.lang.String str32 = python2Target1.getVersion();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "4.5.2.1" + "'", str32, "4.5.2.1");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        boolean boolean10 = python2Target1.supportsOverloadedMethods();
        boolean boolean11 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator12);
        java.util.Set<java.lang.String> strSet14 = python2Target13.badWords;
        boolean boolean15 = python2Target13.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target13.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target13.getTemplates();
        java.util.Set<java.lang.String> strSet18 = python2Target13.badWords;
        python2Target1.badWords = strSet18;
        java.lang.String str21 = python2Target1.getListLabel("\"\\\"hi!\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target23 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator22);
        java.lang.String[] strArray24 = python2Target23.targetCharValueEscape;
        java.lang.String str25 = python2Target23.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup26 = python2Target23.getTemplates();
        boolean boolean27 = python2Target23.wantsBaseVisitor();
        java.lang.String str29 = python2Target23.getTargetStringLiteralFromString("d");
        java.lang.String[] strArray35 = new java.lang.String[] { "_tset\\1", "i", "__tset", "\"\\\"d\\\"\"", "_tsetContextContext" };
        python2Target23.targetCharValueEscape = strArray35;
        java.lang.String[] strArray37 = python2Target23.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator38);
        java.util.Set<java.lang.String> strSet40 = python2Target39.badWords;
        java.lang.String str42 = python2Target39.encodeIntAsCharEscape(64);
        java.lang.String str43 = python2Target39.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target45 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator44);
        java.lang.String[] strArray46 = python2Target45.targetCharValueEscape;
        java.lang.String str47 = python2Target45.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup48 = python2Target45.getTemplates();
        python2Target39.templates = sTGroup48;
        org.antlr.v4.tool.Grammar grammar50 = null;
        org.stringtemplate.v4.ST sT51 = null;
        python2Target39.genRecognizerHeaderFile(grammar50, sT51, "\"_tset\"");
        java.util.Set<java.lang.String> strSet54 = python2Target39.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup55 = python2Target39.loadTemplates();
        java.lang.String str57 = python2Target39.getAltLabelContextStructName("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.stringtemplate.v4.STGroup sTGroup58 = python2Target39.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator59 = python2Target39.gen;
        org.stringtemplate.v4.STGroup sTGroup60 = python2Target39.getTemplates();
        python2Target23.templates = sTGroup60;
        python2Target1.templates = sTGroup60;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str21, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Python2" + "'", str25, "Python2");
        org.junit.Assert.assertNotNull(sTGroup26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"d\"" + "'", str29, "\"d\"");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "@" + "'", str42, "@");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Python2" + "'", str43, "Python2");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Python2" + "'", str47, "Python2");
        org.junit.Assert.assertNotNull(sTGroup48);
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertNotNull(sTGroup55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context" + "'", str57, "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
        org.junit.Assert.assertNotNull(sTGroup58);
        org.junit.Assert.assertNull(codeGenerator59);
        org.junit.Assert.assertNotNull(sTGroup60);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        boolean boolean1 = python2Target0.wantsBaseVisitor();
        boolean boolean2 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = python2Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"hi!\"");
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("\"\\\"_tset_tset_tsetContext\\\"\"Context");
        java.lang.String[] strArray11 = python2Target1.targetCharValueEscape;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\"\\\"_tset_tset_tsetContext\\\"\"Context" + "'", str10, "_\"\\\"_tset_tset_tsetContext\\\"\"Context");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        boolean boolean26 = python2Target1.templatesExist();
        int int27 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.stringtemplate.v4.ST sT29 = null;
        python2Target1.genRecognizerHeaderFile(grammar28, sT29, "4.5.2.1");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        java.util.Set<java.lang.String> strSet17 = python2Target1.getBadWords();
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
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.lang.String[] strArray18 = python2Target17.targetCharValueEscape;
        java.lang.String str21 = python2Target17.getTargetStringLiteralFromString("Python2", false);
        java.lang.String[] strArray22 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target17.targetCharValueEscape = strArray22;
        java.util.Set<java.lang.String> strSet24 = python2Target17.getBadWords();
        python2Target1.badWords = strSet24;
        org.antlr.v4.tool.ast.GrammarAST grammarAST26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python2Target1.getLoopLabel(grammarAST26);
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Python2" + "'", str21, "Python2");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator30);
        java.util.Set<java.lang.String> strSet32 = python2Target31.badWords;
        java.lang.String str35 = python2Target31.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str37 = python2Target31.getTargetStringLiteralFromString("\"hi!\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        python2Target31.gen = codeGenerator38;
        java.lang.String[] strArray40 = null;
        python2Target31.targetCharValueEscape = strArray40;
        org.stringtemplate.v4.STGroup sTGroup42 = python2Target31.getTemplates();
        python2Target1.templates = sTGroup42;
        org.stringtemplate.v4.STGroup sTGroup44 = python2Target1.loadTemplates();
        python2Target1.addBadWords();
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
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str37, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup42);
        org.junit.Assert.assertNotNull(sTGroup44);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        java.lang.String str24 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator26);
        java.util.Set<java.lang.String> strSet28 = python2Target27.badWords;
        java.lang.String str30 = python2Target27.encodeIntAsCharEscape(64);
        java.lang.String str31 = python2Target27.getLanguage();
        int int32 = python2Target27.getInlineTestSetWordSize();
        java.lang.String str34 = python2Target27.getImplicitSetLabel("_tset\\\\1");
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target37 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator36);
        java.lang.String[] strArray38 = python2Target37.targetCharValueEscape;
        java.lang.String str41 = python2Target37.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar42 = null;
        int[] intArray43 = new int[] {};
        java.lang.String[] strArray44 = python2Target37.getTokenTypesAsTargetLabels(grammar42, intArray43);
        java.lang.String[] strArray45 = python2Target27.getTokenTypesAsTargetLabels(grammar35, intArray43);
        java.lang.String[] strArray46 = python2Target1.getTokenTypesAsTargetLabels(grammar25, intArray43);
        java.util.Set<java.lang.String> strSet47 = python2Target1.badWords;
        java.lang.Class<?> wildcardClass48 = strSet47.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tsetContext" + "'", str18, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\0" + "'", str24, "\\0");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "@" + "'", str30, "@");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Python2" + "'", str31, "Python2");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 64 + "'", int32 == 64);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "_tset_tset\\\\1" + "'", str34, "_tset_tset\\\\1");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "_tset\\\\1" + "'", str41, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[]");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python2Target1.genRecognizerHeaderFile(grammar3, sT4, "hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tsetContext", true);
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
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"tsetContex\"" + "'", str10, "\"tsetContex\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("_tset\\1", false);
        java.util.Set<java.lang.String> strSet6 = python2Target1.badWords;
        java.lang.String str8 = python2Target1.getImplicitSetLabel("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean10 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getTokenTypeAsTargetLabel(grammar11, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tset\\\\1" + "'", str5, "_tset\\\\1");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context" + "'", str8, "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python2Target0.gen;
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.stringtemplate.v4.ST sT22 = null;
        python2Target0.genRecognizerHeaderFile(grammar21, sT22, "\"d\"");
        java.util.Set<java.lang.String> strSet25 = python2Target0.badWords;
        java.lang.String str26 = python2Target0.language;
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
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        java.lang.String[] strArray20 = python2Target0.targetCharValueEscape;
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
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.loadTemplates();
        java.lang.String str11 = python2Target1.getListLabel("__tset\\nContext");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "__tset\\nContext" + "'", str11, "__tset\\nContext");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str6 = python2Target1.getLanguage();
        python2Target1.addBadWords();
        java.lang.String str8 = python2Target1.language;
        python2Target1.language = "";
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
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target12.templates;
        java.util.Set<java.lang.String> strSet24 = python2Target12.badWords;
        java.util.Set<java.lang.String> strSet25 = python2Target12.getBadWords();
        boolean boolean26 = python2Target12.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet27 = python2Target12.getBadWords();
        python2Target1.badWords = strSet27;
        java.lang.String str31 = python2Target1.getTargetStringLiteralFromString("#", false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "@" + "'", str15, "@");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Python2" + "'", str16, "Python2");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Python2" + "'", str20, "Python2");
        org.junit.Assert.assertNotNull(sTGroup21);
        org.junit.Assert.assertNotNull(sTGroup23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#" + "'", str31, "#");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup3 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", false);
        java.lang.String str8 = python2Target1.getLanguage();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(sTGroup3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        java.lang.String str49 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet50 = python2Target1.badWords;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = python2Target1.getImplicitTokenLabel("\\1");
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Python2" + "'", str49, "Python2");
        org.junit.Assert.assertNotNull(strSet50);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        python2Target1.addBadWords();
        java.lang.String[] strArray58 = python2Target1.targetCharValueEscape;
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
        org.junit.Assert.assertNotNull(strArray58);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target1.gen = codeGenerator6;
        java.lang.String[] strArray8 = python2Target1.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tset\\\\1" + "'", str5, "_tset\\\\1");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("");
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\\n");
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getListLabel("_\"4.5.2.1\"");
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar13, sT14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset" + "'", str7, "_tset");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\\n" + "'", str9, "_tset\\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"4.5.2.1\"" + "'", str12, "_\"4.5.2.1\"");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target50 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator49);
        java.lang.String[] strArray51 = python2Target50.targetCharValueEscape;
        java.lang.String str52 = python2Target50.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup53 = python2Target50.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target55 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator54);
        java.util.Set<java.lang.String> strSet56 = python2Target55.badWords;
        python2Target50.badWords = strSet56;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = python2Target50.gen;
        java.lang.String str59 = python2Target50.getLanguage();
        java.lang.String str60 = python2Target50.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator61 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target62 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator61);
        java.util.Set<java.lang.String> strSet63 = python2Target62.badWords;
        java.lang.String str66 = python2Target62.getTargetStringLiteralFromString("hi!", false);
        int int67 = python2Target62.getInlineTestSetWordSize();
        boolean boolean68 = python2Target62.wantsBaseVisitor();
        java.lang.String str69 = python2Target62.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup70 = python2Target62.loadTemplates();
        python2Target50.templates = sTGroup70;
        java.lang.String str73 = python2Target50.getAltLabelContextStructName("\"_tsethi!\"");
        java.util.Set<java.lang.String> strSet74 = python2Target50.getBadWords();
        python2Target1.badWords = strSet74;
        org.stringtemplate.v4.STGroup sTGroup76 = python2Target1.loadTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST77 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean78 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST77);
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
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Python2" + "'", str52, "Python2");
        org.junit.Assert.assertNotNull(sTGroup53);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNull(codeGenerator58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Python2" + "'", str59, "Python2");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "4.5.2.1" + "'", str60, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 64 + "'", int67 == 64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Python2" + "'", str69, "Python2");
        org.junit.Assert.assertNotNull(sTGroup70);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\"_tsethi!\"Context" + "'", str73, "\"_tsethi!\"Context");
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(sTGroup76);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target();
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target15.templates;
        java.lang.String[] strArray17 = python2Target15.targetCharValueEscape;
        python2Target15.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        python2Target15.gen = codeGenerator19;
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target();
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target22.templates;
        java.lang.String[] strArray24 = python2Target22.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator25);
        java.lang.String[] strArray27 = python2Target26.targetCharValueEscape;
        java.lang.String str30 = python2Target26.getTargetStringLiteralFromString("Python2", false);
        java.lang.String[] strArray31 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target26.targetCharValueEscape = strArray31;
        python2Target22.targetCharValueEscape = strArray31;
        java.lang.String str36 = python2Target22.getTargetStringLiteralFromString("_tset_tsetContext", false);
        org.antlr.v4.tool.Grammar grammar37 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator38);
        java.lang.String[] strArray40 = python2Target39.targetCharValueEscape;
        java.lang.String str41 = python2Target39.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup42 = python2Target39.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target44 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator43);
        java.util.Set<java.lang.String> strSet45 = python2Target44.badWords;
        python2Target39.badWords = strSet45;
        org.antlr.v4.codegen.CodeGenerator codeGenerator47 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target48 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator47);
        java.util.Set<java.lang.String> strSet49 = python2Target48.badWords;
        java.lang.String str52 = python2Target48.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str54 = python2Target48.getImplicitRuleLabel("@");
        python2Target48.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator57 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target58 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator57);
        java.util.Set<java.lang.String> strSet59 = python2Target58.badWords;
        java.lang.String str61 = python2Target58.encodeIntAsCharEscape(64);
        java.lang.String str62 = python2Target58.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator63 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target64 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator63);
        java.lang.String[] strArray65 = python2Target64.targetCharValueEscape;
        java.lang.String str66 = python2Target64.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup67 = python2Target64.getTemplates();
        python2Target58.templates = sTGroup67;
        org.antlr.v4.codegen.CodeGenerator codeGenerator69 = python2Target58.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup70 = python2Target58.loadTemplates();
        python2Target48.templates = sTGroup70;
        python2Target39.templates = sTGroup70;
        org.antlr.v4.codegen.CodeGenerator codeGenerator73 = null;
        java.lang.String str76 = python2Target39.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator73, "@", false);
        python2Target39.language = "\"4.5.2.1\"";
        org.antlr.v4.tool.Grammar grammar79 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator80 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target81 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator80);
        java.lang.String[] strArray82 = python2Target81.targetCharValueEscape;
        java.lang.String str85 = python2Target81.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar86 = null;
        int[] intArray87 = new int[] {};
        java.lang.String[] strArray88 = python2Target81.getTokenTypesAsTargetLabels(grammar86, intArray87);
        java.lang.String[] strArray89 = python2Target39.getTokenTypesAsTargetLabels(grammar79, intArray87);
        java.lang.String[] strArray90 = python2Target22.getTokenTypesAsTargetLabels(grammar37, intArray87);
        java.lang.String[] strArray91 = python2Target15.getTokenTypesAsTargetLabels(grammar21, intArray87);
        java.lang.String[] strArray92 = python2Target1.getTokenTypesAsTargetLabels(grammar14, intArray87);
        org.antlr.v4.tool.ast.GrammarAST grammarAST93 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str94 = python2Target1.getLoopLabel(grammarAST93);
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
        org.junit.Assert.assertNull(sTGroup16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNull(sTGroup23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Python2" + "'", str30, "Python2");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "_tset_tsetContext" + "'", str36, "_tset_tsetContext");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Python2" + "'", str41, "Python2");
        org.junit.Assert.assertNotNull(sTGroup42);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "_@" + "'", str54, "_@");
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "@" + "'", str61, "@");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Python2" + "'", str62, "Python2");
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Python2" + "'", str66, "Python2");
        org.junit.Assert.assertNotNull(sTGroup67);
        org.junit.Assert.assertNull(codeGenerator69);
        org.junit.Assert.assertNotNull(sTGroup70);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "_tset\\\\1" + "'", str85, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[]");
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNotNull(strArray92);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        java.lang.String str36 = python2Target34.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator37);
        java.util.Set<java.lang.String> strSet39 = python2Target38.badWords;
        java.lang.String str41 = python2Target38.encodeIntAsCharEscape(64);
        java.lang.String str42 = python2Target38.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target44 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator43);
        java.lang.String[] strArray45 = python2Target44.targetCharValueEscape;
        java.lang.String str46 = python2Target44.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup47 = python2Target44.getTemplates();
        python2Target38.templates = sTGroup47;
        python2Target34.templates = sTGroup47;
        boolean boolean50 = python2Target34.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator51 = python2Target34.gen;
        java.lang.String str53 = python2Target34.getImplicitRuleLabel("__tset");
        java.util.Locale locale55 = null;
        java.lang.String str56 = pythonStringRenderer0.toString((java.lang.Object) str53, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"d\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"", locale55);
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "_tset" + "'", str36, "_tset");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "@" + "'", str41, "@");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Python2" + "'", str42, "Python2");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Python2" + "'", str46, "Python2");
        org.junit.Assert.assertNotNull(sTGroup47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(codeGenerator51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "___tset" + "'", str53, "___tset");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"d\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str56, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"d\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        java.lang.String str60 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
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
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\\n" + "'", str60, "\\n");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        org.antlr.v4.tool.Rule rule61 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str62 = python2Target1.getRuleFunctionContextStructName(rule61);
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
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
            java.lang.String str27 = python2Target1.getElementListName("_tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"Contex");
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
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"hi!\"");
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("\"\\\"_tset_tset_tsetContext\\\"\"Context");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar11, sT12, "\"_\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\"\\\"_tset_tset_tsetContext\\\"\"Context" + "'", str10, "_\"\\\"_tset_tset_tsetContext\\\"\"Context");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean6 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.templates;
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.templates;
        java.lang.String str10 = python2Target1.getListLabel("_tset");
        boolean boolean11 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        python2Target1.gen = codeGenerator12;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"4.5.2.1\"" + "'", str5, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset" + "'", str10, "_tset");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        org.antlr.v4.tool.Grammar grammar10 = null;
        int[] intArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = python2Target1.getTokenTypesAsTargetLabels(grammar10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        java.util.Set<java.lang.String> strSet25 = python2Target1.getBadWords();
        python2Target1.language = "\"_tset__tset_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"";
        int int28 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        java.lang.String str32 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator29, "___tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context", false);
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
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 64 + "'", int28 == 64);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "__tset_tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"Contex" + "'", str32, "__tset_tset\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"Contex");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator21);
        java.lang.String[] strArray23 = python2Target22.targetCharValueEscape;
        java.lang.String str24 = python2Target22.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup25 = python2Target22.loadTemplates();
        int int26 = python2Target22.getInlineTestSetWordSize();
        java.lang.String str27 = python2Target22.language;
        java.util.Set<java.lang.String> strSet28 = python2Target22.badWords;
        python2Target1.badWords = strSet28;
        java.util.Set<java.lang.String> strSet30 = python2Target1.badWords;
        java.lang.String str33 = python2Target1.getTargetStringLiteralFromString("\"\\\"4.5.2.1\\\"\"", true);
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
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(sTGroup25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Python2" + "'", str27, "Python2");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\\\"\\\\\\\"4.5.2.1\\\\\\\"\\\"\"" + "'", str33, "\"\\\"\\\\\\\"4.5.2.1\\\\\\\"\\\"\"");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "\"\\\"\\\"\"", true);
        java.lang.String str28 = python2Target1.getTargetStringLiteralFromString("\"_tset__tset_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Python2" + "'", str22, "Python2");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\\\"\\\"\"" + "'", str26, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\\\"_tset__tset_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str28, "\"\\\"_tset__tset_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python2Target1.language;
        java.lang.String[] strArray7 = python2Target1.targetCharValueEscape;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.util.Set<java.lang.String> strSet7 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.util.Set<java.lang.String> strSet12 = python2Target11.badWords;
        java.lang.String str15 = python2Target11.getTargetStringLiteralFromString("hi!", false);
        int int16 = python2Target11.getInlineTestSetWordSize();
        java.lang.String str18 = python2Target11.getTargetStringLiteralFromString("Hi!Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        java.lang.String[] strArray21 = python2Target20.targetCharValueEscape;
        python2Target11.targetCharValueEscape = strArray21;
        python2Target1.targetCharValueEscape = strArray21;
        java.lang.String str26 = python2Target1.getTargetStringLiteralFromString("tset_\\\"#", true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"Hi!Context\"" + "'", str18, "\"Hi!Context\"");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"tset_\\\\\\\"#\"" + "'", str26, "\"tset_\\\\\\\"#\"");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        java.lang.String str4 = python2Target1.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.templates;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        boolean boolean19 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python2Target1.getCodeGenerator();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(codeGenerator20);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
        java.lang.String str17 = python2Target1.getAltLabelContextStructName("\"hi!\"");
        python2Target1.addBadWords();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"hi!\"Context" + "'", str17, "\"hi!\"Context");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_@", true);
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.gen;
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python2Target1.genRecognizerHeaderFile(grammar9, sT10, "\"\\\"\\\\\\\"d\\\\\\\"\\\"\"Context");
        boolean boolean13 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"__tset__tset_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"__tset__tset_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str1, "\"__tset__tset_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.getTemplates();
        java.lang.String str15 = python2Target1.getImplicitRuleLabel("\"_\\\"#\\\"\"");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_\"_\\\"#\\\"\"" + "'", str15, "_\"_\\\"#\\\"\"");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        java.lang.String str35 = python2Target30.getTargetStringLiteralFromString("_tset", true);
        java.lang.String str37 = python2Target30.getTargetStringLiteralFromString("\"4.5.2.1\"");
        java.lang.String[] strArray38 = python2Target30.targetCharValueEscape;
        java.util.Locale locale40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = pythonStringRenderer0.toString((java.lang.Object) python2Target30, "__tset__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"", locale40);
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
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Python2" + "'", str32, "Python2");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"_tset\"" + "'", str35, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"\\\"4.5.2.1\\\"\"" + "'", str37, "\"\\\"4.5.2.1\\\"\"");
        org.junit.Assert.assertNotNull(strArray38);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("d");
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python2Target1.genRecognizerHeaderFile(grammar8, sT9, "\"\\\"d\\\"\"");
        java.lang.String str13 = python2Target1.getImplicitRuleLabel("\"_\"\\\"hi!\\\"\"\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"d\"" + "'", str7, "\"d\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\"_\"\\\"hi!\\\"\"\"" + "'", str13, "_\"_\"\\\"hi!\\\"\"\"");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("");
        python2Target1.language = "_tsetContext";
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("Python2");
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        python2Target1.genRecognizerHeaderFile(grammar14, sT15, "_tset\"#\"");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset" + "'", str7, "_tset");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"Python2\"" + "'", str13, "\"Python2\"");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getLoopCounter(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("_tset\\1", false);
        java.util.Set<java.lang.String> strSet6 = python2Target1.badWords;
        java.lang.String str8 = python2Target1.getImplicitSetLabel("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\" \"");
        int int11 = python2Target1.getInlineTestSetWordSize();
        boolean boolean12 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.loadTemplates();
        python2Target1.addBadWords();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tset\\\\1" + "'", str5, "_tset\\\\1");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context" + "'", str8, "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\" \"Context" + "'", str10, "\" \"Context");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        python2Target1.language = "_tset\"tset_tsetContex\"";
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
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        org.antlr.v4.tool.Grammar grammar9 = null;
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
        org.stringtemplate.v4.STGroup sTGroup22 = python2Target11.templates;
        java.util.Set<java.lang.String> strSet23 = python2Target11.badWords;
        java.util.Set<java.lang.String> strSet24 = python2Target11.getBadWords();
        boolean boolean25 = python2Target11.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet26 = python2Target11.getBadWords();
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target29 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator28);
        java.lang.String[] strArray30 = python2Target29.targetCharValueEscape;
        java.lang.String str33 = python2Target29.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar34 = null;
        int[] intArray35 = new int[] {};
        java.lang.String[] strArray36 = python2Target29.getTokenTypesAsTargetLabels(grammar34, intArray35);
        java.lang.String[] strArray37 = python2Target11.getTokenTypesAsTargetLabels(grammar27, intArray35);
        java.lang.String[] strArray38 = python2Target1.getTokenTypesAsTargetLabels(grammar9, intArray35);
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target40 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator39);
        java.util.Set<java.lang.String> strSet41 = python2Target40.badWords;
        java.lang.String str44 = python2Target40.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str46 = python2Target40.getImplicitRuleLabel("@");
        python2Target40.language = "hi!";
        boolean boolean49 = python2Target40.supportsOverloadedMethods();
        java.lang.String str51 = python2Target40.getTargetStringLiteralFromString("");
        java.lang.String str53 = python2Target40.getImplicitSetLabel("\\1");
        java.util.Set<java.lang.String> strSet54 = python2Target40.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup55 = python2Target40.templates;
        org.stringtemplate.v4.STGroup sTGroup56 = python2Target40.getTemplates();
        python2Target1.templates = sTGroup56;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNotNull(sTGroup22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "_tset\\\\1" + "'", str33, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "_@" + "'", str46, "_@");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\"\"" + "'", str51, "\"\"");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "_tset\\1" + "'", str53, "_tset\\1");
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertNotNull(sTGroup55);
        org.junit.Assert.assertNotNull(sTGroup56);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python2Target1.genRecognizerHeaderFile(grammar3, sT4, "hi!");
        python2Target1.language = "_\"_tset\"";
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getLanguage();
        python2Target1.addBadWords();
        java.util.Set<java.lang.String> strSet10 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        java.util.Set<java.lang.String> strSet13 = python2Target12.badWords;
        java.lang.String str15 = python2Target12.encodeIntAsCharEscape(64);
        java.lang.String str17 = python2Target12.getTargetStringLiteralFromString("hi!");
        java.util.Set<java.lang.String> strSet18 = python2Target12.getBadWords();
        python2Target1.badWords = strSet18;
        java.lang.String str21 = python2Target1.getListLabel("_\"_tset\"Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target23 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator22);
        java.util.Set<java.lang.String> strSet24 = python2Target23.badWords;
        java.lang.String str26 = python2Target23.encodeIntAsCharEscape(64);
        java.lang.String str27 = python2Target23.getLanguage();
        java.lang.String str28 = python2Target23.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup29 = python2Target23.getTemplates();
        python2Target1.templates = sTGroup29;
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.stringtemplate.v4.ST sT32 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar31, sT32, "__tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "@" + "'", str15, "@");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"hi!\"" + "'", str17, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_\"_tset\"Context" + "'", str21, "_\"_tset\"Context");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "@" + "'", str26, "@");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Python2" + "'", str27, "Python2");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Python2" + "'", str28, "Python2");
        org.junit.Assert.assertNotNull(sTGroup29);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"4.5.2.1\"");
        boolean boolean9 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"4.5.2.1\\\"\"" + "'", str8, "\"\\\"4.5.2.1\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"_tset\"", false);
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getImplicitTokenLabel("\".5.2.\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset" + "'", str6, "_tset");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\1" + "'", str8, "\\1");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python2Target1.gen = codeGenerator6;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "_\"_tset\"", false);
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.loadTemplates();
        boolean boolean13 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"_tset" + "'", str11, "\\\"_tset");
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("_tset\\1", false);
        java.util.Set<java.lang.String> strSet6 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator7);
        java.lang.String[] strArray9 = python2Target8.targetCharValueEscape;
        java.lang.String str10 = python2Target8.getLanguage();
        java.lang.String str13 = python2Target8.getTargetStringLiteralFromString("_tset", true);
        java.lang.String str15 = python2Target8.getTargetStringLiteralFromString("\"4.5.2.1\"");
        java.lang.String[] strArray16 = python2Target8.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray16;
        python2Target1.targetCharValueEscape = strArray16;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "\"_tset\\\\n\"", true);
        boolean boolean23 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tset\\\\1" + "'", str5, "_tset\\\\1");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_tset\"" + "'", str13, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"4.5.2.1\\\"\"" + "'", str15, "\"\\\"4.5.2.1\\\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"_tset\\\\n\"" + "'", str22, "\"_tset\\\\n\"");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        python2Target1.language = "";
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        python2Target1.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getElementListName("\"__@\\\"Contex\"");
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
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        java.lang.String[] strArray13 = python2Target1.targetCharValueEscape;
        java.lang.String[] strArray14 = python2Target1.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getElementName("\"tset_\\\\\\\"#\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        java.lang.String str70 = python2Target1.getImplicitSetLabel("_tset ");
        python2Target1.language = "\\\"\\\"";
        org.antlr.v4.tool.Grammar grammar73 = null;
        org.stringtemplate.v4.ST sT74 = null;
        python2Target1.genRecognizerHeaderFile(grammar73, sT74, "\"_tset\\\\n\"");
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
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "_tset_tset " + "'", str70, "_tset_tset ");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("Python2");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python2Target1.genRecognizerHeaderFile(grammar10, sT11, "Python2Context");
        java.lang.String str14 = python2Target1.getVersion();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2Context" + "'", str6, "Python2Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset" + "'", str9, "_tset");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("d");
        java.lang.String[] strArray13 = new java.lang.String[] { "_tset\\1", "i", "__tset", "\"\\\"d\\\"\"", "_tsetContextContext" };
        python2Target1.targetCharValueEscape = strArray13;
        java.lang.String[] strArray15 = python2Target1.targetCharValueEscape;
        int int16 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "", true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"d\"" + "'", str7, "\"d\"");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"" + "'", str20, "\"\"");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.util.Set<java.lang.String> strSet6 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator7);
        java.util.Set<java.lang.String> strSet9 = python2Target8.badWords;
        java.lang.String str12 = python2Target8.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str14 = python2Target8.getTargetStringLiteralFromString("\"hi!\"");
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
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.stringtemplate.v4.ST sT28 = null;
        python2Target16.genRecognizerHeaderFile(grammar27, sT28, "\"_tset\"");
        java.util.Set<java.lang.String> strSet31 = python2Target16.getBadWords();
        python2Target8.badWords = strSet31;
        python2Target1.badWords = strSet31;
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.stringtemplate.v4.ST sT35 = null;
        python2Target1.genRecognizerHeaderFile(grammar34, sT35, "_tset\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = python2Target1.getImplicitTokenLabel("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str14, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "@" + "'", str19, "@");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Python2" + "'", str20, "Python2");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(sTGroup25);
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset");
        java.lang.String str7 = python2Target1.getVersion();
        python2Target1.language = "\\1";
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.templates;
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.getTemplates();
        python2Target1.addBadWords();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup3 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementName("Python2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(sTGroup3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        boolean boolean26 = python2Target1.templatesExist();
        int int27 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str30 = python2Target1.getTargetStringLiteralFromString("\"__tsetContext\"", true);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"\\\"__tsetContext\\\"\"" + "'", str30, "\"\\\"__tsetContext\\\"\"");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset");
        java.lang.String str7 = python2Target1.getVersion();
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("\\1");
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python2Target1.getListLabel("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementListName("@");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str12, "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.language;
        python2Target1.addBadWords();
        java.lang.String str9 = python2Target1.language;
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar10, sT11, "Python2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("");
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\\n");
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getListLabel("_\"4.5.2.1\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.gen;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset" + "'", str7, "_tset");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\\n" + "'", str9, "_tset\\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"4.5.2.1\"" + "'", str12, "_\"4.5.2.1\"");
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        java.lang.String str4 = python2Target1.language;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python2Target1.genRecognizerHeaderFile(grammar8, sT9, "Contex");
        java.lang.String str12 = python2Target1.getVersion();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"\\\"\"" + "'", str7, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python2Target1.genRecognizerHeaderFile(grammar9, sT10, "\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        python2Target1.gen = codeGenerator13;
        java.lang.String[] strArray15 = python2Target1.targetCharValueEscape;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\1" + "'", str8, "\\1");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"hi!\"");
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("\".5.2.\"");
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\".5.2.\"Context" + "'", str11, "\".5.2.\"Context");
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        java.lang.String str9 = python2Target1.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_\"_tset\"");
        boolean boolean13 = python2Target1.templatesExist();
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target();
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
        org.stringtemplate.v4.STGroup sTGroup27 = python2Target16.templates;
        java.util.Set<java.lang.String> strSet28 = python2Target16.badWords;
        java.util.Set<java.lang.String> strSet29 = python2Target16.getBadWords();
        boolean boolean30 = python2Target16.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet31 = python2Target16.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup32 = python2Target16.getTemplates();
        python2Target14.templates = sTGroup32;
        python2Target1.templates = sTGroup32;
        java.lang.String str36 = python2Target1.encodeIntAsCharEscape((int) 'a');
        java.util.Set<java.lang.String> strSet37 = python2Target1.badWords;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"_tset\"Context" + "'", str12, "_\"_tset\"Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "@" + "'", str19, "@");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Python2" + "'", str20, "Python2");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(sTGroup25);
        org.junit.Assert.assertNotNull(sTGroup27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(sTGroup32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "a" + "'", str36, "a");
        org.junit.Assert.assertNotNull(strSet37);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset");
        java.lang.String str7 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str12 = python2Target9.encodeIntAsCharEscape(64);
        java.lang.String str13 = python2Target9.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target9.getTemplates();
        java.lang.String str15 = python2Target9.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.lang.String[] strArray18 = python2Target17.targetCharValueEscape;
        java.lang.String str19 = python2Target17.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target17.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator21);
        java.util.Set<java.lang.String> strSet23 = python2Target22.badWords;
        python2Target17.badWords = strSet23;
        java.lang.String[] strArray30 = new java.lang.String[] { "@", "\"_tset\"", "\"hi!\"", "_tset\\1", "_tset\\\\1" };
        python2Target17.targetCharValueEscape = strArray30;
        java.lang.String str32 = python2Target17.getLanguage();
        boolean boolean33 = python2Target17.templatesExist();
        java.util.Set<java.lang.String> strSet34 = python2Target17.getBadWords();
        python2Target9.badWords = strSet34;
        python2Target1.badWords = strSet34;
        java.lang.String str38 = python2Target1.encodeIntAsCharEscape((int) '#');
        org.stringtemplate.v4.STGroup sTGroup39 = null;
        python2Target1.templates = sTGroup39;
        java.lang.String str43 = python2Target1.getTargetStringLiteralFromString("#Context", false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Python2" + "'", str32, "Python2");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#" + "'", str38, "#");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#Context" + "'", str43, "#Context");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str6 = python2Target1.getLanguage();
        python2Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\\1", false);
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target();
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target14.templates;
        java.lang.String[] strArray16 = python2Target14.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        java.lang.String[] strArray19 = python2Target18.targetCharValueEscape;
        java.lang.String str22 = python2Target18.getTargetStringLiteralFromString("Python2", false);
        java.lang.String[] strArray23 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target18.targetCharValueEscape = strArray23;
        python2Target14.targetCharValueEscape = strArray23;
        java.lang.String str28 = python2Target14.getTargetStringLiteralFromString("_tset_tsetContext", false);
        org.antlr.v4.tool.Grammar grammar29 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator30);
        java.lang.String[] strArray32 = python2Target31.targetCharValueEscape;
        java.lang.String str33 = python2Target31.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup34 = python2Target31.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target36 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator35);
        java.util.Set<java.lang.String> strSet37 = python2Target36.badWords;
        python2Target31.badWords = strSet37;
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target40 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator39);
        java.util.Set<java.lang.String> strSet41 = python2Target40.badWords;
        java.lang.String str44 = python2Target40.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str46 = python2Target40.getImplicitRuleLabel("@");
        python2Target40.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target50 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator49);
        java.util.Set<java.lang.String> strSet51 = python2Target50.badWords;
        java.lang.String str53 = python2Target50.encodeIntAsCharEscape(64);
        java.lang.String str54 = python2Target50.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator55 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target56 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator55);
        java.lang.String[] strArray57 = python2Target56.targetCharValueEscape;
        java.lang.String str58 = python2Target56.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup59 = python2Target56.getTemplates();
        python2Target50.templates = sTGroup59;
        org.antlr.v4.codegen.CodeGenerator codeGenerator61 = python2Target50.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup62 = python2Target50.loadTemplates();
        python2Target40.templates = sTGroup62;
        python2Target31.templates = sTGroup62;
        org.antlr.v4.codegen.CodeGenerator codeGenerator65 = null;
        java.lang.String str68 = python2Target31.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator65, "@", false);
        python2Target31.language = "\"4.5.2.1\"";
        org.antlr.v4.tool.Grammar grammar71 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator72 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target73 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator72);
        java.lang.String[] strArray74 = python2Target73.targetCharValueEscape;
        java.lang.String str77 = python2Target73.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar78 = null;
        int[] intArray79 = new int[] {};
        java.lang.String[] strArray80 = python2Target73.getTokenTypesAsTargetLabels(grammar78, intArray79);
        java.lang.String[] strArray81 = python2Target31.getTokenTypesAsTargetLabels(grammar71, intArray79);
        java.lang.String[] strArray82 = python2Target14.getTokenTypesAsTargetLabels(grammar29, intArray79);
        java.lang.String[] strArray83 = python2Target1.getTokenTypesAsTargetLabels(grammar13, intArray79);
        java.util.Set<java.lang.String> strSet84 = python2Target1.badWords;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(sTGroup15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Python2" + "'", str22, "Python2");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "_tset_tsetContext" + "'", str28, "_tset_tsetContext");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Python2" + "'", str33, "Python2");
        org.junit.Assert.assertNotNull(sTGroup34);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "_@" + "'", str46, "_@");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "@" + "'", str53, "@");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Python2" + "'", str54, "Python2");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Python2" + "'", str58, "Python2");
        org.junit.Assert.assertNotNull(sTGroup59);
        org.junit.Assert.assertNull(codeGenerator61);
        org.junit.Assert.assertNotNull(sTGroup62);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "_tset\\\\1" + "'", str77, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[]");
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(strSet84);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python2Target1.genRecognizerHeaderFile(grammar3, sT4, "hi!");
        java.lang.String str7 = python2Target1.getVersion();
        python2Target1.addBadWords();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset");
        java.lang.String str7 = python2Target1.getVersion();
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopLabel(grammarAST9);
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
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"", true);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str10, "\"_\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"_tset\"", false);
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python2Target1.genRecognizerHeaderFile(grammar8, sT9, "");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator12);
        java.lang.String[] strArray14 = python2Target13.targetCharValueEscape;
        java.lang.String str15 = python2Target13.getLanguage();
        java.lang.String str18 = python2Target13.getTargetStringLiteralFromString("_tset", true);
        java.util.Set<java.lang.String> strSet19 = python2Target13.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python2Target13.gen;
        java.util.Set<java.lang.String> strSet21 = python2Target13.badWords;
        python2Target1.badWords = strSet21;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target1.getElementName("\"d\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset" + "'", str6, "_tset");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"_tset\"" + "'", str18, "\"_tset\"");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.gen;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"d\"");
        java.lang.String[] strArray9 = python2Target1.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"d\\\"\"" + "'", str8, "\"\\\"d\\\"\"");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        java.lang.String[] strArray33 = new java.lang.String[] { "Python2" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray33;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray33;
        python2Target1.targetCharValueEscape = strArray33;
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator37);
        java.lang.String[] strArray39 = python2Target38.targetCharValueEscape;
        java.lang.String str40 = python2Target38.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup41 = python2Target38.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target43 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator42);
        java.util.Set<java.lang.String> strSet44 = python2Target43.badWords;
        python2Target38.badWords = strSet44;
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target47 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator46);
        java.util.Set<java.lang.String> strSet48 = python2Target47.badWords;
        java.lang.String str51 = python2Target47.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str53 = python2Target47.getImplicitRuleLabel("@");
        python2Target47.language = "hi!";
        org.antlr.v4.codegen.CodeGenerator codeGenerator56 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target57 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator56);
        java.util.Set<java.lang.String> strSet58 = python2Target57.badWords;
        java.lang.String str60 = python2Target57.encodeIntAsCharEscape(64);
        java.lang.String str61 = python2Target57.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator62 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target63 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator62);
        java.lang.String[] strArray64 = python2Target63.targetCharValueEscape;
        java.lang.String str65 = python2Target63.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup66 = python2Target63.getTemplates();
        python2Target57.templates = sTGroup66;
        org.antlr.v4.codegen.CodeGenerator codeGenerator68 = python2Target57.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup69 = python2Target57.loadTemplates();
        python2Target47.templates = sTGroup69;
        python2Target38.templates = sTGroup69;
        org.antlr.v4.codegen.CodeGenerator codeGenerator72 = null;
        java.lang.String str75 = python2Target38.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator72, "@", false);
        org.stringtemplate.v4.STGroup sTGroup76 = python2Target38.loadTemplates();
        python2Target1.templates = sTGroup76;
        java.lang.String str79 = python2Target1.getAltLabelContextStructName("_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str80 = python2Target1.language;
        java.util.Set<java.lang.String> strSet81 = python2Target1.badWords;
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
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Python2" + "'", str40, "Python2");
        org.junit.Assert.assertNotNull(sTGroup41);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "_@" + "'", str53, "_@");
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "@" + "'", str60, "@");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Python2" + "'", str61, "Python2");
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Python2" + "'", str65, "Python2");
        org.junit.Assert.assertNotNull(sTGroup66);
        org.junit.Assert.assertNull(codeGenerator68);
        org.junit.Assert.assertNotNull(sTGroup69);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(sTGroup76);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context" + "'", str79, "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Python2" + "'", str80, "Python2");
        org.junit.Assert.assertNotNull(strSet81);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str12 = python2Target1.getLanguage();
        java.lang.String str14 = python2Target1.getAltLabelContextStructName("_tset\"#\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Hi!Context\"Context" + "'", str10, "\"Hi!Context\"Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python2" + "'", str12, "Python2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset\"#\"Context" + "'", str14, "_tset\"#\"Context");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        java.lang.String str21 = python2Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.stringtemplate.v4.ST sT23 = null;
        python2Target0.genRecognizerHeaderFile(grammar22, sT23, "\"_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context\"");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\"" + "'", str21, "\"\"");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getListLabel("_\"_tset\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        int int8 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"_tset\"" + "'", str6, "_\"_tset\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_@", false);
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python2Target1.gen = codeGenerator11;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "tsetContex", true);
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target1.loadTemplates();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"setConte\"" + "'", str16, "\"setConte\"");
        org.junit.Assert.assertNotNull(sTGroup17);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python2Target1.gen = codeGenerator7;
        java.lang.String str9 = python2Target1.language;
        org.stringtemplate.v4.STGroup sTGroup10 = null;
        python2Target1.templates = sTGroup10;
        python2Target1.language = "\\1Context";
        boolean boolean14 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"4.5.2.1\"" + "'", str6, "\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        java.lang.String str4 = python2Target1.language;
        org.antlr.v4.tool.Rule rule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target1.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST16);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"hi!\"" + "'", str13, "\"hi!\"");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNull(codeGenerator15);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str2 = python2Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.Rule rule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target0.getRuleFunctionContextStructName(rule3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        boolean boolean26 = python2Target1.templatesExist();
        int int27 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str29 = python2Target1.getListLabel("_tset_\"#\"");
        java.lang.String[] strArray30 = null;
        python2Target1.targetCharValueEscape = strArray30;
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.stringtemplate.v4.ST sT33 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar32, sT33, "\"d\"Context");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "_tset_\"#\"" + "'", str29, "_tset_\"#\"");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"_tset\"", false);
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python2Target1.genRecognizerHeaderFile(grammar8, sT9, "");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        python2Target13.gen = codeGenerator31;
        python2Target13.language = "@";
        java.lang.String str36 = python2Target13.encodeIntAsCharEscape((int) (short) 0);
        org.antlr.v4.tool.Grammar grammar37 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator38);
        java.util.Set<java.lang.String> strSet40 = python2Target39.badWords;
        java.lang.String str42 = python2Target39.encodeIntAsCharEscape(64);
        java.lang.String str43 = python2Target39.getLanguage();
        int int44 = python2Target39.getInlineTestSetWordSize();
        java.lang.String str46 = python2Target39.getImplicitSetLabel("_tset\\\\1");
        org.antlr.v4.tool.Grammar grammar47 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target49 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator48);
        java.lang.String[] strArray50 = python2Target49.targetCharValueEscape;
        java.lang.String str53 = python2Target49.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar54 = null;
        int[] intArray55 = new int[] {};
        java.lang.String[] strArray56 = python2Target49.getTokenTypesAsTargetLabels(grammar54, intArray55);
        java.lang.String[] strArray57 = python2Target39.getTokenTypesAsTargetLabels(grammar47, intArray55);
        java.lang.String[] strArray58 = python2Target13.getTokenTypesAsTargetLabels(grammar37, intArray55);
        python2Target1.targetCharValueEscape = strArray58;
        python2Target1.language = "_tset_\"\\\"_tset_tset_tsetContext\\\"\"Context";
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset" + "'", str6, "_tset");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset" + "'", str15, "_tset");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "@" + "'", str20, "@");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Python2" + "'", str21, "Python2");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Python2" + "'", str25, "Python2");
        org.junit.Assert.assertNotNull(sTGroup26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "_tsetContext" + "'", str30, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\\0" + "'", str36, "\\0");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "@" + "'", str42, "@");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Python2" + "'", str43, "Python2");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 64 + "'", int44 == 64);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "_tset_tset\\\\1" + "'", str46, "_tset_tset\\\\1");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "_tset\\\\1" + "'", str53, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[]");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray58);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        java.lang.String str19 = python2Target1.language;
        java.lang.String str21 = python2Target1.getImplicitRuleLabel("_tset_\"#\"");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "__tset_\"#\"" + "'", str21, "__tset_\"#\"");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"_tset\"", false);
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python2Target1.genRecognizerHeaderFile(grammar8, sT9, "");
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset" + "'", str6, "_tset");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        python2Target1.language = "\"\"";
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("__tset");
        java.lang.String str8 = python2Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python2Target1.genRecognizerHeaderFile(grammar9, sT10, "");
        boolean boolean13 = python2Target1.templatesExist();
        java.lang.String str14 = python2Target1.getVersion();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"__tset\"" + "'", str7, "\"__tset\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"" + "'", str8, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        java.lang.String str7 = python2Target1.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python2Target1.gen = codeGenerator8;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "_tset#", false);
        java.lang.String str14 = python2Target1.getLanguage();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "tset" + "'", str13, "tset");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_@", true);
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("Python2Context", false);
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python2Target1.genRecognizerHeaderFile(grammar11, sT12, "\"\\\"Hi!Context\\\\\\\"Contex\\\"\"");
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2Context" + "'", str9, "Python2Context");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
        java.lang.String str17 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str19 = python2Target1.getListLabel("_\"_tset_tset_tsetContext\"");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_@" + "'", str8, "_@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset\"Context" + "'", str12, "\"_tset\"Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_hi!" + "'", str17, "_hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_\"_tset_tset_tsetContext\"" + "'", str19, "_\"_tset_tset_tsetContext\"");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        java.lang.String str15 = python2Target1.getImplicitRuleLabel("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python2Target1.getCodeGenerator();
        python2Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python2Target1.gen;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "__tset" + "'", str15, "__tset");
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertNull(codeGenerator18);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\\0");
        java.lang.String str7 = python2Target1.language;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("_\\\"\\\"hi!\\\"\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\0\"" + "'", str6, "\"\\\\0\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tset", true);
        java.lang.String str7 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python2Target1.gen = codeGenerator8;
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String[] strArray25 = python2Target24.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup26 = python2Target24.loadTemplates();
        python2Target11.templates = sTGroup26;
        python2Target1.templates = sTGroup26;
        java.lang.String str30 = python2Target1.getImplicitRuleLabel("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
        java.lang.String str33 = python2Target1.getTargetStringLiteralFromString("_tset\"#\"", false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tset\"" + "'", str6, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(sTGroup26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "_\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str30, "_\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "_tset\\\"#\\\"" + "'", str33, "_tset\\\"#\\\"");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("@");
        python2Target1.language = "hi!";
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
        java.lang.String str11 = python2Target1.getVersion();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        java.lang.String str6 = python2Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python2Target9.badWords;
        java.lang.String str12 = python2Target9.encodeIntAsCharEscape(64);
        java.lang.String str13 = python2Target9.getLanguage();
        int int14 = python2Target9.getInlineTestSetWordSize();
        java.lang.String str16 = python2Target9.getImplicitSetLabel("_tset\\\\1");
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator18);
        java.lang.String[] strArray20 = python2Target19.targetCharValueEscape;
        java.lang.String str21 = python2Target19.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup22 = python2Target19.templates;
        java.lang.String str24 = python2Target19.getTargetStringLiteralFromString("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        python2Target19.gen = codeGenerator25;
        org.stringtemplate.v4.STGroup sTGroup27 = python2Target19.templates;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target();
        org.stringtemplate.v4.STGroup sTGroup29 = python2Target28.templates;
        java.lang.String[] strArray30 = python2Target28.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target32 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator31);
        java.lang.String[] strArray33 = python2Target32.targetCharValueEscape;
        java.lang.String str36 = python2Target32.getTargetStringLiteralFromString("Python2", false);
        java.lang.String[] strArray37 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target32.targetCharValueEscape = strArray37;
        python2Target28.targetCharValueEscape = strArray37;
        python2Target19.targetCharValueEscape = strArray37;
        int int41 = python2Target19.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar42 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target44 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator43);
        java.util.Set<java.lang.String> strSet45 = python2Target44.badWords;
        java.lang.String str47 = python2Target44.encodeIntAsCharEscape(64);
        java.lang.String str49 = python2Target44.getAltLabelContextStructName("Python2");
        python2Target44.language = "";
        java.lang.String str53 = python2Target44.getImplicitRuleLabel("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.antlr.v4.tool.Grammar grammar54 = null;
        org.stringtemplate.v4.ST sT55 = null;
        python2Target44.genRecognizerHeaderFile(grammar54, sT55, "hi!");
        org.antlr.v4.tool.Grammar grammar58 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator59 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target60 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator59);
        java.lang.String[] strArray61 = python2Target60.targetCharValueEscape;
        java.lang.String str62 = python2Target60.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup63 = python2Target60.templates;
        java.lang.String str65 = python2Target60.getListLabel("\\n");
        java.lang.String[] strArray66 = python2Target60.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar67 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator68 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target69 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator68);
        java.lang.String[] strArray70 = python2Target69.targetCharValueEscape;
        java.lang.String str73 = python2Target69.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar74 = null;
        int[] intArray75 = new int[] {};
        java.lang.String[] strArray76 = python2Target69.getTokenTypesAsTargetLabels(grammar74, intArray75);
        java.lang.String[] strArray77 = python2Target60.getTokenTypesAsTargetLabels(grammar67, intArray75);
        java.lang.String[] strArray78 = python2Target44.getTokenTypesAsTargetLabels(grammar58, intArray75);
        java.lang.String[] strArray79 = python2Target19.getTokenTypesAsTargetLabels(grammar42, intArray75);
        java.lang.String[] strArray80 = python2Target9.getTokenTypesAsTargetLabels(grammar17, intArray75);
        java.lang.String[] strArray81 = python2Target1.getTokenTypesAsTargetLabels(grammar7, intArray75);
        org.antlr.v4.tool.Grammar grammar82 = null;
        org.stringtemplate.v4.ST sT83 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar82, sT83, "\"\\\"Hi!Context\\\\\\\"Contex\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset_tset\\\\1" + "'", str16, "_tset_tset\\\\1");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Python2" + "'", str21, "Python2");
        org.junit.Assert.assertNull(sTGroup22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"4.5.2.1\"" + "'", str24, "\"4.5.2.1\"");
        org.junit.Assert.assertNull(sTGroup27);
        org.junit.Assert.assertNull(sTGroup29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Python2" + "'", str36, "Python2");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 64 + "'", int41 == 64);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "@" + "'", str47, "@");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Python2Context" + "'", str49, "Python2Context");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "_\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str53, "_\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Python2" + "'", str62, "Python2");
        org.junit.Assert.assertNull(sTGroup63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\\n" + "'", str65, "\\n");
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "_tset\\\\1" + "'", str73, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[]");
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean7 = python2Target1.templatesExist();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"" + "'", str6, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\"hi!\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python2Target1.gen = codeGenerator8;
        java.lang.String[] strArray10 = null;
        python2Target1.targetCharValueEscape = strArray10;
        org.stringtemplate.v4.STGroup sTGroup12 = null;
        python2Target1.templates = sTGroup12;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("d");
        java.lang.String[] strArray13 = new java.lang.String[] { "_tset\\1", "i", "__tset", "\"\\\"d\\\"\"", "_tsetContextContext" };
        python2Target1.targetCharValueEscape = strArray13;
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromString("", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        python2Target1.gen = codeGenerator18;
        java.lang.String str21 = python2Target1.getAltLabelContextStructName("\"__\\\"_tset\\\"Context\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"d\"" + "'", str7, "\"d\"");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"__\\\"_tset\\\"Context\"Context" + "'", str21, "\"__\\\"_tset\\\"Context\"Context");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        python2Target1.badWords = strSet7;
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"", false);
        int int13 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"" + "'", str12, "_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("_tset\\1", false);
        java.util.Set<java.lang.String> strSet6 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator7);
        java.lang.String[] strArray9 = python2Target8.targetCharValueEscape;
        java.lang.String str10 = python2Target8.getLanguage();
        java.lang.String str13 = python2Target8.getTargetStringLiteralFromString("_tset", true);
        java.lang.String str15 = python2Target8.getTargetStringLiteralFromString("\"4.5.2.1\"");
        java.lang.String[] strArray16 = python2Target8.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray16;
        python2Target1.targetCharValueEscape = strArray16;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "\"_tset\\\\n\"", true);
        java.util.Set<java.lang.String> strSet23 = python2Target1.badWords;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tset\\\\1" + "'", str5, "_tset\\\\1");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_tset\"" + "'", str13, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"4.5.2.1\\\"\"" + "'", str15, "\"\\\"4.5.2.1\\\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"_tset\\\\n\"" + "'", str22, "\"_tset\\\\n\"");
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getLanguage();
        python2Target1.addBadWords();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar14, sT15, "_tset_tset\\\\1");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target23 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator22);
        java.lang.String[] strArray24 = python2Target23.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup25 = python2Target23.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        java.lang.String str29 = python2Target23.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator26, "", false);
        boolean boolean30 = python2Target23.supportsOverloadedMethods();
        python2Target23.addBadWords();
        int int32 = python2Target23.getInlineTestSetWordSize();
        boolean boolean33 = python2Target23.wantsBaseListener();
        java.lang.String str35 = python2Target23.getImplicitRuleLabel("\"_\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.util.Set<java.lang.String> strSet36 = python2Target23.badWords;
        python2Target0.badWords = strSet36;
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
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(sTGroup25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 64 + "'", int32 == 64);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "_\"_\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str35, "_\"_\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup3 = python2Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", false);
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        boolean boolean9 = python2Target1.templatesExist();
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(sTGroup3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("_tset\\1", false);
        java.util.Set<java.lang.String> strSet6 = python2Target1.badWords;
        java.lang.String str8 = python2Target1.getImplicitSetLabel("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getTokenTypeAsTargetLabel(grammar9, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tset\\\\1" + "'", str5, "_tset\\\\1");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context" + "'", str8, "_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        int int6 = python2Target1.getInlineTestSetWordSize();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getLanguage();
        python2Target1.addBadWords();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("");
        python2Target1.language = "__tsetContextContext";
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.templates;
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar16, sT17, "_tset\\n");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertNull(sTGroup15);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String[] strArray6 = org.antlr.v4.codegen.target.Python2Target.python2Keywords;
        python2Target1.targetCharValueEscape = strArray6;
        java.lang.String[] strArray8 = python2Target1.targetCharValueEscape;
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\\"\\\\\\\"Hi!Context\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"\\\\\\\"Hi!Context\\\\\\\"\\\"\"Context" + "'", str10, "\"\\\"\\\\\\\"Hi!Context\\\\\\\"\\\"\"Context");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        java.util.Set<java.lang.String> strSet13 = python2Target12.badWords;
        java.lang.String str15 = python2Target12.encodeIntAsCharEscape(64);
        java.lang.String str17 = python2Target12.getListLabel("_\"_tset\"");
        java.util.Locale locale19 = null;
        java.lang.String str20 = pythonStringRenderer0.toString((java.lang.Object) str17, "", locale19);
        java.util.Locale locale23 = null;
        java.lang.String str24 = pythonStringRenderer0.toString((java.lang.Object) "_tset_\"tsetContex\"", "___tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context", locale23);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2Context" + "'", str7, "Python2Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "@" + "'", str15, "@");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_\"_tset\"" + "'", str17, "_\"_tset\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "___tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context" + "'", str24, "___tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target6 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python2Target6.badWords;
        java.lang.String str9 = python2Target6.encodeIntAsCharEscape(64);
        java.lang.String str10 = python2Target6.getLanguage();
        int int11 = python2Target6.getInlineTestSetWordSize();
        java.lang.String str13 = python2Target6.getImplicitSetLabel("_tset\\\\1");
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String[] strArray17 = python2Target16.targetCharValueEscape;
        java.lang.String str20 = python2Target16.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar21 = null;
        int[] intArray22 = new int[] {};
        java.lang.String[] strArray23 = python2Target16.getTokenTypesAsTargetLabels(grammar21, intArray22);
        java.lang.String[] strArray24 = python2Target6.getTokenTypesAsTargetLabels(grammar14, intArray22);
        java.lang.String[] strArray25 = python2Target1.getTokenTypesAsTargetLabels(grammar4, intArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python2Target1.getElementListName("_tset\\\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "@" + "'", str9, "@");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_tset\\\\1" + "'", str13, "_tset_tset\\\\1");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_tset\\\\1" + "'", str20, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
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
        java.lang.String str49 = python2Target1.getVersion();
        java.lang.String str51 = python2Target1.getListLabel("__tset");
        org.antlr.v4.tool.ast.GrammarAST grammarAST52 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = python2Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST52);
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "4.5.2.1" + "'", str49, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "__tset" + "'", str51, "__tset");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.gen;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        java.lang.String[] strArray11 = python2Target10.targetCharValueEscape;
        java.lang.String str14 = python2Target10.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python2Target10.getTokenTypesAsTargetLabels(grammar15, intArray16);
        java.lang.String[] strArray18 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getImplicitTokenLabel("\"\\\\0\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset\\\\1" + "'", str14, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("");
        python2Target1.language = "_tsetContext";
        python2Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.gen;
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset" + "'", str7, "_tset");
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_@", true);
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.gen;
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python2Target1.genRecognizerHeaderFile(grammar9, sT10, "\"\\\"\\\\\\\"d\\\\\\\"\\\"\"Context");
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        java.lang.String[] strArray18 = python2Target17.targetCharValueEscape;
        java.lang.String str19 = python2Target17.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup20 = python2Target17.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator21);
        java.util.Set<java.lang.String> strSet23 = python2Target22.badWords;
        python2Target17.badWords = strSet23;
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python2Target17.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = python2Target17.getCodeGenerator();
        java.lang.String str27 = python2Target17.language;
        java.lang.String str29 = python2Target17.getListLabel("\"hi!\"");
        int int30 = python2Target17.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target33 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator32);
        java.lang.String str35 = python2Target33.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target37 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator36);
        java.util.Set<java.lang.String> strSet38 = python2Target37.badWords;
        java.lang.String str40 = python2Target37.encodeIntAsCharEscape(64);
        java.lang.String str41 = python2Target37.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target43 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator42);
        java.lang.String[] strArray44 = python2Target43.targetCharValueEscape;
        java.lang.String str45 = python2Target43.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup46 = python2Target43.getTemplates();
        python2Target37.templates = sTGroup46;
        python2Target33.templates = sTGroup46;
        java.lang.String str50 = python2Target33.getAltLabelContextStructName("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator51 = null;
        python2Target33.gen = codeGenerator51;
        python2Target33.language = "@";
        java.lang.String str56 = python2Target33.encodeIntAsCharEscape((int) (short) 0);
        org.antlr.v4.tool.Grammar grammar57 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target59 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator58);
        java.util.Set<java.lang.String> strSet60 = python2Target59.badWords;
        java.lang.String str62 = python2Target59.encodeIntAsCharEscape(64);
        java.lang.String str63 = python2Target59.getLanguage();
        int int64 = python2Target59.getInlineTestSetWordSize();
        java.lang.String str66 = python2Target59.getImplicitSetLabel("_tset\\\\1");
        org.antlr.v4.tool.Grammar grammar67 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator68 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target69 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator68);
        java.lang.String[] strArray70 = python2Target69.targetCharValueEscape;
        java.lang.String str73 = python2Target69.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar74 = null;
        int[] intArray75 = new int[] {};
        java.lang.String[] strArray76 = python2Target69.getTokenTypesAsTargetLabels(grammar74, intArray75);
        java.lang.String[] strArray77 = python2Target59.getTokenTypesAsTargetLabels(grammar67, intArray75);
        java.lang.String[] strArray78 = python2Target33.getTokenTypesAsTargetLabels(grammar57, intArray75);
        java.lang.String[] strArray79 = python2Target17.getTokenTypesAsTargetLabels(grammar31, intArray75);
        java.util.Locale locale81 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str82 = pythonStringRenderer0.toString((java.lang.Object) intArray75, "_tset_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context", locale81);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [I cannot be cast to java.lang.String");
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertNull(codeGenerator26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Python2" + "'", str27, "Python2");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"hi!\"" + "'", str29, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "_tset" + "'", str35, "_tset");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "@" + "'", str40, "@");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Python2" + "'", str41, "Python2");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Python2" + "'", str45, "Python2");
        org.junit.Assert.assertNotNull(sTGroup46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "_tsetContext" + "'", str50, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\\0" + "'", str56, "\\0");
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "@" + "'", str62, "@");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Python2" + "'", str63, "Python2");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 64 + "'", int64 == 64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "_tset_tset\\\\1" + "'", str66, "_tset_tset\\\\1");
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "_tset\\\\1" + "'", str73, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[]");
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "_@", true);
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("\"\\\"hi!\\\"\"");
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.templates;
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genListenerFile(grammar10, sT11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"\\\"hi!\\\"\"" + "'", str8, "_\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!", false);
        java.lang.String[] strArray6 = python2Target1.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("__tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String[] strArray4 = new java.lang.String[] { "Python2" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray4;
        python2Target1.targetCharValueEscape = strArray4;
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        java.lang.String[] strArray33 = new java.lang.String[] { "Python2" };
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray33;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray33;
        python2Target1.targetCharValueEscape = strArray33;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray33;
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
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", false);
        java.lang.String str6 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.lang.String[] strArray10 = python2Target9.targetCharValueEscape;
        java.lang.String str11 = python2Target9.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target9.templates;
        java.lang.String str14 = python2Target9.getTargetStringLiteralFromString("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        python2Target9.gen = codeGenerator15;
        java.lang.String str17 = python2Target9.language;
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        java.lang.String[] strArray21 = python2Target20.targetCharValueEscape;
        java.lang.String str22 = python2Target20.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target20.templates;
        java.lang.String str25 = python2Target20.getListLabel("\\n");
        java.lang.String[] strArray26 = python2Target20.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target29 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator28);
        java.lang.String[] strArray30 = python2Target29.targetCharValueEscape;
        java.lang.String str33 = python2Target29.getTargetStringLiteralFromString("_tset\\1", false);
        org.antlr.v4.tool.Grammar grammar34 = null;
        int[] intArray35 = new int[] {};
        java.lang.String[] strArray36 = python2Target29.getTokenTypesAsTargetLabels(grammar34, intArray35);
        java.lang.String[] strArray37 = python2Target20.getTokenTypesAsTargetLabels(grammar27, intArray35);
        java.lang.String[] strArray38 = python2Target9.getTokenTypesAsTargetLabels(grammar18, intArray35);
        java.lang.String[] strArray39 = python2Target1.getTokenTypesAsTargetLabels(grammar7, intArray35);
        org.stringtemplate.v4.STGroup sTGroup40 = python2Target1.getTemplates();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
        org.junit.Assert.assertNull(sTGroup12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"4.5.2.1\"" + "'", str14, "\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Python2" + "'", str22, "Python2");
        org.junit.Assert.assertNull(sTGroup23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\n" + "'", str25, "\\n");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "_tset\\\\1" + "'", str33, "_tset\\\\1");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(sTGroup40);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.templates;
        java.lang.String str6 = python2Target1.getListLabel("\\n");
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python2Target1.genRecognizerHeaderFile(grammar7, sT8, "\"4.5.2.1\"");
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"_\"\\\"hi!\\\"\"\"", false);
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromString("\"\\\"_tset_tset_tsetContext\\\"\"Context", false);
        python2Target1.addBadWords();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"" + "'", str13, "_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_\\\"\\\"hi!\\\"\\\"" + "'", str17, "_\\\"\\\"hi!\\\"\\\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\\"\\\\\\\"_tset_tset_tsetContext\\\\\\\"\\\"Context" + "'", str20, "\\\"\\\\\\\"_tset_tset_tsetContext\\\\\\\"\\\"Context");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str3 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray6 = python2Target1.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray6;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("");
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("_tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
        java.lang.String str11 = python2Target1.getVersion();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset" + "'", str7, "_tset");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context" + "'", str10, "__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        java.lang.String str16 = python2Target1.getListLabel("_\"hi!\"Context");
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup17 = python2Target1.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_@" + "'", str7, "_@");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_\"hi!\"Context" + "'", str16, "_\"hi!\"Context");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
        java.util.Set<java.lang.String> strSet12 = python2Target1.badWords;
        java.lang.String[] strArray13 = python2Target1.targetCharValueEscape;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python2" + "'", str3, "Python2");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.util.Set<java.lang.String> strSet6 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator7);
        java.util.Set<java.lang.String> strSet9 = python2Target8.badWords;
        java.lang.String str12 = python2Target8.getTargetStringLiteralFromString("hi!", false);
        java.lang.String str14 = python2Target8.getTargetStringLiteralFromString("\"hi!\"");
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
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.stringtemplate.v4.ST sT28 = null;
        python2Target16.genRecognizerHeaderFile(grammar27, sT28, "\"_tset\"");
        java.util.Set<java.lang.String> strSet31 = python2Target16.getBadWords();
        python2Target8.badWords = strSet31;
        python2Target1.badWords = strSet31;
        java.lang.String str35 = python2Target1.getImplicitRuleLabel("\"_\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str14, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "@" + "'", str19, "@");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Python2" + "'", str20, "Python2");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python2" + "'", str24, "Python2");
        org.junit.Assert.assertNotNull(sTGroup25);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "_\"_\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str35, "_\"_\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\\\12\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\\12\"" + "'", str1, "\"\\\\12\"");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String[] strArray2 = python2Target1.targetCharValueEscape;
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("_tset\\1", false);
        java.util.Set<java.lang.String> strSet6 = python2Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator7);
        java.lang.String[] strArray9 = python2Target8.targetCharValueEscape;
        java.lang.String str10 = python2Target8.getLanguage();
        java.lang.String str13 = python2Target8.getTargetStringLiteralFromString("_tset", true);
        java.lang.String str15 = python2Target8.getTargetStringLiteralFromString("\"4.5.2.1\"");
        java.lang.String[] strArray16 = python2Target8.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python2Target.python2Keywords = strArray16;
        python2Target1.targetCharValueEscape = strArray16;
        python2Target1.language = "Tset\\\"tset_tsetContexContext";
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tset\\\\1" + "'", str5, "_tset\\\\1");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_tset\"" + "'", str13, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"4.5.2.1\\\"\"" + "'", str15, "\"\\\"4.5.2.1\\\"\"");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("__\"_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "__\"_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"" + "'", str1, "__\"_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target1.getTemplates();
        boolean boolean24 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.stringtemplate.v4.ST sT26 = null;
        python2Target1.genRecognizerHeaderFile(grammar25, sT26, "_\"_tset\"Context");
        org.antlr.v4.tool.Grammar grammar29 = null;
        org.stringtemplate.v4.ST sT30 = null;
        // The following exception was thrown during execution in test generation
        try {
            python2Target1.genFile(grammar29, sT30, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"d\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
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
        org.junit.Assert.assertNotNull(sTGroup23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("");
        java.lang.String str4 = python2Target1.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        java.lang.String[] strArray6 = python2Target1.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"_tset\"", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset" + "'", str3, "_tset");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str9, "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\"_tset\\\"" + "'", str12, "\\\"_tset\\\"");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python2Target1.badWords;
        java.lang.String str4 = python2Target1.encodeIntAsCharEscape(64);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.loadTemplates();
        java.lang.String str6 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getListLabel("__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String[] strArray10 = python2Target1.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.loadTemplates();
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("", false);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "@" + "'", str4, "@");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str9, "__tset_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }
}

