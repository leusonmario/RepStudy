import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getElementListName("4.5.2.1");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getElementListName("");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getListLabel("");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.getTemplates();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = python3Target0.getElementListName("hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getImplicitSetLabel("\"\"");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.loadTemplates();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        int int3 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getElementName("4.5.2.1");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitTokenLabel("\"\"\"\"");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet5 = python3Target3.badWords;
        python3Target0.badWords = strSet5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getAltLabelContextStructName("\\12");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getAltLabelContextStructName("hi!");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.loadTemplates();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        int int3 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target0.getTemplates();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = python3Target0.getElementListName("4.5.2.1");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.getTemplates();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("12");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitRuleLabel("\"4.5.2.1\"");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitRuleLabel("\"12\"");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        python3Target0.language = "\"\"\"\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getElementListName("");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getElementName("");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getListLabel("\"\"");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitRuleLabel("\"4.5.2.1\"");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        int int12 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getElementName("\\\"4.5.2.1\\\"");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        int int12 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getListLabel("_tset\\12");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitRuleLabel("\"12\"");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getElementListName("hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getListLabel("\"4.5.2.1\"");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = python3Target0.getImplicitRuleLabel("\"12\"");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.loadTemplates();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getImplicitSetLabel("DContext");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitTokenLabel("Python3");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("");
        int int5 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitRuleLabel("\"4.5.2.1\"");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"", false);
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getListLabel("");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitRuleLabel("\"\"\"\"");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str9 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitTokenLabel("Hi!Context");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.loadTemplates();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getImplicitSetLabel("12");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.getTemplates();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("");
        int int5 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getListLabel("\"Python3\"");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        python3Target0.language = "\"\"\"\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getImplicitTokenLabel("");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        int int3 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getAltLabelContextStructName("\"hi!\"");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        boolean boolean3 = python3Target0.templatesExist();
        boolean boolean4 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getElementListName("DContext");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.loadTemplates();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.loadTemplates();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        boolean boolean5 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getAltLabelContextStructName("\"\"\\\"\\\"hi!\\\"\\\"\"\"");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray8;
        python3Target0.targetCharValueEscape = strArray8;
        java.util.Set<java.lang.String> strSet11 = python3Target0.getBadWords();
        int int12 = python3Target0.getInlineTestSetWordSize();
        boolean boolean13 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getImplicitTokenLabel("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getLanguage();
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementName("\"\"\"\\0\"\"\"");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getElementName("");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"", false);
        python3Target0.language = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.getTemplates();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getAltLabelContextStructName("\"\"4.5.2.1\"\"");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getListLabel("\"\"\"\"\"\"\"\"Context");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape(10);
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\\\"\\\"hi!\\\"\\\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitRuleLabel("@");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getListLabel("\"\\\"\\\"\\\\0\\\"\\\"\"");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.loadTemplates();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        java.lang.String[] strArray3 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getAltLabelContextStructName("DContext");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getElementName("");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getImplicitTokenLabel("#");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.getVersion();
        int int3 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getImplicitRuleLabel("\\\"4.5.2.1\\\"");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getImplicitSetLabel("12");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.getVersion();
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitSetLabel("@");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        boolean boolean3 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getElementName("hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        java.lang.String str6 = python3Target0.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitTokenLabel("\"Python3\"");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        java.lang.String str6 = python3Target0.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitTokenLabel("\"4.5.2.1\"");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        boolean boolean3 = python3Target0.supportsOverloadedMethods();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        int int5 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getElementName("4.5.2.1");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("12");
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        int int7 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getElementName("12Context");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        java.lang.String str6 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitRuleLabel("4.5.2.1");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.loadTemplates();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        int int12 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target0.getTemplates();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getAltLabelContextStructName("\"\\12\"");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getListLabel("\"_tsetPython3\"");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"", false);
        python3Target0.language = "";
        java.lang.String str11 = python3Target0.getTargetStringLiteralFromString("\"_tsetHi!Context\"", false);
        int int12 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getImplicitSetLabel("\"\"\"\"\"\"\"\"Context");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getElementName("\\n");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.loadTemplates();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\\\"Python3\\\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitTokenLabel("3");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray8;
        python3Target0.targetCharValueEscape = strArray8;
        java.util.Set<java.lang.String> strSet11 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getListLabel("Python3");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String[] strArray11 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getElementListName("_tset\"\\\"Python3\\\"\"Context");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"", false);
        python3Target0.language = "";
        java.lang.String str11 = python3Target0.getTargetStringLiteralFromString("\"_tsetHi!Context\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getAltLabelContextStructName("\"\\\"\\\"\\\"\\\"\\\"Contex\"");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = python3Target0.getElementName("\"\"\"hi!\"\"\"");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(1);
        boolean boolean6 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getListLabel("_tset\"\\\"\\\"\\\"\\\"\\\"Contex\"");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        int int4 = python3Target0.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitRuleLabel("\"\\\"0\\\"\"");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.getCodeGenerator();
        boolean boolean14 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target0.getTemplates();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape(10);
        java.lang.String str5 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getElementListName("\"\"\"\"\"\"\"\"Context");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray8;
        python3Target0.targetCharValueEscape = strArray8;
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        python3Target0.language = "";
        java.util.Set<java.lang.String> strSet14 = python3Target0.badWords;
        python3Target0.language = "\"\"\"\\\"\\\"hi!\\\"\\\"\"\"\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = python3Target0.getImplicitSetLabel("\"\\\"\\\"\\\\1\\\"\\\"\"");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getElementName("\"\\1\"");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getElementName("\"\\\"4.5.2.1\"");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitTokenLabel("\\\"\\\\\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"\\\"");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target0.loadTemplates();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape(10);
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\\\"\\\"hi!\\\"\\\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.loadTemplates();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getElementName("_tset\"\\\"\\\"hi!\\\"\\\"\"");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray8;
        python3Target0.targetCharValueEscape = strArray8;
        java.util.Set<java.lang.String> strSet11 = python3Target0.getBadWords();
        int int12 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target0.getTemplates();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(64);
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str11 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getImplicitTokenLabel("\"\\12\"");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        boolean boolean3 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getImplicitSetLabel("\"\"\"\"\"\"");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getListLabel("\"Python3\"Context");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray8;
        python3Target0.targetCharValueEscape = strArray8;
        java.util.Set<java.lang.String> strSet11 = python3Target0.getBadWords();
        int int12 = python3Target0.getInlineTestSetWordSize();
        boolean boolean13 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target0.loadTemplates();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getImplicitRuleLabel("\"\\0\"");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getElementListName("\\35");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"", false);
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getListLabel("_tset_tset_12");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str9 = python3Target0.getLanguage();
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getListLabel("_\"\"4.5.2.1\"\"");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        int int2 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray3 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getElementName("\"\"\"4.5.2.1\"\"\"");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray8;
        python3Target0.targetCharValueEscape = strArray8;
        java.util.Set<java.lang.String> strSet11 = python3Target0.getBadWords();
        int int12 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getElementName("");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.loadTemplates();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getElementName("\"DContext\"");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray8;
        python3Target0.targetCharValueEscape = strArray8;
        java.util.Set<java.lang.String> strSet11 = python3Target0.getBadWords();
        int int12 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getListLabel("_tset\\64");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        java.lang.String str7 = python3Target0.language;
        python3Target0.language = "\"\"\"\"\"\"\"\"Context";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitTokenLabel("\"\\\"0\\\"\"");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(64);
        java.lang.String str7 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.getTemplates();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getElementName("\"hi!\"");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"", false);
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"Hi!Context\"", false);
        boolean boolean10 = python3Target0.wantsBaseListener();
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = python3Target0.getImplicitRuleLabel("_tset_\"\"\\\"DContext\\\"\"\"");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        boolean boolean3 = python3Target0.supportsOverloadedMethods();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"hi!\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getListLabel("_\"\"\\\"\\\"hi!\\\"\\\"\"\"Context");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(64);
        java.lang.String str7 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.loadTemplates();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitRuleLabel("\"\"\"\\\"\\\"hi!\\\"\\\"\"\"\"");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitTokenLabel("_tset_12");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getLanguage();
        python3Target0.addBadWords();
        boolean boolean7 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getImplicitRuleLabel("\\0");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        int int2 = python3Target0.getInlineTestSetWordSize();
        boolean boolean3 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getImplicitTokenLabel("_tsetHi!Context");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getLanguage();
        python3Target0.addBadWords();
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.getTemplates();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target0.getTemplates();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        python3Target0.language = "\\1";
        boolean boolean13 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getImplicitTokenLabel("\"\\\"\\\"4.5.2.1\\\"\\\"\"");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getLanguage();
        python3Target0.addBadWords();
        boolean boolean7 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getListLabel("\"\"DContext\"\"");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target0.getTemplates();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str9 = python3Target0.getLanguage();
        java.util.Set<java.lang.String> strSet10 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitRuleLabel("\"\"\\\"\\\"\\\"\\\\\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"\\\"\\\"\\\"\"\"");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = python3Target0.getCodeGenerator();
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getImplicitSetLabel("\"\"4.5.2.1\"\"");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        boolean boolean3 = python3Target0.supportsOverloadedMethods();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"hi!\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitRuleLabel("\\\"\\\"\\\"\\\"\\\"\\\"\\\"ContextContextContex");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitTokenLabel("nContex");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitSetLabel("\"\\64\"");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        java.util.Set<java.lang.String> strSet3 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getListLabel("@");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementName("\"\"DContext\"\"Context");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"", false);
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"Hi!Context\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitTokenLabel("_\"\"\\\"\\\"hi!\\\"\\\"\"\"");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str9 = python3Target0.getLanguage();
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("_tset_tset\"\\\"0\\\"\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target0.getTemplates();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray8;
        python3Target0.targetCharValueEscape = strArray8;
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        python3Target0.language = "";
        java.util.Set<java.lang.String> strSet14 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = python3Target0.getElementListName("_\"\\\"\\\"4.5.2.1\\\"\\\"\"Context");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.getCodeGenerator();
        boolean boolean14 = python3Target0.supportsOverloadedMethods();
        boolean boolean15 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target0.getTemplates();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"\\0\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getElementName("\"\"\"\"\"\"\"Context\"Context");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("");
        int int5 = python3Target0.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementListName("");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getAltLabelContextStructName("_#");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        python3Target0.language = "\\1";
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target0.loadTemplates();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getAltLabelContextStructName("\"\"\\\\0\"\"");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.getVersion();
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str5 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getListLabel("\\\"\\\"\\\"\\\"\\\"Contex");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getLanguage();
        python3Target0.addBadWords();
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getElementListName("\\\"hi!\\\"");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getElementName("\"\\\"\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("");
        int int5 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean6 = python3Target0.templatesExist();
        java.lang.String str7 = python3Target0.getLanguage();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\\\"4.5.2.1\\\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getAltLabelContextStructName("_tset\\64");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getListLabel("_\"\\\"\\\"4.5.2.1\\\"\\\"\"");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        boolean boolean3 = python3Target0.templatesExist();
        java.lang.String str4 = python3Target0.getLanguage();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.loadTemplates();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        python3Target0.language = "\\1";
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getListLabel("\"__tset\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"ContextContextContext\"");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"", false);
        python3Target0.language = "";
        java.lang.String str11 = python3Target0.getTargetStringLiteralFromString("\"_tsetHi!Context\"", false);
        int int12 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getImplicitTokenLabel("_tset_12");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(1);
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("", false);
        python3Target0.language = "\"\"\"_tset12\"\"\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitRuleLabel("_\"\"\"DContext\"\"Context\"");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target0.getTemplates();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        java.lang.String str3 = python3Target0.getVersion();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("_\"\\1\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getListLabel("_\"\"\\\"DContext\\\"\"\"");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.templatesExist();
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getAltLabelContextStructName("\"\\\"\\\"\\\\1\\\"\\\"\"");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        java.lang.String str10 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitSetLabel("_\\\"_\\\"\\\"\\\"DContext\\\"\\\"Context\\\"\\\"");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.templatesExist();
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitTokenLabel("\"\"_tset12\"\"");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet4 = python3Target0.badWords;
        int int5 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitSetLabel("\"_tset\\12\"");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"", false);
        python3Target0.language = "";
        java.lang.String str11 = python3Target0.getTargetStringLiteralFromString("\"_tsetHi!Context\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.loadTemplates();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        java.lang.String str7 = python3Target0.language;
        python3Target0.language = "\"\"\"\"\"\"\"\"Context";
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = python3Target0.getImplicitRuleLabel("__tset\"\"\"\"\"\"\"\"ContextContextContextContext");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getElementName("_\"4.5.2.1\"");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getLanguage();
        python3Target0.addBadWords();
        java.util.Set<java.lang.String> strSet7 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getAltLabelContextStructName("_\"\\\"\\\\\\\"Python3\\\\\\\"\\\"\"");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str9 = python3Target0.getLanguage();
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        python3Target0.language = "\"Hi!Context\"";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getElementListName("\"\"\"4.5.2.1\"\"\"");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        int int12 = python3Target0.getInlineTestSetWordSize();
        boolean boolean13 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target0.loadTemplates();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("4.5.2.1");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.getTemplates();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        java.lang.String str6 = python3Target0.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.getTemplates();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(1);
        java.lang.String str7 = python3Target0.encodeIntAsCharEscape(0);
        python3Target0.addBadWords();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getListLabel("\"\\\"\\\"\\\\1\\\"\\\"\"");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getAltLabelContextStructName("\"\\\"\\\\\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray8;
        python3Target0.targetCharValueEscape = strArray8;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"");
        int int13 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getImplicitSetLabel("_\"\"4.5.2.1\"\"");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape(10);
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementListName("_tset\"\"1\"\"");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.gen;
        boolean boolean14 = python3Target0.templatesExist();
        java.lang.String str15 = python3Target0.getLanguage();
        java.util.Set<java.lang.String> strSet16 = python3Target0.badWords;
        java.lang.String str18 = python3Target0.encodeIntAsCharEscape((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = python3Target0.getElementName("_\"_\"\"\"DContext\"\"Context\"\"");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet5 = python3Target3.badWords;
        python3Target0.badWords = strSet5;
        boolean boolean7 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.loadTemplates();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getImplicitSetLabel("\\\"_tsetPython3\\\"Context");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = python3Target0.getListLabel("");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.getCodeGenerator();
        java.lang.String str10 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.getTemplates();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str9 = python3Target0.getLanguage();
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("_tset_tset\"\\\"0\\\"\"", false);
        java.lang.String str14 = python3Target0.getLanguage();
        java.lang.String str16 = python3Target0.encodeIntAsCharEscape(64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target0.loadTemplates();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape(10);
        java.lang.String str5 = python3Target0.getVersion();
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.loadTemplates();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        python3Target0.language = "\"hi!\"";
        boolean boolean11 = python3Target0.wantsBaseListener();
        int int12 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target0.loadTemplates();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("");
        int int5 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean6 = python3Target0.templatesExist();
        java.lang.String str7 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getElementName("_#");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.lang.String str4 = python3Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getAltLabelContextStructName("\"__tset\"\"\"\"\"\"\"\"ContextContextContextContext\"");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet4 = python3Target0.badWords;
        python3Target0.language = "\"\"\"\"\"\"Context";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getAltLabelContextStructName("_\\\"\\\"\\\\\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"\\\"\\\"Context");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        boolean boolean12 = python3Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getElementName("\"\\\"\\\"\\\"\\\\\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"\\\"\\\"\\\"\"Context");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        boolean boolean3 = python3Target0.templatesExist();
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.loadTemplates();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        int int2 = python3Target0.getInlineTestSetWordSize();
        boolean boolean3 = python3Target0.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitRuleLabel("\"\"4.5.2.1\"\"");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        boolean boolean3 = python3Target0.templatesExist();
        boolean boolean4 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getAltLabelContextStructName("__\"\"\\\"DContext\\\"\"\"Context");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getElementListName("\"\"\"\"\"\"\"\"ContextContext");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        java.lang.String str3 = python3Target0.getVersion();
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getImplicitSetLabel("\"_tset\\12\"");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        boolean boolean2 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python3Target0.getElementListName("\"_tset_tset\\\\64\"");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        boolean boolean5 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getElementName("_tset\"\\64\"");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.templates;
        boolean boolean13 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = python3Target0.getElementName("hi!");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        java.lang.String str7 = python3Target0.language;
        python3Target0.language = "\"\"\"\"\"\"\"\"Context";
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\"\"\\\"\\\"\\\"\\\\\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"\\\"\\\"\\\"\"\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getImplicitRuleLabel("\"__tset\"\"\\0\"\"Context\"");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"", false);
        python3Target0.language = "";
        boolean boolean9 = python3Target0.wantsBaseListener();
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\"\\\"\\\"\\\"\\\"\\\"Contex\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = python3Target0.getImplicitTokenLabel("_tset\"\\\"0\\\"\"");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        boolean boolean3 = python3Target0.templatesExist();
        java.lang.String str4 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getElementName("_\"\"\"DContext\"\"Context\"");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getImplicitSetLabel("\"nContex\"");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python3Target0.getListLabel("\"\\\"\\\"\\\\1\\\"\\\"\"Context");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.getVersion();
        int int3 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = python3Target0.getElementListName("a");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.gen;
        boolean boolean14 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = python3Target0.getElementListName("\"\\\\12\"");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.getVersion();
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str5 = python3Target0.getVersion();
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("_\"\"\"DContext\"\"Context\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getListLabel("\"\"__tset\\\"\\\"\\\"\\\"\\\"\\\"\\\"\\\"ContextContextContext\"\"");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray8;
        python3Target0.targetCharValueEscape = strArray8;
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        java.lang.String str13 = python3Target0.encodeIntAsCharEscape(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target0.loadTemplates();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = python3Target0.getCodeGenerator();
        boolean boolean2 = python3Target0.templatesExist();
        boolean boolean3 = python3Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target0.getTemplates();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str9 = python3Target0.getLanguage();
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("_tset_tset\"\\\"0\\\"\"", false);
        java.lang.String str14 = python3Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = python3Target0.getListLabel("_tset\"\\\"\\\\\\\"\\\\\\\"4.5.2.1\\\\\\\"\\\\\\\"\\\"Context\"");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\\\"4.5.2.1\\\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python3Target0.getAltLabelContextStructName("_tset_12Context");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.badWords;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python3Target0.getAltLabelContextStructName("\".5.2.\"");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        boolean boolean3 = python3Target0.supportsOverloadedMethods();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet5 = python3Target0.getBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.loadTemplates();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"", false);
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"Hi!Context\"", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = python3Target0.getImplicitSetLabel("");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"", false);
        python3Target0.language = "";
        boolean boolean9 = python3Target0.wantsBaseListener();
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.loadTemplates();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getImplicitRuleLabel("\"\"@\"\"");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = python3Target0.getCodeGenerator();
        boolean boolean2 = python3Target0.templatesExist();
        boolean boolean3 = python3Target0.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target0.templates;
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python3Target0.getElementListName("\"\"\\\"\\\"\\\"\\\"\\\"\\\"Contex\"\"");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        boolean boolean12 = python3Target0.wantsBaseVisitor();
        python3Target0.language = "_tset\"\"\\\"\\\"\"\"";
        python3Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = python3Target0.getElementName("\"\"__tset\"\"\"\"\"\"\"\"ContextContextContext\"\"");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"", false);
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        int int8 = python3Target0.getInlineTestSetWordSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = python3Target0.getImplicitRuleLabel("_tset\"\\\"tset\\\"\\\"\\\"hi!\\\"\\\"\\\"\"");
    }
}

