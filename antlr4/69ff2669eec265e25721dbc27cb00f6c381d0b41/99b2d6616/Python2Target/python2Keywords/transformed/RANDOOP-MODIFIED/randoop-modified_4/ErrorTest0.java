import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target0.encodeIntAsCharEscape(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target0.getTemplates();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str4 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getListLabel("\\64");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String[] strArray1 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = python2Target0.getImplicitRuleLabel("\"\"Context");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str4 = python2Target0.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getImplicitSetLabel("i");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        boolean boolean4 = python2Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getAltLabelContextStructName("Python2Context");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        boolean boolean4 = python2Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getImplicitRuleLabel("\\\"\\\\\\\"\\\\\\\"\\\\\\\"\\\"");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str1 = python2Target0.language;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup2 = python2Target0.getTemplates();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        boolean boolean4 = python2Target0.supportsOverloadedMethods();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = python2Target0.getElementName("_\\\"\\\\\\\"\\\\\\\"\\\"");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target0.getCodeGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = python2Target0.getImplicitSetLabel("");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target0.encodeIntAsCharEscape(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getElementName("\"\"\\\"_hi!\\\"\"\"");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("@", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target0.loadTemplates();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str4 = python2Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target0.gen;
        boolean boolean6 = python2Target0.supportsOverloadedMethods();
        java.lang.String str7 = python2Target0.getLanguage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target0.loadTemplates();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        boolean boolean4 = python2Target0.supportsOverloadedMethods();
        boolean boolean5 = python2Target0.templatesExist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = python2Target0.getImplicitSetLabel("\"\\\"_hi!\\\"\"");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = python2Target0.getAltLabelContextStructName("\"\\\"\\\"\\\"\"");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str4 = python2Target0.getLanguage();
        boolean boolean5 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target0.gen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target0.getTemplates();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str5 = python2Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target0.getCodeGenerator();
        python2Target0.addBadWords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = python2Target0.getImplicitRuleLabel("AContext");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String str3 = python2Target0.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str4 = python2Target0.getLanguage();
        boolean boolean5 = python2Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target0.gen;
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target0.templates;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target0.loadTemplates();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        python2Target0.addBadWords();
        boolean boolean2 = python2Target0.wantsBaseListener();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = python2Target0.getImplicitTokenLabel("tset6");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.antlr.v4.codegen.target.Python2Target python2Target0 = new org.antlr.v4.codegen.target.Python2Target();
        java.lang.String[] strArray1 = python2Target0.targetCharValueEscape;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = python2Target0.getImplicitTokenLabel("Python2Context\\\"Contex");
    }
}

