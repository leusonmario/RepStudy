import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.templates;
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getElementListName("\"\\\"\\\"12\\\"\\\"\"");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        boolean boolean2 = python3Target0.templatesExist();
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getListLabel("\"\"\"\\\" \\\"\"\"\"");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\12");
        java.lang.String[] strArray9 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.loadTemplates();
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.wantsBaseVisitor();
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        java.lang.String[] strArray8 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet9 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.loadTemplates();
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"4.5.2.1\"\"\"\"", true);
        python3Target0.addBadWords();
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.loadTemplates();
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\"\"\"i\"\"\"");
        java.util.Set<java.lang.String> strSet13 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getImplicitSetLabel("a");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.gen;
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getElementListName("\"\".5.2.\"\"");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        int int6 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.getTemplates();
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\12");
        java.lang.String[] strArray9 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getElementListName("\"\"\"\"\"\"\"\"hi!\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        boolean boolean4 = python3Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet5 = python3Target0.getBadWords();
        java.util.Set<java.lang.String> strSet6 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementListName("\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        boolean boolean5 = python3Target0.wantsBaseListener();
        boolean boolean6 = python3Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet7 = python3Target0.getBadWords();
        java.lang.String str9 = python3Target0.encodeIntAsCharEscape(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.getTemplates();
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getAltLabelContextStructName("\\\"\\\"\\\"\\\"64\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) '4');
        python3Target0.language = "\"\\\"\\\"\\\"i\\\"\\\"\\\"\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.getTemplates();
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str9 = python3Target0.language;
        int int10 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.getTemplates();
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        boolean boolean4 = python3Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet5 = python3Target0.getBadWords();
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        boolean boolean7 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getAltLabelContextStructName("\"\"@\"\"");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("@");
        python3Target0.language = "d";
        boolean boolean9 = python3Target0.wantsBaseListener();
        boolean boolean10 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitSetLabel("\"\\1\"");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        boolean boolean4 = python3Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet5 = python3Target0.getBadWords();
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet7 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getElementName("\"\"\\\"\\\"0\\\"\\\"\"\"");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getVersion();
        java.lang.String str6 = python3Target0.getLanguage();
        boolean boolean7 = python3Target0.templatesExist();
        java.lang.String str8 = python3Target0.language;
        python3Target0.addBadWords();
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getAltLabelContextStructName("\"\"\"\"\"\"\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
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
        boolean boolean12 = python3Target0.wantsBaseVisitor();
        java.lang.String[] strArray13 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getAltLabelContextStructName("\"\"\"\"\"\"\"\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"hi!\"", false);
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        java.lang.String str11 = python3Target0.language;
        int int12 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean13 = python3Target0.supportsOverloadedMethods();
        java.lang.String str14 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target0.getTemplates();
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.gen;
        boolean boolean8 = python3Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        int int11 = python3Target10.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target10.language;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target10.templates;
        boolean boolean14 = python3Target10.templatesExist();
        java.lang.String[] strArray15 = python3Target10.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray15;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = python3Target0.getListLabel("\"\\\"\\\"1\\\"\\\"\"");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String str3 = python3Target0.language;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getListLabel("\"\"\\\"\\\"\\\"\\\"\\\"0\\\"\\\"\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.getCodeGenerator();
        boolean boolean9 = python3Target0.wantsBaseListener();
        java.lang.String str11 = python3Target0.encodeIntAsCharEscape(0);
        java.util.Set<java.lang.String> strSet12 = python3Target0.getBadWords();
        java.util.Set<java.lang.String> strSet13 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getAltLabelContextStructName("\"\"\"\"\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str6 = python3Target0.getVersion();
        boolean boolean7 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitRuleLabel("\"\\\"\\\"\\\"\\\"\\\"0\\\"\\\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"hi!\"", false);
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        java.lang.String str11 = python3Target0.language;
        int int12 = python3Target0.getSerializedATNSegmentLimit();
        int int13 = python3Target0.getInlineTestSetWordSize();
        boolean boolean14 = python3Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet15 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = python3Target0.getImplicitTokenLabel("\"\\\"5.2\\\"\"");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        boolean boolean7 = python3Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.getCodeGenerator();
        boolean boolean10 = python3Target0.templatesExist();
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("\"\\\"\\\"\\\"12\\\"\\\"\\\"\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getImplicitRuleLabel("");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) '#');
        python3Target0.language = "\"\".5.2.\"\"";
        int int11 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getAltLabelContextStructName("\"\"\"\\\"\\\" \\\"\\\"\"\"\"");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
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
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        python3Target13.badWords = strSet16;
        org.stringtemplate.v4.STGroup sTGroup19 = python3Target13.templates;
        int int20 = python3Target13.getInlineTestSetWordSize();
        java.lang.String str22 = python3Target13.encodeIntAsCharEscape((int) (byte) 10);
        org.stringtemplate.v4.STGroup sTGroup23 = python3Target13.templates;
        java.util.Set<java.lang.String> strSet24 = python3Target13.getBadWords();
        python3Target0.badWords = strSet24;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = python3Target0.getImplicitRuleLabel("\"\"\"\"\\0\"\"\"\"");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.loadTemplates();
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.getLanguage();
        java.util.Set<java.lang.String> strSet7 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitRuleLabel("\"\"\\\"\\\"\\\".5.2.\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        boolean boolean5 = python3Target0.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        int int7 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str8 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getElementName("\"\"a\"\"");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        int int7 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitTokenLabel("\"\"\"\"\\\"4.5.2.1\\\"\"\"\"\"");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getVersion();
        java.lang.String str6 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementName("\"\"\\\"\\\"\\\"\\\"64\\\"\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getListLabel("\"\"\"\"\\\"\\\"64\\\"\\\"\"\"\"\"");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
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
        java.lang.String[] strArray11 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getElementListName("\"\"\\\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getVersion();
        java.lang.String str6 = python3Target0.getLanguage();
        java.lang.String str7 = python3Target0.getLanguage();
        java.util.Set<java.lang.String> strSet8 = python3Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        boolean boolean10 = python3Target0.wantsBaseListener();
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\"\\\"\\\"\\\"0\\\"\\\"\\\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getListLabel("\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getListLabel("\"\"\\\" \\\"\"\"");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        int int7 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target0.getLanguage();
        java.lang.String str9 = python3Target0.getVersion();
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\"\\\"\\\"\\\"\\\"hi!\\\"\\\"\\\"\\\"\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target0.loadTemplates();
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"i\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getElementListName("\"\"\"\"\"\"\"\"\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitSetLabel("\"\"\"\"i\"\"\"\"");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        java.lang.String str8 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.templates;
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getElementName("\"\"\"\"\"hi!\"\"\"\"\"");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        int int8 = python3Target0.getInlineTestSetWordSize();
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.lang.String str10 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitSetLabel("\"\"\"\"\"\"#\"\"\"\"\"\"");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\".5.2.\"\"", false);
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"4.5.2.1\"\"\"\"\"", true);
        java.util.Set<java.lang.String> strSet10 = python3Target0.getBadWords();
        boolean boolean11 = python3Target0.supportsOverloadedMethods();
        java.lang.String str12 = python3Target0.language;
        java.lang.String str14 = python3Target0.encodeIntAsCharEscape(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target0.getTemplates();
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        java.util.Set<java.lang.String> strSet8 = python3Target0.getBadWords();
        java.util.Set<java.lang.String> strSet9 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getListLabel("\\\"4.5.2.1\\\"");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str5 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getElementName("\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        boolean boolean7 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.getTemplates();
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        java.util.Set<java.lang.String> strSet8 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getElementListName("\"\"\\\"\\\"\\\"\\\"hi!\\\"\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        python3Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getListLabel("\"\"\"\"\"\"#\"\"\"\"\"\"");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getElementName("\"\"\"\"\"\\\"\\\"\\\"\\\"\"\"\"\"\"");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getListLabel("\\\"a\\\"");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("@");
        python3Target0.language = "d";
        boolean boolean9 = python3Target0.templatesExist();
        boolean boolean10 = python3Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet11 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getImplicitSetLabel("_tset\"\"\\\"\\\"\\\"i\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        python3Target0.language = "\"\"\\\"hi!\\\"\"\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.getTemplates();
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        int int7 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getElementListName("\"\\\"64\\\"\"");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
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
        java.lang.String str22 = python3Target0.encodeIntAsCharEscape((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup23 = python3Target0.loadTemplates();
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        int int9 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        boolean boolean11 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getImplicitTokenLabel("\"\"\"\"64\"\"\"\"");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.templates;
        int int12 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getListLabel("_tset\"\"");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.getCodeGenerator();
        boolean boolean9 = python3Target0.wantsBaseListener();
        boolean boolean10 = python3Target0.supportsOverloadedMethods();
        int int11 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.getTemplates();
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
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
        java.lang.String[] strArray79 = new java.lang.String[] { "\\\".5.2.\\\"", "\"\"\"\"\"\"", "\\64", "a", "\"\\\"\\\"\\\"i\\\"\\\"\\\"\"", "\"\"\\\"\\\"4.5.2.1\\\"\\\"\"\"", "\"\"i\"\"", " ", "\\64", "\"12\"", "\"1\"", "\\1", "\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"", "12", "\"\"\"i\"\"\"", "\"\"\\0\"\"", "\"\\\"hi!\\\"\"", "\"\\12\"", "\"\"\\0\"\"", "\"\"\\1\"\"", "\"i\"", "\"\"\"4.5.2.1\"\"\"", "\\35", "\"\"\\\"\\\"\"\"", "\\64", "\"i\"", "\"\"\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\"\"\"", "\"i\"", "4.5.2.1", "hi!", "@", "\"\"\"\"\"\"", "\\\"4.5.2.1\\\"", " ", "\"12\"", "\"\"\"4.5.2.1\"\"\"", "\"\"\".5.2.\"\"\"", "\\\"\\\"4.5.2.1\\\"\\\"", "\"\"4.5.2.1\"\"", "\"\"d\"\"", "\"\"\"\\0\"\"\"", "a", "\"\"\"\"", "\\\"4.5.2.1\\\"", "\"\"\"\\0\"\"\"", "\\\"4.5.2.1\\\"", "\"\\12\"", "\\35", "\"i\"", "\"1\"", "1", "\\\"\\\"\\\"\\\"", "a" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        python3Target0.badWords = strSet80;
        int int83 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str84 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup85 = python3Target0.getTemplates();
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
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
        java.lang.String[] strArray79 = new java.lang.String[] { "\\\".5.2.\\\"", "\"\"\"\"\"\"", "\\64", "a", "\"\\\"\\\"\\\"i\\\"\\\"\\\"\"", "\"\"\\\"\\\"4.5.2.1\\\"\\\"\"\"", "\"\"i\"\"", " ", "\\64", "\"12\"", "\"1\"", "\\1", "\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"", "12", "\"\"\"i\"\"\"", "\"\"\\0\"\"", "\"\\\"hi!\\\"\"", "\"\\12\"", "\"\"\\0\"\"", "\"\"\\1\"\"", "\"i\"", "\"\"\"4.5.2.1\"\"\"", "\\35", "\"\"\\\"\\\"\"\"", "\\64", "\"i\"", "\"\"\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\"\"\"", "\"i\"", "4.5.2.1", "hi!", "@", "\"\"\"\"\"\"", "\\\"4.5.2.1\\\"", " ", "\"12\"", "\"\"\"4.5.2.1\"\"\"", "\"\"\".5.2.\"\"\"", "\\\"\\\"4.5.2.1\\\"\\\"", "\"\"4.5.2.1\"\"", "\"\"d\"\"", "\"\"\"\\0\"\"\"", "a", "\"\"\"\"", "\\\"4.5.2.1\\\"", "\"\"\"\\0\"\"\"", "\\\"4.5.2.1\\\"", "\"\\12\"", "\\35", "\"i\"", "\"1\"", "1", "\\\"\\\"\\\"\\\"", "a" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        python3Target0.badWords = strSet80;
        int int83 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str85 = python3Target0.getTargetStringLiteralFromString("\"a\"");
        boolean boolean86 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str88 = python3Target0.getElementListName("_tset\"\\\"\\\"\"");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        int int4 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getAltLabelContextStructName("\"\"\"\"\"\"\\1\"\"\"\"\"\"");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
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
        java.lang.String str27 = python3Target0.getTargetStringLiteralFromString("\"\\\"\\\"\"");
        java.lang.String str30 = python3Target0.getTargetStringLiteralFromString("\\1", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = python3Target0.getImplicitSetLabel("\"\"\".5.2.\"\"\"");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String str3 = python3Target0.language;
        java.lang.String str4 = python3Target0.getVersion();
        python3Target0.language = "\"\"\\\"\\\"\"\"";
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape(29);
        java.lang.String str9 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitRuleLabel("\".5.2.\"");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        int int8 = python3Target0.getInlineTestSetWordSize();
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.lang.String str10 = python3Target0.language;
        boolean boolean11 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getAltLabelContextStructName("\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"Context\"");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.loadTemplates();
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String[] strArray4 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getListLabel("\"\\\"\\\"12\\\"\\\"\"");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.util.Set<java.lang.String> strSet1 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.loadTemplates();
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\".5.2.\"\"", false);
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"4.5.2.1\"\"\"\"\"", true);
        java.util.Set<java.lang.String> strSet10 = python3Target0.getBadWords();
        java.lang.String str12 = python3Target0.encodeIntAsCharEscape(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getListLabel("\"\"\"\\64\"\"\"");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        boolean boolean7 = python3Target0.templatesExist();
        int int8 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getListLabel("");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.getTemplates();
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
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
        java.lang.String[] strArray11 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.getTemplates();
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getImplicitTokenLabel("\"\"\\\"\\\" \\\"\\\"\"\"");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getImplicitSetLabel("\"\\\"\\\"hi!\\\"\\\"\"");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        int int7 = python3Target0.getInlineTestSetWordSize();
        int int8 = python3Target0.getInlineTestSetWordSize();
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.loadTemplates();
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        java.lang.String str7 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitRuleLabel("\\\"#\\\"");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = python3Target0.getImplicitRuleLabel("\"\"\\\"\\\"\\\"\\\"64\\\"\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        java.util.Set<java.lang.String> strSet7 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getElementName("\"4.5.2.1\"");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        boolean boolean3 = python3Target0.templatesExist();
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("tset\\\"\\\".5.2.\\\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.loadTemplates();
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
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
        boolean boolean13 = python3Target0.wantsBaseVisitor();
        int int14 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target0.gen;
        boolean boolean16 = python3Target0.supportsOverloadedMethods();
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = python3Target0.getAltLabelContextStructName("\\\"\\\"\\\"12\\\"\\\"\\\"");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.getCodeGenerator();
        boolean boolean9 = python3Target0.wantsBaseListener();
        boolean boolean10 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitRuleLabel("ython");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.getTemplates();
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getLanguage();
        java.lang.String str7 = python3Target0.getVersion();
        java.util.Set<java.lang.String> strSet8 = python3Target0.getBadWords();
        java.lang.String str9 = python3Target0.getLanguage();
        boolean boolean10 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getAltLabelContextStructName("\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"1\"\"", false);
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"hi!\"\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.gen;
        int int12 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getListLabel("_");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("i");
        int int5 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str7 = python3Target0.encodeIntAsCharEscape(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getElementListName("\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"Context\"");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        int int4 = python3Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        python3Target3.targetCharValueEscape = strArray7;
        python3Target0.targetCharValueEscape = strArray7;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitRuleLabel("\"\"\\\"\\\"\\\"i\\\"\\\"\\\"\"Context\"");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.util.Set<java.lang.String> strSet7 = python3Target0.badWords;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        python3Target11.targetCharValueEscape = strArray15;
        python3Target8.targetCharValueEscape = strArray15;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray15;
        python3Target0.targetCharValueEscape = strArray15;
        java.lang.String str20 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = python3Target0.getAltLabelContextStructName("\"\"\\\"\\\"\\\"12\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        python3Target0.addBadWords();
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"", false);
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        int int11 = python3Target10.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target10.language;
        java.lang.String str13 = python3Target10.getVersion();
        int int14 = python3Target10.getInlineTestSetWordSize();
        java.lang.String str15 = python3Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target10.gen;
        python3Target10.addBadWords();
        java.util.Set<java.lang.String> strSet18 = python3Target10.getBadWords();
        java.util.Set<java.lang.String> strSet19 = python3Target10.getBadWords();
        python3Target0.badWords = strSet19;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = python3Target0.getImplicitSetLabel("\"\"\"\"64\"\"\"\"");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getElementListName("\"\\\"\\\"\\\"\\\"\\\"i\\\"\\\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        int int6 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"hi!\"", false);
        java.util.Set<java.lang.String> strSet10 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getElementName("\"\\\"\\\"\\\"i\\\"\\\"\\\"\"");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        java.util.Set<java.lang.String> strSet8 = python3Target0.getBadWords();
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("#");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getListLabel("\"\"\"\\64\"\"\"");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        python3Target0.addBadWords();
        java.lang.String str6 = python3Target0.language;
        java.util.Set<java.lang.String> strSet7 = python3Target0.badWords;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"d\"\"\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitSetLabel("@");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("i", true);
        java.lang.String str10 = python3Target0.encodeIntAsCharEscape(10);
        java.lang.String str11 = python3Target0.getVersion();
        boolean boolean12 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getElementListName("\"\"_\"\"");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
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
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("\"\\\"\\\"4.5.2.1\\\"\\\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getAltLabelContextStructName("\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        java.util.Set<java.lang.String> strSet8 = python3Target0.getBadWords();
        java.lang.String str11 = python3Target0.getTargetStringLiteralFromString("\" \"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getListLabel("_\"\"@\"\"");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        boolean boolean7 = python3Target0.templatesExist();
        boolean boolean8 = python3Target0.wantsBaseVisitor();
        java.lang.String str9 = python3Target0.getVersion();
        java.util.Set<java.lang.String> strSet10 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitTokenLabel("\"\"\"#\"\"\"");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str11 = python3Target0.getVersion();
        java.lang.String[] strArray12 = new java.lang.String[] {};
        python3Target0.targetCharValueEscape = strArray12;
        java.lang.String str16 = python3Target0.getTargetStringLiteralFromString("\"\\\"\\\"0\\\"\\\"\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = python3Target0.getAltLabelContextStructName("\"\"\"\"i\"\"\"\"");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        int int7 = python3Target0.getInlineTestSetWordSize();
        int int8 = python3Target0.getInlineTestSetWordSize();
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitRuleLabel("");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        boolean boolean2 = python3Target0.templatesExist();
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (short) 100);
        int int5 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.getTemplates();
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        python3Target0.language = "@";
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\\1\"");
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getAltLabelContextStructName("\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str3 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target0.loadTemplates();
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        boolean boolean6 = python3Target0.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        boolean boolean8 = python3Target0.templatesExist();
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitRuleLabel("@");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getLanguage();
        java.lang.String[] strArray7 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitSetLabel("\"\"\\\"hi!\\\"\"\"");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.getCodeGenerator();
        boolean boolean9 = python3Target0.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getElementListName("\"\\\"\\\"_tseta\\\"\\\"\"");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        boolean boolean7 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitSetLabel("\"\\\"\\\"12\\\"\\\"\"");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str8 = python3Target0.getLanguage();
        java.lang.String str10 = python3Target0.encodeIntAsCharEscape(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getAltLabelContextStructName("\"\"\"\"\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        boolean boolean6 = python3Target0.wantsBaseVisitor();
        java.lang.String[] strArray7 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getListLabel("\\\"@\\\"");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        boolean boolean7 = python3Target0.templatesExist();
        java.util.Set<java.lang.String> strSet8 = python3Target0.getBadWords();
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        java.lang.String str10 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet12 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getListLabel("\"\\\"\\\"1\\\"\\\"\"");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\\1\"\"\"\"");
        java.lang.String[] strArray9 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitSetLabel("\"se\"");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("@");
        java.lang.String str7 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.gen;
        boolean boolean9 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitSetLabel("\"12\"");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python3Target0.getCodeGenerator();
        java.lang.String str25 = python3Target0.getTargetStringLiteralFromString("tho", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = python3Target0.getListLabel("\\\".5.2.\\\"");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        python3Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet7 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.getTemplates();
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String str3 = python3Target0.language;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        int int7 = python3Target6.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target6.language;
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target6.templates;
        boolean boolean10 = python3Target6.templatesExist();
        java.lang.String[] strArray11 = python3Target6.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet12 = python3Target6.badWords;
        boolean boolean13 = python3Target6.templatesExist();
        boolean boolean14 = python3Target6.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target6.templates;
        java.util.Set<java.lang.String> strSet16 = python3Target6.getBadWords();
        python3Target0.badWords = strSet16;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = python3Target0.getImplicitRuleLabel("_tset\\\"");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str6 = python3Target0.language;
        java.lang.String str7 = python3Target0.getVersion();
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("1", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitSetLabel("");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
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
        boolean boolean13 = python3Target0.wantsBaseVisitor();
        int int14 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = python3Target0.getImplicitTokenLabel("\\\"\\\"\\\"\\\"64\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str6 = python3Target0.getVersion();
        java.lang.String str7 = python3Target0.getVersion();
        int int8 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitSetLabel("\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getImplicitSetLabel("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        int int11 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getImplicitTokenLabel("\\\"\\\"\\\"64\\\"\\\"\\\"");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        int int7 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getElementListName("\"\"\"\"\"\"\"\\\"\\\"0\\\"\\\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
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
        python3Target0.language = "\\\"\\\"12\\\"\\\"";
        java.lang.String str29 = python3Target0.getTargetStringLiteralFromString("\"\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\"\"");
        python3Target0.addBadWords();
        java.util.Set<java.lang.String> strSet31 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = python3Target0.getAltLabelContextStructName("\"i\"");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\\1");
        boolean boolean8 = python3Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target0.getCodeGenerator();
        int int11 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getAltLabelContextStructName("\"\"\"\"\"\"\\\"i\\\"\"\"\"\"\"\"");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitRuleLabel("\"\"4.5.2.1\"\"");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        python3Target0.language = "\"\"\"#\"\"\"";
        int int8 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitSetLabel("\"\".5.2.\"\"");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.gen;
        java.lang.String str10 = python3Target0.encodeIntAsCharEscape(0);
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        java.lang.String str14 = python3Target0.getTargetStringLiteralFromString("\"\"\\\"\\\"\\\"#\\\"\\\"\\\"\"\"", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = python3Target0.getImplicitSetLabel("\"\"\"\\\"\\\"4.5.2.1\\\"\\\"\"\"\"");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        boolean boolean6 = python3Target0.templatesExist();
        java.util.Set<java.lang.String> strSet7 = python3Target0.getBadWords();
        boolean boolean8 = python3Target0.wantsBaseListener();
        java.lang.String str11 = python3Target0.getTargetStringLiteralFromString("\"\\\"\\\"\\\"\\\"12\\\"\\\"\\\"\\\"\\\"Contex\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getAltLabelContextStructName("_tset\\\"");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
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
        java.lang.String[] strArray11 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target12.language;
        java.lang.String str15 = python3Target12.getVersion();
        int int16 = python3Target12.getInlineTestSetWordSize();
        java.lang.String str17 = python3Target12.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python3Target12.gen;
        python3Target12.addBadWords();
        java.util.Set<java.lang.String> strSet20 = python3Target12.getBadWords();
        java.lang.String str22 = python3Target12.getTargetStringLiteralFromString("#");
        org.stringtemplate.v4.STGroup sTGroup23 = python3Target12.templates;
        java.util.Set<java.lang.String> strSet24 = python3Target12.badWords;
        python3Target0.badWords = strSet24;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = python3Target0.getListLabel("\\\"i\\\"");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getListLabel("\\\"\\\"\\\"\\\"#\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String str5 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        java.lang.String str7 = python3Target0.getVersion();
        boolean boolean8 = python3Target0.supportsOverloadedMethods();
        java.lang.String str10 = python3Target0.encodeIntAsCharEscape(1);
        java.lang.String str12 = python3Target0.encodeIntAsCharEscape(64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getElementListName("0");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"hi!\"", false);
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        java.lang.String str11 = python3Target0.language;
        int int12 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target0.loadTemplates();
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitTokenLabel("\"\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"", false);
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getImplicitTokenLabel("_\"\"\"\"\\\"\\\"0\\\"\\\"\"\"\"\"");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\\1");
        boolean boolean8 = python3Target0.wantsBaseVisitor();
        boolean boolean9 = python3Target0.templatesExist();
        int int10 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("", true);
        boolean boolean14 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = python3Target0.getAltLabelContextStructName("\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        python3Target0.addBadWords();
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"", false);
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        int int11 = python3Target10.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target10.language;
        java.lang.String str13 = python3Target10.getVersion();
        int int14 = python3Target10.getInlineTestSetWordSize();
        java.lang.String str15 = python3Target10.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target10.gen;
        python3Target10.addBadWords();
        java.util.Set<java.lang.String> strSet18 = python3Target10.getBadWords();
        java.util.Set<java.lang.String> strSet19 = python3Target10.getBadWords();
        python3Target0.badWords = strSet19;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = python3Target0.getElementListName("\"\"_tseta\"\"");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = python3Target0.getImplicitSetLabel("\"\"\"\\\"hi!\\\"\"\"\"");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        boolean boolean8 = python3Target0.wantsBaseListener();
        java.lang.String str9 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitRuleLabel("\"set\\\"\\\".5.2.\\\"\"");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
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
        java.lang.String str12 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target0.templates;
        python3Target0.language = "\"\"\"\"\"hi!\"\"\"\"\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = python3Target0.getElementListName("\"\"\\\"\\\"\\\"#\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getListLabel("\"\"\"hi!\"\"\"");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(10);
        boolean boolean7 = python3Target0.templatesExist();
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.getCodeGenerator();
        python3Target0.language = "\"\"\\\"4.5.2.1\\\"\"\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getImplicitTokenLabel("\"\"\"\\\"\\\"\\\"d\\\"\\\"\\\"\"\"\"");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target0.gen;
        java.lang.String str13 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getListLabel("\\\"\\\"\\\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
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
        java.lang.String str12 = python3Target0.getVersion();
        java.lang.String[] strArray13 = python3Target0.targetCharValueEscape;
        java.lang.String str15 = python3Target0.getTargetStringLiteralFromString("\"\"\"hi!\"\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = python3Target0.getImplicitSetLabel("\"\"\"\\1\"\"\"");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getLanguage();
        boolean boolean6 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementName("\"\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\\1");
        boolean boolean8 = python3Target0.wantsBaseVisitor();
        boolean boolean9 = python3Target0.templatesExist();
        int int10 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("", true);
        java.lang.String str16 = python3Target0.getTargetStringLiteralFromString("\\\"\\\"0\\\"\\\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = python3Target0.getListLabel("5.2Context");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        java.lang.String str8 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.templates;
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getElementListName("\"\\\"\\\"#\\\"\\\"\"");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
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
        boolean boolean13 = python3Target0.wantsBaseListener();
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = python3Target0.getElementName("\"\"\\\"\\\"4.5.2.1\\\"\\\"\"\"");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.language;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getListLabel("\"\"\"\"\"\\\"\\\"\\\"i\\\"\\\"\\\"\"\"\"\"\"");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        boolean boolean2 = python3Target0.templatesExist();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitTokenLabel("\"\"\\\"\\\"\\\"i\\\"\\\"\\\"\"Context\"");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("i");
        python3Target0.language = "hi!";
        java.lang.String str9 = python3Target0.getVersion();
        boolean boolean10 = python3Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.getTemplates();
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        int int8 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitSetLabel("\\\"5.2\\\"");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitTokenLabel("\\\"\\\"\\\"\\\"\\\"64\\\"\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"i\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.loadTemplates();
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        python3Target0.addBadWords();
        java.lang.String str6 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitSetLabel(".5.2.");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitRuleLabel("\"\"\"\"\"64\"\"\"\"\"");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"#\"");
        java.lang.String str11 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"\"\"\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.getTemplates();
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getListLabel("\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        java.lang.String str8 = python3Target0.language;
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.loadTemplates();
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet5 = python3Target0.getBadWords();
        java.lang.String str7 = python3Target0.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.templates;
        java.lang.String str11 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"hi!\"\"\"\"\"\"", true);
        java.lang.String str12 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getImplicitSetLabel("\"\"\\\"\\\"\\\"\\\"64\\\"\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str6 = python3Target0.language;
        java.lang.String str7 = python3Target0.getVersion();
        java.lang.String str8 = python3Target0.getVersion();
        boolean boolean9 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getAltLabelContextStructName("\\\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        boolean boolean7 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getAltLabelContextStructName("\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        python3Target0.addBadWords();
        java.lang.String str7 = python3Target0.encodeIntAsCharEscape(100);
        java.lang.String str8 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getVersion();
        int int10 = python3Target0.getInlineTestSetWordSize();
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getImplicitSetLabel("\"\"\"\\\"\\\"\\\"i\\\"\\\"\\\"\"\"\"");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("i");
        python3Target0.language = "hi!";
        java.lang.String str10 = python3Target0.encodeIntAsCharEscape((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitSetLabel("\"\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        java.util.Set<java.lang.String> strSet10 = python3Target0.getBadWords();
        int int11 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean12 = python3Target0.templatesExist();
        java.lang.String[] strArray13 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target0.loadTemplates();
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        int int6 = python3Target0.getInlineTestSetWordSize();
        int int7 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getElementName("\"_\"\"a\"\"\"");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        int int4 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\\64", true);
        boolean boolean8 = python3Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        boolean boolean10 = python3Target0.wantsBaseListener();
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        boolean boolean13 = python3Target11.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target11.gen;
        boolean boolean15 = python3Target11.wantsBaseVisitor();
        boolean boolean16 = python3Target11.supportsOverloadedMethods();
        java.lang.String str19 = python3Target11.getTargetStringLiteralFromString("\\0", false);
        java.lang.String str22 = python3Target11.getTargetStringLiteralFromString("\"d\"", false);
        python3Target11.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python3Target11.getCodeGenerator();
        java.util.Set<java.lang.String> strSet25 = python3Target11.badWords;
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target();
        int int27 = python3Target26.getInlineTestSetWordSize();
        java.lang.String str28 = python3Target26.language;
        org.stringtemplate.v4.STGroup sTGroup29 = python3Target26.templates;
        boolean boolean30 = python3Target26.templatesExist();
        boolean boolean31 = python3Target26.wantsBaseListener();
        boolean boolean32 = python3Target26.wantsBaseListener();
        java.lang.String[] strArray33 = python3Target26.targetCharValueEscape;
        python3Target11.targetCharValueEscape = strArray33;
        python3Target0.targetCharValueEscape = strArray33;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = python3Target0.getImplicitRuleLabel("\"_\\\"#\\\"\"");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        int int8 = python3Target0.getInlineTestSetWordSize();
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet10 = python3Target0.badWords;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\"");
        java.util.Set<java.lang.String> strSet13 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target0.loadTemplates();
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 1);
        boolean boolean5 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getElementListName("\"\"\"\"Python3\"\"\"\"");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"\"\\0\"\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitSetLabel("\"\"\"\"\"_\\\"1\\\"\"\"\"\"\"");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str7 = python3Target5.getTargetStringLiteralFromString("\"\"");
        java.lang.String[] strArray8 = python3Target5.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray8;
        python3Target0.addBadWords();
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getListLabel("\"\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        int int8 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitRuleLabel("\"\\\"\\\"\\\"d\\\"\\\"\\\"\"");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
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
        python3Target0.language = "\\\"\\\"\\\"i\\\"\\\"\\\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getImplicitRuleLabel("\"\\\"\\\"0\\\"\\\"\"");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getAltLabelContextStructName("\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.util.Set<java.lang.String> strSet6 = python3Target0.getBadWords();
        java.util.Set<java.lang.String> strSet7 = python3Target0.badWords;
        boolean boolean8 = python3Target0.templatesExist();
        java.lang.String[] strArray9 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitRuleLabel("\"\"\"\\64\"\"\"");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("i");
        int int5 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        int int7 = python3Target6.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target6.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        int int10 = python3Target9.getInlineTestSetWordSize();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "" };
        python3Target9.targetCharValueEscape = strArray13;
        python3Target6.targetCharValueEscape = strArray13;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray13;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray13;
        python3Target0.targetCharValueEscape = strArray13;
        java.lang.String str20 = python3Target0.encodeIntAsCharEscape((int) 'a');
        boolean boolean21 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = python3Target0.getImplicitRuleLabel("1");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\\1");
        boolean boolean8 = python3Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.templates;
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        boolean boolean11 = python3Target0.wantsBaseListener();
        int int12 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getListLabel("\"\"\"\"\"#\"\"\"\"\"");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        int int7 = python3Target6.getInlineTestSetWordSize();
        boolean boolean8 = python3Target6.wantsBaseVisitor();
        java.lang.String str9 = python3Target6.getLanguage();
        java.lang.String str12 = python3Target6.getTargetStringLiteralFromString("\"\".5.2.\"\"", false);
        java.lang.String str15 = python3Target6.getTargetStringLiteralFromString("\"\"\"\"\"4.5.2.1\"\"\"\"\"", true);
        java.util.Set<java.lang.String> strSet16 = python3Target6.getBadWords();
        java.lang.String str18 = python3Target6.encodeIntAsCharEscape(0);
        boolean boolean19 = python3Target6.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet20 = python3Target6.getBadWords();
        python3Target0.badWords = strSet20;
        org.stringtemplate.v4.STGroup sTGroup22 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = python3Target0.getListLabel("_tset\"\"\\\"\\\"\\\"i\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        java.util.Set<java.lang.String> strSet7 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitRuleLabel("\"\"\"\"\\12\"\"\"\"");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        python3Target0.addBadWords();
        java.lang.String str7 = python3Target0.encodeIntAsCharEscape(100);
        java.lang.String str8 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitSetLabel("\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getLanguage();
        java.util.Set<java.lang.String> strSet7 = python3Target0.badWords;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\"\" \"\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.getTemplates();
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) '#');
        python3Target0.language = "\"\".5.2.\"\"";
        int int11 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target0.getLanguage();
        java.util.Set<java.lang.String> strSet13 = python3Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = python3Target0.getElementListName("\"\"\"\"\\\"\\\"1\\\"\\\"\"\"\"\"");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitRuleLabel("\"\"\"\"\"\"\"\"\\1\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.util.Set<java.lang.String> strSet6 = python3Target0.getBadWords();
        java.util.Set<java.lang.String> strSet7 = python3Target0.badWords;
        boolean boolean8 = python3Target0.templatesExist();
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitTokenLabel("_tset\\1");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\\1");
        boolean boolean8 = python3Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.templates;
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.getCodeGenerator();
        python3Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getImplicitSetLabel("\"\"\"\"\"\\\"i\\\"\"\"\"\"\"");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        java.lang.String str3 = python3Target0.language;
        java.lang.String[] strArray4 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitTokenLabel("\"6\"");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.templates;
        java.util.Set<java.lang.String> strSet9 = python3Target0.getBadWords();
        boolean boolean10 = python3Target0.wantsBaseListener();
        java.lang.String str11 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getElementListName("\"\"\"\\\"\\\"\\\"0\\\"\\\"\\\"\"\"\"");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        int int8 = python3Target0.getInlineTestSetWordSize();
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet10 = python3Target0.badWords;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\"");
        boolean boolean13 = python3Target0.templatesExist();
        java.lang.String str14 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = python3Target0.getImplicitTokenLabel("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"Context\"\"\"\"");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        int int6 = python3Target0.getInlineTestSetWordSize();
        int int7 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.getTemplates();
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
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
        python3Target0.language = "\"\"\\\"\\\"hi!\\\"\\\"\"\"";
        java.lang.String str26 = python3Target0.getVersion();
        java.lang.String[] strArray27 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = python3Target0.getImplicitSetLabel("\\\"\\\" \\\"\\\"");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getVersion();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("1");
        boolean boolean9 = python3Target0.templatesExist();
        java.util.Set<java.lang.String> strSet10 = python3Target0.getBadWords();
        boolean boolean11 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getListLabel("\"\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        java.lang.String str8 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitTokenLabel("\"\"\"\\64\"\"\"");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getVersion();
        java.util.Set<java.lang.String> strSet7 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitTokenLabel("\"\"\\\"\\\" \\\"\\\"\"\"");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
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
        java.lang.String[] strArray23 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = python3Target0.getElementListName("\"_tset\\\"\\\"\\\"\\\"0\\\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str6 = python3Target0.language;
        java.lang.String str7 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\"hi!\"\"");
        boolean boolean10 = python3Target0.templatesExist();
        java.util.Set<java.lang.String> strSet11 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getImplicitTokenLabel("\"\"\"\"\\\"hi!\\\"\"\"\"\"");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
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
        boolean boolean14 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target0.loadTemplates();
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"i\"\"");
        python3Target0.addBadWords();
        java.lang.String str9 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitSetLabel("\"\"\"\"12\"\"\"\"");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\".5.2.\"\"", false);
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"4.5.2.1\"\"\"\"\"", true);
        java.util.Set<java.lang.String> strSet10 = python3Target0.getBadWords();
        java.lang.String str12 = python3Target0.encodeIntAsCharEscape(0);
        boolean boolean13 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getImplicitRuleLabel("\"\"\"\"\"\"\"\\\"\\\"0\\\"\\\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getVersion();
        java.lang.String str6 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitSetLabel("\"\\\"\\\"\\\"\\\"12\\\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
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
        java.lang.String[] strArray12 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getAltLabelContextStructName("\"\"\"1\"\"\"");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.getCodeGenerator();
        boolean boolean9 = python3Target0.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.loadTemplates();
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitRuleLabel("\"\"\"\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\"\"\"\"");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("i");
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getVersion();
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getListLabel("\"\\\"\\\"\\\"12\\\"\\\"\\\"\"");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        boolean boolean6 = python3Target0.wantsBaseVisitor();
        java.lang.String str7 = python3Target0.language;
        java.lang.String str8 = python3Target0.getVersion();
        java.lang.String str11 = python3Target0.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target0.loadTemplates();
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet10 = python3Target0.badWords;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str12 = python3Target11.language;
        java.lang.String[] strArray13 = python3Target11.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray13;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = python3Target0.getImplicitTokenLabel("\"\"Python3\"\"");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.addBadWords();
        python3Target0.addBadWords();
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getElementName("\"\"\\35\"\"");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.getCodeGenerator();
        java.lang.String str11 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"hi!\"\"\"\"\"\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getElementListName("\"\"\"\"\"\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"i\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getElementName("\"\"12\"\"");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) '4');
        java.lang.String str10 = python3Target0.encodeIntAsCharEscape((int) '#');
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\\\"\\\"\\\"\\\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getAltLabelContextStructName("\"\\\"\\\"\\\"i\\\"\\\"\\\"\\\"Contex\"");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        int int8 = python3Target0.getInlineTestSetWordSize();
        python3Target0.language = "\"\"\"\"\"\"";
        java.lang.String str11 = python3Target0.getVersion();
        java.lang.String str12 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getListLabel("_\"\"@\"\"");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        int int8 = python3Target0.getInlineTestSetWordSize();
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.lang.String str10 = python3Target0.language;
        boolean boolean11 = python3Target0.supportsOverloadedMethods();
        boolean boolean12 = python3Target0.wantsBaseListener();
        boolean boolean13 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getImplicitRuleLabel("\\\"\\\"5.2\\\"\\\"");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getElementListName("\"\\\"\\\"5.2\\\"\\\"\"");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"1\"\"", false);
        java.util.Set<java.lang.String> strSet8 = python3Target0.getBadWords();
        java.lang.String str9 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitSetLabel("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"Context\"\"\"\"");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        int int6 = python3Target5.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target5.language;
        java.lang.String str8 = python3Target5.getVersion();
        int int9 = python3Target5.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target5.getLanguage();
        java.lang.String str13 = python3Target5.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet14 = python3Target5.badWords;
        python3Target0.badWords = strSet14;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target0.getCodeGenerator();
        java.lang.String str17 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target0.loadTemplates();
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("i");
        java.lang.String str7 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.loadTemplates();
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
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
        int int13 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getAltLabelContextStructName("\"\"\"\"\\\"\\\"64\\\"\\\"\"\"\"\"");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("@");
        java.lang.String str7 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.templates;
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.getTemplates();
    }
}

