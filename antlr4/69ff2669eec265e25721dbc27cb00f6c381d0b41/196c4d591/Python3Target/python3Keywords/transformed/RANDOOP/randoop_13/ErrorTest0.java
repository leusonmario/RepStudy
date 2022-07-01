import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0001");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.getTemplates();
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitRuleLabel("d");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getElementListName("4.5.2.1");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        java.lang.String[] strArray2 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getImplicitSetLabel("hi!");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getImplicitSetLabel("");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.loadTemplates();
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = python3Target0.getElementName("\\0");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target0.loadTemplates();
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitTokenLabel("hi!");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getAltLabelContextStructName("d");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitRuleLabel("hi!");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target0.loadTemplates();
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup1 = python3Target0.loadTemplates();
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.loadTemplates();
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.getTemplates();
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = python3Target0.getListLabel("4.5.2.1");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getImplicitSetLabel("\"\"\"\"");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getListLabel("4.5.2.1");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitRuleLabel("\"i\"");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitRuleLabel("\"4.5.2.1\"");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getElementListName("hi!");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getAltLabelContextStructName("\\12");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementListName("4.5.2.1");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getElementListName("\"\"");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getListLabel("d");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.loadTemplates();
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = python3Target0.getAltLabelContextStructName("hi!");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getElementName("");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitSetLabel("\"\"\"i\"\"\"");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.getTemplates();
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getListLabel("\"\"\"i\"\"\"");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementName("\"\"i\"\"");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.getTemplates();
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getListLabel("\"\"");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitRuleLabel("4.5.2.1");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getListLabel("\"\"i\"\"");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getElementName("\\0");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getElementListName("d");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getElementListName("d");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.getTemplates();
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getElementListName("\"hi!\"");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.getTemplates();
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        int int4 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitTokenLabel("hi!");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitTokenLabel("\\12");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitSetLabel("\"\"\"i\"\"\"");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementListName("\"i\"");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        int int4 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitSetLabel("\"\"4.5.2.1\"\"");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        int int8 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getListLabel("\"\\1\"");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str8 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitRuleLabel("\\12");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.util.Set<java.lang.String> strSet7 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getListLabel("");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
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
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target0.loadTemplates();
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getListLabel("\"\\1\"");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getImplicitSetLabel("\"\\12\"");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getListLabel("\"\"\"i\"\"\"");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getImplicitTokenLabel("\\12");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getElementListName("\"\"hi!\"\"");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.loadTemplates();
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("i");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.getTemplates();
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str5 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.loadTemplates();
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitSetLabel("@");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str8 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getElementListName("\"\"4.5.2.1\"\"");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getElementName("\"\"4.5.2.1\"\"");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitTokenLabel("\"\"4.5.2.1\"\"");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementListName("\"\"\"\"\"4.5.2.1\"\"\"\"\"");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        int int6 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.getTemplates();
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target0.loadTemplates();
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target0.loadTemplates();
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = python3Target0.getElementListName("hi!");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = python3Target0.getListLabel("\"\"\"\"\"4.5.2.1\"\"\"\"\"");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitSetLabel("\"\"\"\"\"\"");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.getTemplates();
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getElementName("\"\"hi!\"\"");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        int int9 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitRuleLabel("\"\".5.2.\"\"");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"i\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getElementName("\"\"\"\"");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
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
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\"i\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getAltLabelContextStructName("\"\"");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet10 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.getTemplates();
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getAltLabelContextStructName("1");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\".5.2.\"\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.loadTemplates();
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"hi!\"", false);
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitTokenLabel("\\1");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        boolean boolean9 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.getTemplates();
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\12");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitRuleLabel("\"\"\"hi!\"\"\"");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"hi!\"", false);
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getElementListName("1");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitTokenLabel("\\\"4.5.2.1\\\"");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        python3Target0.language = "@";
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitTokenLabel("\\0");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.gen;
        java.lang.String str10 = python3Target0.encodeIntAsCharEscape(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.loadTemplates();
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        boolean boolean5 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getAltLabelContextStructName("\"hi!\"");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getListLabel("\"\\1\"");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.getTemplates();
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str3 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitRuleLabel("@");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = python3Target0.getAltLabelContextStructName("4.5.2.1");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str3 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getAltLabelContextStructName("\"\"\"\"i\"\"\"\"");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("i", true);
        java.lang.String str10 = python3Target0.encodeIntAsCharEscape(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.loadTemplates();
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getElementName("\\1");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        int int9 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitRuleLabel("\"\\12\"");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getListLabel("\"\"");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("i");
        int int5 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getAltLabelContextStructName("\"i\"");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = python3Target0.getImplicitSetLabel("\"\\0\"");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"hi!\"", false);
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        java.lang.String str11 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.loadTemplates();
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String str3 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getAltLabelContextStructName("\"\".5.2.\"\"");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = python3Target0.getImplicitSetLabel("\"\"4.5.2.1\"\"");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getImplicitTokenLabel("\"\".5.2.\"\"");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getListLabel("\\64");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("@");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitRuleLabel("d");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        java.lang.String str8 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitTokenLabel("\"\"\"i\"\"\"");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"i\"");
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getListLabel("\"\"hi!\"\"");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("@");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getElementListName("4.5.2.1");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
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
        java.lang.String[] strArray20 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup21 = python3Target0.loadTemplates();
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.getTemplates();
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getImplicitTokenLabel("\"i\"");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitRuleLabel("\\1");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getListLabel("\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementName("\"\"\"hi!\"\"\"");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getImplicitTokenLabel("\"\"i\"\"");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getAltLabelContextStructName("\"\"\"\"");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getAltLabelContextStructName("hi!");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("i");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitRuleLabel("\"\"");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
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
        int int12 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getImplicitTokenLabel("\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.getCodeGenerator();
        boolean boolean9 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.loadTemplates();
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
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
        java.lang.String str13 = python3Target0.getImplicitSetLabel("\"\"4.5.2.1\"\"");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitTokenLabel("\"i\"");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getImplicitRuleLabel("\\1");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getElementName("");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.getLanguage();
        python3Target0.language = "\"\"\"4.5.2.1\"\"\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.getTemplates();
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitTokenLabel("\"\"\"i\"\"\"");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.getTemplates();
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.loadTemplates();
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitTokenLabel("\"\"\"\"\"\"");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitTokenLabel("i");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getAltLabelContextStructName(" ");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"i\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitRuleLabel("\\64");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"hi!\"", false);
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitSetLabel("\"\"\"\"\"4.5.2.1\"\"\"\"\"");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.getTemplates();
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getAltLabelContextStructName("\"\"hi!\"\"");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getElementName("\"\"\"\"i\"\"\"\"");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet5 = python3Target0.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        python3Target0.language = "\"\"\"i\"\"\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getAltLabelContextStructName("\"i\"");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitTokenLabel("1");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getAltLabelContextStructName("\\0");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet5 = python3Target0.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementName("\\0");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getElementName("4.5.2.1");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getElementName("\"@\"");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.loadTemplates();
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getElementListName("\\64");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.getTemplates();
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.getLanguage();
        python3Target0.language = "\"\"\"4.5.2.1\"\"\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getElementName("\".5.2.\"");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getListLabel("\"\"\\0\"\"");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getElementListName("\"\"\\0\"\"");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getAltLabelContextStructName("\"\\1\"");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getAltLabelContextStructName("\"12\"");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        boolean boolean7 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getAltLabelContextStructName("\"\\0\"");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("i");
        int int5 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getElementName("\"\"\\\"i\\\"\"\"");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getElementListName("");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("hi!", false);
        python3Target0.language = "\"\"i\"\"";
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\"4.5.2.1\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getListLabel("\"\"hi!\"\"");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getVersion();
        java.lang.String str6 = python3Target0.getLanguage();
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitRuleLabel("\"\\12\"");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getElementName("\"\\\"\\\"4.5.2.1\\\"\\\"\"");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("i");
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getListLabel("3");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"4.5.2.1\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitTokenLabel("\"\"\\\"i\\\"\"\"");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementName("\"\\\"\\\"\\\"i\\\"\\\"\\\"\"");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.getTemplates();
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.gen;
        java.lang.String str10 = python3Target0.encodeIntAsCharEscape(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getElementListName("4.5.2.1");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getAltLabelContextStructName("\\64");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getLanguage();
        boolean boolean6 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementListName("\"i\"");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        int int7 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getElementName("\\\"hi!\\\"");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getElementName("\" \"");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        python3Target0.addBadWords();
        java.lang.String str7 = python3Target0.encodeIntAsCharEscape(100);
        java.lang.String str8 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.loadTemplates();
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitTokenLabel("\\\"4.5.2.1\\\"");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.getTemplates();
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getAltLabelContextStructName("\"i\"");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str8 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitTokenLabel("\"\\\"\\\"\\\"i\\\"\\\"\\\"\"");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str6 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"4.5.2.1\"\"\"\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitTokenLabel("\\\"hi!\\\"");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getAltLabelContextStructName("1");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        java.lang.String str3 = python3Target0.getLanguage();
        boolean boolean4 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.getTemplates();
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.getTemplates();
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        int int8 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.loadTemplates();
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\".5.2.\"\"", false);
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"4.5.2.1\"\"\"\"\"", true);
        java.util.Set<java.lang.String> strSet10 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getElementListName("\"\\\"i\\\"\"");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitSetLabel("\"\\12\"");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitRuleLabel("");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        boolean boolean7 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitTokenLabel("\"\"\".5.2.\"\"\"");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet10 = python3Target0.getBadWords();
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getElementListName("\"d\"");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        int int8 = python3Target0.getInlineTestSetWordSize();
        python3Target0.language = "\"\"\"\"\"\"";
        java.lang.String str11 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.loadTemplates();
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = python3Target0.getImplicitTokenLabel("1");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitTokenLabel("\"@\"");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str6 = python3Target0.language;
        java.lang.String str7 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\"hi!\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.loadTemplates();
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str8 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        boolean boolean10 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getAltLabelContextStructName("\"\"\"\"i\"\"\"\"");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean10 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitRuleLabel("1");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean5 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitRuleLabel("\"\"hi!\"\"");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        python3Target0.addBadWords();
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"hi!\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.loadTemplates();
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("i");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getListLabel("4.5.2.1");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getAltLabelContextStructName("\"@\"");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str8 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitSetLabel("\"\\1\"");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getListLabel("\"\\64\"");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getImplicitSetLabel("\"\"\\\"i\\\"\"\"");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean5 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.loadTemplates();
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String[] strArray3 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getElementListName("\"\\64\"");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.loadTemplates();
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        python3Target0.addBadWords();
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.loadTemplates();
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getElementListName("\"@\"");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        boolean boolean6 = python3Target0.templatesExist();
        int int7 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getListLabel("\"hi!\"");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("@");
        python3Target0.language = "d";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitSetLabel("\"\"\"\"\"\"");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.getTemplates();
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementName("\"\"\\\"hi!\\\"\"\"");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(10);
        boolean boolean7 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitSetLabel("\"\"hi!\"\"");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
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
        java.lang.String str13 = python3Target0.getImplicitRuleLabel("\"\"hi!\"\"");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\".5.2.\"\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getAltLabelContextStructName("\"\"d\"\"");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = python3Target0.getListLabel("\"\"d\"\"");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str3 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitTokenLabel("a");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        boolean boolean6 = python3Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitSetLabel("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        boolean boolean7 = python3Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.getTemplates();
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getImplicitSetLabel("\"\"\\\"\\\"\"\"");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitSetLabel("\"\"\"\"4.5.2.1\"\"\"\"");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        java.lang.String str7 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitSetLabel("\"i\"");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
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
        int int12 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getImplicitTokenLabel("\"\"\"\\0\"\"\"");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getImplicitRuleLabel("\"\"\"\"i\"\"\"\"");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\\1");
        boolean boolean8 = python3Target0.wantsBaseVisitor();
        boolean boolean9 = python3Target0.templatesExist();
        int int10 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getAltLabelContextStructName("\"\\\"\\\"\"");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getImplicitTokenLabel("");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitRuleLabel("\\\"1\\\"");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getListLabel("\"\\\".5.2.\\\"\"");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getImplicitRuleLabel("\"\".5.2.\"\"");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        int int4 = python3Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        python3Target3.targetCharValueEscape = strArray7;
        python3Target0.targetCharValueEscape = strArray7;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.getTemplates();
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean5 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getElementName("\"d\"");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = python3Target0.getImplicitRuleLabel("a");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        int int4 = python3Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        python3Target3.targetCharValueEscape = strArray7;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray7;
        python3Target0.targetCharValueEscape = strArray7;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitTokenLabel("\\\"1\\\"");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        boolean boolean7 = python3Target0.templatesExist();
        java.util.Set<java.lang.String> strSet8 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getElementName("\"\"\\64\"\"");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("i");
        java.lang.String str5 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitRuleLabel("\"\"\\\"i\\\"\"\"");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        int int9 = python3Target0.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet10 = python3Target0.getBadWords();
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getElementName("\"1\"");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str84 = python3Target0.getListLabel("\".5.2.\"");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.loadTemplates();
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str6 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.loadTemplates();
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        python3Target0.addBadWords();
        java.lang.String str7 = python3Target0.encodeIntAsCharEscape(100);
        java.lang.String str8 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getListLabel("4.5.2.1");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitSetLabel("\"12\"");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = python3Target0.getImplicitTokenLabel("\"\"\\\"i\\\"\"\"");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getAltLabelContextStructName("@");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getAltLabelContextStructName("\"\"\\\"i\\\"\"\"");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.getTemplates();
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 1);
        boolean boolean5 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitTokenLabel("\" \"");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        boolean boolean6 = python3Target0.templatesExist();
        int int7 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\\\"\\\"4.5.2.1\\\"\\\"\"", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitTokenLabel("\"i\"");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str7 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.loadTemplates();
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementName("\"\\\"\\\"\"");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getListLabel("\"\"d\"\"");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String str3 = python3Target0.language;
        java.lang.String str4 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.loadTemplates();
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        boolean boolean7 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getAltLabelContextStructName("\"\\\"\\\"4.5.2.1\\\"\\\"\"");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str6 = python3Target0.language;
        java.lang.String str7 = python3Target0.getVersion();
        java.lang.String str8 = python3Target0.getVersion();
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getElementListName("\"64\"");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        int int6 = python3Target0.getInlineTestSetWordSize();
        boolean boolean7 = python3Target0.templatesExist();
        java.lang.String str8 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.getTemplates();
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getElementListName("\"\\12\"");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
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
        python3Target0.language = "\"i\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = python3Target0.getElementName("\"\\\"\\\"\\\"i\\\"\\\"\\\"\"");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        python3Target0.language = "\"\"\"\"";
        boolean boolean8 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.loadTemplates();
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getVersion();
        java.lang.String str6 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.loadTemplates();
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitTokenLabel("\"\\\"i\\\"\"");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = python3Target0.getElementListName("\"\"\"4.5.2.1\"\"\"");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        java.lang.String str3 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getListLabel("\"\\0\"");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getVersion();
        java.lang.String str6 = python3Target0.getLanguage();
        java.lang.String str7 = python3Target0.getLanguage();
        java.util.Set<java.lang.String> strSet8 = python3Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.getTemplates();
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
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
        java.lang.String str16 = python3Target0.getTargetStringLiteralFromString("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = python3Target0.getImplicitRuleLabel("\"1\"");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str6 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"4.5.2.1\"\"\"\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitTokenLabel("\"\"\"\"i\"\"\"\"");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        java.lang.String str8 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getElementListName("\"\"\\\"i\\\"\"\"");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getListLabel("\\\".5.2.\\\"");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getAltLabelContextStructName("\"\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"\"");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\".5.2.\"\"", false);
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"4.5.2.1\"\"\"\"\"", true);
        java.util.Set<java.lang.String> strSet10 = python3Target0.getBadWords();
        java.lang.String str12 = python3Target0.encodeIntAsCharEscape(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getListLabel("\"\"\"\\\"hi!\\\"\"\"\"");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = python3Target0.getImplicitSetLabel("\".5.2.\"");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = python3Target0.getAltLabelContextStructName("\"\"4.5.2.1\"\"");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getAltLabelContextStructName("\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getListLabel("\"\"\\\"\\\"\"\"");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.getTemplates();
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getImplicitRuleLabel("\\35");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.wantsBaseListener();
        boolean boolean5 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getElementListName("12");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getLanguage();
        java.lang.String str7 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getElementListName("\"\"\"\\\"\\\"\"\"\"");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
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
        boolean boolean13 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getAltLabelContextStructName("\"\"d\"\"");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
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
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.loadTemplates();
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"hi!\"", false);
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        java.lang.String str11 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getElementName("\"1\"");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        boolean boolean7 = python3Target0.templatesExist();
        boolean boolean8 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.loadTemplates();
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        java.util.Set<java.lang.String> strSet8 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitTokenLabel("\"0\"");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        java.lang.String[] strArray2 = python3Target0.targetCharValueEscape;
        boolean boolean3 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getElementListName("\"\"1\"\"");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = python3Target0.getElementListName("d");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        java.lang.String str8 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitTokenLabel("");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        int int7 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getElementName("\"\"\"64\"\"\"");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str6 = python3Target0.language;
        int int7 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getElementListName("\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = python3Target0.getElementListName("\"\"\\\"\\\"4.5.2.1\\\"\\\"\"\"");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        java.lang.String str3 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getAltLabelContextStructName(".5.2.");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"hi!\"", false);
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitRuleLabel("\"hi!\"");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("i");
        java.util.Set<java.lang.String> strSet5 = python3Target0.getBadWords();
        python3Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getElementListName("\"\\\"\\\"0\\\"\\\"\"");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\".5.2.\"\"", false);
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"4.5.2.1\"\"\"\"\"", true);
        java.lang.String str10 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitRuleLabel("\"\"\"\"\"\\1\"\"\"\"\"");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getListLabel("\"\"\\64\"\"");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getVersion();
        java.lang.String str6 = python3Target0.getLanguage();
        java.lang.String str7 = python3Target0.getLanguage();
        java.util.Set<java.lang.String> strSet8 = python3Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getAltLabelContextStructName("\"\"\"4.5.2.1\"\"\"");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getVersion();
        java.lang.String str6 = python3Target0.getLanguage();
        java.lang.String str7 = python3Target0.getLanguage();
        java.util.Set<java.lang.String> strSet8 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getAltLabelContextStructName("\"\"\".5.2.\"\"\"");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str4 = python3Target0.language;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"\\\"i\\\"\"\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getAltLabelContextStructName("\\\"1\\\"");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"1\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getElementName("\"\"\"4.5.2.1\"\"\"");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet5 = python3Target0.getBadWords();
        java.lang.String[] strArray6 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray6;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray6;
        python3Target0.targetCharValueEscape = strArray6;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.loadTemplates();
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        python3Target0.addBadWords();
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitRuleLabel("\"\\0\"");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("\"\"\"4.5.2.1\"\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.loadTemplates();
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitTokenLabel("Python3");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getElementListName("\"\"\"\"\"4.5.2.1\"\"\"\"\"");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementName("\"@\"");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getAltLabelContextStructName("\"\"\\\"\\\"0\\\"\\\"\"\"");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
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
        int int12 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getImplicitTokenLabel("\"\"\"\"\"4.5.2.1\"\"\"\"\"");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
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
        int int12 = python3Target0.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet13 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getElementListName("\"\"64\"\"");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitSetLabel("\"\"\"\"i\"\"\"\"");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.loadTemplates();
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("hi!", false);
        python3Target0.language = "\"\"i\"\"";
        java.lang.String str11 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getListLabel("\"\"\\\"i\\\"\"\"");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) '4');
        boolean boolean9 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitRuleLabel("#");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        boolean boolean7 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitRuleLabel("\"\"\"\\\"i\\\"\"\"\"");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.wantsBaseListener();
        int int5 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getElementName("\"\"\\\"\\\"4.5.2.1\\\"\\\"\"\"");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getListLabel("\"\"\"12\"\"\"");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        int int6 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementListName("\\\".5.2.\\\"");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getElementName("\"\"\"64\"\"\"");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String str5 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitSetLabel("\"\\\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.getTemplates();
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = python3Target0.getElementName("\"\\\"\\\"\\\"i\\\"\\\"\\\"\"");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getImplicitSetLabel("\"\\1\"");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitTokenLabel("\"\".5.2.\"\"");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getElementListName("3");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = python3Target0.getElementName("");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getListLabel("\"\\\"\\\"hi!\\\"\\\"\"");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        boolean boolean6 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getAltLabelContextStructName("1");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitRuleLabel("\"\"\"\"4.5.2.1\"\"\"\"");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getElementName("#");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getListLabel("\"i\"");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target0.getTemplates();
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet5 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getListLabel("\"\"64\"\"");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getListLabel("\\35");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.getLanguage();
        boolean boolean6 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getListLabel("\"\".5.2.\"\"");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("i");
        python3Target0.language = "hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitTokenLabel("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.loadTemplates();
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getVersion();
        java.lang.String str6 = python3Target0.getLanguage();
        java.lang.String str7 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getElementName("\"\\\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        int int7 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.loadTemplates();
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        boolean boolean5 = python3Target0.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementListName("\"\"\\\"i\\\"\"\"");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getElementName("\"\"\\\"\\\"4.5.2.1\\\"\\\"\"\"");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str7 = python3Target5.getTargetStringLiteralFromString("\"\"");
        java.lang.String[] strArray8 = python3Target5.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray8;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getListLabel("\" \"");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        java.lang.String str10 = python3Target0.encodeIntAsCharEscape(10);
        java.util.Set<java.lang.String> strSet11 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getElementName("\\\"hi!\\\"");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        python3Target0.language = "@";
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getListLabel("\"\"d\"\"");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        int int6 = python3Target0.getInlineTestSetWordSize();
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getAltLabelContextStructName("\\\".5.2.\\\"");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.getLanguage();
        boolean boolean6 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.loadTemplates();
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
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
        org.stringtemplate.v4.STGroup sTGroup21 = python3Target0.getTemplates();
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str4 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getAltLabelContextStructName("d");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("i");
        python3Target0.language = "hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitSetLabel("\"\"\\\"\\\"4.5.2.1\\\"\\\"\"\"");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.getLanguage();
        python3Target0.language = "\"\"\"4.5.2.1\"\"\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getElementListName("\"\"\"\"\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        boolean boolean7 = python3Target0.templatesExist();
        java.util.Set<java.lang.String> strSet8 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getElementListName("\"\"\\\"4.5.2.1\\\"\"\"");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.util.Set<java.lang.String> strSet6 = python3Target0.getBadWords();
        boolean boolean7 = python3Target0.templatesExist();
        boolean boolean8 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitSetLabel("\"\\\".5.2.\\\"\"");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        int int6 = python3Target0.getInlineTestSetWordSize();
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getElementListName("\"64\"");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        python3Target0.language = "\"\"\"\"";
        python3Target0.language = "hi!";
        java.util.Set<java.lang.String> strSet10 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitTokenLabel("\"\\64\"");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str8 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        boolean boolean10 = python3Target0.templatesExist();
        java.lang.String[] strArray11 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getElementListName("\\35");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        python3Target0.language = "\"\"\"\"";
        boolean boolean8 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getListLabel("");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getListLabel("a");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getAltLabelContextStructName("\"\\\".5.2.\\\"\"");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(10);
        boolean boolean7 = python3Target0.templatesExist();
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"", true);
        java.lang.String str11 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getElementName(".5.2.");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"1\"\"", false);
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"hi!\"\"", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getListLabel("\\12");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
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
        python3Target0.language = "\\12";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = python3Target0.getImplicitTokenLabel("Python3");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
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
        java.lang.String str13 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getAltLabelContextStructName("\"0\"");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitSetLabel("\"\\\"\\\"12\\\"\\\"\"");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str6 = python3Target0.language;
        java.lang.String str7 = python3Target0.getVersion();
        java.lang.String str8 = python3Target0.getVersion();
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getElementName("\"\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\".5.2.\"\"", false);
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"4.5.2.1\"\"\"\"\"", true);
        java.lang.String str10 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitRuleLabel("4.5.2.1");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getListLabel("\"\\\"\\\"\\\"64\\\"\\\"\\\"\"");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getElementListName("");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getImplicitSetLabel("a");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"i\"");
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getAltLabelContextStructName("\\\"\\\"\\\"i\\\"\\\"\\\"");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"1\"");
        boolean boolean9 = python3Target0.wantsBaseVisitor();
        boolean boolean10 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.loadTemplates();
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("@");
        python3Target0.language = "d";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getListLabel("\"\\\"\\\"12\\\"\\\"\"");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getAltLabelContextStructName("\"\"12\"\"");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str3 = python3Target0.getLanguage();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        python3Target0.language = "\"\\\"\\\"\\\"64\\\"\\\"\\\"\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementName("\"\"d\"\"");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getListLabel("\"\"\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\"\"\"");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getAltLabelContextStructName("\"4.5.2.1\"");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
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
        java.lang.String str23 = python3Target0.encodeIntAsCharEscape((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = python3Target0.getListLabel("\\\"i\\\"");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
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
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\"i\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getImplicitRuleLabel("\"\"\\0\"\"");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
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
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target0.loadTemplates();
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = python3Target0.getElementName("\"\".5.2.\"\"");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getElementName("\"\"\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        python3Target0.addBadWords();
        java.lang.String str7 = python3Target0.encodeIntAsCharEscape(100);
        java.lang.String str8 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitRuleLabel("\"\\\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.getTemplates();
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str3 = python3Target0.getLanguage();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getElementListName("\"\\\"\\\"\\\"i\\\"\\\"\\\"\"");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target0.getCodeGenerator();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"\"\\\"\\\"\"\"\"", false);
        java.lang.String str10 = python3Target0.encodeIntAsCharEscape(64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getListLabel("\"\\1\"");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        int int9 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getListLabel("\"\"\\\"\\\"\\\"i\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str4 = python3Target0.language;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"\\\"i\\\"\"\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getAltLabelContextStructName("\"\"\\\"hi!\\\"\"\"");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        boolean boolean5 = python3Target0.wantsBaseListener();
        boolean boolean6 = python3Target0.wantsBaseListener();
        java.util.Set<java.lang.String> strSet7 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitRuleLabel("\"\" \"\"");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        python3Target0.language = "d";
        java.util.Set<java.lang.String> strSet7 = python3Target0.getBadWords();
        java.lang.String str9 = python3Target0.encodeIntAsCharEscape((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitRuleLabel("\"\"\\\"\\\"\\\"i\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
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
        java.lang.String str15 = python3Target0.getTargetStringLiteralFromString("\"\\\"\\\"hi!\\\"\\\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = python3Target0.getElementName("\\\"\\\"\\\"i\\\"\\\"\\\"");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
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
        int int12 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getElementName("\"\"\\\"\\\"4.5.2.1\\\"\\\"\"\"");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementListName("4.5.2.1");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getImplicitTokenLabel("\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.getTemplates();
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getElementListName("");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"\\\"\\\"4.5.2.1\\\"\\\"\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitSetLabel("\"\"hi!\"\"");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(10);
        boolean boolean7 = python3Target0.templatesExist();
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"", true);
        java.lang.String str11 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getElementListName("\"d\"");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String str5 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitSetLabel("\\\"hi!\\\"");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str8 = python3Target0.getVersion();
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"\\1\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getElementListName("\"\"\"\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("i", true);
        java.lang.String str10 = python3Target0.encodeIntAsCharEscape(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getAltLabelContextStructName("\"\"\"\"\\\"\\\"\"\"\"\"");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getElementListName("\"\"#\"\"");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"i\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitSetLabel("\"\"\"\"\"\\1\"\"\"\"\"");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
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
        python3Target0.language = "\"\"\"\"\"\"\"\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getImplicitTokenLabel("\"_\\\"1\\\"\"");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        int int6 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitTokenLabel("\"\"\"\"\"hi!\"\"\"\"\"");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str85 = python3Target0.getImplicitTokenLabel("\\\"\\\"\\\"i\\\"\\\"\\\"");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        python3Target0.targetCharValueEscape = strArray8;
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitTokenLabel("\"\"\"\"hi!\"\"\"\"");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
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
        java.lang.String str11 = python3Target0.getElementListName("");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        java.util.Set<java.lang.String> strSet8 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.getTemplates();
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        python3Target0.language = "@";
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\\1\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getElementName("\"\"12\"\"");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.getTemplates();
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) '4');
        boolean boolean9 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.getTemplates();
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\\1");
        boolean boolean8 = python3Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.templates;
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitTokenLabel("\"6\"");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getVersion();
        java.lang.String str6 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitSetLabel("\".5.2.\"");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
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
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.loadTemplates();
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        python3Target0.addBadWords();
        java.lang.String str7 = python3Target0.encodeIntAsCharEscape(100);
        java.lang.String str8 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getAltLabelContextStructName("\"\"\"1\"\"\"");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        boolean boolean3 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getImplicitTokenLabel("\\\"\\\"\\\"i\\\"\\\"\\\"");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean10 = python3Target0.wantsBaseListener();
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str13 = python3Target11.language;
        java.lang.String str14 = python3Target11.getVersion();
        int int15 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target11.getLanguage();
        boolean boolean17 = python3Target11.templatesExist();
        java.util.Set<java.lang.String> strSet18 = python3Target11.getBadWords();
        python3Target0.badWords = strSet18;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = python3Target0.getElementName("\\\"hi!\\\"");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
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
        java.lang.String str15 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = python3Target0.getListLabel("\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("@");
        python3Target0.language = "d";
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getElementListName("\\\"\\\"\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\\1");
        boolean boolean8 = python3Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.templates;
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        int int11 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getImplicitTokenLabel("\"\"i\"\"");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
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
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\"\\\"4.5.2.1\\\"\"", false);
        java.lang.String str15 = python3Target0.getTargetStringLiteralFromString("\"d\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target0.loadTemplates();
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        python3Target0.addBadWords();
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"hi!\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getElementListName("\"\"");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        java.lang.String str3 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getElementListName("\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) '#');
        python3Target0.language = "\"\".5.2.\"\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getListLabel("\\\"\\\"\\\"\\\"i\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        python3Target0.language = "@";
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitSetLabel("\"\\35\"");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getElementListName("\"\"\"\"i\"\"\"\"");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        int int8 = python3Target0.getInlineTestSetWordSize();
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.lang.String str10 = python3Target0.language;
        boolean boolean11 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getElementListName("\"\"4.5.2.1\"\"");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.util.Set<java.lang.String> strSet5 = python3Target0.getBadWords();
        java.lang.String[] strArray6 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray6;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray6;
        python3Target0.targetCharValueEscape = strArray6;
        boolean boolean10 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getElementListName("\"\"1\"\"");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        boolean boolean7 = python3Target0.templatesExist();
        boolean boolean8 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitSetLabel("\"\" \"\"");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) '4');
        boolean boolean9 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getListLabel("\"\\\"\\\"\\\"64\\\"\\\"\\\"\"");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("i");
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape(64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitSetLabel("d");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        boolean boolean5 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getElementListName("\"\"\"12\"\"\"");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str8 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getListLabel("\"\"\"\"i\"\"\"\"");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("i", true);
        java.lang.String str10 = python3Target0.encodeIntAsCharEscape(10);
        java.lang.String str11 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getElementListName("\"\"\"\"\"hi!\"\"\"\"\"");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        boolean boolean10 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getListLabel("\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        boolean boolean9 = python3Target0.wantsBaseListener();
        python3Target0.addBadWords();
        int int11 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getImplicitSetLabel("\"\"1\"\"");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"i\"");
        python3Target0.addBadWords();
        java.util.Set<java.lang.String> strSet8 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitTokenLabel("\"\"d\"\"");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        java.lang.String str3 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getElementListName("");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str6 = python3Target0.getVersion();
        java.lang.String str7 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitRuleLabel("\\\"\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
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
        boolean boolean21 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup22 = python3Target0.loadTemplates();
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"i\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getAltLabelContextStructName("\"\"\"\"i\"\"\"\"");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str3 = python3Target0.getLanguage();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        python3Target0.language = "\"\\\"\\\"\\\"64\\\"\\\"\\\"\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitRuleLabel("\"\"\"\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\"\"\"\"");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        python3Target0.addBadWords();
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitTokenLabel("\"\"\"\"\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        boolean boolean6 = python3Target0.templatesExist();
        java.util.Set<java.lang.String> strSet7 = python3Target0.getBadWords();
        boolean boolean8 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getElementName("3");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        java.lang.String str7 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitSetLabel("\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getImplicitTokenLabel("\"\"\".5.2.\"\"\"");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target0.getBadWords();
        java.lang.String str10 = python3Target0.language;
        python3Target0.language = "4.5.2.1";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getListLabel("\"\"\"\\0\"\"\"");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitRuleLabel("\\35");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.util.Set<java.lang.String> strSet7 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getElementListName("\"\"\"\\\"4.5.2.1\\\"\"\"\"");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getImplicitTokenLabel("\"\"\"\\12\"\"\"");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        int int6 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getListLabel("\"\"\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str6 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementListName("\"\"\"\\1\"\"\"");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str7 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getListLabel("\"\"\"\"\\\"i\\\"\"\"\"\"");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        int int8 = python3Target0.getInlineTestSetWordSize();
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitSetLabel("\\\"\\\"\\\"0\\\"\\\"\\\"");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(10);
        boolean boolean7 = python3Target0.templatesExist();
        java.lang.String[] strArray8 = python3Target0.targetCharValueEscape;
        boolean boolean9 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.loadTemplates();
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"i\"\"");
        python3Target0.language = "\"\\\"\\\"4.5.2.1\\\"\\\"\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitRuleLabel("\"\"\\\"4.5.2.1\\\"\"\"");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getAltLabelContextStructName("\"\" \"\"");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = python3Target0.getImplicitTokenLabel("\"\\\"\\\"hi!\\\"\\\"\"");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.loadTemplates();
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementListName("\\1");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str6 = python3Target0.language;
        java.lang.String str7 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getElementListName("\"\\\"1\\\"\"");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
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
        int int15 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = python3Target0.getImplicitTokenLabel("\"\\\"\\\"\\\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getVersion();
        java.lang.String str6 = python3Target0.getVersion();
        java.lang.String str7 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitSetLabel("");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
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
        java.lang.String[] strArray15 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = python3Target0.getImplicitSetLabel("\\\"hi!\\\"");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getVersion();
        java.lang.String str6 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitRuleLabel("\"\\\"\\\"64\\\"\\\"\"");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getAltLabelContextStructName("\"\"\"\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        boolean boolean6 = python3Target0.templatesExist();
        int int7 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\\\"\\\"4.5.2.1\\\"\\\"\"", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitSetLabel("\"\"\"\"#\"\"\"\"");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        int int9 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getElementListName("\"#\"");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        boolean boolean5 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getListLabel("_");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        boolean boolean3 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getAltLabelContextStructName("\"\"\"hi!\"\"\"");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str5 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getListLabel("\\\"\\\"#\\\"\\\"");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        int int8 = python3Target0.getInlineTestSetWordSize();
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.lang.String str10 = python3Target0.language;
        boolean boolean11 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getImplicitRuleLabel("\\\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        int int7 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target0.getLanguage();
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getElementName("\"#\"");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        boolean boolean6 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitSetLabel("\"d\"");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        java.lang.String str3 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getAltLabelContextStructName("\"\\\"\\\"\"");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String[] strArray3 = python3Target0.targetCharValueEscape;
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getAltLabelContextStructName("3");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        boolean boolean6 = python3Target0.wantsBaseVisitor();
        java.lang.String str7 = python3Target0.language;
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.getTemplates();
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\\1");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getElementListName("\"\"\\0\"\"");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) '4');
        java.lang.String str10 = python3Target0.encodeIntAsCharEscape((int) '#');
        java.lang.String str12 = python3Target0.encodeIntAsCharEscape((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getImplicitRuleLabel("\"\"\"\"1\"\"\"\"");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getImplicitRuleLabel("ython");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.lang.String str4 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getAltLabelContextStructName("\"\"\"hi!\"\"\"");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitRuleLabel("\"\\\"\\\"\"");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getListLabel("6");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.loadTemplates();
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        java.lang.String str7 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.getTemplates();
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getListLabel("");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        python3Target0.addBadWords();
        java.lang.String str6 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.getTemplates();
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitSetLabel("\\12");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        python3Target0.language = "@";
        java.lang.String str10 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.loadTemplates();
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("\"\"\"4.5.2.1\"\"\"");
        int int5 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitSetLabel("\"\"\"\"\\1\"\"\"\"");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getVersion();
        java.lang.String str6 = python3Target0.getVersion();
        java.lang.String str7 = python3Target0.language;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"4.5.2.1\"\"\"\"", false);
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\"\\64\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target0.loadTemplates();
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        int int4 = python3Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        python3Target3.targetCharValueEscape = strArray7;
        python3Target0.targetCharValueEscape = strArray7;
        java.lang.String str11 = python3Target0.encodeIntAsCharEscape((int) (short) 100);
        java.lang.String str13 = python3Target0.encodeIntAsCharEscape((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target0.getTemplates();
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
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
        boolean boolean12 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getAltLabelContextStructName("\\\"\\\"\\\"0\\\"\\\"\\\"");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        python3Target0.addBadWords();
        java.lang.String str7 = python3Target0.encodeIntAsCharEscape(100);
        java.lang.String str8 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getAltLabelContextStructName("\"\\\"\\\"12\\\"\\\"\"");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        python3Target0.addBadWords();
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"hi!\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\\\"\\\"\\\"4.5.2.1\\\"\\\"\\\"\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.getTemplates();
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
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
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.loadTemplates();
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet10 = python3Target0.getBadWords();
        int int11 = python3Target0.getInlineTestSetWordSize();
        boolean boolean12 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getImplicitTokenLabel("i");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        int int4 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.loadTemplates();
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        boolean boolean6 = python3Target0.wantsBaseListener();
        java.lang.String[] strArray7 = python3Target0.targetCharValueEscape;
        java.lang.String[] strArray8 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitTokenLabel("\\\"\\\"\\\"0\\\"\\\"\\\"");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getListLabel("\\\"\\\"0\\\"\\\"");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.loadTemplates();
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        python3Target0.addBadWords();
        java.lang.String str7 = python3Target0.encodeIntAsCharEscape(29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.loadTemplates();
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
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
        int int15 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target0.loadTemplates();
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target0.getBadWords();
        java.lang.String str10 = python3Target0.language;
        python3Target0.language = "4.5.2.1";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getImplicitSetLabel("\\\"\\\"\\\"\\\"");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
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
        java.lang.String[] strArray12 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target0.loadTemplates();
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\".5.2.\"\"", false);
        int int7 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitRuleLabel("\"\"#\"\"");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        boolean boolean5 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.loadTemplates();
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        boolean boolean9 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.loadTemplates();
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"1\"");
        boolean boolean9 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.getTemplates();
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitSetLabel("\"\"\"\\\"hi!\\\"\"\"\"");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
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
        java.lang.String str12 = python3Target0.getImplicitRuleLabel("\"i\"");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.util.Set<java.lang.String> strSet6 = python3Target0.getBadWords();
        boolean boolean7 = python3Target0.templatesExist();
        boolean boolean8 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getElementListName("\"\\\".5.2.\\\"\"");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str6 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.loadTemplates();
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        boolean boolean7 = python3Target0.templatesExist();
        boolean boolean8 = python3Target0.wantsBaseVisitor();
        java.lang.String str9 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getListLabel("i");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        python3Target0.addBadWords();
        java.lang.String str7 = python3Target0.encodeIntAsCharEscape(100);
        java.lang.String str8 = python3Target0.getVersion();
        boolean boolean9 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getAltLabelContextStructName("\"\"\"\"12\"\"\"\"");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("\"\"\"4.5.2.1\"\"\"");
        int int5 = python3Target0.getInlineTestSetWordSize();
        boolean boolean6 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getAltLabelContextStructName("\"\"4.5.2.1\"\"");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.getTemplates();
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
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
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\"i\"");
        int int13 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getImplicitRuleLabel("\\\"\\\"1\\\"\\\"");
    }
}

